package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.A_Activity;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;

public class A_List
{
	public A_List(A_Activity activity, Database database, SivisoList sivisoList)
	{
		LayoutInflater layoutInflater = LayoutInflater.from(activity);
		RecyclerView sivisoListView = activity.findViewById(R.id.recyclerViewSivisoList);
		sivisoListView.setLayoutManager(new LinearLayoutManager(activity));
		ArrayAdapter<CharSequence> sivisoSpinnerAdapter = ArrayAdapter.createFromResource(activity, R.array.sivisos, android.R.layout.simple_spinner_item);
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, new OnClickListener_GoToCurrentLocation(), sivisoSpinnerAdapter);
		sivisoListView.setAdapter(adapter);
	}
}
