package com.jordan.betcher.siviso.siviso.list;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import androidx.recyclerview.widget.LinearLayoutManager;

import org.junit.Test;

public class Test$OnSelect_ScrollToIndexOfSiviso
{
	@Test
	public void onSelect_1_scrollTo2()
	{
		int indexOfSiviso = 1;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		
		OnSelect_ScrollToIndexOfSiviso scrollToIndexOfSiviso = new OnSelect_ScrollToIndexOfSiviso(linearLayoutManager);
		scrollToIndexOfSiviso.onSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(1)).scrollToPosition(indexOfSiviso + 1);
	}
	
	@Test
	public void __0scrollTo()
	{
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		
		new OnSelect_ScrollToIndexOfSiviso(linearLayoutManager);
		
		verify(linearLayoutManager, times(0)).scrollToPosition(anyInt());
	}
	
	@Test
	public void onSelect_0_scrollTo1()
	{
		int indexOfSiviso = 0;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		
		OnSelect_ScrollToIndexOfSiviso scrollToIndexOfSiviso = new OnSelect_ScrollToIndexOfSiviso(linearLayoutManager);
		scrollToIndexOfSiviso.onSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(1)).scrollToPosition(indexOfSiviso + 1);
	}
}