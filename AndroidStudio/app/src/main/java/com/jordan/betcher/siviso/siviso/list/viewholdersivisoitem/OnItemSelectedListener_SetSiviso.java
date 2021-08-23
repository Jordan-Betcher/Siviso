package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.siviso.database.Database;

class OnItemSelectedListener_SetSiviso
implements AdapterView.OnItemSelectedListener
{
	private Database database;
	private int sivisoIndex;
	
	public OnItemSelectedListener_SetSiviso(Database database, int sivisoIndex)
	{
		this.database = database;
		this.sivisoIndex = sivisoIndex;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> adapterView, View view, int ringmodeIndex, long l)
	{
		database.setRingmode(sivisoIndex, ringmodeIndex);
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> adapterView)
	{
	
	}
}
