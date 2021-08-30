package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Ringmode;
import com.jordan.betcher.siviso.siviso.database.Ringmodes;

import org.junit.Test;

public class Test$OnItemSelectedListener_SetSiviso
{
	@Test
	public void onItemSelected_SivisoIndex1SilentIndex_DatabaseSetSiviso1Silent()
	{
		int sivisoIndex = 1;
		Database database = mock(Database.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		Ringmode ringmode = Ringmode.SILENT;
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		OnItemSelectedListener_SetSiviso onItemClickListener = new OnItemSelectedListener_SetSiviso(database, sivisoIndex,
		                                                                                            ringmodes);
		onItemClickListener.onItemSelected(null, null, ringmode.ordinal(), 0);
		
		verify(database, times(1)).setRingmode(sivisoIndex, ringmode);
	}
	
	@Test
	public void onItemSelected_SivisoIndex0VibrateIndex_DatabaseSetSiviso0Vibrate()
	{
		int sivisoIndex = 0;
		Database database = mock(Database.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		Ringmode ringmode = Ringmode.VIBRATE;
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		OnItemSelectedListener_SetSiviso onItemClickListener = new OnItemSelectedListener_SetSiviso(database, sivisoIndex,
		                                                                                            ringmodes);
		onItemClickListener.onItemSelected(null, null, ringmode.ordinal(), 0);
		
		verify(database, times(1)).setRingmode(sivisoIndex, ringmode);
	}
	
	@Test
	public void onItemSelected_SivisoIndex0SilentIndex_DatabaseSetSiviso0Silent()
	{
		int sivisoIndex = 0;
		Database database = mock(Database.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		Ringmode ringmode = Ringmode.SILENT;
		when(ringmodes.from(ringmode.ordinal())).thenReturn(ringmode);
		
		OnItemSelectedListener_SetSiviso onItemClickListener = new OnItemSelectedListener_SetSiviso(database, sivisoIndex,
		                                                                                            ringmodes);
		onItemClickListener.onItemSelected(null, null, ringmode.ordinal(), 0);
		
		verify(database, times(1)).setRingmode(sivisoIndex, ringmode);
	}
}