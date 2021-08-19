package com.jordan.betcher.siviso.siviso.database;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$PossibleSivisoData
{
	@Test
	public void setOnComplete_onComplete_0callOnComplete()
	{
		OnComplete onComplete = mock(OnComplete.class);
		
		PossibleSivisoData possibleSivisoData = new PossibleSivisoData();
		possibleSivisoData.setOnComplete(onComplete);
		
		verify(onComplete, times(0)).onComplete(possibleSivisoData);
	}
	
	@Test
	public void setLatLng_00OnComplete_callOnComplete()
	{
		LatLng latLng = new LatLng(0, 0);
		OnComplete onComplete = mock(OnComplete.class);
		
		PossibleSivisoData possibleSivisoData = new PossibleSivisoData();
		possibleSivisoData.setOnComplete(onComplete);
		possibleSivisoData.setLatLng(latLng);
		
		verify(onComplete, times(1)).onComplete(possibleSivisoData);
	}
}