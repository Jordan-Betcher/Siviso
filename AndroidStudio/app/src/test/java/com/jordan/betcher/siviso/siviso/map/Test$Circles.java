package com.jordan.betcher.siviso.siviso.map;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.jordan.betcher.siviso.siviso.database.Siviso;

import org.junit.Test;

public class Test$Circles
{
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