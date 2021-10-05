package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;

import org.junit.Test;

public class Test$AtPermissionGranted_RequestSingleUpdate
{
	@Test
	public void granted__0RequestSingleUpdate()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		LocationListener locationListener = mock(LocationListener.class);
		
		new AtPermissionGranted_RequestSingleUpdate(locationManager, criteria, locationListener);
		
		verify(locationManager, times(0)).requestSingleUpdate(criteria, locationListener, null);
	}
	
	@Test
	public void granted__requestSingleUpdate()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		LocationListener locationListener = mock(LocationListener.class);
		
		AtPermissionGranted_RequestSingleUpdate requestSingleUpdate = new AtPermissionGranted_RequestSingleUpdate(locationManager, criteria, locationListener);
		requestSingleUpdate.call();
		
		verify(locationManager, times(1)).requestSingleUpdate(criteria, locationListener, null);
	}
}