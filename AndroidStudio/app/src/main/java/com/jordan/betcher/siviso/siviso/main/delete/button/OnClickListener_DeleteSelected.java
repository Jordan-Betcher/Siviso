package com.jordan.betcher.siviso.siviso.main.delete.button;

import android.view.View;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.SivisoList;

class OnClickListener_DeleteSelected implements View.OnClickListener
{
	public OnClickListener_DeleteSelected(
	Database database, SivisoList sivisoList)
	{
		database.delete(new LatLng(0, 0));
	}
	
	@Override
	public void onClick(View view)
	{
	
	}
}
