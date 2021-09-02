package com.jordan.betcher.siviso.siviso.list;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class Test$SivisoList_Siviso
{
	
	@Test
	public void select_0onSelectAonSelectB_onSelectB1()
	{
		int indexOfSiviso = 0;
		OnSelect onSelectA = mock(OnSelect.class);
		OnSelect onSelectB = mock(OnSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onSelectA);
		sivisoList.addOnSelect(onSelectB);
		sivisoList.select(indexOfSiviso);
		
		verify(onSelectB, times(1)).onSelect(indexOfSiviso + 1);
	}
	
	@Test
	public void select_0onSelectAonSelectB_onSelectA1()
	{
		int indexOfSiviso = 0;
		OnSelect onSelectA = mock(OnSelect.class);
		OnSelect onSelectB = mock(OnSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onSelectA);
		sivisoList.addOnSelect(onSelectB);
		sivisoList.select(indexOfSiviso);
		
		verify(onSelectA, times(1)).onSelect(indexOfSiviso + 1);
	}
	
	@Test
	public void select_1_onSelect2()
	{
		int indexOfSiviso = 1;
		OnSelect onSelect = mock(OnSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onSelect);
		sivisoList.select(indexOfSiviso);
		
		verify(onSelect, times(1)).onSelect(indexOfSiviso + 1);
	}
	
	@Test
	public void select_0_onSelect1()
	{
		int indexOfSiviso = 0;
		OnSelect onSelect = mock(OnSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onSelect);
		sivisoList.select(indexOfSiviso);
		
		verify(onSelect, times(1)).onSelect(indexOfSiviso + 1);
	}
}