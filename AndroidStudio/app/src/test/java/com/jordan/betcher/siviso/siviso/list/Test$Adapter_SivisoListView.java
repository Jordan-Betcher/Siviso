package com.jordan.betcher.siviso.siviso.list;

import com.jordan.betcher.siviso.siviso.database.SivisoData;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class Test$Adapter_SivisoListView
{
	
	@Test
	public void getItemCount_0SivisoData_2()
	{
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoList sivisoList = mock(SivisoList.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(sivisoDatas, sivisoList);
		
		int actualItemCount = adapter.getItemCount();
		int expectedItemCount = sivisoDatas.size() + 2;
		assertEquals(expectedItemCount, actualItemCount);
	}
	
	@Test
	public void getItemCount_1SivisoData_3()
	{
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		sivisoDatas.add(mock(SivisoData.class));
		SivisoList sivisoList = mock(SivisoList.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(sivisoDatas, sivisoList);
		
		int actualItemCount = adapter.getItemCount();
		int expectedItemCount = sivisoDatas.size() + 2;
		assertEquals(expectedItemCount, actualItemCount);
	}
}