package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.A_Activity;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.OnClickListener_StartActivityAdd;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.viewholderadd.Factory_ViewHolderAdd;
import com.jordan.betcher.siviso.siviso.list.viewholderdefault.Factory_ViewHolderDefault;
import com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem.Factory_ViewHolderSiviso;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

public class A_List
{
	public A_List(A_Activity activity, Database database, SivisoList sivisoList, SivisoMap sivisoMap)
	{
		RecyclerView sivisoListView = activity.findViewById(R.id.recyclerViewSivisoList);
		sivisoListView.setLayoutManager(new LinearLayoutManager(activity));
		
		CharSequence[] arrayOfSivisos = activity.getResources().getStringArray(R.array.sivisos);
		ArrayAdapter_CharSequence sivisoSpinnerAdapter = new ArrayAdapter_CharSequence(activity, android.R.layout.simple_spinner_item, arrayOfSivisos);
		LayoutInflater layoutInflater = LayoutInflater.from(activity);
		Factory_ViewHolderDefault factoryViewHolderDefault = new Factory_ViewHolderDefault(layoutInflater, sivisoSpinnerAdapter, sivisoMap, database);
		Factory_ViewHolderSiviso factoryViewHolderSiviso = new Factory_ViewHolderSiviso(layoutInflater, sivisoSpinnerAdapter, sivisoMap);
		OnClickListener_StartActivityAdd startActivityAdd = new OnClickListener_StartActivityAdd();
		Factory_ViewHolderAdd factoryViewHolderAdd = new Factory_ViewHolderAdd(layoutInflater, startActivityAdd);
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, factoryViewHolderDefault, factoryViewHolderSiviso, factoryViewHolderAdd);
		sivisoListView.setAdapter(adapter);
	}
}
