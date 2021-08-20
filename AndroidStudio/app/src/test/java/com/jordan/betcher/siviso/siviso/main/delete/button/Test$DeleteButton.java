package com.jordan.betcher.siviso.siviso.main.delete.button;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.widget.Button;

import org.junit.Test;

public class Test$DeleteButton
{
	@Test
	public void _buttonOnClickListener_buttonSetOnClickListener()
	{
		Button button = mock(Button.class);
		OnClickListener_DeleteSelected deleteSelected = mock(OnClickListener_DeleteSelected.class);
		
		DeleteButton deleteButton = new DeleteButton(button, deleteSelected);
		
		verify(button, times(1)).setOnClickListener(deleteSelected);
	}
	
	@Test
	public void _button_enabledFalse()
	{
		Button button = mock(Button.class);
		OnClickListener_DeleteSelected deleteSelected = mock(OnClickListener_DeleteSelected.class);
		
		DeleteButton deleteButton = new DeleteButton(button, deleteSelected);
		
		verify(button, times(1)).setEnabled(false);
	}
}