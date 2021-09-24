package com.jordan.betcher.siviso.siviso.map;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.jordan.betcher.siviso.siviso.database.Siviso;

import org.junit.Test;

public class Test$Circles
{
	@Test
	public void setCircles_circle0siviso0_removeCircle0()
	{
		Siviso siviso0 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso0};
		Wrapper_Circle circle0 = mock(Wrapper_Circle.class);
		Wrapper_Circle[] wrapper_circles = new Wrapper_Circle[]{circle0};
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
		Wrapper_Circle[] wrapper_circles = new Wrapper_Circle[]{circle0, circle1};
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		
		Circles circles = new Circles(googleMap, factory);
		circles.circles = wrapper_circles;
		circles.setCircles(new Siviso[0]);
		
		verify(circle1, times(1)).remove();
	}
	
	@Test
	public void setCircles_circle0_removeCircle0()
	{
		Wrapper_Circle circle0 = mock(Wrapper_Circle.class);
		Wrapper_Circle[] wrapper_circles = new Wrapper_Circle[]{circle0};
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		
		Circles circles = new Circles(googleMap, factory);
		circles.circles = wrapper_circles;
		circles.setCircles(new Siviso[0]);
		
		verify(circle0, times(1)).remove();
	}
	
	@Test
	public void setCircles_siviso0siviso1_createCircle0Circle1()
	{
		Siviso siviso0 = mock(Siviso.class);
		Siviso siviso1 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso0, siviso1};
		Wrapper_Circle circle0 = mock(Wrapper_Circle.class);
		Wrapper_Circle circle1 = mock(Wrapper_Circle.class);
		Wrapper_Circle[] wrapper_circles = new Wrapper_Circle[]{circle0, circle1};
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		when(googleMap.createCircle(factory, siviso0)).thenReturn(circle0);
		when(googleMap.createCircle(factory, siviso1)).thenReturn(circle1);
		
		Circles circles = new Circles(googleMap, factory);
		circles.setCircles(sivisos);
		
		Wrapper_Circle[] actualCircles = circles.circles;
		assertArrayEquals(wrapper_circles, actualCircles);
	}
	
	@Test
	public void setCircles_siviso0_createCircle0()
	{
		Siviso siviso0 = mock(Siviso.class);
		Siviso[] sivisos = new Siviso[]{siviso0};
		Wrapper_Circle circle0 = mock(Wrapper_Circle.class);
		Wrapper_Circle[] wrapper_circles = new Wrapper_Circle[]{circle0};
		Wrapper_GoogleMap googleMap = mock(Wrapper_GoogleMap.class);
		Factory_CircleOptions factory = mock(Factory_CircleOptions.class);
		when(googleMap.createCircle(factory, siviso0)).thenReturn(circle0);
		
		Circles circles = new Circles(googleMap, factory);
		circles.setCircles(sivisos);
		
		Wrapper_Circle[] actualCircles = circles.circles;
		assertArrayEquals(wrapper_circles, actualCircles);
	}
}