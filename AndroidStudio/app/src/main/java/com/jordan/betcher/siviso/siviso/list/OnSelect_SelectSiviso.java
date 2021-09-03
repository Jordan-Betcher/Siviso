package com.jordan.betcher.siviso.siviso.list;

import androidx.recyclerview.widget.LinearLayoutManager;

class OnSelect_SelectSiviso implements OnSelect
{
	private LinearLayoutManager linearLayoutManager;
	
	public OnSelect_SelectSiviso(LinearLayoutManager linearLayoutManager)
	{
		this.linearLayoutManager = linearLayoutManager;
	}
	
	@Override
	public void onSelect(int indexOfSiviso)
	{
		linearLayoutManager.scrollToPosition(indexOfSiviso + 1);
	}
}
