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
	public void highlight_PreviousViewPreviousColor0_setPreviousViewBackgroundTintListNull()
	{
		View previousView = mock(View.class);
		
		int color = 0;
		View view = mock(View.class);
		ColorDrawable colorDrawable = mock(ColorDrawable.class);
		when(view.getBackground()).thenReturn(colorDrawable);
		
		ColorDrawable previousColorDrawable = mock(ColorDrawable.class);
		when(previousView.getBackground()).thenReturn(previousColorDrawable);
		
		HighlightView highlightView = new HighlightView(color);
		highlightView.previous = previousView;
		highlightView.highlight(view);
		
		verify(previousColorDrawable, times(1)).setTintList(null);
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
	public void highlight_Color1View_SetTintTo1()
	{
		int color = 0;
		View view = mock(View.class);
		
		ColorDrawable colorDrawable = mock(ColorDrawable.class);
		when(view.getBackground()).thenReturn(colorDrawable);
		when(colorDrawable.getColor()).thenReturn(0);
		
		HighlightView highlightView = new HighlightView(color);
		highlightView.highlight(view);
		
		verify(colorDrawable, times(1)).setTint(color);
	}
	
	@Test
	public void highlight_Color0View_SetTint0()
	{
		int color = 0;
		View view = mock(View.class);
		
		ColorDrawable colorDrawable = mock(ColorDrawable.class);
		when(view.getBackground()).thenReturn(colorDrawable);
		when(colorDrawable.getColor()).thenReturn(0);
		
		HighlightView highlightView = new HighlightView(color);
		highlightView.highlight(view);
		
		verify(colorDrawable, times(1)).setTint(color);
	}
}