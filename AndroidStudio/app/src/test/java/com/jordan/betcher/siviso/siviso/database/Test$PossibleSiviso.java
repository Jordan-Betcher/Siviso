package com.jordan.betcher.siviso.siviso.database;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$PossibleSiviso
{
	@Test
	public void setOnComplete_onComplete_0callOnComplete()
	{
		OnComplete onComplete = mock(OnComplete.class);
		
		PossibleSiviso possibleSiviso = new PossibleSiviso();
		possibleSiviso.setOnComplete(onComplete);
		
		verify(onComplete, times(0)).onComplete(possibleSiviso);
	}
	
	@Test
	public void setLatLng_00OnComplete_callOnComplete()
	{
		LatLng latLng = new LatLng(0, 0);
		OnComplete onComplete = mock(OnComplete.class);
		
		PossibleSiviso possibleSiviso = new PossibleSiviso();
		possibleSiviso.setOnComplete(onComplete);
		possibleSiviso.setLatLng(latLng);
		
		verify(onComplete, times(1)).onComplete(possibleSiviso);
	}
}