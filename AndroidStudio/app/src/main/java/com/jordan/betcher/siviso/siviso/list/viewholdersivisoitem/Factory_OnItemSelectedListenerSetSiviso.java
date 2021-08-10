package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import com.jordan.betcher.siviso.siviso.database.Database;

class Factory_OnItemSelectedListenerSetSiviso
{
	public OnItemSelectedListener_SetSiviso create(Database database, int sivisoIndex)
	{
		return new OnItemSelectedListener_SetSiviso(database, sivisoIndex);
	}
}
