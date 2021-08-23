package com.jordan.betcher.siviso.siviso.database;

public class RingmodeConverter
{
	public Ringmode ringmodeFrom(int position)
	{
		switch(position)
		{
			case 2: return Ringmode.SOUND;
			case 1: return Ringmode.VIBRATE;
			default: return Ringmode.SILENT;
		}
	}
}
