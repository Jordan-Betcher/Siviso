package com.jordan.betcher.siviso.siviso;

import android.app.Activity;
import android.graphics.Color;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSiviso;
import com.jordan.betcher.siviso.siviso.database.Ringmode;
import com.jordan.betcher.siviso.siviso.database.Siviso;

import java.util.ArrayList;

public class Database_Temp implements Database
{
	private Activity activity;
	ArrayList<Siviso> sivisos = new ArrayList<>();
	
	public Database_Temp(Activity activity)
	{
		this.activity = activity;
		
		sivisos.add(new Siviso(){
			@Override
			public void setLatLng(double latitude, double longitude)
			{
			
			}
			
			@Override
			public LatLng latLng()
			{
				return new LatLng(37.4220698,-122.0862784);
			}
			
			@Override
			public double radius()
			{
				return 60;
			}
			
			@Override
			public int color()
			{
				return Color.BLACK;
			}
			
			@Override
			public Ringmode siviso()
			{
				return Ringmode.SILENT;
			}
		});
	}
	
	@Override
	public Ringmode defaultRingmode()
	{
		return Ringmode.VIBRATE;
	}
	
	@Override
	public void setDefaultRingmode(Ringmode ringmodeFromPosition)
	{
	
	}
	
	@Override
	public int count()
	{
		return sivisos.size();
	}
	
	@Override
	public ArrayList<Siviso> sivisos()
	{
		return sivisos;
	}
	
	@Override
	public void setRingmode(int sivisoIndex, int ringmodeIndex)
	{
	
	}
	
	@Override
	public LatLng sivisoLatLng(int index)
	{
		//TODO change this to just get siviso
		return sivisos.get(index).latLng();
	}
	
	@Override
	public void saveNewSiviso(
	PossibleSiviso possibleSiviso)
	{
	
	}
	
	@Override
	public void delete(LatLng selected)
	{
		Toast.makeText(activity, activity.getLocalClassName() + " Databse_Temp delete", Toast.LENGTH_SHORT).show();
	}
}
