package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Ringmodes;

class OnItemSelectedListener_SetSiviso
implements AdapterView.OnItemSelectedListener
{
	private Database database;
	private int sivisoIndex;
	private Ringmodes ringmodes;
	
	public OnItemSelectedListener_SetSiviso(
	Database database, int sivisoIndex,
	Ringmodes ringmodes)
	{
		this.database = database;
		this.sivisoIndex = sivisoIndex;
		this.ringmodes = ringmodes;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> adapterView, View view, int ringmodeIndex, long l)
	{
		database.setRingmode(sivisoIndex, ringmodes.from(ringmodeIndex));
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> adapterView)
	{
	
	}
}
