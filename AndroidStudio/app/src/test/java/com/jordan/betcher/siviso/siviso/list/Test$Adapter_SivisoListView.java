package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test$Adapter_SivisoListView
{
	
	@Test
	public void onCreateViewHolder_itemTypeADD_viewHolderAdd()
	{
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoList sivisoList = mock(SivisoList.class);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		View view = mock(View.class);
		when(layoutInflater.inflate(R.layout.item_siviso, viewGroup, false)).thenReturn(view);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(sivisoDatas, layoutInflater, sivisoList);
		
		int itemType = Adapter_SivisoListView.ViewType.ADD.ordinal();
		ViewHolder_Abstract viewHolder = adapter.onCreateViewHolder(viewGroup, itemType);
		ViewHolder_Abstract expected = new ViewHolder_Add(view);
		assertEquals(expected, viewHolder);
	}
	
	@Test
	public void onCreateViewHolder_itemTypeDEFAULT_viewHolderDefault()
	{
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoList sivisoList = mock(SivisoList.class);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		View view = mock(View.class);
		when(layoutInflater.inflate(R.layout.item_siviso, viewGroup, false)).thenReturn(view);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(sivisoDatas, layoutInflater, sivisoList);
		
		int itemType = Adapter_SivisoListView.ViewType.DEFAULT.ordinal();
		ViewHolder_Abstract viewHolder = adapter.onCreateViewHolder(viewGroup, itemType);
		ViewHolder_Abstract expected = new ViewHolder_Default(view);
		assertEquals(expected, viewHolder);
	}
	
	@Test
	public void onCreateViewHolder_itemTypeSIVISO_viewHolderSiviso()
	{
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoList sivisoList = mock(SivisoList.class);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		View view = mock(View.class);
		when(layoutInflater.inflate(R.layout.item_siviso, viewGroup, false)).thenReturn(view);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(sivisoDatas, layoutInflater, sivisoList);
		
		int itemType = Adapter_SivisoListView.ViewType.SIVISO.ordinal();
		ViewHolder_Abstract viewHolder = adapter.onCreateViewHolder(viewGroup, itemType);
		ViewHolder_Abstract expected = new ViewHolder_Siviso(view);
		assertEquals(expected, viewHolder);
	}
	
	@Test
	public void getItemViewType_SivisoData1Position1_SIVISO()
	{
		int position = 1;
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		sivisoDatas.add(mock(SivisoData.class));
		SivisoList sivisoList = mock(SivisoList.class);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(sivisoDatas, layoutInflater, sivisoList);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.SIVISO.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	@Test
	public void getItemViewType_SivisoData0Position0_DEFAULT()
	{
		int position = 0;
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoList sivisoList = mock(SivisoList.class);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(sivisoDatas, layoutInflater, sivisoList);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.DEFAULT.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	
	@Test
	public void getItemViewType_SivisoData0Position1_ADD()
	{
		int position = 1;
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoList sivisoList = mock(SivisoList.class);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(sivisoDatas, layoutInflater, sivisoList);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.ADD.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	@Test
	public void getItemCount_0SivisoData_2()
	{
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoList sivisoList = mock(SivisoList.class);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(sivisoDatas, layoutInflater, sivisoList);
		
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
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(sivisoDatas, layoutInflater, sivisoList);
		
		int actualItemCount = adapter.getItemCount();
		int expectedItemCount = sivisoDatas.size() + 2;
		assertEquals(expectedItemCount, actualItemCount);
	}
}