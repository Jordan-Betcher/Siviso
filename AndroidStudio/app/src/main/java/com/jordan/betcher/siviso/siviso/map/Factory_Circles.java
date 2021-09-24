package com.jordan.betcher.siviso.siviso.map;

class Factory_Circles
{
	private Factory_CircleOptions factory;
	
	public Factory_Circles(Factory_CircleOptions factory)
	{
		this.factory = factory;
	}
	
	public Circles create(Wrapper_GoogleMap googleMap)
	{
		return new Circles(googleMap, factory);
	}
}
