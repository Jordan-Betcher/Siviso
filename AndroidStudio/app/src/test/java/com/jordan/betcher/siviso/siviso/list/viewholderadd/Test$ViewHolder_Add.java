package com.jordan.betcher.siviso.siviso.list.viewholderadd;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;
import android.widget.Button;

import org.junit.Test;

public class Test$ViewHolder_Add
{
	@Test
	public void _ButtonFactory_setButtonOnClickFromFactory()
	{
		View view = mock(View.class);
		Button button = mock(Button.class);
		View.OnClickListener onClickListener = mock(View.OnClickListener.class);
		
		new ViewHolder_Add(view, button, onClickListener);
		
		verify(button, times(1)).setOnClickListener(onClickListener);
	}
}