package com.jordan.betcher.siviso.siviso.permissions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.Manifest;
import android.app.Activity;

import com.jordan.betcher.siviso.siviso.thirdparty.Wrapper_ActivityCompat;

import org.junit.Test;

public class Test$Permission_AccessFineLocation
{
	@Test
	public void addOnGrantedGrantGrant_isGrantedFalseFalse_0Granted()
	{
		boolean isGranted1 = false;
		boolean isGranted2 = false;
		Activity activity = mock(Activity.class);
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted1);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permission_AccessFineLocation accessFineLocation = new Permission_AccessFineLocation(activity);
		accessFineLocation.activityCompat = activityCompat;
		accessFineLocation.addOnGranted(onPermissionGranted);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted2);
		accessFineLocation.grant();
		
		verify(onPermissionGranted, times(0)).call();
	}
	
	@Test
	public void addOnGrantedGrantGrant_isGrantedFalseFalseTrue_granted()
	{
		boolean isGranted1 = false;
		boolean isGranted2 = false;
		boolean isGranted3 = true;
		Activity activity = mock(Activity.class);
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted1);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permission_AccessFineLocation accessFineLocation = new Permission_AccessFineLocation(activity);
		accessFineLocation.activityCompat = activityCompat;
		accessFineLocation.addOnGranted(onPermissionGranted);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted2);
		accessFineLocation.grant();
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted3);
		accessFineLocation.grant();
		
		verify(onPermissionGranted, times(1)).call();
	}
	
	
	@Test
	public void addOnGrantedGrant_isGrantedFalseTrue2OnGranted_1OnGranted2GrantedAfter()
	{
		boolean isGranted1 = false;
		boolean isGranted2 = true;
		Activity activity = mock(Activity.class);
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted1);
		OnPermissionGranted onPermissionGranted1 = mock(OnPermissionGranted.class);
		OnPermissionGranted onPermissionGranted2 = mock(OnPermissionGranted.class);
		
		Permission_AccessFineLocation accessFineLocation = new Permission_AccessFineLocation(activity);
		accessFineLocation.activityCompat = activityCompat;
		accessFineLocation.addOnGranted(onPermissionGranted1);
		accessFineLocation.addOnGranted(onPermissionGranted2);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted2);
		accessFineLocation.grant();
		
		verify(onPermissionGranted2, times(1)).call();
	}
	
	@Test
	public void addOnGrantedGrant_isGrantedFalseTrue2OnGranted_1OnGranted1GrantedAfter()
	{
		boolean isGranted1 = false;
		boolean isGranted2 = true;
		Activity activity = mock(Activity.class);
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted1);
		OnPermissionGranted onPermissionGranted1 = mock(OnPermissionGranted.class);
		OnPermissionGranted onPermissionGranted2 = mock(OnPermissionGranted.class);
		
		Permission_AccessFineLocation accessFineLocation = new Permission_AccessFineLocation(activity);
		accessFineLocation.activityCompat = activityCompat;
		accessFineLocation.addOnGranted(onPermissionGranted1);
		accessFineLocation.addOnGranted(onPermissionGranted2);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted2);
		accessFineLocation.grant();
		
		verify(onPermissionGranted1, times(1)).call();
	}
	
	@Test
	public void addOnGrantedGrant_isGrantedFalseTrue_1GrantedAfter()
	{
		boolean isGranted1 = false;
		boolean isGranted2 = true;
		Activity activity = mock(Activity.class);
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted1);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permission_AccessFineLocation accessFineLocation = new Permission_AccessFineLocation(activity);
		accessFineLocation.activityCompat = activityCompat;
		accessFineLocation.addOnGranted(onPermissionGranted);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted2);
		accessFineLocation.grant();
		
		verify(onPermissionGranted, times(1)).call();
	}
	
	@Test
	public void addOnGranted_isGrantedFalse_0Granted()
	{
		boolean isGranted = false;
		Activity activity = mock(Activity.class);
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permission_AccessFineLocation accessFineLocation = new Permission_AccessFineLocation(activity);
		accessFineLocation.activityCompat = activityCompat;
		accessFineLocation.addOnGranted(onPermissionGranted);
		
		verify(onPermissionGranted, times(0)).call();
	}
	
	@Test
	public void addOnGranted_isGrantedTrue_granted()
	{
		boolean isGranted = true;
		Activity activity = mock(Activity.class);
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted);
		OnPermissionGranted onPermissionGranted = mock(OnPermissionGranted.class);
		
		Permission_AccessFineLocation accessFineLocation = new Permission_AccessFineLocation(activity);
		accessFineLocation.activityCompat = activityCompat;
		accessFineLocation.addOnGranted(onPermissionGranted);
		
		verify(onPermissionGranted, times(1)).call();
	}
	
	@Test
	public void isGranted__false()
	{
		boolean isGranted = false;
		Activity activity = mock(Activity.class);
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted);
		
		Permission_AccessFineLocation accessFineLocation = new Permission_AccessFineLocation(activity);
		accessFineLocation.activityCompat = activityCompat;
		
		boolean actualIsGranted = accessFineLocation.isGranted();
		assertEquals(isGranted, actualIsGranted);
	}
	
	@Test
	public void isGranted__true()
	{
		boolean isGranted = true;
		Activity activity = mock(Activity.class);
		Wrapper_ActivityCompat activityCompat = mock(Wrapper_ActivityCompat.class);
		when(activityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(isGranted);
		
		Permission_AccessFineLocation accessFineLocation = new Permission_AccessFineLocation(activity);
		accessFineLocation.activityCompat = activityCompat;
		
		boolean actualIsGranted = accessFineLocation.isGranted();
		assertEquals(isGranted, actualIsGranted);
	}
	
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