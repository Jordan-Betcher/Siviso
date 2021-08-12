package com.jordan.betcher.siviso.siviso.list.viewholderadd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.OnClickListener_StartActivityAdd;

public class Factory_ViewHolderAdd
{
	private LayoutInflater layoutInflater;
	private OnClickListener_StartActivityAdd startActivityAdd;
	
	public Factory_ViewHolderAdd(LayoutInflater layoutInflater, OnClickListener_StartActivityAdd startActivityAdd)
	{
		this.layoutInflater = layoutInflater;
		this.startActivityAdd = startActivityAdd;
	}
	
	public ViewHolder_Add create(ViewGroup parent)
	{
		View view = layoutInflater.inflate(R.layout.item_siviso_add_button, parent, false);
		Button button = view.findViewById(R.id.buttonAdd);
		return new ViewHolder_Add(view, button, startActivityAdd);
	}
}
