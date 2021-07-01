package com.jordan.betcher.siviso.siviso;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.LatLngData;
import com.jordan.betcher.siviso.siviso.map.A_Map;
import com.jordan.betcher.siviso.siviso.permissions.Permission;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

public class A_Activity extends AppCompatActivity
{
	Permission_AccessFineLocation accessFineLocationPermission = new Permission_AccessFineLocation(this);
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LatLngData sivisoLatLng = new LatLngData(){
			@Override
			public boolean exists()
			{
				return false;
			}
			
			@Override
			public void setLatLng(double latitude, double longitude)
			{
			
			}
			
			@Override
			public LatLng latLng()
			{
				return null;
			}
		};
		
		A_Map map = new A_Map(this, accessFineLocationPermission, sivisoLatLng);
	}
	
	
	
	//Called after a permission is asked for
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
	{
		accessFineLocationPermission.grant();
	}
}