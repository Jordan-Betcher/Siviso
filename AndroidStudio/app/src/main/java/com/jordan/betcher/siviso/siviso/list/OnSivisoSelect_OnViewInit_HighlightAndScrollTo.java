package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

class OnSivisoSelect_OnViewInit_HighlightAndScrollTo implements OnSivisoSelect, OnViewInit
{
	int indexOfSelectedSiviso = -1;
	private LinearLayoutManager linearLayoutManager;
	private HighlightView highlightView;
	
	public OnSivisoSelect_OnViewInit_HighlightAndScrollTo(LinearLayoutManager linearLayoutManager, HighlightView highlightView)
	{
		this.linearLayoutManager = linearLayoutManager;
		this.highlightView = highlightView;
	}
	
	@Override
	public void onSivisoSelect(int indexOfSiviso)
	{
		indexOfSelectedSiviso = indexOfSiviso;
		View view = linearLayoutManager.findViewByPosition(indexOfSiviso + 1);
		if(isVisible(view))
		{
			highlightView.highlight(view);
		}
		else
		{
			linearLayoutManager.scrollToPosition(indexOfSiviso + 1);
		}
	}
	
	private boolean isVisible(View view)
	{
		return view != null;
	}
	
	@Override
	public void bindingView(int indexOfView, View view)
	{
		highlightView.highlight(view);
		
		/*
		if(indexOfSelectedSiviso != -1 && indexOfView == indexOfSelectedSiviso + 1)
		{
			//TODO highlight view
		}
		//*/
	}
}
