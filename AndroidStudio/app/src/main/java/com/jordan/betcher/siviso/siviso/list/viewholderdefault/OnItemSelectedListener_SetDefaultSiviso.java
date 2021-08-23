package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.RingmodeConverter;

class OnItemSelectedListener_SetDefaultSiviso
implements AdapterView.OnItemSelectedListener
{
	private Database database;
	private RingmodeConverter ringmodeConverter;
	
	public OnItemSelectedListener_SetDefaultSiviso(
	Database database, RingmodeConverter ringmodeConverter)
	{
		this.database = database;
		this.ringmodeConverter = ringmodeConverter;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l)
	{
		database.setDefaultRingmode(ringmodeConverter.sivisoFrom(position));
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> adapterView)
	{
	
	}
}
