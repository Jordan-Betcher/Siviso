package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

class OnRowSelect_OnViewInit_HighlightAndScrollTo implements OnRowSelect, OnViewInit
{
	
	public View previousView;
	public int previousColor = 0;
	int indexOfSelectedSiviso = -1;
	private LinearLayoutManager linearLayoutManager;
	
	public OnRowSelect_OnViewInit_HighlightAndScrollTo(LinearLayoutManager linearLayoutManager, HighlightView highlightView)
	{
		this.linearLayoutManager = linearLayoutManager;
	}
	
	@Override
	public void onSelect(int indexOfSiviso)
	{
		indexOfSelectedSiviso = indexOfSiviso;
		View view = linearLayoutManager.findViewByPosition(indexOfSiviso + 1);
		if(view == null)
		{
			linearLayoutManager.scrollToPosition(indexOfSiviso + 1);
		}
		else
		{
			//TODO highlight view
		}
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
