package com.jordan.betcher.siviso.siviso.map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;

import org.junit.Test;

import java.util.ArrayList;

public class Test$OnMapReady_CreateSivisoCircles
{
	@Test
	public void dataChanged_siviso0Circles_setCircles()
	{
		Siviso siviso0 = mock(Siviso.class);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		sivisos.add(siviso0);
		Database database = mock(Database.class);
		when(database.sivisos()).thenReturn(sivisos);
		Circles circles = mock(Circles.class);
		
		OnMapReady_CreateSivisoCircles createSivisoCircles = new OnMapReady_CreateSivisoCircles(
		database, null);
		createSivisoCircles.circles = circles;
		createSivisoCircles.dataChanged();
		
		verify(circles, times(1)).setCircles(sivisos);
	}
	
	@Test
	public void ready_siviso0_setCircles()
	{
		Siviso siviso0 = mock(Siviso.class);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		sivisos.add(siviso0);
		Database database = mock(Database.class);
		when(database.sivisos()).thenReturn(sivisos);
		Circles circles = mock(Circles.class);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_Circles factory = mock(Factory_Circles.class);
		when(factory.create(googleMap)).thenReturn(circles);
		
		OnMapReady_CreateSivisoCircles createSivisoCircles = new OnMapReady_CreateSivisoCircles(
		database, factory);
		createSivisoCircles.ready(googleMap);
		
		verify(circles, times(1)).setCircles(sivisos);
	}
	
	@Test
	public void dataChanged_null_noError()
	{
		ArrayList<Siviso> sivisos = new ArrayList<>();
		Database database = mock(Database.class);
		when(database.sivisos()).thenReturn(sivisos);
		
		OnMapReady_CreateSivisoCircles createSivisoCircles = new OnMapReady_CreateSivisoCircles(
		database, null);
		createSivisoCircles.circles = null;
		createSivisoCircles.dataChanged();
	}
	
	@Test
	public void dataChanged_circles_setCircles()
	{
		ArrayList<Siviso> sivisos = new ArrayList<>();
		Database database = mock(Database.class);
		when(database.sivisos()).thenReturn(sivisos);
		Circles circles = mock(Circles.class);
		
		OnMapReady_CreateSivisoCircles createSivisoCircles = new OnMapReady_CreateSivisoCircles(
		database, null);
		createSivisoCircles.circles = circles;
		createSivisoCircles.dataChanged();
		
		verify(circles, times(1)).setCircles(sivisos);
	}
	
	@Test
	public void ready__setCircles()
	{
		ArrayList<Siviso> sivisos = new ArrayList<>();
		Database database = mock(Database.class);
		when(database.sivisos()).thenReturn(sivisos);
		Circles circles = mock(Circles.class);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_Circles factory = mock(Factory_Circles.class);
		when(factory.create(googleMap)).thenReturn(circles);
		
		OnMapReady_CreateSivisoCircles createSivisoCircles = new OnMapReady_CreateSivisoCircles(
		database, factory);
		createSivisoCircles.ready(googleMap);
		
		verify(circles, times(1)).setCircles(sivisos);
	}
}