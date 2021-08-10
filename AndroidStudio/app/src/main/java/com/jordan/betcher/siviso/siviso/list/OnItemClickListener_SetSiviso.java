package com.jordan.betcher.siviso.siviso.list;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.siviso.database.Database;

class OnItemClickListener_SetSiviso
implements AdapterView.OnItemClickListener
{
	private Database database;
	private int sivisoIndex;
	
	public OnItemClickListener_SetSiviso(Database database, int sivisoIndex)
	{
		this.database = database;
		this.sivisoIndex = sivisoIndex;
	}
	
	@Override
	public void onItemClick(AdapterView<?> adapterView, View view, int itemIndex, long rowId)
	{
		database.setSiviso(sivisoIndex, itemIndex);
	}
}
