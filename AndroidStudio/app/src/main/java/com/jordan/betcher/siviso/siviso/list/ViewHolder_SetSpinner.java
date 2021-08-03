package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.database.SivisoData;

abstract class ViewHolder_SetSpinner
extends RecyclerView.ViewHolder
{
	public ViewHolder_SetSpinner(@NonNull View itemView)
	{
		super(itemView);
	}
	
	@Override
	public boolean equals(@Nullable Object obj)
	{
		if(this.getClass().equals( obj.getClass() ))
		{
			ViewHolder_SetSpinner other = (ViewHolder_SetSpinner)obj;
			return this.itemView == other.itemView;
		}
		
		return false;
	}
	
	public void setSivisoData(SivisoData sivisoData)
	{
		//TODO
	}
}
