package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.junit.Test;

public class Test$ViewHolder_Default
{
	@Test
	public void init_spinnnerArrayAdapter_SetSpinnerAdapterToArrayAdapter()
	{
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter sivisoSpinnerAdapter = mock(ArrayAdapter.class);
		View view = mock(View.class);
		
		ViewHolder_Default viewHolder = new ViewHolder_Default(view, mock(TextView.class), "", spinner, sivisoSpinnerAdapter, null, null, null);
		viewHolder.init(null, 0);
		
		verify(spinner, times(1)).setAdapter(sivisoSpinnerAdapter);
	}
	
	@Test
	public void init_textViewNameDefault_SetTextViewTextToNameDefault()
	{
		String name = "Default";
		TextView textView = mock(TextView.class);
		View view = mock(View.class);
		
		ViewHolder_Default viewHolder = new ViewHolder_Default(view, textView, name, mock(Spinner.class), mock(ArrayAdapter.class), null, null, null);
		viewHolder.init(null, 0);
		
		verify(textView, times(1)).setText(name);
	}
}