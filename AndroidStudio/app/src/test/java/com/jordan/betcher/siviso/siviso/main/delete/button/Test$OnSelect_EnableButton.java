package com.jordan.betcher.siviso.siviso.main.delete.button;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$OnSelect_EnableButton
{
	@Test
	public void onSelect_deleteButton_enable()
	{
		DeleteButton deleteButton = mock(DeleteButton.class);
		
		OnSelect_EnableButton onSelect = new OnSelect_EnableButton(deleteButton);
		onSelect.onSelect(null);
		
		verify(deleteButton,times(1)).enable();
	}
}