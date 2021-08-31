package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;

import org.junit.Test;

public class Test$OnMapClickListener_SaveNewSiviso
{
	@Test
	public void onMapClick_00_saveSiviso00ToDatabase()
	{
		LatLng latLng = new LatLng(0, 0);
		Database database = mock(Database.class);
		Siviso siviso = mock(Siviso.class);
		Factory_Siviso factorySiviso = mock(Factory_Siviso.class);
		when(factorySiviso.create(latLng)).thenReturn(siviso);
		
		OnMapClickListener_SaveNewSiviso saveNewSiviso = new OnMapClickListener_SaveNewSiviso(database, factorySiviso);
		saveNewSiviso.onMapClick(latLng);
		
		verify(database, times(1)).save(siviso);
	}
}