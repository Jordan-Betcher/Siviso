package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;

import org.junit.Test;

public class Test$ViewHolder_SivisoItem
{
	@Test
	public void background_background_background()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		CardView background = mock(CardView.class);
		Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground = mock(
		Factory_OnClickListenerGoToSivisoLocation.class);
		
		ViewHolder_SivisoItem viewHolder = new ViewHolder_SivisoItem(view, textView, name, spinner,
		                                                             background,
		                                                             factoryOnClickBackground);
		
		View actualView = viewHolder.background();
		assertEquals(background, actualView);
	}
	
	
	@Test
	public void init_FactoryIndex1SivisoLatLng01_setBackgroundOnClickListener()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		CardView background = mock(CardView.class);
		Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground = mock(Factory_OnClickListenerGoToSivisoLocation.class);
		
		Database database = mock(Database.class);
		int index = 1;
		LatLng sivisoLatLng = new LatLng(0, 1);
		Siviso siviso = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[index + 1];
		sivisos[index] = siviso;
		when(database.sivisos()).thenReturn(sivisos);
		when(siviso.latLng()).thenReturn(sivisoLatLng);
		OnClickListener_Multiple onClickListener = mock(OnClickListener_Multiple.class);
		when(factoryOnClickBackground.create(sivisoLatLng)).thenReturn(onClickListener);
		
		ViewHolder_SivisoItem viewHolder = new ViewHolder_SivisoItem(view, textView, name, spinner,
		                                                             background,
		                                                             factoryOnClickBackground);
		viewHolder.init(database, index);
		
		verify(background, times(1)).setOnClickListener(onClickListener);
	}
	
	@Test
	public void init_FactoryIndex1SivisoLatLng00_setBackgroundOnClickListener()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		CardView background = mock(CardView.class);
		Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground = mock(
		Factory_OnClickListenerGoToSivisoLocation.class);
		
		Database database = mock(Database.class);
		int index = 1;
		LatLng sivisoLatLng = new LatLng(0, 0);
		Siviso siviso = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[index + 1];
		sivisos[index] = siviso;
		when(database.sivisos()).thenReturn(sivisos);
		when(siviso.latLng()).thenReturn(sivisoLatLng);
		OnClickListener_Multiple onClickListener = mock(OnClickListener_Multiple.class);
		when(factoryOnClickBackground.create(sivisoLatLng)).thenReturn(onClickListener);
		
		ViewHolder_SivisoItem viewHolder = new ViewHolder_SivisoItem(view, textView, name, spinner,
		                                                             background,
		                                                             factoryOnClickBackground);
		viewHolder.init(database, index);
		
		verify(background, times(1)).setOnClickListener(onClickListener);
	}
	
	@Test
	public void _textViewNameA_setTextViewTextToNameA()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "A";
		Spinner spinner = mock(Spinner.class);
		CardView background = mock(CardView.class);
		Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground = mock(
		Factory_OnClickListenerGoToSivisoLocation.class);
		
		ViewHolder_SivisoItem viewHolder = new ViewHolder_SivisoItem(view, textView, name, spinner,
		                                                             background,
		                                                             factoryOnClickBackground);
		
		verify(textView, times(1)).setText(name);
	}
	
	@Test
	public void _textViewName_setTextViewTextToName()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		CardView background = mock(CardView.class);
		Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground = mock(
		Factory_OnClickListenerGoToSivisoLocation.class);
		
		new ViewHolder_SivisoItem(view, textView, name, spinner, background,
		                          factoryOnClickBackground);
		
		verify(textView, times(1)).setText(name);
	}
}