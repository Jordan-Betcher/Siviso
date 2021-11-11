package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem.Factory_ViewHolderSiviso;
import com.jordan.betcher.siviso.siviso.main.A_Activity_Main;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

public class A_List
{
	private final A_Activity_Main activity;
	private final Database database;
	private final SivisoList sivisoList;
	private final SivisoMap sivisoMap;
	
	public A_List(
	A_Activity_Main activity, Database database, SivisoList sivisoList, SivisoMap sivisoMap)
	{
		this.activity = activity;
		this.database = database;
		this.sivisoList = sivisoList;
		this.sivisoMap = sivisoMap;
		
		RecyclerView listView = activity.findViewById(R.id.recyclerViewSivisoList);
		LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
		
		int highlightColor = activity.getResources().getColor(R.color.higlightColor);
		HighlightView highlightView = new HighlightView(highlightColor);
		Adapter_SivisoListView adapter = createAdapter(highlightView);
		
		listView.setLayoutManager(linearLayoutManager);
		listView.setAdapter(adapter);
		
		A_OnDataChange_NotifyAdapter notifyAdapter = new A_OnDataChange_NotifyAdapter(adapter);
		database.addOnDataChange(notifyAdapter);
		OnSivisoSelect_OnViewHolderInit_HighlightAndScrollTo selectSiviso = new OnSivisoSelect_OnViewHolderInit_HighlightAndScrollTo(listView, highlightView);
		sivisoList.addOnSelect(selectSiviso);
		adapter.setOnViewInit(selectSiviso);
		
		Helper_SimpleCallback_SwipeToDelete viewHolderHelper = new Helper_SimpleCallback_SwipeToDelete();
		SimpleCallback_SwipeToDelete swipeToDelete = new SimpleCallback_SwipeToDelete(adapter, viewHolderHelper);
		ItemTouchHelper itemTouchHelper = new ItemTouchHelper(swipeToDelete);
		itemTouchHelper.attachToRecyclerView(listView);
	}
	
	private Adapter_SivisoListView createAdapter(
	HighlightView highlightView)
	{
		LayoutInflater layoutInflater = LayoutInflater.from(activity);
		Factory_ViewHolderSiviso sivisoViewHolderFactory = new Factory_ViewHolderSiviso(
		layoutInflater, sivisoMap, highlightView);
		
		return new Adapter_SivisoListView(database, sivisoViewHolderFactory);
	}
}
