package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$OnMapClickListener_SelectCircle
{
	@Test
	public void onMapClick_00_createCircle00()
	{
		LatLng latLng = new LatLng(0, 0);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_CircleOptions_NewSivisoCircle factory = mock(Factory_CircleOptions_NewSivisoCircle.class);
		CircleOptions circleOptions  = new CircleOptions();
		when(factory.create(latLng)).thenReturn(circleOptions);
		
		OnMapClickListener_SelectCircle selectCircle = new OnMapClickListener_SelectCircle(googleMap, factory);
		selectCircle.onMapClick(latLng);
		
		verify(googleMap, times(1)).createCircle(circleOptions);
	}
}