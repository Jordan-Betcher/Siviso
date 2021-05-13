package com.jordan.betcher.siviso.siviso.permissions;

import android.Manifest;
import android.app.Activity;
import android.content.Context;

import com.jordan.betcher.siviso.siviso.thirdparty.Wrapper_ActivityCompat;

import org.junit.Test;
import org.junit.runner.manipulation.Ordering;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$Permission_AccessFineLocation
{
	@Test
	public void request_activityCompat_requestPermissions()
	{
		Activity activity = mock(Activity.class);
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		
		Permission_AccessFineLocation accessFineLocation = new Permission_AccessFineLocation(activity);
		accessFineLocation.activityCompat = activityCompat;
		accessFineLocation.request();
		
		verify(activityCompat, times(1)).requestPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION);
	}
	
	@Test
	public void __createWrapperActivityCompat()
	{
		Activity activity = mock(Activity.class);
		
		Permission_AccessFineLocation accessFineLocation = new Permission_AccessFineLocation(activity);
		
		Wrapper_ActivityCompat activityCompat = accessFineLocation.activityCompat;
		assertNotNull(activityCompat);
	}
}