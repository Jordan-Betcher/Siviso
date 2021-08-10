package com.jordan.betcher.siviso.siviso.list;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.database.Database;

class Adapter_SivisoListView
extends RecyclerView.Adapter<ViewHolder_SetSpinner>
{
	private Database database;
	private Factory_ViewHolderDefault factoryViewHolderDefault;
	private Factory_ViewHolderSiviso factoryViewHolderSiviso;
	private Factory_ViewHolderAdd factoryViewHolderAdd;
	
	public Adapter_SivisoListView(Database database,
	                              Factory_ViewHolderDefault factoryViewHolder,
	                              Factory_ViewHolderSiviso factoryViewHolderSiviso,
	                              Factory_ViewHolderAdd factoryViewHolderAdd)
	{
		this.database = database;
		this.factoryViewHolderDefault = factoryViewHolder;
		this.factoryViewHolderSiviso = factoryViewHolderSiviso;
		this.factoryViewHolderAdd = factoryViewHolderAdd;
	}
	
	enum ViewType
	{
		DEFAULT,
		SIVISO,
		ADD
	}
	
	@Override
	public int getItemViewType(int index)
	{
		if(index == 0)
		{
			return ViewType.DEFAULT.ordinal();
		}
		else if(index == indexOfListItemAdd())
		{
			return ViewType.ADD.ordinal();
		}
		else
		{
			return ViewType.SIVISO.ordinal();
		}
	}
	
	@NonNull
	@Override
	public ViewHolder_SetSpinner onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
	{
		if(viewType == ViewType.DEFAULT.ordinal())
		{
			return factoryViewHolderDefault.create(parent);
		}
		else if(viewType == ViewType.ADD.ordinal())
		{
			return factoryViewHolderAdd.create(parent);
		}
		else
		{
			return factoryViewHolderSiviso.create(parent);
		}
	}
	
	@Override
	public void onBindViewHolder(@NonNull ViewHolder_SetSpinner viewHolder, int index)
	{
		int sivisoDataIndex = listPositionToSivisoIndex(index);
		viewHolder.init(database, sivisoDataIndex);
	}
	
	private int indexOfListItemAdd()
	{
		return getItemCount() - 1;
	}
	
	private int listPositionToSivisoIndex(int index)
	{
		return index - 1;
	}
	
	@Override
	public int getItemCount()
	{
		return database.count() + 2;
	}
}
