package com.jordan.betcher.siviso.siviso.list;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.siviso.database.Database;

class OnItemClickListener_SetDefaultSiviso
implements AdapterView.OnItemClickListener
{
	private Database database;
	private SivisoConverter sivisoConverter;
	
	public OnItemClickListener_SetDefaultSiviso(
	Database database, SivisoConverter sivisoConverter)
	{
		this.database = database;
		this.sivisoConverter = sivisoConverter;
	}
	
	@Override
	public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
	{
		database.setDefaultSiviso(sivisoConverter.sivisoFrom(position));
	}
}
