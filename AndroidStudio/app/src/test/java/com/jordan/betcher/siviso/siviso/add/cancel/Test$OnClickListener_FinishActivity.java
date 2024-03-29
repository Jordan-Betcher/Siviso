package com.jordan.betcher.siviso.siviso.add.cancel;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.jordan.betcher.siviso.siviso.add.A_Activity_Add;

import org.junit.Test;

public class Test$OnClickListener_FinishActivity
{
	@Test
	public void _activity_finishActivity()
	{
		A_Activity_Add activity = mock(A_Activity_Add.class);
		
		new OnClickListener_FinishActivity(activity);
		
		verify(activity, times(0)).finish();
	}
	
	@Test
	public void onClick_activity_finishActivity()
	{
		A_Activity_Add activity = mock(A_Activity_Add.class);
		
		OnClickListener_FinishActivity stopActivity = new OnClickListener_FinishActivity(activity);
		stopActivity.onClick(null);
		
		verify(activity, times(1)).finish();
	}
}