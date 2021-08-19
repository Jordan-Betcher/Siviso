package com.jordan.betcher.siviso.siviso.add.siviso;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.widget.Spinner;

import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_CharSequence;

import org.junit.Test;

public class Test$SivisoView
{
	@Test
	public void _spinnerArrayAdapter_setAdapter()
	{
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_CharSequence arrayAdapter = mock(ArrayAdapter_CharSequence.class);
		
		SivisoView sivisoView = new SivisoView(spinner, arrayAdapter);
		
		verify(spinner, times(1)).setAdapter(arrayAdapter);
	}
}