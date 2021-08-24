package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Ringmodes;

class OnItemSelectedListener_SetDefaultSiviso
implements AdapterView.OnItemSelectedListener
{
	private Database database;
	private Ringmodes ringmodes;
	
	public OnItemSelectedListener_SetDefaultSiviso(
	Database database, Ringmodes ringmodes)
	{
		this.database = database;
		this.ringmodes = ringmodes;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l)
	{
		database.setDefaultRingmode(ringmodes.from(position));
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> adapterView)
	{
	
	}
}
