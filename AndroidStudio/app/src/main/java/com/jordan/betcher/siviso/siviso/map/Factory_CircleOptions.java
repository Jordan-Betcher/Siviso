package com.jordan.betcher.siviso.siviso.map;

import android.graphics.Color;

import com.google.android.gms.maps.model.CircleOptions;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

class Factory_CircleOptions
{
	public CircleOptions create(SivisoData sivisoData)
	{
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.center(sivisoData.latLng());
		circleOptions.radius(sivisoData.radius());
		circleOptions.visible(true);
		circleOptions.strokeWidth(10);
		circleOptions.fillColor(sivisoData.color());
		circleOptions.strokeColor(Color.GREEN);
		return circleOptions;
	}
}
