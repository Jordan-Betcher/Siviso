package com.jordan.betcher.siviso.siviso.add.confirm;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

import org.junit.Test;

public class Test$OnClick_SaveSivisoData
{
	@Test
	public void __0databaseSaveNewSivisoData()
	{
		Database database = mock(Database.class);
		PossibleSivisoData possibleSivisoData = mock(PossibleSivisoData.class);
		
		OnClick_SaveSivisoData saveSivisoData = new OnClick_SaveSivisoData(database, possibleSivisoData);
		
		verify(database, times(0)).saveNewSiviso(possibleSivisoData);
	}
	
	@Test
	public void onClick__databaseSaveNewSivisoData()
	{
		Database database = mock(Database.class);
		PossibleSivisoData possibleSivisoData = mock(PossibleSivisoData.class);
		
		OnClick_SaveSivisoData saveSivisoData = new OnClick_SaveSivisoData(database, possibleSivisoData);
		saveSivisoData.onClick(null);
		
		verify(database, times(1)).saveNewSiviso(possibleSivisoData);
	}
}