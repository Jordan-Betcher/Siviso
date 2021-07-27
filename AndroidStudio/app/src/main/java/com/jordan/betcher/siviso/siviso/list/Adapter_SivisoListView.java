package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;

class Adapter_SivisoListView
extends RecyclerView.Adapter<ViewHolder_Abstract>
{
	private Database database;
	private LayoutInflater layoutInflater;
	
	public Adapter_SivisoListView(Database database, LayoutInflater layoutInflater, SivisoList sivisoList)
	{
		this.database = database;
		this.layoutInflater = layoutInflater;
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
		View view = layoutInflater.inflate(R.layout.item_siviso, parent, false);
		
		if(viewType == ViewType.DEFAULT.ordinal())
		{
			return new ViewHolder_Default(view);
		}
		else if(viewType == ViewType.ADD.ordinal())
		{
			return new ViewHolder_Add(view);
		}
		else
		{
			return new ViewHolder_Siviso(view);
		}
	}
	
	@Override
	public void onBindViewHolder(@NonNull ViewHolder_Abstract holder, int position)
	{
		//Put data into holder
		
	}
	
	@Override
	public int getItemCount()
	{
		return database.sivisoDatas().size() + 2;
	}
}
