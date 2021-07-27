package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

abstract class ViewHolder_Abstract
extends RecyclerView.ViewHolder
{
	public ViewHolder_Abstract(@NonNull View itemView)
	{
		super(itemView);
	}
	
	@Override
	public boolean equals(@Nullable Object obj)
	{
		if(this.getClass().equals( obj.getClass() ))
		{
			ViewHolder_Abstract other = (ViewHolder_Abstract)obj;
			return this.itemView == other.itemView;
		}
		
		return false;
	}
}
