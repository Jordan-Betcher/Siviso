package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

class OnSelect_SelectSiviso implements OnSelect, OnBindView
{
	
	public View previousView;
	public int previousColor = 0;
	int indexOfSelectedSiviso = -1;
	private LinearLayoutManager linearLayoutManager;
	private int highlightColor;
	
	public OnSelect_SelectSiviso(LinearLayoutManager linearLayoutManager, int highlightColor)
	{
		this.linearLayoutManager = linearLayoutManager;
		this.highlightColor = highlightColor;
	}
	
	@Override
	public void onSelect(int indexOfSiviso)
	{
		indexOfSelectedSiviso = indexOfSiviso;
		if(linearLayoutManager.findViewByPosition(indexOfSiviso + 1) == null)
		{
			linearLayoutManager.scrollToPosition(indexOfSiviso + 1);
		}
		else
		{
			linearLayoutManager.findViewByPosition(indexOfSiviso + 1).setBackgroundColor(0);
		}
	}
	
	@Override
	public void bindingView(int indexOfView, View view)
	{
		if(indexOfSelectedSiviso != -1 && indexOfView == indexOfSelectedSiviso + 1)
		{
			view.setBackgroundColor(highlightColor);
			
			if(previousView != null)
			{
				previousView.setBackgroundColor(previousColor);
			}
			
			previousView = view;
		}
	}
}
