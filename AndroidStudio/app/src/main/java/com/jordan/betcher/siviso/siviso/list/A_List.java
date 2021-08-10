package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.A_Activity;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

public class A_List
{
	public A_List(A_Activity activity, Database database, SivisoList sivisoList, SivisoMap sivisoMap)
	{
		RecyclerView sivisoListView = activity.findViewById(R.id.recyclerViewSivisoList);
		sivisoListView.setLayoutManager(new LinearLayoutManager(activity));
		
		ArrayAdapter<CharSequence> sivisoSpinnerAdapter = ArrayAdapter.createFromResource(activity, R.array.sivisos, android.R.layout.simple_spinner_item);
		LayoutInflater layoutInflater = LayoutInflater.from(activity);
		SivisoConverter sivisoConverter = new SivisoConverter();
		OnItemClickListener_SetDefaultSiviso setDefaultSiviso = new OnItemClickListener_SetDefaultSiviso(database, sivisoConverter);
		OnClickListener_GoToCurrentLocation goToCurrentLocation = new OnClickListener_GoToCurrentLocation(sivisoMap);
		Factory_ViewHolderDefault factoryViewHolderDefault = new Factory_ViewHolderDefault(layoutInflater, goToCurrentLocation, sivisoSpinnerAdapter, setDefaultSiviso);
		
		Factory_OnClickListenerGoToSivisoLocation factoryOnClickListenerGoToSivisoLocation = new Factory_OnClickListenerGoToSivisoLocation();
		OnItemClickListener_SetSiviso setSiviso = new OnItemClickListener_SetSiviso();
		Factory_ViewHolderSiviso factoryViewHolderSiviso = new Factory_ViewHolderSiviso(layoutInflater, factoryOnClickListenerGoToSivisoLocation, sivisoSpinnerAdapter, setSiviso, sivisoMap);
		Factory_ViewHolderAdd factoryViewHolderAdd = new Factory_ViewHolderAdd(layoutInflater);
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, factoryViewHolderDefault, factoryViewHolderSiviso, factoryViewHolderAdd);
		sivisoListView.setAdapter(adapter);
	}
}
