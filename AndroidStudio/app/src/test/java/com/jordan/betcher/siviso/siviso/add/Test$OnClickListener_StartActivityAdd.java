package com.jordan.betcher.siviso.siviso.add;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.app.Activity;

import org.junit.Test;

public class Test$OnClickListener_StartActivityAdd
{
	@Test
	public void _activityIntentAdd_0startActivityWithIntentAdd()
	{
		Activity activity = mock(Activity.class);
		Intent_Add intentAdd = mock(Intent_Add.class);
		
		new OnClickListener_StartActivityAdd(activity, intentAdd);
		
		verify(activity, times(0)).startActivity(intentAdd);
	}
	
	@Test
	public void onClick_activityIntentAdd_startActivityWithIntentAdd()
	{
		Activity activity = mock(Activity.class);
		Intent_Add intentAdd = mock(Intent_Add.class);
		
		OnClickListener_StartActivityAdd onClickListener = new OnClickListener_StartActivityAdd(activity, intentAdd);
		onClickListener.onClick(null);
		
		verify(activity, times(1)).startActivity(intentAdd);
	}
}