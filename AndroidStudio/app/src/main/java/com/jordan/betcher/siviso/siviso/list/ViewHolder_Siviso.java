package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

class ViewHolder_Siviso
extends RecyclerView.ViewHolder
{
	public ViewHolder_Siviso(@NonNull View itemView)
	{
		super(itemView);
	}
	
	@Override
	public boolean equals(@Nullable Object obj)
	{
		ViewHolder_Siviso other = (ViewHolder_Siviso)obj;
		
		return this.itemView == other.itemView;
	}
	
	//TODO
}
