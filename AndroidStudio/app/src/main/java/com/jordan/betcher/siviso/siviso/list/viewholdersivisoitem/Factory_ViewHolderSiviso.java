package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

public class Factory_ViewHolderSiviso
{
	private LayoutInflater layoutInflater;
	private Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground;
	private ArrayAdapter spinnerAdapter;
	private Factory_OnItemSelectedListenerSetSiviso factoryOnItemClickListenerSetSiviso;
	private SivisoMap sivisoMap;
	
	public Factory_ViewHolderSiviso(LayoutInflater layoutInflater, ArrayAdapter spinnerAdapter, SivisoMap sivisoMap)
	{
		this.layoutInflater = layoutInflater;
		this.spinnerAdapter = spinnerAdapter;
		this.sivisoMap = sivisoMap;
		this.factoryOnClickBackground = new Factory_OnClickListenerGoToSivisoLocation(sivisoMap);
		this.factoryOnItemClickListenerSetSiviso = new Factory_OnItemSelectedListenerSetSiviso();
	}
	
	public ViewHolder_Abstract create(ViewGroup parent)
	{
		View view = layoutInflater.inflate(R.layout.item_siviso, parent, false);
		Spinner spinner = view.findViewById(R.id.spinner);
		TextView textView = view.findViewById(R.id.textViewName);
		CardView background = view.findViewById(R.id.cardViewHome);
		String name = "";
		return new ViewHolder_SivisoItem(view, textView, name, spinner, spinnerAdapter,
		                                 factoryOnItemClickListenerSetSiviso, background,
		                                 factoryOnClickBackground);
	}
}
