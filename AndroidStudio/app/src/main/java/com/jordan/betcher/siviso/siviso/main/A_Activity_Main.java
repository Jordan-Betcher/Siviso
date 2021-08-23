package com.jordan.betcher.siviso.siviso.main;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.Database_Temp;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Ringmode;
import com.jordan.betcher.siviso.siviso.database.Siviso;
import com.jordan.betcher.siviso.siviso.list.A_List;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.list.SivisoList_Siviso;
import com.jordan.betcher.siviso.siviso.main.delete.button.A_DeleteButton;
import com.jordan.betcher.siviso.siviso.map.OnMapReady_CallOnMapReadys;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

import java.util.ArrayList;

public class A_Activity_Main extends AppCompatActivity
{
	Permission_AccessFineLocation accessFineLocationPermission = new Permission_AccessFineLocation(this);
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Activity activity = this;
		OnMapReady_CallOnMapReadys map = new OnMapReady_CallOnMapReadys();
		Siviso siviso = new Siviso(){
			
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
			public Ringmode siviso()
			{
				return null;
			}
		};
		ArrayList<Siviso> sivisos = new ArrayList<>();
		sivisos.add(siviso);
		sivisos.add(siviso);
		sivisos.add(siviso);
		sivisos.add(siviso);
		sivisos.add(siviso);
		
		SivisoList sivisoList = new SivisoList_Siviso();
		
		SivisoMap sivisoMap = new SivisoMap(){
			@Override
			public void goToCurrentLocation()
			{
				//Toast.makeText(activity, "A_Activity_Main: SivisoMap goToCurrentLocation", Toast.LENGTH_SHORT).show();
			}
			
			@Override
			public void goToLocation(LatLng sivisoLocation)
			{
				//Toast.makeText(activity, "A_Activity_Main: SivisoMap goToLocation " + sivisoLocation.toString(), Toast.LENGTH_SHORT).show();
			}
		};
		
		Database database = new Database_Temp(this);
		
		new A_Map_Main(this, accessFineLocationPermission, database, sivisoList);
		new A_List(this, database, sivisoList, sivisoMap);
		//TODO delete button
		new A_DeleteButton(this, database, sivisoList);
		//TODO edit button
		//TODO on/off button
	}
	
	
	
	//Called after a permission is asked for
	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
	{
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		accessFineLocationPermission.grant();
	}
}