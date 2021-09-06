package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

class OnSelect_SelectSiviso implements OnSelect, OnBindView
{
	
	public View previousView;
	public int previousColor = 0;
	int indexOfSelectedSiviso = -1;
	private LinearLayoutManager linearLayoutManager;
	
	public OnSelect_SelectSiviso(LinearLayoutManager linearLayoutManager, HighlightView highlightView)
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
			//TODO set previous view color to previous color
			//TODO set previous view to current View
		}
	}
	
	@Override
	public void bindingView(int indexOfView, View view)
	{
		if(indexOfSelectedSiviso != -1 && indexOfView == indexOfSelectedSiviso + 1)
		{
		
		}
	}
}
