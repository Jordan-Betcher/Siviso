package com.jordan.betcher.siviso.siviso.database;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$PossibleSivisoData
{
	@Test
	public void setLatLng_00OnComplete_callOnComplete()
	{
		LatLng latLng = new LatLng(0, 0);
		OnComplete onComplete = mock(OnComplete.class);
		
		PossibleSivisoData possibleSivisoData = new PossibleSivisoData();
		possibleSivisoData.addOnComplete(onComplete);
		possibleSivisoData.setLatLng(latLng);
		
		verify(onComplete, times(1)).onComplete(possibleSivisoData);
	}
}