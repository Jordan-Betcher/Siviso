package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.SivisoConverter;

class OnItemSelectedListener_SetDefaultSiviso
implements AdapterView.OnItemSelectedListener
{
	private Database database;
	private SivisoConverter sivisoConverter;
	
	public OnItemSelectedListener_SetDefaultSiviso(
	Database database, SivisoConverter sivisoConverter)
	{
		this.database = database;
		this.sivisoConverter = sivisoConverter;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l)
	{
		database.setDefaultSiviso(sivisoConverter.sivisoFrom(position));
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> adapterView)
	{
	
	}
}
