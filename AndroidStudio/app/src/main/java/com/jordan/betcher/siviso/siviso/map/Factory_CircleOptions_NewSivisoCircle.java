package com.jordan.betcher.siviso.siviso.map;

import android.graphics.Color;

import androidx.core.graphics.ColorUtils;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

class Factory_CircleOptions_NewSivisoCircle
{
	public CircleOptions create(LatLng latLng)
	{
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.center(latLng);
		circleOptions.radius(100);
		circleOptions.visible(true);
		circleOptions.strokeWidth(10);
		circleOptions.fillColor(ColorUtils.setAlphaComponent(Color.GRAY, 100));
		circleOptions.strokeColor(Color.GREEN);
		circleOptions.clickable(true);
		return circleOptions;
	}
}
