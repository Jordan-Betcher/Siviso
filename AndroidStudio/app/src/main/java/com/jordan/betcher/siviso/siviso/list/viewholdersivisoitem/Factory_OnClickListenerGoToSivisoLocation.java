package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.list.HighlightView;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

class Factory_OnClickListenerGoToSivisoLocation
{
	private SivisoMap sivisoMap;
	private HighlightView highlightView;
	
	public Factory_OnClickListenerGoToSivisoLocation(SivisoMap sivisoMap, HighlightView highlightView)
	{
		
		this.sivisoMap = sivisoMap;
		this.highlightView = highlightView;
	}
	
	public OnClickListener_Multiple create(LatLng sivisoLocation, int sivisoIndex)
	{
		OnRowClick_HighlightRow highlightRow = new OnRowClick_HighlightRow(highlightView);
		OnRowClick_GoToSivisoLocation goToSivisoLocation = new OnRowClick_GoToSivisoLocation(sivisoMap, sivisoLocation);
		OnClickListener_Multiple multiple = new OnClickListener_Multiple(goToSivisoLocation, highlightRow);
		
		return multiple;
	}
}
