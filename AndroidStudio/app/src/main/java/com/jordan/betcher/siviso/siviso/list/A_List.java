package com.jordan.betcher.siviso.siviso.list;

import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.A_Activity;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import java.util.ArrayList;

public class A_List
{
	public A_List(A_Activity activity, ArrayList<SivisoData> sivisoDatas, SivisoList sivisoList)
	{
		RecyclerView sivisoListView = activity.findViewById(R.id.recyclerViewSivisoList);
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(sivisoDatas, sivisoList);
		sivisoListView.setAdapter(adapter);
	}
}
