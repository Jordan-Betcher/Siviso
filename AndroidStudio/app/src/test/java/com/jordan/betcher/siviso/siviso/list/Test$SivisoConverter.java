package com.jordan.betcher.siviso.siviso.list;

import static org.junit.Assert.assertEquals;

import com.jordan.betcher.siviso.siviso.database.Siviso;

import org.junit.Test;

public class Test$SivisoConverter
{
	@Test
	public void sivisoFrom_0_SILENT()
	{
		int position = 0;
		Siviso siviso = Siviso.SILENT;
		
		SivisoConverter sivisoConverter = new SivisoConverter();
		
		Siviso actualSiviso = sivisoConverter.sivisoFrom(position);
		assertEquals(siviso, actualSiviso);
	}
	
	@Test
	public void sivisoFrom_1_VIBRATE()
	{
		int position = 1;
		Siviso siviso = Siviso.VIBRATE;
		
		SivisoConverter sivisoConverter = new SivisoConverter();
		
		Siviso actualSiviso = sivisoConverter.sivisoFrom(position);
		assertEquals(siviso, actualSiviso);
	}
	
	@Test
	public void sivisoFrom_2_SOUND()
	{
		int position = 2;
		Siviso siviso = Siviso.SOUND;
		
		SivisoConverter sivisoConverter = new SivisoConverter();
		
		Siviso actualSiviso = sivisoConverter.sivisoFrom(position);
		assertEquals(siviso, actualSiviso);
	}
}