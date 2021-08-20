package com.jordan.betcher.siviso.siviso.add;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.Database_Temp;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.cancel.A_CancelButton;
import com.jordan.betcher.siviso.siviso.add.confirm.A_ConfirmButton;
import com.jordan.betcher.siviso.siviso.add.siviso.A_Siviso;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;
import com.jordan.betcher.siviso.siviso.database.Siviso;
import com.jordan.betcher.siviso.siviso.database.SivisoData;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_CallOnMapReadys;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

import java.util.ArrayList;

public class A_Activity_Add extends AppCompatActivity
{
	
	Permission_AccessFineLocation accessFineLocationPermission = new Permission_AccessFineLocation(this);
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		
		
		Activity activity = this;
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
			
			@Override
			public Siviso siviso()
			{
				return null;
			}
		};
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		sivisoDatas.add(sivisoData);
		sivisoDatas.add(sivisoData);
		sivisoDatas.add(sivisoData);
		sivisoDatas.add(sivisoData);
		sivisoDatas.add(sivisoData);
		
		SivisoList sivisoList = new SivisoList_Temp();
		
		SivisoMap sivisoMap = new SivisoMap(){
			@Override
			public void goToCurrentLocation()
			{
				Toast.makeText(activity, "A_Activity_Main: SivisoMap goToCurrentLocation", Toast.LENGTH_SHORT).show();
			}
			
			@Override
			public void goToLocation(LatLng sivisoLocation)
			{
				Toast.makeText(activity, "A_Activity_Main: SivisoMap goToLocation " + sivisoLocation.toString(), Toast.LENGTH_SHORT).show();
			}
		};
		
		Database database = new Database_Temp(this);
		
		PossibleSivisoData possibleSivisoData = new PossibleSivisoData();
		new A_Map_Add(this, possibleSivisoData, accessFineLocationPermission);
		new A_Siviso(this, possibleSivisoData);
		new A_CancelButton(this);
		new A_ConfirmButton(this, possibleSivisoData, database);
	}
}
