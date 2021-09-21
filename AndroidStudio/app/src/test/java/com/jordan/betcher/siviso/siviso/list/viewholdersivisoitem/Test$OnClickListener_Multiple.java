package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;

import org.junit.Test;

public class Test$OnClickListener_Multiple
{
	@Test
	public void onClick_viewOnRowClick_onRowClickView()
	{
		View  view = mock(View.class);
		OnRowClick onRowClick = mock(OnRowClick.class);
		
		OnClickListener_Multiple multiple = new OnClickListener_Multiple(onRowClick);
		multiple.onClick(view);
		
		verify(onRowClick, times(1)).call(view);
	}
}