package com.jordan.betcher.siviso.siviso.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.graphics.drawable.ColorDrawable;
import android.view.View;

import org.junit.Test;

public class Test$HighlightView
{
	@Test
	public void highlight_PreviousViewPreviousColor0_setPreviousViewBackgroundColorColor0()
	{
		View previousView = mock(View.class);
		int previuosColor = 0;
		
		int color = 0;
		int viewColor = 0;
		View view = mock(View.class);
		ColorDrawable colorDrawable = mock(ColorDrawable.class);
		when(view.getBackground()).thenReturn(colorDrawable);
		when(colorDrawable.getColor()).thenReturn(viewColor);
		
		HighlightView highlightView = new HighlightView(color);
		highlightView.previous = previousView;
		highlightView.previousColor = previuosColor;
		highlightView.highlight(view);
		
		verify(previousView, times(1)).setBackgroundColor(previuosColor);
	}
	
	@Test
	public void highlight_ViewColor0_PreviousColorEqualsViewColor0()
	{
		int color = 0;
		int viewColor = 0;
		View view = mock(View.class);
		ColorDrawable colorDrawable = mock(ColorDrawable.class);
		when(view.getBackground()).thenReturn(colorDrawable);
		when(colorDrawable.getColor()).thenReturn(viewColor);
		
		HighlightView highlightView = new HighlightView(color);
		highlightView.highlight(view);
		
		int previousColor = highlightView.previousColor;
		assertEquals(viewColor, previousColor);
	}
	
	@Test
	public void highlight_ViewColor1_PreviousColorEqualsViewColor1()
	{
		int color = 0;
		int viewColor = 1;
		View view = mock(View.class);
		ColorDrawable colorDrawable = mock(ColorDrawable.class);
		when(view.getBackground()).thenReturn(colorDrawable);
		when(colorDrawable.getColor()).thenReturn(viewColor);
		
		HighlightView highlightView = new HighlightView(color);
		highlightView.highlight(view);
		
		int previousColor = highlightView.previousColor;
		assertEquals(viewColor, previousColor);
	}
	
	@Test
	public void highlight_Color0View_PreviousEqualsView()
	{
		int color = 0;
		View view = mock(View.class);
		ColorDrawable colorDrawable = mock(ColorDrawable.class);
		when(view.getBackground()).thenReturn(colorDrawable);
		when(colorDrawable.getColor()).thenReturn(0);
		
		HighlightView highlightView = new HighlightView(color);
		highlightView.highlight(view);
		
		View previousView = highlightView.previous;
		assertEquals(view, previousView);
	}
	
	@Test
	public void highlight_Color1View_SetBackGroundColorTo1()
	{
		int color = 0;
		View view = mock(View.class);
		
		ColorDrawable colorDrawable = mock(ColorDrawable.class);
		when(view.getBackground()).thenReturn(colorDrawable);
		when(colorDrawable.getColor()).thenReturn(0);
		
		HighlightView highlightView = new HighlightView(color);
		highlightView.highlight(view);
		
		verify(view, times(1)).setBackgroundColor(color);
	}
	
	@Test
	public void highlight_Color0View_SetBackGroundColorTo0()
	{
		int color = 0;
		View view = mock(View.class);
		
		ColorDrawable colorDrawable = mock(ColorDrawable.class);
		when(view.getBackground()).thenReturn(colorDrawable);
		when(colorDrawable.getColor()).thenReturn(0);
		
		HighlightView highlightView = new HighlightView(color);
		highlightView.highlight(view);
		
		verify(view, times(1)).setBackgroundColor(color);
	}
}