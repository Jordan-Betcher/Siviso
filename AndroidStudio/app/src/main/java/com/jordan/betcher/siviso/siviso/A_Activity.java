package com.jordan.betcher.siviso.siviso;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.SivisoData;
import com.jordan.betcher.siviso.siviso.map.A_Map;
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
		
		A_Map map = new A_Map(this, accessFineLocationPermission, sivisoDatas);
	}
	
	
	
	//Called after a permission is asked for
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
	{
		accessFineLocationPermission.grant();
	}
}