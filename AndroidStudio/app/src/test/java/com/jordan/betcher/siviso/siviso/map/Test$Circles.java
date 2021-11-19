package com.jordan.betcher.siviso.siviso.map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.jordan.betcher.siviso.siviso.database.Siviso;

import org.junit.Test;

import java.util.ArrayList;

public class Test$Circles
{
	@Test
	public void setCircles_circle0siviso0_removeCircle0()
	{
		Siviso siviso0 = mock(Siviso.class);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		sivisos.add(siviso0);
		Wrapper_Circle circle0 = mock(Wrapper_Circle.class);
		ArrayList<Wrapper_Circle> wrapper_circles = new ArrayList<>();
		wrapper_circles.add(circle0);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		
		Circles circles = new Circles(googleMap, factory);
		circles.circles = wrapper_circles;
		circles.setCircles(sivisos);
		
		verify(circle0, times(1)).remove();
	}
	
	@Test
	public void setCircles_circle0Circle1_removeCircle1()
	{
		Wrapper_Circle circle0 = mock(Wrapper_Circle.class);
		Wrapper_Circle circle1 = mock(Wrapper_Circle.class);
		ArrayList<Wrapper_Circle> wrapper_circles = new ArrayList<>();
		wrapper_circles.add(circle0);
		wrapper_circles.add(circle1);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		
		Circles circles = new Circles(googleMap, factory);
		circles.circles = wrapper_circles;
		circles.setCircles(new ArrayList<>());
		
		verify(circle1, times(1)).remove();
	}
	
	@Test
	public void setCircles_circle0_removeCircle0()
	{
		Wrapper_Circle circle0 = mock(Wrapper_Circle.class);
		ArrayList<Wrapper_Circle> wrapper_circles = new ArrayList<>();
		wrapper_circles.add(circle0);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		
		Circles circles = new Circles(googleMap, factory);
		circles.circles = wrapper_circles;
		circles.setCircles(new ArrayList<>());
		
		verify(circle0, times(1)).remove();
	}
	
	@Test
	public void setCircles_siviso0siviso1_createCircle0Circle1()
	{
		Siviso siviso0 = mock(Siviso.class);
		Siviso siviso1 = mock(Siviso.class);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		sivisos.add(siviso0);
		sivisos.add(siviso1);
		Wrapper_Circle circle0 = mock(Wrapper_Circle.class);
		Wrapper_Circle circle1 = mock(Wrapper_Circle.class);
		ArrayList<Wrapper_Circle> wrapper_circles = new ArrayList<>();
		wrapper_circles.add(circle0);
		wrapper_circles.add(circle1);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		when(googleMap.createCircle(factory, siviso0)).thenReturn(circle0);
		when(googleMap.createCircle(factory, siviso1)).thenReturn(circle1);
		
		Circles circles = new Circles(googleMap, factory);
		circles.setCircles(sivisos);
		
		ArrayList<Wrapper_Circle> actualCircles = circles.circles;
		assertEquals(wrapper_circles, actualCircles);
	}
	
	@Test
	public void setCircles_siviso0_createCircle0()
	{
		Siviso siviso0 = mock(Siviso.class);
		ArrayList<Siviso> sivisos = new ArrayList<>();
		sivisos.add(siviso0);
		Wrapper_Circle circle0 = mock(Wrapper_Circle.class);
		ArrayList<Wrapper_Circle> wrapper_circles = new ArrayList<>();
		wrapper_circles.add(circle0);
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		when(googleMap.createCircle(factory, siviso0)).thenReturn(circle0);
		
		Circles circles = new Circles(googleMap, factory);
		circles.setCircles(sivisos);
		
		ArrayList<Wrapper_Circle> actualCircles = circles.circles;
		assertEquals(wrapper_circles, actualCircles);
	}
}