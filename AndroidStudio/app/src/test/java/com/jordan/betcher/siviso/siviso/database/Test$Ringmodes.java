package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test$Ringmodes
{
	@Test
	public void sivisoFrom_0_SILENT()
	{
		int position = 0;
		Ringmode ringmode = Ringmode.SILENT;
		
		Ringmodes ringmodes = new Ringmodes();
		
		Ringmode actualRingmode = ringmodes.from(position);
		assertEquals(ringmode, actualRingmode);
	}
	
	@Test
	public void sivisoFrom_1_VIBRATE()
	{
		int position = 1;
		Ringmode ringmode = Ringmode.VIBRATE;
		
		Ringmodes ringmodes = new Ringmodes();
		
		Ringmode actualRingmode = ringmodes.from(position);
		assertEquals(ringmode, actualRingmode);
	}
	
	@Test
	public void sivisoFrom_2_SOUND()
	{
		int position = 2;
		Ringmode ringmode = Ringmode.SOUND;
		
		Ringmodes ringmodes = new Ringmodes();
		
		Ringmode actualRingmode = ringmodes.from(position);
		assertEquals(ringmode, actualRingmode);
	}
}