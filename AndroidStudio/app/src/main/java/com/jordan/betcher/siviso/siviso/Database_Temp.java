package com.jordan.betcher.siviso.siviso;

import android.app.Activity;
import android.graphics.Color;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;
import com.jordan.betcher.siviso.siviso.database.Siviso;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import java.util.ArrayList;

public class Database_Temp implements Database
{
	private Activity activity;
	ArrayList<SivisoData> sivisos = new ArrayList<>();
	
	public Database_Temp(Activity activity)
	{
		this.activity = activity;
		
		sivisos.add(new SivisoData(){
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
			public Siviso siviso()
			{
				return Siviso.SILENT;
			}
		});
	}
	
	@Override
	public Siviso defaultSiviso()
	{
		return Siviso.VIBRATE;
	}
	
	@Override
	public void setDefaultSiviso(Siviso sivisoFromPosition)
	{
	
	}
	
	@Override
	public int count()
	{
		return sivisos.size();
	}
	
	@Override
	public ArrayList<SivisoData> sivisos()
	{
		return sivisos;
	}
	
	@Override
	public void setSiviso(int sivisoIndex, int itemIndex)
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
	PossibleSivisoData possibleSivisoData)
	{
	
	}
	
	@Override
	public void delete(LatLng selected)
	{
		Toast.makeText(activity, activity.getLocalClassName() + " Databse_Temp delete", Toast.LENGTH_SHORT).show();
	}
}
