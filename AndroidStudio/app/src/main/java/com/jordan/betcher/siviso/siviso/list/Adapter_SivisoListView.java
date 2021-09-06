package com.jordan.betcher.siviso.siviso.list;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.viewholderdefault.Factory_ViewHolderDefault;
import com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem.Factory_ViewHolderSiviso;

class Adapter_SivisoListView
extends RecyclerView.Adapter<ViewHolder_Abstract>
{
	private Database database;
	private Factory_ViewHolderDefault factoryViewHolderDefault;
	private Factory_ViewHolderSiviso factoryViewHolderSiviso;
	
	public Adapter_SivisoListView(Database database,
	                              Factory_ViewHolderDefault factoryViewHolder,
	                              Factory_ViewHolderSiviso factoryViewHolderSiviso)
	{
		this.database = database;
		this.factoryViewHolderDefault = factoryViewHolder;
		this.factoryViewHolderSiviso = factoryViewHolderSiviso;
	}
	
	public void setOnViewInit(OnViewInit onViewInit)
	{
		//TODO
	}
	
	enum ViewType
	{
		DEFAULT,
		SIVISO
	}
	
	@Override
	public int getItemViewType(int index)
	{
		if(index == 0)
		{
			return ViewType.DEFAULT.ordinal();
		}
		else
		{
			return ViewType.SIVISO.ordinal();
		}
	}
	
	@NonNull
	@Override
	public ViewHolder_Abstract onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
	{
		if(viewType == ViewType.DEFAULT.ordinal())
		{
			return factoryViewHolderDefault.create(parent);
		}
		else
		{
			return factoryViewHolderSiviso.create(parent);
		}
	}
	
	@Override
	public void onBindViewHolder(@NonNull ViewHolder_Abstract viewHolder, int index)
	{
		int sivisoDataIndex = listPositionToSivisoIndex(index);
		viewHolder.init(database, sivisoDataIndex);
	}
	
	private int listPositionToSivisoIndex(int index)
	{
		return index - 1;
	}
	
	@Override
	public int getItemCount()
	{
		return database.sivisos().length + 1;
	}
	
	
}
