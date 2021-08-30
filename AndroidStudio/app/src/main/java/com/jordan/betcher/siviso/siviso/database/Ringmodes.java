package com.jordan.betcher.siviso.siviso.database;

public class Ringmodes
{
	public Ringmode from(int position)
	{
		switch(position)
		{
			case 2: return Ringmode.SOUND;
			case 1: return Ringmode.VIBRATE;
			default: return Ringmode.SILENT;
		}
	}
	
	public Ringmode[] list()
	{
		return new Ringmode[]{Ringmode.SILENT, Ringmode.VIBRATE, Ringmode.SOUND};
	}
}
