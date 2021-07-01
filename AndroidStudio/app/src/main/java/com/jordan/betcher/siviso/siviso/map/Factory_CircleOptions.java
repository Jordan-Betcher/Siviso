package com.jordan.betcher.siviso.siviso.map;

import android.graphics.Color;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;

class Factory_CircleOptions
{
	public CircleOptions create(LatLng latLng)
	{
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.center(latLng);
		circleOptions.radius(1000);
		circleOptions.visible(true);
		circleOptions.strokeWidth(10);
		circleOptions.fillColor(Color.GRAY);
		circleOptions.strokeColor(Color.GREEN);
		return circleOptions;
	}
}
