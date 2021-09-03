package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;

class OnSelect_SelectSiviso implements OnSelect, OnBindView
{
	
	int indexOfSelectedSiviso = 0;
	
	public OnSelect_SelectSiviso(LinearLayoutManager linearLayoutManager, int highlightColor)
	{
	}
	
	@Override
	public void onSelect(int indexOfSiviso)
	{
		//TODO have sivisoList onSelect highlight that index
	}
	
	@Override
	public void bindingView(int indexOfView, View view)
	{
		//TODO
		view.setBackgroundColor(0);
	}
}
