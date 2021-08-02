package com.jordan.betcher.siviso.siviso.list;

import com.jordan.betcher.siviso.siviso.database.Siviso;

class SivisoConverter
{
	public Siviso sivisoFrom(int position)
	{
		switch(position)
		{
			case 2: return Siviso.SOUND;
			case 1: return Siviso.VIBRATE;
			default: return Siviso.SILENT;
		}
	}
}
