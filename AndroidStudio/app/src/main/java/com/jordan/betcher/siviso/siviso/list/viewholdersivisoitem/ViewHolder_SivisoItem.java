package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;

class ViewHolder_SivisoItem extends ViewHolder_Abstract
{
	
	private Spinner spinner;
	private Factory_OnItemSelectedListenerSetSiviso factoryOnItemClickListenerSetSiviso;
	private final CardView background;
	private final Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground;
	
	public ViewHolder_SivisoItem(
	View view, TextView textView, String name, Spinner spinner, ArrayAdapter spinnerAdapter, Factory_OnItemSelectedListenerSetSiviso factoryOnItemClickListenerSetSiviso, CardView background, Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground)
	{
		super(view);
		this.spinner = spinner;
		this.factoryOnItemClickListenerSetSiviso = factoryOnItemClickListenerSetSiviso;
		this.background = background;
		this.factoryOnClickBackground = factoryOnClickBackground;
		textView.setText(name);
		spinner.setAdapter(spinnerAdapter);
	}
	
	@Override
	public void init(Database database, int sivisoIndex)
	{
		AdapterView.OnItemSelectedListener onItemSelected = factoryOnItemClickListenerSetSiviso.create(database, sivisoIndex);
		spinner.setOnItemSelectedListener(onItemSelected);
		LatLng sivisoLatLng = database.sivisos()[sivisoIndex].latLng();
		spinner.setSelection(database.sivisos()[sivisoIndex].ringmode().ordinal());
		OnClickListener_GoToSivisoLocation onClickListener = factoryOnClickBackground.create(sivisoLatLng);
		background.setOnClickListener(onClickListener);
	}
	
	@Override
	public View view()
	{
		return null; //TODO
	}
	
}
