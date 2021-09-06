package com.jordan.betcher.siviso.siviso.list;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;

import org.junit.Test;

public class Test$HighlightView
{
	@Test
	public void highlight_Color0View_SetBackGroundColorTo0()
	{
		int color = 0;
		View view = mock(View.class);
		
		HighlightView highlightView = new HighlightView(color);
		highlightView.highlight(view);
		
		verify(view, times(1)).setBackgroundColor(color);
	}
}