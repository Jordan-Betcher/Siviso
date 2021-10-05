package com.jordan.betcher.siviso.siviso.main;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Database_Siviso;
import com.jordan.betcher.siviso.siviso.database.OnSharedPreferenceChangeListener_OnChangeEvent;
import com.jordan.betcher.siviso.siviso.database.Ringmodes;
import com.jordan.betcher.siviso.siviso.database.UseSharedPreferences;
import com.jordan.betcher.siviso.siviso.database.Wrapper_Gson;
import com.jordan.betcher.siviso.siviso.list.A_List;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.list.SivisoList_Siviso;
import com.jordan.betcher.siviso.siviso.map.A_Map_Main;
import com.jordan.betcher.siviso.siviso.map.SivisoMap_Siviso;
import com.jordan.betcher.siviso.siviso.permissions.Intent_PermissionSettingNotification;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessNotificationPolicy;
import com.jordan.betcher.siviso.siviso.service.A_Service;
import com.jordan.betcher.siviso.siviso.thirdparty.BuildVersion;

import main.java.com.betcher.jordan.helper.library.event.Event;

public class A_Activity_Main extends AppCompatActivity
{
	Permission_AccessFineLocation accessFineLocationPermission = new Permission_AccessFineLocation(this);
	Permission_AccessNotificationPolicy accessNotificationPolicy;
	
	private Permission_AccessNotificationPolicy createPermissionAccessNotificationPolicy()
	{
		Intent_PermissionSettingNotification permissionSettingNotification = new Intent_PermissionSettingNotification();
		Event event = new Event();
		NotificationManager notificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
		BuildVersion buildVersion = new BuildVersion();
		return new Permission_AccessNotificationPolicy(this, permissionSettingNotification, event, notificationManager, buildVersion);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		accessNotificationPolicy = createPermissionAccessNotificationPolicy();
		
		SivisoMap_Siviso sivisoMap = new SivisoMap_Siviso();
		SivisoList sivisoList = new SivisoList_Siviso();
		Database database = createDatabase();
		new A_Map_Main(this, accessFineLocationPermission, database, sivisoMap, sivisoList);
		new A_List(this, database, sivisoList, sivisoMap);
		new A_Service(this, accessNotificationPolicy);
	}
	
	private Database createDatabase()
	{
		Ringmodes ringmodes = new Ringmodes();
		Wrapper_Gson gson = new Wrapper_Gson();
		OnSharedPreferenceChangeListener_OnChangeEvent onChangeEvent = new OnSharedPreferenceChangeListener_OnChangeEvent();
		UseSharedPreferences useSharedPreferences = new UseSharedPreferences(this, ringmodes, gson,
		                                                                     onChangeEvent);
		return new Database_Siviso(useSharedPreferences);
	}
	
	//Called after a permission is asked for
	@Override
	public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
	{
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		accessFineLocationPermission.grant();
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
	{
		super.onActivityResult(requestCode, resultCode, data);
		accessNotificationPolicy.grant();
	}
}