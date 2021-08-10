package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_CharSequence;

import org.junit.Test;

public class Test$ViewHolder_SivisoItem
{
	@Test
	public void _textViewNameA_setTextViewTextToNameA()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "A";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_CharSequence spinnerAdapter = mock(ArrayAdapter_CharSequence.class);
		Factory_OnItemClickListener_SetSiviso factoryOnItemClickListener = mock(Factory_OnItemClickListener_SetSiviso.class);
		CardView background = mock(CardView.class);
		Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground = mock(Factory_OnClickListenerGoToSivisoLocation.class);
		
		ViewHolder_SivisoItem viewHolder = new ViewHolder_SivisoItem(view, textView, name, spinner, spinnerAdapter, factoryOnItemClickListener, background, factoryOnClickBackground);
		
		verify(textView, times(1)).setText(name);
	}
	
	@Test
	public void _textViewName_setTextViewTextToName()
	{
		View view = mock(View.class);
		TextView textView = mock(TextView.class);
		String name = "";
		Spinner spinner = mock(Spinner.class);
		ArrayAdapter_CharSequence spinnerAdapter = mock(ArrayAdapter_CharSequence.class);
		Factory_OnItemClickListener_SetSiviso factoryOnItemClickListener = mock(Factory_OnItemClickListener_SetSiviso.class);
		CardView background = mock(CardView.class);
		Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground = mock(Factory_OnClickListenerGoToSivisoLocation.class);
		
		ViewHolder_SivisoItem viewHolder = new ViewHolder_SivisoItem(view, textView, name, spinner, spinnerAdapter, factoryOnItemClickListener, background, factoryOnClickBackground);
		
		verify(textView, times(1)).setText(name);
	}
}