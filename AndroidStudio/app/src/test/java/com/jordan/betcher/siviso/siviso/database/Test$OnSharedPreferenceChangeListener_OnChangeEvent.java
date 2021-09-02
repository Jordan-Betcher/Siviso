package com.jordan.betcher.siviso.siviso.database;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$OnSharedPreferenceChangeListener_OnChangeEvent
{
	@Test
	public void onSharedPreferenceChanged_onDataChange1onDataChange2_dataChanged2()
	{
		OnDataChange onDataChange1 = mock(OnDataChange.class);
		OnDataChange onDataChange2 = mock(OnDataChange.class);
		
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = new OnSharedPreferenceChangeListener_OnChangeEvent();
		onChangeEvent.add(onDataChange1);
		onChangeEvent.add(onDataChange2);
		onChangeEvent.onSharedPreferenceChanged(null, "");
		
		verify(onDataChange2, times(1)).dataChanged();
	}
	
	
	@Test
	public void onSharedPreferenceChanged_onDataChange1onDataChange2_dataChanged1()
	{
		OnDataChange onDataChange1 = mock(OnDataChange.class);
		OnDataChange onDataChange2 = mock(OnDataChange.class);
		
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = new OnSharedPreferenceChangeListener_OnChangeEvent();
		onChangeEvent.add(onDataChange1);
		onChangeEvent.add(onDataChange2);
		onChangeEvent.onSharedPreferenceChanged(null, "");
		
		verify(onDataChange1, times(1)).dataChanged();
	}
	
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