package com.jordan.betcher.siviso.siviso.list.viewholderadd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.Factory_OnClickListener_StartActivityAdd;

public class Factory_ViewHolderAdd
{
	private LayoutInflater layoutInflater;
	private Factory_OnClickListener_StartActivityAdd factory;
	
	public Factory_ViewHolderAdd(LayoutInflater layoutInflater, Factory_OnClickListener_StartActivityAdd factory)
	{
		this.layoutInflater = layoutInflater;
		this.factory = factory;
	}
	
	public ViewHolder_Add create(ViewGroup parent)
	{
		View view = layoutInflater.inflate(R.layout.item_siviso_add_button, parent, false);
		Button button = view.findViewById(R.id.buttonAdd);
		return new ViewHolder_Add(view, button, factory);
	}
}
