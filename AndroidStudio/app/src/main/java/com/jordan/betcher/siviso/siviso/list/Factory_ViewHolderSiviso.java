package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.R;

class Factory_ViewHolderSiviso
{
	private LayoutInflater layoutInflater;
	private Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground;
	private ArrayAdapter spinnerAdapter;
	private AdapterView.OnItemClickListener sivisoOnClick;
	
	public Factory_ViewHolderSiviso(LayoutInflater layoutInflater, Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground, ArrayAdapter spinnerAdapter, OnItemClickListener_SetSiviso sivisoOnClick)
	{
		this.layoutInflater = layoutInflater;
		this.factoryOnClickBackground = factoryOnClickBackground;
		this.spinnerAdapter = spinnerAdapter;
		this.sivisoOnClick = sivisoOnClick;
	}
	
	public ViewHolder_SivisoItem create(ViewGroup parent)
	{
		
		View view = layoutInflater.inflate(R.layout.item_siviso, parent, false);
		Spinner spinner = view.findViewById(R.id.spinnerHome);
		TextView textView = view.findViewById(R.id.textViewName);
		CardView background = view.findViewById(R.id.cardViewHome);
		String name = "";
		OnClickListener_GoToSivisoLocation backgroundOnClick = factoryOnClickBackground.create();
		return new ViewHolder_SivisoItem(view, textView, name, spinner, spinnerAdapter, sivisoOnClick, background,
		                                 backgroundOnClick);
	}
}
