package com.jordan.betcher.siviso.siviso.permissions;

import android.widget.Button;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Test$PermissionsButton
{
	@Test
	public void __addButtonListenerRequestPermissions()
	{
		Button button = mock(Button.class);
		OnClickListenerRequestPermission onClickListenerRequestPermission = mock(OnClickListenerRequestPermission.class);
		
		new PermissionsButton(button, onClickListenerRequestPermission);
		
		verify(button, times(1)).setOnClickListener(onClickListenerRequestPermission);
	}
}