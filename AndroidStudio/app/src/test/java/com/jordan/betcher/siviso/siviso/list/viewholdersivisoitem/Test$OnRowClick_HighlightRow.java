package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;

import com.jordan.betcher.siviso.siviso.list.HighlightView;

import org.junit.Test;

public class Test$OnRowClick_HighlightRow
{
	@Test
	public void call_view_highlightViewView()
	{
		View view = mock(View.class);
		HighlightView highlightView = mock(HighlightView.class);
		
		OnRowClick_HighlightRow highlightRow = new OnRowClick_HighlightRow(highlightView);
		highlightRow.call(view);
		
		verify(highlightView, times(1)).highlight(view);
	}
}