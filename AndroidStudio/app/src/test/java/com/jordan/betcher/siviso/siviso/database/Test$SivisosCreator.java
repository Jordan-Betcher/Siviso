package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$SivisosCreator
{
	
	@Test
	public void sivisos_sameStringA_sameSivisosA()
	{
		String name = "A";
		LatLng latLng = new LatLng(0.0,0.0);
		int radius = 0;
		Ringmode ringmode = Ringmode.VIBRATE;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisosString = String.format("{%s}", sivisoString1);
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso1};
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		
		SivisosCreator sivisosCreator = new SivisosCreator(sivisoFromString, ringmodes);
		sivisosCreator.sivisosString = sivisosString;
		sivisosCreator.sivisos = sivisos;
		
		Siviso[] actualSivisos = sivisosCreator.from(sivisosString);
		assertArrayEquals(sivisos, actualSivisos);
	}
	
	@Test
	public void sivisos_ringmodeVIBRATE_VIBRATE()
	{
		String name = "A";
		LatLng latLng = new LatLng(0.0,0.0);
		int radius = 0;
		Ringmode ringmode = Ringmode.VIBRATE;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisosString = String.format("{%s}", sivisoString1);
		
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] list = new Siviso[]{siviso1};
		Ringmodes ringmodes = mock(Ringmodes.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(name, latLng, radius, ringmode)).thenReturn(siviso1);
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		SivisosCreator sivisosCreator = new SivisosCreator(sivisoFromString, ringmodes);
		
		Siviso[] actualSivisos = sivisosCreator.from(sivisosString);
		assertArrayEquals(list, actualSivisos);
	}
	
	@Test
	public void sivisos_radius1_radius1()
	{
		String name = "A";
		LatLng latLng = new LatLng(0.0,0.0);
		int radius = 1;
		Ringmode ringmode = Ringmode.SILENT;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisosString = String.format("{%s}", sivisoString1);
		
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] list = new Siviso[]{siviso1};
		Ringmodes ringmodes = mock(Ringmodes.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(name, latLng, radius, ringmode)).thenReturn(siviso1);
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		SivisosCreator sivisosCreator = new SivisosCreator(sivisoFromString, ringmodes);
		
		Siviso[] actualSivisos = sivisosCreator.from(sivisosString);
		assertArrayEquals(list, actualSivisos);
	}
	
	@Test
	public void sivisos_latlng01_SivisosWith01()
	{
		String name = "A";
		LatLng latLng = new LatLng(0.0,1.0);
		int radius = 0;
		Ringmode ringmode = Ringmode.SILENT;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisosString = String.format("{%s}", sivisoString1);
		
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] list = new Siviso[]{siviso1};
		Ringmodes ringmodes = mock(Ringmodes.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(name, latLng, radius, ringmode)).thenReturn(siviso1);
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		SivisosCreator sivisosCreator = new SivisosCreator(sivisoFromString, ringmodes);
		
		Siviso[] actualSivisos = sivisosCreator.from(sivisosString);
		assertArrayEquals(list, actualSivisos);
	}
	
	@Test
	public void sivisos_latlng10_SivisosWith10()
	{
		String name = "A";
		LatLng latLng = new LatLng(1.0,0.0);
		int radius = 0;
		Ringmode ringmode = Ringmode.SILENT;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisosString = String.format("{%s}", sivisoString1);
		
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] list = new Siviso[]{siviso1};
		Ringmodes ringmodes = mock(Ringmodes.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(name, latLng, radius, ringmode)).thenReturn(siviso1);
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		SivisosCreator sivisosCreator = new SivisosCreator(sivisoFromString, ringmodes);
		
		Siviso[] actualSivisos = sivisosCreator.from(sivisosString);
		assertArrayEquals(list, actualSivisos);
	}
	
	@Test
	public void sivisos_nameAnameB_SivisosWithB()
	{
		String name1 = "A";
		String name2 = "B";
		LatLng latLng = new LatLng(0.0,0.0);
		int radius = 0;
		Ringmode ringmode = Ringmode.SILENT;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name1, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisoString2 = String.format("[%s][%f,%f][%d][%d]", name2, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisosString = String.format("{%s}{%s}", sivisoString1, sivisoString2);
		
		Siviso siviso1 = mock(Siviso.class);
		Siviso siviso2 = mock(Siviso.class);
		Siviso[] list = new Siviso[]{siviso1, siviso2};
		Ringmodes ringmodes = mock(Ringmodes.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(name1, latLng, radius, ringmode)).thenReturn(siviso1);
		when(sivisoFromString.siviso(name2, latLng, radius, ringmode)).thenReturn(siviso2);
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		SivisosCreator sivisosCreator = new SivisosCreator(sivisoFromString, ringmodes);
		
		Siviso[] actualSivisos = sivisosCreator.from(sivisosString);
		assertArrayEquals(list, actualSivisos);
	}
	
	
	@Test
	public void sivisos_nameB_SivisosWithB()
	{
		String name = "B";
		LatLng latLng = new LatLng(0.0,0.0);
		int radius = 0;
		Ringmode ringmode = Ringmode.SILENT;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisosString = String.format("{%s}", sivisoString1);
		
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] list = new Siviso[]{siviso1};
		Ringmodes ringmodes = mock(Ringmodes.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(name, latLng, radius, ringmode)).thenReturn(siviso1);
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		SivisosCreator sivisosCreator = new SivisosCreator(sivisoFromString, ringmodes);
		
		Siviso[] actualSivisos = sivisosCreator.from(sivisosString);
		assertArrayEquals(list, actualSivisos);
	}
	
	@Test
	public void sivisos_nameA_SivisosWithA()
	{
		String name = "A";
		LatLng latLng = new LatLng(0.0, 0.0);
		int radius = 0;
		Ringmode ringmode = Ringmode.SILENT;
		String sivisoString1 = String.format("[%s][%f,%f][%d][%d]", name, latLng.latitude, latLng.longitude, radius, ringmode.ordinal());
		String sivisosString = String.format("{%s}", sivisoString1);
		
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] list = new Siviso[]{siviso1};
		Ringmodes ringmodes = mock(Ringmodes.class);
		Factory_SivisoFromString sivisoFromString = mock(Factory_SivisoFromString.class);
		when(sivisoFromString.siviso(name, latLng, radius, ringmode)).thenReturn(siviso1);
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		SivisosCreator sivisosCreator = new SivisosCreator(sivisoFromString, ringmodes);
		
		Siviso[] actualSivisos = sivisosCreator.from(sivisosString);
		assertArrayEquals(list, actualSivisos);
	}
}