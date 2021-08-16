package com.jordan.betcher.siviso.siviso;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;
import com.jordan.betcher.siviso.siviso.database.SivisoData;
import com.jordan.betcher.siviso.siviso.list.A_List;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.map.A_Map;
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
		
		SivisoList sivisoList = latLng ->
		{
		
		};
		
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
		
		Database database = new Database()
		{
			@Override
			public Siviso defaultSiviso()
			{
				Toast.makeText(activity, "A_Activity_Main: Database defaultSiviso", Toast.LENGTH_SHORT).show();
				return Siviso.SILENT;
			}
			
			@Override
			public void setDefaultSiviso(Siviso sivisoFromPosition)
			{
				Toast.makeText(activity, "A_Activity_Main: Database setDefaultSiviso", Toast.LENGTH_SHORT).show();
			}
			
			@Override
			public int count()
			{
				//Toast.makeText(activity, "A_Activity_Main: Database count", Toast.LENGTH_SHORT).show();
				return sivisoDatas.size();
			}
			
			@Override
			public ArrayList<SivisoData> sivisos()
			{
				//Toast.makeText(activity, "A_Activity_Main: Database sivisos", Toast.LENGTH_SHORT).show();
				return sivisoDatas;
			}
			
			@Override
			public void setSiviso(int sivisoIndex, int itemIndex)
			{
				Toast.makeText(activity, "A_Activity_Main: Database setSiviso", Toast.LENGTH_SHORT).show();
			}
			
			@Override
			public LatLng sivisoLatLng(int index)
			{
				return new LatLng(0, 0);
			}
		};
		Button mapLock = activity.findViewById(R.id.homeMapLock);
		SupportMapFragment supportMapFragment = (SupportMapFragment)this.getSupportFragmentManager().findFragmentById(R.id.homeMap);
		new A_Map(this, map, supportMapFragment, mapLock, accessFineLocationPermission, database, sivisoList);
		new A_List(this, database, sivisoList, sivisoMap);
	}
	
	
	
	//Called after a permission is asked for
	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
	{
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		accessFineLocationPermission.grant();
	}
}