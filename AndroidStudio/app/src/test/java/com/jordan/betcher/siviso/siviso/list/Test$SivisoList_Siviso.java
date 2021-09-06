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
		OnRowSelect onRowSelectA = mock(OnRowSelect.class);
		OnRowSelect onRowSelectB = mock(OnRowSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onRowSelectA);
		sivisoList.addOnSelect(onRowSelectB);
		sivisoList.select(indexOfSiviso);
		
		verify(onRowSelectB, times(1)).onSelect(indexOfSiviso + 1);
	}
	
	@Test
	public void select_0onSelectAonSelectB_onSelectA1()
	{
		int indexOfSiviso = 0;
		OnRowSelect onRowSelectA = mock(OnRowSelect.class);
		OnRowSelect onRowSelectB = mock(OnRowSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onRowSelectA);
		sivisoList.addOnSelect(onRowSelectB);
		sivisoList.select(indexOfSiviso);
		
		verify(onRowSelectA, times(1)).onSelect(indexOfSiviso + 1);
	}
	
	@Test
	public void select_1_onSelect2()
	{
		int indexOfSiviso = 1;
		OnRowSelect onRowSelect = mock(OnRowSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onRowSelect);
		sivisoList.select(indexOfSiviso);
		
		verify(onRowSelect, times(1)).onSelect(indexOfSiviso + 1);
	}
	
	@Test
	public void select_0_onSelect1()
	{
		int indexOfSiviso = 0;
		OnRowSelect onRowSelect = mock(OnRowSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onRowSelect);
		sivisoList.select(indexOfSiviso);
		
		verify(onRowSelect, times(1)).onSelect(indexOfSiviso + 1);
	}
}