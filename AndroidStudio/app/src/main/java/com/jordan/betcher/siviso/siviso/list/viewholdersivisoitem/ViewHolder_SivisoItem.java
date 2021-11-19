package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;

class ViewHolder_SivisoItem extends ViewHolder_Abstract
{
	
	private final Spinner spinner;
	private final CardView background;
	private final Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground;
	
	public ViewHolder_SivisoItem(
	View view, TextView textView, String name, Spinner spinner, CardView background,
	Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground)
	{
		super(view);
		this.spinner = spinner;
		this.background = background;
		this.factoryOnClickBackground = factoryOnClickBackground;
		textView.setText(name);
	}
	
	@Override
	public void init(Database database, int sivisoIndex)
	{
		LatLng sivisoLatLng = database.sivisos().get(sivisoIndex).latLng();
		//TODO Set Switch to database
		OnClickListener_Multiple onClickListener = factoryOnClickBackground.create(sivisoLatLng);
		background.setOnClickListener(onClickListener);
	}
	
	@Override
	public View background()
	{
		return background;
	}
	
}
