package com.jordan.betcher.siviso.siviso.list;

import androidx.recyclerview.widget.LinearLayoutManager;

class OnSelect_SelectSiviso implements OnSelect, OnBindView
{
	private LinearLayoutManager linearLayoutManager;
	
	public OnSelect_SelectSiviso(LinearLayoutManager linearLayoutManager)
	{
		this.linearLayoutManager = linearLayoutManager;
	}
	
	@Override
	public void onSelect(int indexOfSiviso)
	{
		//TODO have sivisoList onSelect highlight that index
		linearLayoutManager.scrollToPosition(indexOfSiviso + 1);
	}
	
	@Override
	public void bindingView(int indexOfView)
	{
		//TODO
	}
}
