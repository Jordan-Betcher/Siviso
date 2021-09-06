package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

class OnSivisoSelect_OnViewInit_HighlightAndScrollTo implements OnSivisoSelect, OnViewInit
{
	int indexOfSelectedSiviso = -1;
	private LinearLayoutManager linearLayoutManager;
	
	public OnSivisoSelect_OnViewInit_HighlightAndScrollTo(LinearLayoutManager linearLayoutManager, HighlightView highlightView)
	{
		this.linearLayoutManager = linearLayoutManager;
	}
	
	@Override
	public void onSivisoSelect(int indexOfSiviso)
	{
		indexOfSelectedSiviso = indexOfSiviso;
		View view = linearLayoutManager.findViewByPosition(indexOfSiviso + 1);
		if(isVisible(view))
		{
			//TODO highlight view
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
		if(indexOfSelectedSiviso != -1 && indexOfView == indexOfSelectedSiviso + 1)
		{
			//TODO highlight view
		}
	}
}
