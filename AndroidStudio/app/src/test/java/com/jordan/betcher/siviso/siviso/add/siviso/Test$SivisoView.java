package com.jordan.betcher.siviso.siviso.add.siviso;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.widget.Spinner;

import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_Sivisos;

import org.junit.Test;

public class Test$SivisoView
{
	@Test
	public void _spinnerOnItemSelectSetSiviso_onItemSelect()
	{
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_Sivisos arrayAdapter = mock(ArrayAdapter_Sivisos.class);
		OnItemSelect_SetPossibleSiviso onItemSelect = mock(OnItemSelect_SetPossibleSiviso.class);
		
		SivisoView sivisoView = new SivisoView(spinner, arrayAdapter, onItemSelect);
		
		verify(spinner, times(1)).setOnItemSelectedListener(onItemSelect);
	}
	
	@Test
	public void _spinnerArrayAdapter_setAdapter()
	{
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_Sivisos arrayAdapter = mock(ArrayAdapter_Sivisos.class);
		OnItemSelect_SetPossibleSiviso onItemSelect = mock(OnItemSelect_SetPossibleSiviso.class);
		
		SivisoView sivisoView = new SivisoView(spinner, arrayAdapter, onItemSelect);
		
		verify(spinner, times(1)).setAdapter(arrayAdapter);
	}
}