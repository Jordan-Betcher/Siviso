package com.jordan.betcher.siviso.siviso.list;

import androidx.recyclerview.widget.RecyclerView;

class OnSivisoSelect_OnViewHolderInit_HighlightAndScrollTo
implements OnSivisoSelect, OnViewHolderInit
{
	int indexOfSelectedSiviso = -1;
	private RecyclerView recyclerView;
	private HighlightView highlightView;
	
	public OnSivisoSelect_OnViewHolderInit_HighlightAndScrollTo(RecyclerView recyclerView, HighlightView highlightView)
	{
		this.recyclerView = recyclerView;
		this.highlightView = highlightView;
	}
	
	@Override
	public void onSivisoSelect(int indexOfSiviso)
	{
		indexOfSelectedSiviso = indexOfSiviso;
		ViewHolder_Abstract viewHolder = (ViewHolder_Abstract) recyclerView.findViewHolderForAdapterPosition(indexOfSiviso + 1);
		if(isVisible(viewHolder))
		{
			highlightView.highlight(viewHolder.background());
		}
		else
		{
			recyclerView.scrollToPosition(indexOfSiviso + 1);
		}
	}
	
	private boolean isVisible(ViewHolder_Abstract viewHolder)
	{
		return viewHolder != null;
	}
	
	@Override
	public void bindingView(int indexOfView, ViewHolder_Abstract viewHolder)
	{
		if(indexOfSelectedSiviso != -1 && indexOfView == indexOfSelectedSiviso + 1)
		{
			highlightView.highlight(viewHolder.background());
		}
	}
}
