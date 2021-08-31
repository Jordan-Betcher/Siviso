package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Ringmode;
import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_Sivisos;

import org.junit.Test;

public class Test$ViewHolder_Default
{
	@Test
	public void init_databaseDefaultRingmodeVibrate_setSpinnerSelectionToVibrateOrdinal()
	{
		Ringmode ringmode = Ringmode.VIBRATE;
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_Sivisos adapter = mock(ArrayAdapter_Sivisos.class);
		OnItemSelectedListener_SetDefaultSiviso onItemClickListener = mock(
		OnItemSelectedListener_SetDefaultSiviso.class);
		CardView cardView = mock(CardView.class);
		OnClickListener_GoToCurrentLocation onClick = mock(OnClickListener_GoToCurrentLocation.class);
		Database database = mock(Database.class);
		when(database.defaultRingmode()).thenReturn(ringmode);
		
		ViewHolder_Default viewHolder = new ViewHolder_Default(view, textView, name, spinner, adapter, onItemClickListener, cardView, onClick);
		viewHolder.init(database, -1);
		
		verify(spinner, times(1)).setSelection(ringmode.ordinal());
	}
	
	@Test
	public void init_databaseDefaultRingmodeSilent_setSpinnerSelectionToSilentOrdinal()
	{
		Ringmode ringmode = Ringmode.SILENT;
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_Sivisos adapter = mock(ArrayAdapter_Sivisos.class);
		OnItemSelectedListener_SetDefaultSiviso onItemClickListener = mock(
		OnItemSelectedListener_SetDefaultSiviso.class);
		CardView cardView = mock(CardView.class);
		OnClickListener_GoToCurrentLocation onClick = mock(OnClickListener_GoToCurrentLocation.class);
		Database database = mock(Database.class);
		when(database.defaultRingmode()).thenReturn(ringmode);
		
		ViewHolder_Default viewHolder = new ViewHolder_Default(view, textView, name, spinner, adapter, onItemClickListener, cardView, onClick);
		viewHolder.init(database, -1);
		
		verify(spinner, times(1)).setSelection(ringmode.ordinal());
	}
	
	
	@Test
	public void _spinnerOnItemClick_SetSpinnerOnItemClick()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_Sivisos adapter = mock(ArrayAdapter_Sivisos.class);
		OnItemSelectedListener_SetDefaultSiviso onItemClickListener = mock(
		OnItemSelectedListener_SetDefaultSiviso.class);
		CardView cardView = mock(CardView.class);
		OnClickListener_GoToCurrentLocation onClick = mock(OnClickListener_GoToCurrentLocation.class);
		
		new ViewHolder_Default(view, textView, name, spinner, adapter, onItemClickListener, cardView, onClick);
		
		verify(spinner, times(1)).setOnItemSelectedListener(onItemClickListener);
	}
	
	@Test
	public void _backgroundOnClickListener_SetBackgroundOnClickListener()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_Sivisos adapter = mock(ArrayAdapter_Sivisos.class);
		OnItemSelectedListener_SetDefaultSiviso onItemClickListener = mock(
		OnItemSelectedListener_SetDefaultSiviso.class);
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
		ArrayAdapter_Sivisos adapter = mock(ArrayAdapter_Sivisos.class);
		OnItemSelectedListener_SetDefaultSiviso onItemClickListener = mock(
		OnItemSelectedListener_SetDefaultSiviso.class);
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
		ArrayAdapter_Sivisos adapter = mock(ArrayAdapter_Sivisos.class);
		OnItemSelectedListener_SetDefaultSiviso onItemClickListener = mock(
		OnItemSelectedListener_SetDefaultSiviso.class);
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
		ArrayAdapter_Sivisos adapter = mock(ArrayAdapter_Sivisos.class);
		OnItemSelectedListener_SetDefaultSiviso onItemClickListener = mock(
		OnItemSelectedListener_SetDefaultSiviso.class);
		CardView cardView = mock(CardView.class);
		OnClickListener_GoToCurrentLocation onClick = mock(OnClickListener_GoToCurrentLocation.class);
		
		new ViewHolder_Default(view, textView, name, spinner, adapter, onItemClickListener, cardView, onClick);
		
		verify(textView, times(1)).setText(name);
	}
}