package com.jordan.betcher.siviso.siviso.map;

class OnMapReady_AddOnClickListener_SaveNewSiviso implements OnMapReady
{
	private OnMapClickListener_SaveNewSiviso onMapClickListener;
	
	public OnMapReady_AddOnClickListener_SaveNewSiviso(
	OnMapClickListener_SaveNewSiviso onMapClickListener)
	{
		this.onMapClickListener = onMapClickListener;
	}
	
	@Override
	public void ready(Wrapper_GoogleMap googleMap)
	{
		googleMap.addOnMapClickListener(onMapClickListener);
	}
}
