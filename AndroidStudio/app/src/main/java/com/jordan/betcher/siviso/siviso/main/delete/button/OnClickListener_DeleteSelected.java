package com.jordan.betcher.siviso.siviso.main.delete.button;

import android.view.View;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.SivisoList;

class OnClickListener_DeleteSelected implements View.OnClickListener
{
	private Database database;
	private SivisoList sivisoList;
	
	public OnClickListener_DeleteSelected(
	Database database, SivisoList sivisoList)
	{
		this.database = database;
		this.sivisoList = sivisoList;
	}
	
	@Override
	public void onClick(View view)
	{
		database.delete(sivisoList.selected());
	}
}
