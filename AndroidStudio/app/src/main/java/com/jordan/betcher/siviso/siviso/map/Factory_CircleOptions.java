package com.jordan.betcher.siviso.siviso.map;

import android.graphics.Color;

import com.google.android.gms.maps.model.CircleOptions;
import com.jordan.betcher.siviso.siviso.database.Siviso;

class Factory_CircleOptions
{
	public CircleOptions create(Siviso siviso)
	{
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.center(siviso.latLng());
		circleOptions.radius(siviso.radius());
		circleOptions.visible(true);
		circleOptions.strokeWidth(10);
		circleOptions.fillColor(Color.GRAY);
		circleOptions.strokeColor(Color.GREEN);
		circleOptions.clickable(true);
		return circleOptions;
	}
}
