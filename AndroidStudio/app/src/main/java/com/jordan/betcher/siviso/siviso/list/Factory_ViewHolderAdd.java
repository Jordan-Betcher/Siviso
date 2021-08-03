package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jordan.betcher.siviso.siviso.R;

class Factory_ViewHolderAdd
{
	private LayoutInflater layoutInflater;
	
	public Factory_ViewHolderAdd(LayoutInflater layoutInflater)
	{
		this.layoutInflater = layoutInflater;
	}
	
	public ViewHolder_Add create(ViewGroup parent)
	{
		View view = layoutInflater.inflate(R.layout.item_siviso_add_button, parent, false);
		return new ViewHolder_Add(view);
	}
}
