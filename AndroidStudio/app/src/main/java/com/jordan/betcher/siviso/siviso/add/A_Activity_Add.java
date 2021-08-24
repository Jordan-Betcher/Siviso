package com.jordan.betcher.siviso.siviso.add;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.cancel.A_CancelButton;
import com.jordan.betcher.siviso.siviso.add.confirm.A_ConfirmButton;
import com.jordan.betcher.siviso.siviso.add.siviso.A_Siviso;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Database_Siviso;
import com.jordan.betcher.siviso.siviso.database.Factory_SivisoFromString;
import com.jordan.betcher.siviso.siviso.database.PossibleSiviso;
import com.jordan.betcher.siviso.siviso.database.Ringmodes;
import com.jordan.betcher.siviso.siviso.database.Sivisos;
import com.jordan.betcher.siviso.siviso.permissions.Permission_AccessFineLocation;

public class A_Activity_Add extends AppCompatActivity
{
	
	Permission_AccessFineLocation accessFineLocationPermission = new Permission_AccessFineLocation(this);
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		
		Database database = createDatabase();
		
		PossibleSiviso possibleSiviso = new PossibleSiviso();
		new A_Map_Add(this, possibleSiviso, accessFineLocationPermission);
		new A_Siviso(this, possibleSiviso);
		new A_CancelButton(this);
		new A_ConfirmButton(this, possibleSiviso, database);
	}
	
	
	private Database createDatabase()
	{
		Ringmodes ringmodes = new Ringmodes();
		Factory_SivisoFromString sivisoFromString = new Factory_SivisoFromString();
		Sivisos sivisos = new Sivisos(sivisoFromString, ringmodes);
		return new Database_Siviso(this, ringmodes, sivisos);
		
	}
}
