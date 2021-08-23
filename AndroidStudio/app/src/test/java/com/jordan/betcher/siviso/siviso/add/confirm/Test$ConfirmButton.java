package com.jordan.betcher.siviso.siviso.add.confirm;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.widget.Button;

import org.junit.Test;

public class Test$ConfirmButton
{
	
	@Test
	public void _buttonSaveData_0setButtonEnabledFalse()
	{
		Button button = mock(Button.class);
		OnClick_SaveSivisoAndFinishActivity saveData = mock(
		OnClick_SaveSivisoAndFinishActivity.class);
		
		ConfirmButton confirmButton = new ConfirmButton(button, saveData);
		
		verify(button, times(0)).setEnabled(true);
	}
	
	@Test
	public void enable_buttonSaveData_setButtonEnabledFalse()
	{
		Button button = mock(Button.class);
		OnClick_SaveSivisoAndFinishActivity saveData = mock(
		OnClick_SaveSivisoAndFinishActivity.class);
		
		ConfirmButton confirmButton = new ConfirmButton(button, saveData);
		confirmButton.enable();
		
		verify(button, times(1)).setEnabled(true);
	}
	
	@Test
	public void _buttonSaveData_setButtonEnabledFalse()
	{
		Button button = mock(Button.class);
		OnClick_SaveSivisoAndFinishActivity saveData = mock(
		OnClick_SaveSivisoAndFinishActivity.class);
		
		ConfirmButton confirmButton = new ConfirmButton(button, saveData);
		
		verify(button, times(1)).setEnabled(false);
	}
	
	@Test
	public void _buttonSaveData_setOnClickSaveData()
	{
		Button button = mock(Button.class);
		OnClick_SaveSivisoAndFinishActivity saveData = mock(
		OnClick_SaveSivisoAndFinishActivity.class);
		
		ConfirmButton confirmButton = new ConfirmButton(button, saveData);
		
		verify(button, times(1)).setOnClickListener(saveData);
	}
}