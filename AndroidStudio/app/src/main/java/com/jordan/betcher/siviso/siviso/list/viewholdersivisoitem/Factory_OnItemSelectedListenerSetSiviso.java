package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Ringmodes;

class Factory_OnItemSelectedListenerSetSiviso
{
	public OnItemSelectedListener_SetSiviso create(Database database, int sivisoIndex)
	{
		Ringmodes ringmodes = new Ringmodes();
		return new OnItemSelectedListener_SetSiviso(database, sivisoIndex, ringmodes);
	}
}
