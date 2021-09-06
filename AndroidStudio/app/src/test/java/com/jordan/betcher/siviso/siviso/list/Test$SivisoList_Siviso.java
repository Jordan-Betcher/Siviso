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
		OnSivisoSelect onSivisoSelectA = mock(OnSivisoSelect.class);
		OnSivisoSelect onSivisoSelectB = mock(OnSivisoSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onSivisoSelectA);
		sivisoList.addOnSelect(onSivisoSelectB);
		sivisoList.select(indexOfSiviso);
		
		verify(onSivisoSelectB, times(1)).onSivisoSelect(indexOfSiviso + 1);
	}
	
	@Test
	public void select_0onSelectAonSelectB_onSelectA1()
	{
		int indexOfSiviso = 0;
		OnSivisoSelect onSivisoSelectA = mock(OnSivisoSelect.class);
		OnSivisoSelect onSivisoSelectB = mock(OnSivisoSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onSivisoSelectA);
		sivisoList.addOnSelect(onSivisoSelectB);
		sivisoList.select(indexOfSiviso);
		
		verify(onSivisoSelectA, times(1)).onSivisoSelect(indexOfSiviso + 1);
	}
	
	@Test
	public void select_1_onSelect2()
	{
		int indexOfSiviso = 1;
		OnSivisoSelect onSivisoSelect = mock(OnSivisoSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onSivisoSelect);
		sivisoList.select(indexOfSiviso);
		
		verify(onSivisoSelect, times(1)).onSivisoSelect(indexOfSiviso + 1);
	}
	
	@Test
	public void select_0_onSelect1()
	{
		int indexOfSiviso = 0;
		OnSivisoSelect onSivisoSelect = mock(OnSivisoSelect.class);
		
		SivisoList_Siviso sivisoList = new SivisoList_Siviso();
		sivisoList.addOnSelect(onSivisoSelect);
		sivisoList.select(indexOfSiviso);
		
		verify(onSivisoSelect, times(1)).onSivisoSelect(indexOfSiviso + 1);
	}
}