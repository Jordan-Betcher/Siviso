package com.jordan.betcher.siviso.siviso.list;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import java.util.ArrayList;

class Adapter_SivisoListView
extends RecyclerView.Adapter<ViewHolder_Abstract>
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
	public int getItemViewType(int position)
	{
		if(position == 0)
		{
			return ViewType.DEFAULT.ordinal();
		}
		else if(position == getItemCount() - 1)
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
	public ViewHolder_Abstract onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
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
	public void onBindViewHolder(@NonNull ViewHolder_Abstract viewHolder, int position)
	{
		//TODO swap to using Position instead of instanceof
		//Position 0 -> Default
		//getItemCount() - 1 is Add
		//Inbetween is Siviso
		if(viewHolder instanceof ViewHolder_Default)
		{
			ViewHolder_Default viewHolder_default = (ViewHolder_Default)viewHolder;
			viewHolder_default.setSiviso(database.defaultSiviso());
		}
		else if(viewHolder instanceof ViewHolder_Siviso)
		{
			ViewHolder_Siviso viewHolder_siviso = (ViewHolder_Siviso)viewHolder;
			int sivisoDataIndex = listPositionToSivisoIndex(position);
			
			ArrayList<SivisoData> sivisoDatas = database.sivisoDatas();
			SivisoData sivisoData = sivisoDatas.get(sivisoDataIndex);
			
			viewHolder_siviso.setSivisoData(sivisoData);
		}
	}
	
	private int listPositionToSivisoIndex(int position)
	{
		return position - 1;
	}
	
	@Override
	public int getItemCount()
	{
		return database.sivisoDatas().size() + 2;
	}
}
