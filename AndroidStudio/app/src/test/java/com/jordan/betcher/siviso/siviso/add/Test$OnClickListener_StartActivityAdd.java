package com.jordan.betcher.siviso.siviso.add;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.Activity;
import android.content.Intent;

import org.junit.Test;

public class Test$OnClickListener_StartActivityAdd
{
	@Test
	public void _activityIntentAdd_0startActivityWithIntentAdd()
	{
		Activity activity = mock(Activity.class);
		Factory_Intent_Add factory = mock(Factory_Intent_Add.class);
		Intent intent = mock(Intent.class);
		when(factory.create()).thenReturn(intent);
		
		new OnClickListener_StartActivityAdd(activity, factory);
		
		verify(activity, times(0)).startActivity(intent);
	}
	
	@Test
	public void onClick_activityIntentAdd_startActivityWithIntentAdd()
	{
		Activity activity = mock(Activity.class);
		Factory_Intent_Add factory = mock(Factory_Intent_Add.class);
		Intent intent = mock(Intent.class);
		when(factory.create()).thenReturn(intent);
		
		OnClickListener_StartActivityAdd onClickListener = new OnClickListener_StartActivityAdd(activity, factory);
		onClickListener.onClick(null);
		
		verify(activity, times(1)).startActivity(intent);
	}
}