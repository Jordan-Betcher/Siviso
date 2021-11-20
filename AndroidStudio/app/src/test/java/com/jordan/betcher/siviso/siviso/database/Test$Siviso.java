package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertEquals;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Test;

public class Test$Siviso
{
	@Test
	public void isOnSetIsOn_trueFalse_true()
	{
		
		String name = "";
		LatLng latLng = new LatLng(0, 0);
		int radius = 0;
		boolean isOn = false;
		boolean setIsOn = true;
		
		Siviso siviso = new Siviso(name, latLng, radius, isOn);
		siviso.setIsOn(setIsOn);
		
		boolean actualIsOn = siviso.isOn();
		assertEquals(setIsOn, actualIsOn);
	}
	
	@Test
	public void isOn_false_false()
	{
		String name = "";
		LatLng latLng = new LatLng(0, 0);
		int radius = 0;
		boolean isOn = false;
		
		Siviso siviso = new Siviso(name, latLng, radius, isOn);
		
		boolean actualIsOn = siviso.isOn();
		assertEquals(isOn, actualIsOn);
	}
	
	@Test
	public void isOn_true_true()
	{
		String name = "";
		LatLng latLng = new LatLng(0, 0);
		int radius = 0;
		boolean isOn = true;
		
		Siviso siviso = new Siviso(name, latLng, radius, isOn);
		
		boolean actualIsOn = siviso.isOn();
		assertEquals(isOn, actualIsOn);
	}
	
	@Test
	public void radius_0_0()
	{
		String name = "";
		LatLng latLng = new LatLng(0, 0);
		int radius = 0;
		boolean isOn = false;
		
		Siviso siviso = new Siviso(name, latLng, radius, isOn);
		
		double actualRadius = siviso.radius();
		assertEquals(radius, actualRadius, 0.1);
	}
	
	@Test
	public void radius_1_1()
	{
		String name = "";
		LatLng latLng = new LatLng(0, 0);
		int radius = 1;
		boolean isOn = false;
		
		Siviso siviso = new Siviso(name, latLng, radius, isOn);
		
		double actualRadius = siviso.radius();
		assertEquals(radius, actualRadius, 0.1);
	}
	
	@Test
	public void name_B_B()
	{
		String name = "B";
		LatLng latLng = new LatLng(0, 0);
		int radius = 0;
		boolean isOn = false;
		
		Siviso siviso = new Siviso(name, latLng, radius, isOn);
		
		String actualName = siviso.name();
		assertEquals(name, actualName);
	}
	
	@Test
	public void name_A_A()
	{
		String name = "A";
		LatLng latLng = new LatLng(0, 0);
		int radius = 0;
		boolean isOn = false;
		
		Siviso siviso = new Siviso(name, latLng, radius, isOn);
		
		String actualName = siviso.name();
		assertEquals(name, actualName);
	}
	
	@Test
	public void latLng_01_01()
	{
		String name = "";
		LatLng latLng = new LatLng(0, 1);
		int radius = 0;
		boolean isOn = false;
		
		Siviso siviso = new Siviso(name, latLng, radius, isOn);
		
		LatLng actualLatLng = siviso.latLng();
		assertEquals(latLng, actualLatLng);
	}
	
	@Test
	public void latLng_00_00()
	{
		String name = "";
		LatLng latLng = new LatLng(0, 0);
		int radius = 0;
		boolean isOn = false;
		
		Siviso siviso = new Siviso(name, latLng, radius, isOn);
		
		LatLng actualLatLng = siviso.latLng();
		assertEquals(latLng, actualLatLng);
	}
}