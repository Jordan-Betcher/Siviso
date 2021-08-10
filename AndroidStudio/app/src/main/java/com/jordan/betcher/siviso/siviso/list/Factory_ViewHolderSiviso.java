package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

class Factory_ViewHolderSiviso
{
	private LayoutInflater layoutInflater;
	private Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground;
	private ArrayAdapter spinnerAdapter;
	private Factory_OnItemClickListener_SetSiviso factoryOnItemClickListenerSetSiviso;
	private SivisoMap sivisoMap;
	
	public Factory_ViewHolderSiviso(LayoutInflater layoutInflater, Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground, ArrayAdapter spinnerAdapter, Factory_OnItemClickListener_SetSiviso factoryOnItemClickListenerSetSiviso, SivisoMap sivisoMap)
	{
		this.layoutInflater = layoutInflater;
		this.factoryOnClickBackground = factoryOnClickBackground;
		this.spinnerAdapter = spinnerAdapter;
		this.factoryOnItemClickListenerSetSiviso = factoryOnItemClickListenerSetSiviso;
		this.sivisoMap = sivisoMap;
	}
	
	public ViewHolder_Abstract create(ViewGroup parent)
	{
		View view = layoutInflater.inflate(R.layout.item_siviso, parent, false);
		Spinner spinner = view.findViewById(R.id.spinnerHome);
		TextView textView = view.findViewById(R.id.textViewName);
		CardView background = view.findViewById(R.id.cardViewHome);
		String name = "";
		return new ViewHolder_SivisoItem(view, textView, name, spinner, spinnerAdapter,
		                                 factoryOnItemClickListenerSetSiviso, background,
		                                 factoryOnClickBackground);
	}
}
