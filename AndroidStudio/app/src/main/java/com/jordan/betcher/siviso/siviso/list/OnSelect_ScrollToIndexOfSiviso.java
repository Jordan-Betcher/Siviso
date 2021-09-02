package com.jordan.betcher.siviso.siviso.list;

import androidx.recyclerview.widget.LinearLayoutManager;

class OnSelect_ScrollToIndexOfSiviso implements OnSelect
{
	private LinearLayoutManager linearLayoutManager;
	
	public OnSelect_ScrollToIndexOfSiviso(LinearLayoutManager linearLayoutManager)
	{
		this.linearLayoutManager = linearLayoutManager;
	}
	
	@Override
	public void onSelect(int indexOfSiviso)
	{
		linearLayoutManager.scrollToPosition(1);
	}
}
