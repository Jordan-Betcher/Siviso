package com.jordan.betcher.siviso.siviso.map;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class OnMapReady_LocationListener_StartAtCurrentLocation implements OnMapReady, LocationListener
{
	private Location location;
	private Wrapper_GoogleMap googleMap;
	private float zoom;
	
	public OnMapReady_LocationListener_StartAtCurrentLocation(float zoom)
	{
		this.zoom = zoom;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		this.googleMap = googleMap;
		ifGoogleMapAndLocationNotNullThenMoveToLocation();
	}
	
	@Override
	public void onLocationChanged(Location location)
	{
		this.location = location;
		ifGoogleMapAndLocationNotNullThenMoveToLocation();
	}
	
	
	@Override
	public void onStatusChanged(String provider, int status, Bundle extras){}
	
	@Override
	public void onProviderEnabled(String provider){}
	
	@Override
	public void onProviderDisabled(String provider){}
	
	private void ifGoogleMapAndLocationNotNullThenMoveToLocation()
	{
		if(location != null && googleMap != null)
		{
			//googleMap.moveTo(new LatLng(0, 0));
			googleMap.zoomTo(zoom);
		}
	}
}
