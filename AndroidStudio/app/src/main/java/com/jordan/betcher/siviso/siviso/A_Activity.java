package com.jordan.betcher.siviso.siviso;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.SivisoData;
import com.jordan.betcher.siviso.siviso.list.A_List;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.map.A_Map;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_CallOnMapReadys;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

import java.util.ArrayList;

public class A_Activity extends AppCompatActivity
{
	Permission_AccessFineLocation accessFineLocationPermission = new Permission_AccessFineLocation(this);
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		OnMapReady_CallOnMapReadys map = new OnMapReady_CallOnMapReadys();
		SivisoData sivisoData = new SivisoData(){
			
			@Override
			public void setLatLng(double latitude, double longitude)
			{
			
			}
			
			@Override
			public LatLng latLng()
			{
				return new LatLng(37.4220656,-122.0862784);
			}
			
			@Override
			public double radius()
			{
				return 1000;
			}
			
			@Override
			public int color()
			{
				return Color.GREEN;
			}
		};
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		sivisoDatas.add(sivisoData);
		
		SivisoList sivisoList = latLng ->
		{
		
		};
		
		Database database = () -> sivisoDatas;
		
		new A_Map(this, map, accessFineLocationPermission, database, sivisoList);
		new A_List(this, database, sivisoList);
	}
	
	
	
	//Called after a permission is asked for
	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
	{
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		accessFineLocationPermission.grant();
	}
}