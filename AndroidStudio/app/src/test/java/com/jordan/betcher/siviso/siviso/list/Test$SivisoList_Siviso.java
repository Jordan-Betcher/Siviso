package com.jordan.betcher.siviso.siviso.list;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$SivisoList_Siviso
{
	@Test
	public void select_0_onSelect1()
	{
		int indexOfSiviso = 0;
		OnSelect onSelect = mock(OnSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onSelect);
		
		verify(onSelect, times(1)).onSelect(indexOfSiviso + 1);
	}
}