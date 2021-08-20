package com.jordan.betcher.siviso.siviso.main.delete.button;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.list.OnSelect;

class OnSelect_EnableButton implements OnSelect
{
	private DeleteButton deleteButton;
	
	public OnSelect_EnableButton(DeleteButton deleteButton)
	{
		this.deleteButton = deleteButton;
	}
	
	@Override
	public void onSelect(LatLng latLng)
	{
		deleteButton.enable();
	}
}
