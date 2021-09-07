package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jordan.betcher.siviso.siviso.database.Database;

public abstract class ViewHolder_Abstract
extends RecyclerView.ViewHolder
{
	//TODO Have viewholder highlight and unhighlight instead using shades because of siviso coloring
	//TODO only 1 viewholder
	public ViewHolder_Abstract(@NonNull View itemView)
	{
		super(itemView);
	}
	
	public abstract void init(Database database, int sivisoDataIndex);
	
	public abstract View background();
}
