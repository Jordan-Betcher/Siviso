package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Ringmode;
import com.jordan.betcher.siviso.siviso.database.Ringmodes;

import org.junit.Test;

public class Test$OnItemSelectedListener_SetDefaultSiviso
{
	@Test
	public void onItemClick_DatabasePosition1_DatabaseSetDefaultSivisoVIBRATE()
	{
		int position = 1;
		Ringmode ringmodeFromPosition = Ringmode.VIBRATE;
		Database database = mock(Database.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		when(ringmodes.from(position)).thenReturn(ringmodeFromPosition);
		
		OnItemSelectedListener_SetDefaultSiviso onItemSelectedListener_setDefaultSiviso = new OnItemSelectedListener_SetDefaultSiviso(database,
		                                                                                                                              ringmodes);
		onItemSelectedListener_setDefaultSiviso.onItemSelected(null, null, position, 0);
		
		verify(database, times(1)).setDefaultRingmode(ringmodeFromPosition);
	}
	
	@Test
	public void __0DatabaseSetDefaultSiviso()
	{
		int position = 0;
		Ringmode ringmodeFromPosition = Ringmode.SILENT;
		Database database = mock(Database.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		when(ringmodes.from(position)).thenReturn(ringmodeFromPosition);
		
		new OnItemSelectedListener_SetDefaultSiviso(database, ringmodes);
		
		verify(database, times(0)).setDefaultRingmode(any());
	}
	
	@Test
	public void onItemClick_DatabasePosition0_DatabaseSetDefaultSivisoSILENT()
	{
		int position = 0;
		Ringmode ringmodeFromPosition = Ringmode.SILENT;
		Database database = mock(Database.class);
		Ringmodes ringmodes = mock(Ringmodes.class);
		when(ringmodes.from(position)).thenReturn(ringmodeFromPosition);
		
		OnItemSelectedListener_SetDefaultSiviso onItemSelectedListener_setDefaultSiviso = new OnItemSelectedListener_SetDefaultSiviso(database,
		                                                                                                                              ringmodes);
		onItemSelectedListener_setDefaultSiviso.onItemSelected(null, null, position, 0);
		
		verify(database, times(1)).setDefaultRingmode(ringmodeFromPosition);
	}
}