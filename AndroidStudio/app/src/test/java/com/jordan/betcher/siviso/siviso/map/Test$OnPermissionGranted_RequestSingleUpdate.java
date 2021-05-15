package com.jordan.betcher.siviso.siviso.map;

import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$OnPermissionGranted_RequestSingleUpdate
{
	@Test
	public void granted__0RequestSingleUpdate()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		LocationListener locationListener = mock(LocationListener.class);
		
		new OnPermissionGranted_RequestSingleUpdate(locationManager, criteria, locationListener);
		
		verify(locationManager, times(0)).requestSingleUpdate(criteria, locationListener, null);
	}
	
	@Test
	public void granted__requestSingleUpdate()
	{
		LocationManager locationManager = mock(LocationManager.class);
		Criteria criteria = mock(Criteria.class);
		LocationListener locationListener = mock(LocationListener.class);
		
		OnPermissionGranted_RequestSingleUpdate requestSingleUpdate = new OnPermissionGranted_RequestSingleUpdate(locationManager, criteria, locationListener);
		requestSingleUpdate.granted();
		
		verify(locationManager, times(1)).requestSingleUpdate(criteria, locationListener, null);
	}
}