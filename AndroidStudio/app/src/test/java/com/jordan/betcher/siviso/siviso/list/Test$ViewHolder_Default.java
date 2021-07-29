package com.jordan.betcher.siviso.siviso.list;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Siviso;

import org.junit.Test;

public class Test$ViewHolder_Default
{
	@Test
	public void _spinnerOnItemClickListenerSetDefaultSiviso_setOnItemClickListenerSetDefaultSivisoToSpinner()
	{
		OnItemClickListener_SetDefaultSiviso onItemClickListener = mock(OnItemClickListener_SetDefaultSiviso.class);
		OnClickListener_GoToCurrentLocation clickListener = mock(OnClickListener_GoToCurrentLocation.class);
		View view = mock(View.class);
		Spinner spinner = mock(Spinner.class);
		when(view.findViewById(R.id.textViewName)).thenReturn(mock(TextView.class));
		when(view.findViewById(R.id.cardViewHome)).thenReturn(mock(CardView.class));
		when(view.findViewById(R.id.spinnerHome)).thenReturn(spinner);
		
		new ViewHolder_Default(view, clickListener, mock(ArrayAdapter.class), onItemClickListener);
		
		verify(spinner, times(1)).setOnItemClickListener(onItemClickListener);
	}
	
	@Test
	public void setSiviso_VIBRATE_setSpinnerSelectionToOrdinal()
	{
		Siviso siviso = Siviso.VIBRATE;
		ArrayAdapter spinnerAdapter = mock(ArrayAdapter.class);
		OnClickListener_GoToCurrentLocation clickListener = mock(OnClickListener_GoToCurrentLocation.class);
		View view = mock(View.class);
		Spinner spinner = mock(Spinner.class);
		when(view.findViewById(R.id.textViewName)).thenReturn(mock(TextView.class));
		when(view.findViewById(R.id.cardViewHome)).thenReturn(mock(CardView.class));
		when(view.findViewById(R.id.spinnerHome)).thenReturn(spinner);
		
		ViewHolder_Default viewHolderDefault = new ViewHolder_Default(view, clickListener, spinnerAdapter,
		                                                              mock(OnItemClickListener_SetDefaultSiviso.class));
		viewHolderDefault.setSiviso(siviso);
		
		verify(spinner, times(1)).setSelection(siviso.ordinal());
	}
	
	@Test
	public void setSiviso_SILENT_setSpinnerSelectionToOrdinal()
	{
		Siviso siviso = Siviso.SILENT;
		ArrayAdapter spinnerAdapter = mock(ArrayAdapter.class);
		OnClickListener_GoToCurrentLocation clickListener = mock(OnClickListener_GoToCurrentLocation.class);
		View view = mock(View.class);
		Spinner spinner = mock(Spinner.class);
		when(view.findViewById(R.id.textViewName)).thenReturn(mock(TextView.class));
		when(view.findViewById(R.id.cardViewHome)).thenReturn(mock(CardView.class));
		when(view.findViewById(R.id.spinnerHome)).thenReturn(spinner);
		
		ViewHolder_Default viewHolderDefault = new ViewHolder_Default(view, clickListener, spinnerAdapter,
		                                                              mock(OnItemClickListener_SetDefaultSiviso.class));
		viewHolderDefault.setSiviso(siviso);
		
		verify(spinner, times(1)).setSelection(siviso.ordinal());
	}
	
	@Test
	public void __setSpinnerToSiviso()
	{
		ArrayAdapter spinnerAdapter = mock(ArrayAdapter.class);
		OnClickListener_GoToCurrentLocation clickListener = mock(OnClickListener_GoToCurrentLocation.class);
		View view = mock(View.class);
		Spinner spinner = mock(Spinner.class);
		when(view.findViewById(R.id.textViewName)).thenReturn(mock(TextView.class));
		when(view.findViewById(R.id.cardViewHome)).thenReturn(mock(CardView.class));
		when(view.findViewById(R.id.spinnerHome)).thenReturn(spinner);
		
		new ViewHolder_Default(view, clickListener, spinnerAdapter, mock(OnItemClickListener_SetDefaultSiviso.class));
		
		verify(spinner, times(1)).setAdapter(spinnerAdapter);
	}
	
	@Test
	public void _OnClickListener_setOnClickListener()
	{
		OnClickListener_GoToCurrentLocation clickListener = mock(OnClickListener_GoToCurrentLocation.class);
		View view = mock(View.class);
		CardView cardView = mock(CardView.class);
		when(view.findViewById(R.id.textViewName)).thenReturn(mock(TextView.class));
		when(view.findViewById(R.id.cardViewHome)).thenReturn(cardView);
		when(view.findViewById(R.id.spinnerHome)).thenReturn(mock(Spinner.class));
		
		new ViewHolder_Default(view, clickListener, mock(ArrayAdapter.class), mock(OnItemClickListener_SetDefaultSiviso.class));
		
		verify(cardView, times(1)).setOnClickListener(clickListener);
	}
	
	@Test
	public void _textBox_textBoxNameDefault()
	{
		OnClickListener_GoToCurrentLocation clickListener = mock(OnClickListener_GoToCurrentLocation.class);
		TextView textView = mock(TextView.class);
		View view = mock(View.class);
		when(view.findViewById(R.id.textViewName)).thenReturn(textView);
		when(view.findViewById(R.id.cardViewHome)).thenReturn(mock(CardView.class));
		when(view.findViewById(R.id.spinnerHome)).thenReturn(mock(Spinner.class));
		
		new ViewHolder_Default(view, clickListener, mock(ArrayAdapter.class), mock(OnItemClickListener_SetDefaultSiviso.class));
		
		verify(textView, times(1)).setText(R.string.siviso_list_name_default);
	}
}