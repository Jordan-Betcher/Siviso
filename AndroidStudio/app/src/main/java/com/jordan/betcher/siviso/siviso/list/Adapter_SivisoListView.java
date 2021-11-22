package com.jordan.betcher.siviso.siviso.list;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem.Factory_ViewHolderSiviso;

class Adapter_SivisoListView
extends RecyclerView.Adapter<ViewHolder_Abstract>
{
	private final Database database;
	private final Factory_ViewHolderSiviso factoryViewHolderSiviso;
	private OnViewHolderInit onViewHolderInit;
	
	public Adapter_SivisoListView(
	Database database,
	Factory_ViewHolderSiviso factoryViewHolderSiviso)
	{
		this.database = database;
		this.factoryViewHolderSiviso = factoryViewHolderSiviso;
	}
	
	public void setOnViewInit(OnViewHolderInit onViewHolderInit)
	{
		this.onViewHolderInit = onViewHolderInit;
	}
	
	public Database database()
	{
		return database;
	}
	
	@NonNull
	@Override
	public ViewHolder_Abstract onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
	{
		return factoryViewHolderSiviso.create(parent);
	}
	
	@Override
	public void onBindViewHolder(@NonNull ViewHolder_Abstract viewHolder, int index)
	{
		if(onViewHolderInit != null)
		{
			onViewHolderInit.bindingView(index, viewHolder);
		}
		viewHolder.init(database, index);
	}
	
	@Override
	public int getItemCount()
	{
		return database.sivisos().size();
	}
	
	
}
