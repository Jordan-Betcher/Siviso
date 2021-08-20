package com.jordan.betcher.siviso.siviso.add.cancel;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.widget.Button;

import org.junit.Test;

public class Test$CancelButton
{
	@Test
	public void _buttonOnClickListener_setButtonOnClickListener()
	{
		Button button = mock(Button.class);
		OnClickListener_FinishActivity onClickListener = mock(OnClickListener_FinishActivity.class);
		
		new CancelButton(button, onClickListener);
		
		verify(button, times(1)).setOnClickListener(onClickListener);
	}
}