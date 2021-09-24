package com.jordan.betcher.siviso.siviso.list;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.viewholderdefault.ViewHolder_Default;

class SimpleCallback_SwipeToDelete extends ItemTouchHelper.SimpleCallback
{
	
	private final Adapter_SivisoListView adapter;
	private A_ViewHolderHelper viewHolderHelper;
	
	public SimpleCallback_SwipeToDelete(
	Adapter_SivisoListView adapter,
	A_ViewHolderHelper viewHolderHelper){
		super(0,  ItemTouchHelper.RIGHT);
		this.adapter = adapter;
		this.viewHolderHelper = viewHolderHelper;
	}
	
	@Override
	public int getMovementFlags(
	@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder)
	{
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
		Database database = adapter.database();
		database.delete(0);
		//TODO
		//int position = viewHolder.getAdapterPosition();
		//adapter.deleteItem(position);
	}
	
}
