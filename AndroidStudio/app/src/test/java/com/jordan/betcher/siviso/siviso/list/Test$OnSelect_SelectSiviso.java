package com.jordan.betcher.siviso.siviso.list;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

import org.junit.Test;

public class Test$OnSelect_SelectSiviso
{
	@Test
	public void bindingView_1ViewSelected0_highlight0()
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