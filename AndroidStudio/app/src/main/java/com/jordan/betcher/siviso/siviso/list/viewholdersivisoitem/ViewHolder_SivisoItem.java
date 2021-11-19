package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;

class ViewHolder_SivisoItem extends ViewHolder_Abstract
{
	
	private final SwitchCompat switchSiviso;
	private final CardView background;
	private final Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground;
	
	public ViewHolder_SivisoItem(
	View view, TextView textView, String name, SwitchCompat switchSiviso, CardView background,
	Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground)
	{
		super(view);
		this.switchSiviso = switchSiviso;
		this.background = background;
		this.factoryOnClickBackground = factoryOnClickBackground;
		textView.setText(name);
	}
	
	@Override
	public void init(Database database, int sivisoIndex)
	{
		if(sivisoIndex < 0)
		{ return; }
		LatLng sivisoLatLng = database.sivisos().get(sivisoIndex).latLng();
		//TODO Set Switch on change listener to update database
		OnClickListener_Multiple onClickListener = factoryOnClickBackground.create(sivisoLatLng);
		background.setOnClickListener(onClickListener);
	}
	
	@Override
	public View background()
	{
		return background;
	}
	
}
