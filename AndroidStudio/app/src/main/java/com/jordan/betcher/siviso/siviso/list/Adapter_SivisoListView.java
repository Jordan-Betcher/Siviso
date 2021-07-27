package com.jordan.betcher.siviso.siviso.list;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.database.SivisoData;

import java.util.ArrayList;

class Adapter_SivisoListView
extends RecyclerView.Adapter<ViewHolder_Siviso>
{
	private ArrayList<SivisoData> sivisoDatas;
	
	public Adapter_SivisoListView(ArrayList<SivisoData> sivisoDatas, SivisoList sivisoList)
	{
		
		this.sivisoDatas = sivisoDatas;
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
	public ViewHolder_Siviso onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
	{
		return null;
	}
	
	@Override
	public void onBindViewHolder(@NonNull ViewHolder_Siviso holder, int position)
	{
	
	}
	
	@Override
	public int getItemCount()
	{
		return sivisoDatas.size() + 2;
	}
	//TODO
}
