package com.jordan.betcher.siviso.siviso.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Database_Siviso;
import com.jordan.betcher.siviso.siviso.database.Factory_SivisoFromString;
import com.jordan.betcher.siviso.siviso.database.Ringmodes;
import com.jordan.betcher.siviso.siviso.database.SivisosCreator;
import com.jordan.betcher.siviso.siviso.list.A_List;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.list.SivisoList_Siviso;
import com.jordan.betcher.siviso.siviso.main.delete.button.A_DeleteButton;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

public class A_Activity_Main extends AppCompatActivity
{
	Permission_AccessFineLocation accessFineLocationPermission = new Permission_AccessFineLocation(this);
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
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
		Database database = createDatabase();
		new A_Map_Main(this, accessFineLocationPermission, database, sivisoList);
		new A_List(this, database, sivisoList, sivisoMap);
		//TODO delete button
		new A_DeleteButton(this, database, sivisoList);
		//TODO edit button
		//TODO on/off button
	}
	
	private Database createDatabase()
	{
		Ringmodes ringmodes = new Ringmodes();
		Factory_SivisoFromString sivisoFromString = new Factory_SivisoFromString();
		SivisosCreator sivisosCreator = new SivisosCreator(sivisoFromString, ringmodes);
		return new Database_Siviso(this, ringmodes, sivisosCreator);
		
	}
	
	
	//Called after a permission is asked for
	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
	{
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		accessFineLocationPermission.grant();
	}
}