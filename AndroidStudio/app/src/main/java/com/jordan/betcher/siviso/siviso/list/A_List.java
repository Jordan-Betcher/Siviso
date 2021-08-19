package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.Factory_OnClickListener_StartActivityAdd;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.viewholderadd.Factory_ViewHolderAdd;
import com.jordan.betcher.siviso.siviso.list.viewholderdefault.Factory_ViewHolderDefault;
import com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem.Factory_ViewHolderSiviso;
import com.jordan.betcher.siviso.siviso.main.A_Activity_Main;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

public class A_List
{
	public A_List(A_Activity_Main activity, Database database, SivisoList sivisoList, SivisoMap sivisoMap)
	{
		RecyclerView sivisoListView = activity.findViewById(R.id.recyclerViewSivisoList);
		sivisoListView.setLayoutManager(new LinearLayoutManager(activity));
		
		ArrayAdapter_Sivisos sivisoSpinnerAdapter = new ArrayAdapter_Sivisos(activity);
		LayoutInflater layoutInflater = LayoutInflater.from(activity);
		Factory_ViewHolderDefault factoryViewHolderDefault = new Factory_ViewHolderDefault(layoutInflater, sivisoSpinnerAdapter, sivisoMap, database);
		Factory_ViewHolderSiviso factoryViewHolderSiviso = new Factory_ViewHolderSiviso(layoutInflater, sivisoSpinnerAdapter, sivisoMap);
		Factory_OnClickListener_StartActivityAdd startActivityAdd = new Factory_OnClickListener_StartActivityAdd(activity);
		Factory_ViewHolderAdd factoryViewHolderAdd = new Factory_ViewHolderAdd(layoutInflater, startActivityAdd);
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, factoryViewHolderDefault, factoryViewHolderSiviso, factoryViewHolderAdd);
		sivisoListView.setAdapter(adapter);
	}
}
