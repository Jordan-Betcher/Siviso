package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.R;

class Factory_ViewHolderDefault
{
	private LayoutInflater layoutInflater;
	private OnClickListener_GoToCurrentLocation clickListener;
	private ArrayAdapter sivisoSpinnerAdapter;
	private OnItemClickListener_SetDefaultSiviso onItemClickListener;
	
	public Factory_ViewHolderDefault(LayoutInflater layoutInflater, OnClickListener_GoToCurrentLocation clickListener, ArrayAdapter sivisoSpinnerAdapter, OnItemClickListener_SetDefaultSiviso onItemClickListener)
	{
		this.layoutInflater = layoutInflater;
		this.clickListener = clickListener;
		this.sivisoSpinnerAdapter = sivisoSpinnerAdapter;
		this.onItemClickListener = onItemClickListener;
	}
	
	public ViewHolder_SivisoItem create(ViewGroup parent)
	{
		View view = layoutInflater.inflate(R.layout.item_siviso, parent, false);
		Spinner spinner = view.findViewById(R.id.spinnerHome);
		TextView name = view.findViewById(R.id.textViewName);
		CardView background = view.findViewById(R.id.cardViewHome);
		int defaultNameId = R.string.siviso_list_name_default;
		return new ViewHolder_SivisoItem(view, spinner, name, background, defaultNameId, clickListener, sivisoSpinnerAdapter, onItemClickListener);
	}
}
