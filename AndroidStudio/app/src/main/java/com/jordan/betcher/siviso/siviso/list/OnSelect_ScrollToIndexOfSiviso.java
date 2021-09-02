package com.jordan.betcher.siviso.siviso.list;

import androidx.recyclerview.widget.LinearLayoutManager;

class OnSelect_ScrollToIndexOfSiviso implements OnSelect
{
	public OnSelect_ScrollToIndexOfSiviso(LinearLayoutManager linearLayoutManager)
	{
		linearLayoutManager.scrollToPosition(1);
	}
	
	@Override
	public void onSelect(int indexOfSiviso)
	{
	
	}
}
