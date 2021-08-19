package com.jordan.betcher.siviso.siviso.add;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.jordan.betcher.siviso.siviso.add.cancel.OnClickListener_StopActivity;

import org.junit.Test;

public class Test$OnClickListener_StopActivity
{
	@Test
	public void _activity_finishActivity()
	{
		A_Activity_Add activity = mock(A_Activity_Add.class);
		
		new OnClickListener_StopActivity(activity);
		
		verify(activity, times(0)).finish();
	}
	
	@Test
	public void onClick_activity_finishActivity()
	{
		A_Activity_Add activity = mock(A_Activity_Add.class);
		
		OnClickListener_StopActivity stopActivity = new OnClickListener_StopActivity(activity);
		stopActivity.onClick(null);
		
		verify(activity, times(1)).finish();
	}
}