package com.jordan.betcher.siviso.siviso.list;

import android.content.Intent;
import android.view.LayoutInflater;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.A_Activity_Add;
import com.jordan.betcher.siviso.siviso.add.OnClickListener_StartActivityAdd;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.viewholderadd.Factory_ViewHolderAdd;
import com.jordan.betcher.siviso.siviso.list.viewholderdefault.Factory_ViewHolderDefault;
import com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem.Factory_ViewHolderSiviso;
import com.jordan.betcher.siviso.siviso.main.A_Activity_Main;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

public class A_List
{
	private A_Activity_Main activity;
	private Database database;
	private SivisoList sivisoList;
	private SivisoMap sivisoMap;
	
	public A_List(A_Activity_Main activity, Database database, SivisoList sivisoList, SivisoMap sivisoMap)
	{
		this.activity = activity;
		this.database = database;
		this.sivisoList = sivisoList;
		this.sivisoMap = sivisoMap;
		
		RecyclerView listView = activity.findViewById(R.id.recyclerViewSivisoList);
		setLayoutManager(listView);
		setAdapter(listView);
	}
	
	private void setAdapter(RecyclerView sivisoListView)
	{
		Adapter_SivisoListView adapter = createAdapter();
		sivisoListView.setAdapter(adapter);
	}
	
	private void setLayoutManager(RecyclerView sivisoListView)
	{
		LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
		sivisoListView.setLayoutManager(linearLayoutManager);
	}
	
	private Adapter_SivisoListView createAdapter()
	{
		LayoutInflater layoutInflater = LayoutInflater.from(activity);
		ArrayAdapter_Sivisos sivisoSpinnerAdapter = new ArrayAdapter_Sivisos(activity);
		Factory_ViewHolderDefault defaultViewHolderFactory = new Factory_ViewHolderDefault(layoutInflater, sivisoSpinnerAdapter, sivisoMap, database);
		Factory_ViewHolderSiviso sivisoViewHolderFactory = new Factory_ViewHolderSiviso(layoutInflater, sivisoSpinnerAdapter, sivisoMap);
		
		Factory_ViewHolderAdd addViewHolderFactory = addViewHolderFactory(layoutInflater);
		return new Adapter_SivisoListView(database, defaultViewHolderFactory, sivisoViewHolderFactory, addViewHolderFactory);
	}
	
	private Factory_ViewHolderAdd addViewHolderFactory(LayoutInflater layoutInflater)
	{
		Intent intent = new Intent(activity, A_Activity_Add.class);
		OnClickListener_StartActivityAdd onClick = new OnClickListener_StartActivityAdd(activity, intent);
		return new Factory_ViewHolderAdd(layoutInflater, onClick);
	}
}
