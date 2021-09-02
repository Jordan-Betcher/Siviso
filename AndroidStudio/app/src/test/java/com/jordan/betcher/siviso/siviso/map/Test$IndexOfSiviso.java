package com.jordan.betcher.siviso.siviso.map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;

import org.junit.Test;

public class Test$IndexOfSiviso
{
	
	@Test
	public void from_22Siviso01Siviso00_negative1()
	{
		int index = -1;
		LatLng latLng = new LatLng(2, 2);
		Database database = mock(Database.class);
		Siviso siviso1 = mock(Siviso.class);
		Siviso siviso2 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso1, siviso2};
		when(siviso1.latLng()).thenReturn(new LatLng(0, 1));
		when(siviso2.latLng()).thenReturn(new LatLng(0, 0));
		when(database.sivisos()).thenReturn(sivisos);
		
		IndexOfSiviso indexOfSiviso = new IndexOfSiviso(database);
		
		int actualIndex = indexOfSiviso.from(latLng);
		assertEquals(index, actualIndex);
	}
	
	@Test
	public void from_01Siviso01Siviso00_0()
	{
		int index = 0;
		LatLng latLng = new LatLng(0, 1);
		Database database = mock(Database.class);
		Siviso siviso1 = mock(Siviso.class);
		Siviso siviso2 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso1, siviso2};
		when(siviso1.latLng()).thenReturn(new LatLng(0, 1));
		when(siviso2.latLng()).thenReturn(latLng);
		when(database.sivisos()).thenReturn(sivisos);
		
		IndexOfSiviso indexOfSiviso = new IndexOfSiviso(database);
		
		int actualIndex = indexOfSiviso.from(latLng);
		assertEquals(index, actualIndex);
	}
	
	@Test
	public void from_00Siviso01Siviso00_1()
	{
		int index = 1;
		LatLng latLng = new LatLng(0, 0);
		Database database = mock(Database.class);
		Siviso siviso1 = mock(Siviso.class);
		Siviso siviso2 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso1, siviso2};
		when(siviso1.latLng()).thenReturn(new LatLng(0, 1));
		when(siviso2.latLng()).thenReturn(latLng);
		when(database.sivisos()).thenReturn(sivisos);
		
		IndexOfSiviso indexOfSiviso = new IndexOfSiviso(database);
		
		int actualIndex = indexOfSiviso.from(latLng);
		assertEquals(index, actualIndex);
	}
}