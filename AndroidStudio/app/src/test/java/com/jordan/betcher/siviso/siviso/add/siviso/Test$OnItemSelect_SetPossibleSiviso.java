package com.jordan.betcher.siviso.siviso.add.siviso;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.jordan.betcher.siviso.siviso.database.PossibleSiviso;

import org.junit.Test;

public class Test$OnItemSelect_SetPossibleSiviso
{
	@Test
	public void onItemSelected_1_setSiviso1()
	{
		int index = 1;
		PossibleSiviso possibleSiviso = mock(PossibleSiviso.class);
		
		OnItemSelect_SetPossibleSiviso onItemSelect = new OnItemSelect_SetPossibleSiviso(
		possibleSiviso);
		onItemSelect.onItemSelected(null, null, index, 0);
		
		verify(possibleSiviso, times(1)).setSiviso(index);
	}
	
	@Test
	public void onItemSelected_0_setSiviso0()
	{
		int index = 0;
		PossibleSiviso possibleSiviso = mock(PossibleSiviso.class);
		
		OnItemSelect_SetPossibleSiviso onItemSelect = new OnItemSelect_SetPossibleSiviso(
		possibleSiviso);
		onItemSelect.onItemSelected(null, null, index, 0);
		
		verify(possibleSiviso, times(1)).setSiviso(index);
	}
}