package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_CharSequence;

import org.junit.Test;

public class Test$ViewHolder_Default
{
	@Test
	public void _spinnerOnItemClick_SetSpinnerOnItemClick()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_CharSequence adapter = mock(ArrayAdapter_CharSequence.class);
		OnItemClickListener_SetDefaultSiviso onItemClickListener = mock(OnItemClickListener_SetDefaultSiviso.class);
		CardView cardView = mock(CardView.class);
		OnClickListener_GoToCurrentLocation onClick = mock(OnClickListener_GoToCurrentLocation.class);
		
		new ViewHolder_Default(view, textView, name, spinner, adapter, onItemClickListener, cardView, onClick);
		
		verify(spinner, times(1)).setOnItemClickListener(onItemClickListener);
	}
	
	@Test
	public void _backgroundOnClickListener_SetBackgroundOnClickListener()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_CharSequence adapter = mock(ArrayAdapter_CharSequence.class);
		OnItemClickListener_SetDefaultSiviso onItemClickListener = mock(OnItemClickListener_SetDefaultSiviso.class);
		CardView background = mock(CardView.class);
		OnClickListener_GoToCurrentLocation onClick = mock(OnClickListener_GoToCurrentLocation.class);
		
		new ViewHolder_Default(view, textView, name, spinner, adapter, onItemClickListener, background, onClick);
		
		verify(background, times(1)).setOnClickListener(onClick);
	}
	
	@Test
	public void _spinnerArrayAdapter_SetSpinnerAdapterToArrayAdapter()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_CharSequence adapter = mock(ArrayAdapter_CharSequence.class);
		OnItemClickListener_SetDefaultSiviso onItemClickListener = mock(OnItemClickListener_SetDefaultSiviso.class);
		CardView cardView = mock(CardView.class);
		OnClickListener_GoToCurrentLocation onClick = mock(OnClickListener_GoToCurrentLocation.class);
		
		new ViewHolder_Default(view, textView, name, spinner, adapter, onItemClickListener, cardView, onClick);
		
		verify(spinner, times(1)).setAdapter(adapter);
	}
	
	@Test
	public void _textViewName_SetTextViewTextToName()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_CharSequence adapter = mock(ArrayAdapter_CharSequence.class);
		OnItemClickListener_SetDefaultSiviso onItemClickListener = mock(OnItemClickListener_SetDefaultSiviso.class);
		CardView cardView = mock(CardView.class);
		OnClickListener_GoToCurrentLocation onClick = mock(OnClickListener_GoToCurrentLocation.class);
		
		new ViewHolder_Default(view, textView, name, spinner, adapter, onItemClickListener, cardView, onClick);
		
		verify(textView, times(1)).setText(name);
	}
	
	@Test
	public void _textViewNameDefault_SetTextViewTextToNameDefault()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "Default";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_CharSequence adapter = mock(ArrayAdapter_CharSequence.class);
		OnItemClickListener_SetDefaultSiviso onItemClickListener = mock(OnItemClickListener_SetDefaultSiviso.class);
		CardView cardView = mock(CardView.class);
		OnClickListener_GoToCurrentLocation onClick = mock(OnClickListener_GoToCurrentLocation.class);
		
		new ViewHolder_Default(view, textView, name, spinner, adapter, onItemClickListener, cardView, onClick);
		
		verify(textView, times(1)).setText(name);
	}
}