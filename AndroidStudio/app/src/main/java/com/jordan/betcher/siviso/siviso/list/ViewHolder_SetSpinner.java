package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.database.Siviso;

abstract class ViewHolder_SetSpinner
extends RecyclerView.ViewHolder
{
	public ViewHolder_SetSpinner(@NonNull View itemView)
	{
		super(itemView);
	}
	
	public abstract void setSiviso(Siviso siviso);
}
