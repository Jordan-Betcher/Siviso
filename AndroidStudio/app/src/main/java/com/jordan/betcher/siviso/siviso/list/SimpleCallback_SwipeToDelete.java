package com.jordan.betcher.siviso.siviso.list;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.list.viewholderdefault.ViewHolder_Default;

class SimpleCallback_SwipeToDelete extends ItemTouchHelper.SimpleCallback
{
	
	private Adapter_SivisoListView adapter;
	
	public SimpleCallback_SwipeToDelete(Adapter_SivisoListView adapter){
		super(0,  ItemTouchHelper.RIGHT);
		//this.adapter = adapter;
	}
	
	@Override
	public int getMovementFlags(
	@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder)
	{
		//TODO
		if(viewHolder instanceof ViewHolder_Default) return 0;
		return ItemTouchHelper.RIGHT;
	}
	
	@Override
	public boolean onMove(
	@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder,
	@NonNull RecyclerView.ViewHolder target)
	{
		return false;
	}
	
	@Override
	public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction)
	{
		//TODO
		//int position = viewHolder.getAdapterPosition();
		//adapter.deleteItem(position);
	}
	
}
