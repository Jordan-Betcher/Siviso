package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;

import com.jordan.betcher.siviso.siviso.map.SivisoMap;

import org.junit.Test;

public class Test$OnClickListener_GoToCurrentLocation
{
	@Test
	public void _SivisoMap_0sivisoMapGoToCurrentLocation()
	{
		SivisoMap sivisoMap = mock(SivisoMap.class);
		
		OnClickListener_GoToCurrentLocation onClickListener = new OnClickListener_GoToCurrentLocation(sivisoMap);
		
		verify(sivisoMap, times(0)).goToCurrentLocation();
	}
	
	@Test
	public void onClick_SivisoMap_sivisoMapGoToCurrentLocation()
	{
		SivisoMap sivisoMap = mock(SivisoMap.class);
		
		OnClickListener_GoToCurrentLocation onClickListener = new OnClickListener_GoToCurrentLocation(sivisoMap);
		onClickListener.onClick(mock(View.class));
		
		verify(sivisoMap, times(1)).goToCurrentLocation();
	}
}