package com.jordan.betcher.siviso.siviso.database;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test$RingmodeConverter
{
	@Test
	public void sivisoFrom_0_SILENT()
	{
		int position = 0;
		Ringmode ringmode = Ringmode.SILENT;
		
		RingmodeConverter ringmodeConverter = new RingmodeConverter();
		
		Ringmode actualRingmode = ringmodeConverter.ringmodeFrom(position);
		assertEquals(ringmode, actualRingmode);
	}
	
	@Test
	public void sivisoFrom_1_VIBRATE()
	{
		int position = 1;
		Ringmode ringmode = Ringmode.VIBRATE;
		
		RingmodeConverter ringmodeConverter = new RingmodeConverter();
		
		Ringmode actualRingmode = ringmodeConverter.ringmodeFrom(position);
		assertEquals(ringmode, actualRingmode);
	}
	
	@Test
	public void sivisoFrom_2_SOUND()
	{
		int position = 2;
		Ringmode ringmode = Ringmode.SOUND;
		
		RingmodeConverter ringmodeConverter = new RingmodeConverter();
		
		Ringmode actualRingmode = ringmodeConverter.ringmodeFrom(position);
		assertEquals(ringmode, actualRingmode);
	}
}