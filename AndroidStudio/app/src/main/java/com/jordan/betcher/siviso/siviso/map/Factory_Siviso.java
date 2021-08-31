package com.jordan.betcher.siviso.siviso.map;

import android.app.Activity;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Ringmode;
import com.jordan.betcher.siviso.siviso.database.Siviso;

class Factory_Siviso
{
	double radius;
	
	public Factory_Siviso(Activity activity)
	{
		radius = activity.getResources().getInteger(R.integer.circle_radius_times_100) / 100;
	}
	
	public Siviso create(LatLng latLng)
	{
		return new Siviso("", latLng, radius, Ringmode.SILENT);
	}
}
