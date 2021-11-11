package com.jordan.betcher.siviso.siviso.list;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.database.Database;

class SimpleCallback_SwipeToDelete extends ItemTouchHelper.SimpleCallback
{
	
	private final Adapter_SivisoListView adapter;
	private final Helper_SimpleCallback_SwipeToDelete swipeToDeleteHelper;
	
	public SimpleCallback_SwipeToDelete(
	Adapter_SivisoListView adapter,
	Helper_SimpleCallback_SwipeToDelete swipeToDeleteHelper)
	{
		super(0, ItemTouchHelper.RIGHT);
		this.adapter = adapter;
		this.swipeToDeleteHelper = swipeToDeleteHelper;
	}
	
	@Override
	public int getMovementFlags(
	@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder)
	{
		return makeMovementFlags(0, ItemTouchHelper.RIGHT);
	}
	
	@Override
	public boolean onMove(
	@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder,
	@NonNull RecyclerView.ViewHolder target)
	{
		return false;//TODO ?
	}
	
	@Override
	public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction)
	{
		Database database = adapter.database();
		int position = swipeToDeleteHelper.positionOf(viewHolder);
		int index = adapter.itemPositionToSivisoIndex(position);
		if(position != 0)
		{
			database.delete(index);
			swipeToDeleteHelper.notifyAdapterItemRemoved(adapter, position);
		}
	}
	
}
