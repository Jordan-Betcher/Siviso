package com.jordan.betcher.siviso.siviso.map;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import java.util.ArrayList;

public class Factory_CreateCircles
{
	private Database database;
	
	public Factory_CreateCircles(Database database)
	{
		this.database = database;
	}
	
	public OnMapReady_CreateSivisoCircles create()
	{
		ArrayList<SivisoData> sivisoDatas = database.sivisos();
		Factory_CircleOptions factory = new Factory_CircleOptions();
		return new OnMapReady_CreateSivisoCircles(sivisoDatas, factory);
	}
}
