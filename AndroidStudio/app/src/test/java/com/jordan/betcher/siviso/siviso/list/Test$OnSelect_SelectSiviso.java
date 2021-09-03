package com.jordan.betcher.siviso.siviso.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

import org.junit.Test;

public class Test$OnSelect_SelectSiviso
{
	@Test
	public void onSelect_1ViewNull_Selected1()
	{
		int indexOfSiviso = 1;
		int highlightColor = 0;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		when(linearLayoutManager.findViewByPosition(indexOfSiviso)).thenReturn(view);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(linearLayoutManager, highlightColor);
		selectSiviso.onSelect(indexOfSiviso);
		
		int selected = selectSiviso.indexOfSelectedSiviso;
		assertEquals(indexOfSiviso, selected);
	}
	
	@Test
	public void onSelect_0ViewNull_Selected0()
	{
		int indexOfSiviso = 0;
		int highlightColor = 0;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		when(linearLayoutManager.findViewByPosition(indexOfSiviso)).thenReturn(view);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(linearLayoutManager, highlightColor);
		selectSiviso.onSelect(indexOfSiviso);
		
		int selected = selectSiviso.indexOfSelectedSiviso;
		assertEquals(indexOfSiviso, selected);
	}
	
	@Test
	public void onSelect_0View_()
	{
		int indexOfSiviso = 0;
		int highlightColor = 0;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		when(linearLayoutManager.findViewByPosition(indexOfSiviso)).thenReturn(view);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(linearLayoutManager, highlightColor);
		selectSiviso.onSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(0)).scrollToPosition(anyInt());
	}
	
	@Test
	public void onSelect_0View_0ScrollTo()
	{
		int indexOfSiviso = 0;
		int highlightColor = 0;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		when(linearLayoutManager.findViewByPosition(indexOfSiviso)).thenReturn(view);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(linearLayoutManager, highlightColor);
		selectSiviso.onSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(0)).scrollToPosition(anyInt());
	}
	
	@Test
	public void bindingView_0ViewSelectedNegative1_PreviousViewIsNotView()
	{
		int indexOfView = 0;
		int highlightColor = 0;
		int indexOfSelectedSiviso = -1;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.bindingView(indexOfView, view);
		
		View actualView = selectSiviso.previousView;
		assertNotEquals(view, actualView);
	}
	
	@Test
	public void bindingView_2ViewSelected1_PreviousViewIsView()
	{
		int indexOfView = 2;
		int highlightColor = 0;
		int indexOfSelectedSiviso = 1;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.bindingView(indexOfView, view);
		
		View actualView = selectSiviso.previousView;
		assertEquals(view, actualView);
	}
	
	@Test
	public void bindingView_2ViewSelected0_PreviousViewIsNotView()
	{
		int indexOfView = 2;
		int highlightColor = 0;
		int indexOfSelectedSiviso = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.bindingView(indexOfView, view);
		
		View actualView = selectSiviso.previousView;
		assertNotEquals(view, actualView);
	}
	
	@Test
	public void bindingView_1ViewSelected0_PreviousViewIsView()
	{
		int indexOfView = 1;
		int highlightColor = 0;
		int indexOfSelectedSiviso = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.bindingView(indexOfView, view);
		
		View actualView = selectSiviso.previousView;
		assertEquals(view, actualView);
	}
	
	@Test
	public void bindingView_1ViewSelected0Color0PreviousColor0PreviousView_PreviousViewSetColor0()
	{
		int indexOfView = 1;
		int indexOfSelectedSiviso = 0;
		int highlightColor = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		View previousView = mock(View.class);
		int previousColor = 0;
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.previousView = previousView;
		selectSiviso.previousColor = previousColor;
		selectSiviso.bindingView(indexOfView, view);
		
		verify(previousView, times(1)).setBackgroundColor(previousColor);
	}
	
	@Test
	public void bindingView_0ViewSelectedNegative1Color0PreviousColor1PreviousView_0PreviousViewSetColor()
	{
		int indexOfView = 0;
		int indexOfSelectedSiviso = -1;
		int highlightColor = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		View previousView = mock(View.class);
		int previousColor = 1;
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.previousView = previousView;
		selectSiviso.previousColor = previousColor;
		selectSiviso.bindingView(indexOfView, view);
		
		verify(previousView, times(0)).setBackgroundColor(anyInt());
	}
	
	@Test
	public void bindingView_2ViewSelected1Color0PreviousColor1PreviousView_PreviousViewSetColor1()
	{
		int indexOfView = 2;
		int indexOfSelectedSiviso = 1;
		int highlightColor = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		View previousView = mock(View.class);
		int previousColor = 1;
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.previousView = previousView;
		selectSiviso.previousColor = previousColor;
		selectSiviso.bindingView(indexOfView, view);
		
		verify(previousView, times(1)).setBackgroundColor(previousColor);
	}
	
	@Test
	public void bindingView_2ViewSelected0Color0PreviousColor1PreviousView_0PreviousViewSetColor()
	{
		int indexOfView = 2;
		int indexOfSelectedSiviso = 0;
		int highlightColor = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		View previousView = mock(View.class);
		int previousColor = 1;
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.previousView = previousView;
		selectSiviso.previousColor = previousColor;
		selectSiviso.bindingView(indexOfView, view);
		
		verify(previousView, times(0)).setBackgroundColor(anyInt());
	}
	
	@Test
	public void bindingView_1ViewSelected0Color0PreviousColor1PreviousView_PreviousViewSetColor1()
	{
		int indexOfView = 1;
		int indexOfSelectedSiviso = 0;
		int highlightColor = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		View previousView = mock(View.class);
		int previousColor = 1;
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.previousView = previousView;
		selectSiviso.previousColor = previousColor;
		selectSiviso.bindingView(indexOfView, view);
		
		verify(previousView, times(1)).setBackgroundColor(previousColor);
	}
	
	@Test
	public void onSelect_1ViewNull_ScrollTo2()
	{
		int indexOfSiviso = 1;
		int highlightColor = 0;
		int scrollToPosition = 2;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		when(linearLayoutManager.findViewByPosition(indexOfSiviso)).thenReturn(view);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(linearLayoutManager, highlightColor);
		selectSiviso.onSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(1)).scrollToPosition(scrollToPosition);
	}
	
	@Test
	public void onSelect_0ViewNull_ScrollTo1()
	{
		int indexOfSiviso = 0;
		int highlightColor = 0;
		int scrollToPosition = 1;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		when(linearLayoutManager.findViewByPosition(indexOfSiviso)).thenReturn(view);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(linearLayoutManager, highlightColor);
		selectSiviso.onSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(1)).scrollToPosition(scrollToPosition);
	}
	
	@Test
	public void bindingView_1ViewSelected0Color1_highlight1()
	{
		int indexOfView = 1;
		int indexOfSelectedSiviso = 0;
		int highlightColor = 1;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.bindingView(indexOfView, view);
		
		verify(view, times(1)).setBackgroundColor(highlightColor);
	}
	
	@Test
	public void bindingView_2ViewSelected1Color0_highlight0()
	{
		int indexOfView = 2;
		int indexOfSelectedSiviso = 1;
		int highlightColor = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.bindingView(indexOfView, view);
		
		verify(view, times(1)).setBackgroundColor(highlightColor);
	}
	
	@Test
	public void bindingView_2ViewSelected0Color0_0highlight0()
	{
		int indexOfView = 2;
		int indexOfSelectedSiviso = 0;
		int highlightColor = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.bindingView(indexOfView, view);
		
		verify(view, times(0)).setBackgroundColor(anyInt());
	}
	
	@Test
	public void __selectedSivisoNegative1()
	{
		int highlightColor = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		
		int actualSelected = selectSiviso.indexOfSelectedSiviso;
		assertEquals(-1, actualSelected);
	}
	
	@Test
	public void bindingView_1ViewSelectedNegative1_0highlight()
	{
		int indexOfView = 1;
		int indexOfSelectedSiviso = -1;
		int highlightColor = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.bindingView(indexOfView, view);
		
		verify(view, times(0)).setBackgroundColor(anyInt());
	}
	
	@Test
	public void bindingView_1ViewSelected0Color0_highlight0()
	{
		int indexOfView = 1;
		int indexOfSelectedSiviso = 0;
		int highlightColor = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		
		OnSelect_SelectSiviso selectSiviso = new OnSelect_SelectSiviso(layoutManager, highlightColor);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.bindingView(indexOfView, view);
		
		verify(view, times(1)).setBackgroundColor(highlightColor);
	}
}