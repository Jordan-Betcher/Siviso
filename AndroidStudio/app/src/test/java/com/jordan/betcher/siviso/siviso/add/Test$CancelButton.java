package com.jordan.betcher.siviso.siviso.add;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.widget.Button;

import com.jordan.betcher.siviso.siviso.add.cancel.CancelButton;
import com.jordan.betcher.siviso.siviso.add.cancel.OnClickListener_StopActivity;

import org.junit.Test;

public class Test$CancelButton
{
	@Test
	public void _buttonOnClickListener_setButtonOnClickListener()
	{
		Button button = mock(Button.class);
		OnClickListener_StopActivity onClickListener = mock(OnClickListener_StopActivity.class);
		
		new CancelButton(button, onClickListener);
		
		verify(button, times(1)).setOnClickListener(onClickListener);
	}
}