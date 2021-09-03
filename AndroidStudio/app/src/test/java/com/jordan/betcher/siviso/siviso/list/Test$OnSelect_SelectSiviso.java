package com.jordan.betcher.siviso.siviso.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

import org.junit.Test;

public class Test$OnSelect_SelectSiviso
{
	
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