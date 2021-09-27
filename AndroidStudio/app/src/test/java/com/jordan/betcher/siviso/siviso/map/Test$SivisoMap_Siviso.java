package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$SivisoMap_Siviso
{
	@Test
	public void goToLocationReady_00map_moveTo00()
	{
		LatLng latLng = new LatLng(0, 0);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		
		SivisoMap_Siviso sivisoMap = new SivisoMap_Siviso();
		sivisoMap.ready(googleMap);
		sivisoMap.goToLocation(latLng);
		
		verify(googleMap, times(1)).moveTo(latLng);
	}
}