package com.jordan.betcher.siviso.siviso.add.confirm;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$OnComplete_EnableButton
{
	@Test
	public void onComplete__enableConfirmButton()
	{
		ConfirmButton confirmButton = mock(ConfirmButton.class);
		
		OnComplete_EnableButton onComplete = new OnComplete_EnableButton(confirmButton);
		onComplete.onComplete(null);
		
		verify(confirmButton, times(1)).enable();
	}
}