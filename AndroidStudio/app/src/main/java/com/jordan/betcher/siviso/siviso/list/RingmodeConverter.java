package com.jordan.betcher.siviso.siviso.list;

import com.jordan.betcher.siviso.siviso.database.Ringmode;

public class RingmodeConverter
{
	public Ringmode sivisoFrom(int position)
	{
		switch(position)
		{
			case 2: return Ringmode.SOUND;
			case 1: return Ringmode.VIBRATE;
			default: return Ringmode.SILENT;
		}
	}
}
