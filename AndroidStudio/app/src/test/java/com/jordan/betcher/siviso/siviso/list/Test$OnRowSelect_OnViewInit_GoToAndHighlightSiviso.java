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

public class Test$OnRowSelect_OnViewInit_GoToAndHighlightSiviso
{
	
	@Test
	public void onSelect_1ViewNull_Selected1()
	{
		int indexOfSiviso = 1;
		HighlightView highlightView = mock(HighlightView.class);
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		int indexOfSivisoView = indexOfSiviso + 1;
		when(linearLayoutManager.findViewByPosition(indexOfSivisoView)).thenReturn(view);
		
		OnRowSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnRowSelect_OnViewInit_HighlightAndScrollTo(linearLayoutManager, highlightView);
		selectSiviso.onSelect(indexOfSiviso);
		
		int selected = selectSiviso.indexOfSelectedSiviso;
		assertEquals(indexOfSiviso, selected);
	}
	
	@Test
	public void onSelect_0ViewNull_Selected0()
	{
		int indexOfSiviso = 0;
		HighlightView highlightView = mock(HighlightView.class);
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		int indexOfSivisoView = indexOfSiviso + 1;
		when(linearLayoutManager.findViewByPosition(indexOfSivisoView)).thenReturn(view);
		
		OnRowSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnRowSelect_OnViewInit_HighlightAndScrollTo(linearLayoutManager, highlightView);
		selectSiviso.onSelect(indexOfSiviso);
		
		int selected = selectSiviso.indexOfSelectedSiviso;
		assertEquals(indexOfSiviso, selected);
	}
	
	@Test
	public void onSelect_0View_0ScrollTo()
	{
		int indexOfSiviso = 0;
		HighlightView highlightView = mock(HighlightView.class);
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		int indexOfSivisoView = indexOfSiviso + 1;
		when(linearLayoutManager.findViewByPosition(indexOfSivisoView)).thenReturn(view);
		
		OnRowSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnRowSelect_OnViewInit_HighlightAndScrollTo(linearLayoutManager, highlightView);
		selectSiviso.onSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(0)).scrollToPosition(anyInt());
	}
	
	@Test
	public void bindingView_0ViewSelectedNegative1_PreviousViewIsNotView()
	{
		int indexOfView = 0;
		HighlightView highlightView = mock(HighlightView.class);
		int indexOfSelectedSiviso = -1;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		
		OnRowSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnRowSelect_OnViewInit_HighlightAndScrollTo(layoutManager, highlightView);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.bindingView(indexOfView, view);
		
		View actualView = selectSiviso.previousView;
		assertNotEquals(view, actualView);
	}
	
	@Test
	public void bindingView_2ViewSelected0_PreviousViewIsNotView()
	{
		int indexOfView = 2;
		HighlightView highlightView = mock(HighlightView.class);
		int indexOfSelectedSiviso = 0;
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		
		OnRowSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnRowSelect_OnViewInit_HighlightAndScrollTo(layoutManager, highlightView);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.bindingView(indexOfView, view);
		
		View actualView = selectSiviso.previousView;
		assertNotEquals(view, actualView);
	}
	
	@Test
	public void bindingView_0ViewSelectedNegative1Color0PreviousColor1PreviousView_0PreviousViewSetColor()
	{
		int indexOfView = 0;
		int indexOfSelectedSiviso = -1;
		HighlightView highlightView = mock(HighlightView.class);
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		View view = mock(View.class);
		View previousView = mock(View.class);
		int previousColor = 1;
		
		OnRowSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnRowSelect_OnViewInit_HighlightAndScrollTo(layoutManager, highlightView);
		selectSiviso.indexOfSelectedSiviso = indexOfSelectedSiviso;
		selectSiviso.previousView = previousView;
		selectSiviso.previousColor = previousColor;
		selectSiviso.bindingView(indexOfView, view);
		
		verify(previousView, times(0)).setBackgroundColor(anyInt());
	}
	
	
	@Test
	public void onSelect_1ViewNull_ScrollTo2()
	{
		int indexOfSiviso = 1;
		HighlightView highlightView = mock(HighlightView.class);
		int scrollToPosition = 2;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		int indexOfSivisoView = indexOfSiviso + 1;
		when(linearLayoutManager.findViewByPosition(indexOfSivisoView)).thenReturn(view);
		
		OnRowSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnRowSelect_OnViewInit_HighlightAndScrollTo(linearLayoutManager, highlightView);
		selectSiviso.onSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(1)).scrollToPosition(scrollToPosition);
	}
	
	@Test
	public void onSelect_0ViewNull_ScrollTo1()
	{
		int indexOfSiviso = 0;
		HighlightView highlightView = mock(HighlightView.class);
		int scrollToPosition = 1;
		LinearLayoutManager linearLayoutManager = mock(LinearLayoutManager.class);
		View view = null;
		when(linearLayoutManager.findViewByPosition(indexOfSiviso)).thenReturn(view);
		
		OnRowSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnRowSelect_OnViewInit_HighlightAndScrollTo(linearLayoutManager, highlightView);
		selectSiviso.onSelect(indexOfSiviso);
		
		verify(linearLayoutManager, times(1)).scrollToPosition(scrollToPosition);
	}
	
	@Test
	public void __selectedSivisoNegative1()
	{
		HighlightView highlightView = mock(HighlightView.class);
		LinearLayoutManager layoutManager = mock(LinearLayoutManager.class);
		
		OnRowSelect_OnViewInit_HighlightAndScrollTo selectSiviso = new OnRowSelect_OnViewInit_HighlightAndScrollTo(layoutManager, highlightView);
		
		int actualSelected = selectSiviso.indexOfSelectedSiviso;
		assertEquals(-1, actualSelected);
	}
}