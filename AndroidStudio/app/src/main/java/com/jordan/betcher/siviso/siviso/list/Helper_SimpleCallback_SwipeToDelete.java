package com.jordan.betcher.siviso.siviso.list;

import androidx.recyclerview.widget.RecyclerView;

class Helper_SimpleCallback_SwipeToDelete
{
	
	public int positionOf(RecyclerView.ViewHolder viewHolder)
	{
		return viewHolder.getAdapterPosition();
	}
	
	public void notifyAdapterItemRemoved(Adapter_SivisoListView adapter, int position)
	{
		adapter.notifyItemRemoved(position);
	}
}
