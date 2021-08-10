package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.jordan.betcher.siviso.siviso.database.Database;

import org.junit.Test;

public class Test$OnItemSelectedListener_SetSiviso
{
	@Test
	public void onItemSelected_SivisoIndex1ItemIndex0_DatabaseSetSiviso10()
	{
		int sivisoIndex = 1;
		int itemIndex = 0;
		Database database = mock(Database.class);
		
		OnItemSelectedListener_SetSiviso onItemClickListener = new OnItemSelectedListener_SetSiviso(database, sivisoIndex);
		onItemClickListener.onItemSelected(null, null, itemIndex, 0);
		
		verify(database, times(1)).setSiviso(sivisoIndex, itemIndex);
	}
	
	@Test
	public void onItemSelected_SivisoIndex0ItemIndex1_DatabaseSetSiviso01()
	{
		int sivisoIndex = 0;
		int itemIndex = 1;
		Database database = mock(Database.class);
		
		OnItemSelectedListener_SetSiviso onItemClickListener = new OnItemSelectedListener_SetSiviso(database, sivisoIndex);
		onItemClickListener.onItemSelected(null, null, itemIndex, 0);
		
		verify(database, times(1)).setSiviso(sivisoIndex, itemIndex);
	}
	
	@Test
	public void onItemSelected_SivisoIndex0ItemIndex0_DatabaseSetSiviso00()
	{
		int sivisoIndex = 0;
		int itemIndex = 0;
		Database database = mock(Database.class);
		
		OnItemSelectedListener_SetSiviso onItemClickListener = new OnItemSelectedListener_SetSiviso(database, sivisoIndex);
		onItemClickListener.onItemSelected(null, null, itemIndex, 0);
		
		verify(database, times(1)).setSiviso(sivisoIndex, itemIndex);
	}
}