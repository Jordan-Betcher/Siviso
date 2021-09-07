package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.database.Database;

public abstract class ViewHolder_Abstract
extends RecyclerView.ViewHolder
{
	public ViewHolder_Abstract(@NonNull View itemView)
	{
		super(itemView);
	}
	
	public abstract void init(Database database, int sivisoDataIndex);
	
	public abstract View background();
}
