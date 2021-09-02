package com.jordan.betcher.siviso.siviso.database;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$OnSharedPreferenceChangeListener_OnChangeEvent
{
	@Test
	public void add_onDataChange_0dataChanged()
	{
		OnDataChange onDataChange = mock(OnDataChange.class);
		
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = new OnSharedPreferenceChangeListener_OnChangeEvent();
		onChangeEvent.add(onDataChange);
		
		verify(onDataChange, times(0)).dataChanged();
	}
	
	@Test
	public void onSharedPreferenceChanged_onDataChange_dataChanged()
	{
		OnDataChange onDataChange = mock(OnDataChange.class);
		
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = new OnSharedPreferenceChangeListener_OnChangeEvent();
		onChangeEvent.add(onDataChange);
		onChangeEvent.onSharedPreferenceChanged(null, "");
		
		verify(onDataChange, times(1)).dataChanged();
	}
}