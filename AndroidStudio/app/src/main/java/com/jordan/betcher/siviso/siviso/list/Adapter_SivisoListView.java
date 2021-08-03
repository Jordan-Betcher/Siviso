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
	private Factory_ViewHolder factoryViewHolder;
	
	public Adapter_SivisoListView(Database database, Factory_ViewHolder factoryViewHolder)
	{
		this.database = database;
		this.factoryViewHolder = factoryViewHolder;
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
			return factoryViewHolder.createDefault(parent);
		}
		else if(viewType == ViewType.ADD.ordinal())
		{
			return factoryViewHolder.createAdd(parent);
		}
		else
		{
			return factoryViewHolder.createSiviso(parent);
		}
	}
	
	@Override
	public void onBindViewHolder(@NonNull ViewHolder_Abstract viewHolder, int position)
	{
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
