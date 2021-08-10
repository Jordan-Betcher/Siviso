package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;
import android.widget.TextView;

import org.junit.Test;

public class Test$ViewHolder_Default
{
	@Test
	public void init_textViewNameDefault_SetTextViewTextToNameDefault()
	{
		String name = "Default";
		TextView textView = mock(TextView.class);
		View view = mock(View.class);
		
		ViewHolder_Default viewHolder = new ViewHolder_Default(view, textView, name, null, null, null, null, null);
		viewHolder.init(null, 0);
		
		verify(textView, times(1)).setText(name);
	}
}