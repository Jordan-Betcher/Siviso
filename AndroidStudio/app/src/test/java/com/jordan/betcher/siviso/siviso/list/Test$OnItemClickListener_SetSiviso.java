package com.jordan.betcher.siviso.siviso.list;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.jordan.betcher.siviso.siviso.database.Database;

import org.junit.Test;

public class Test$OnItemClickListener_SetSiviso
{
	@Test
	public void onItemClick_SivisoIndex1ItemIndex0_DatabaseSetSiviso10()
	{
		int sivisoIndex = 1;
		int itemIndex = 0;
		Database database = mock(Database.class);
		
		OnItemClickListener_SetSiviso onItemClickListener = new OnItemClickListener_SetSiviso(database, sivisoIndex);
		onItemClickListener.onItemClick(null, null, itemIndex, 0);
		
		verify(database, times(1)).setSiviso(sivisoIndex, itemIndex);
	}
	
	@Test
	public void onItemClick_SivisoIndex0ItemIndex1_DatabaseSetSiviso01()
	{
		int sivisoIndex = 0;
		int itemIndex = 1;
		Database database = mock(Database.class);
		
		OnItemClickListener_SetSiviso onItemClickListener = new OnItemClickListener_SetSiviso(database, sivisoIndex);
		onItemClickListener.onItemClick(null, null, itemIndex, 0);
		
		verify(database, times(1)).setSiviso(sivisoIndex, itemIndex);
	}
	
	@Test
	public void onItemClick_SivisoIndex0ItemIndex0_DatabaseSetSiviso00()
	{
		int sivisoIndex = 0;
		int itemIndex = 0;
		Database database = mock(Database.class);
		
		OnItemClickListener_SetSiviso onItemClickListener = new OnItemClickListener_SetSiviso(database, sivisoIndex);
		onItemClickListener.onItemClick(null, null, itemIndex, 0);
		
		verify(database, times(1)).setSiviso(sivisoIndex, itemIndex);
	}
}