package com.jordan.betcher.siviso.siviso.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.view.ViewGroup;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;
import com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem.Factory_ViewHolderSiviso;

import org.junit.Test;

public class Test$Adapter_SivisoListView
{
	@Test
	public void itemPositionToSivisoIndex_1_0()
	{
		int itemPosition = 1;
		int sivisoIndex = itemPosition - 1;
		
		Adapter_SivisoListView sivisoListView = new Adapter_SivisoListView(null, null);
		
		int actualSivisoIndex = sivisoListView.itemPositionToSivisoIndex(itemPosition);
		assertEquals(sivisoIndex, actualSivisoIndex);
	}
	
	@Test
	public void itemPositionToSivisoIndex_2_1()
	{
		int itemPosition = 2;
		int sivisoIndex = itemPosition - 1;
		
		Adapter_SivisoListView sivisoListView = new Adapter_SivisoListView(null, null);
		
		int actualSivisoIndex = sivisoListView.itemPositionToSivisoIndex(itemPosition);
		assertEquals(sivisoIndex, actualSivisoIndex);
	}
	
	@Test
	public void database__database()
	{
		Database database = mock(Database.class);
		
		Adapter_SivisoListView sivisoListView = new Adapter_SivisoListView(database, null);
		
		Database actualDatabase = sivisoListView.database();
		assertEquals(database, actualDatabase);
	}
	
	@Test
	public void onBindViewHolder_onBindViewHolder1_OnBindViewHolder1ViewHolder()
	{
		Database database = mock(Database.class);
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null);
		
		OnViewHolderInit onViewHolderInit = mock(OnViewHolderInit.class);
		adapter.setOnViewInit(onViewHolderInit);
		
		int index = 1;
		ViewHolder_Abstract viewHolder = mock(ViewHolder_Abstract.class);
		adapter.onBindViewHolder(viewHolder, index);
		
		verify(onViewHolderInit, times(1)).bindingView(index, viewHolder);
	}
	
	@Test
	public void onBindViewHolder_onBindViewHolder0_OnBindViewHolder0ViewHolder()
	{
		Database database = mock(Database.class);
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null);
		
		OnViewHolderInit onViewHolderInit = mock(OnViewHolderInit.class);
		adapter.setOnViewInit(onViewHolderInit);
		
		int index = 0;
		ViewHolder_Abstract viewHolder = mock(ViewHolder_Abstract.class);
		adapter.onBindViewHolder(viewHolder, index);
		
		verify(onViewHolderInit, times(1)).bindingView(index, viewHolder);
	}
	
	@Test
	public void onBindViewHolder_Count0Position0_initMinus1()
	{
		ViewHolder_Abstract viewHolder_sivisoItem = mock(ViewHolder_Abstract.class);
		int position = 0;
		int count = 0;
		
		Siviso[] sivisos = new Siviso[count];
		Database database = mock(Database.class);
		when(database.sivisos()).thenReturn(sivisos);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null);
		adapter.onBindViewHolder(viewHolder_sivisoItem, position);
		
		verify(viewHolder_sivisoItem, times(1)).init(database, position - 1);
	}
	
	@Test
	public void onCreateViewHolder__viewHolderSiviso()
	{
		Database database = mock(Database.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		ViewHolder_Abstract viewHolderSivisoItem = mock(ViewHolder_Abstract.class);
		Factory_ViewHolderSiviso factoryViewHolder = mock(Factory_ViewHolderSiviso.class);
		when(factoryViewHolder.create(viewGroup)).thenReturn(viewHolderSivisoItem);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, factoryViewHolder);
		
		ViewHolder_Abstract actualViewHolder = adapter.onCreateViewHolder(viewGroup, 0);
		assertEquals(viewHolderSivisoItem, actualViewHolder);
	}
	
	@Test
	public void getItemCount_0SivisoData_1()
	{
		int count = 0;
		Siviso[] sivisos = new Siviso[count];
		Database database = mock(Database.class);
		when(database.sivisos()).thenReturn(sivisos);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null);
		
		int actualItemCount = adapter.getItemCount();
		int expectedItemCount = count + 1;
		assertEquals(expectedItemCount, actualItemCount);
	}
	
	@Test
	public void getItemCount_1SivisoData_2()
	{
		int count = 1;
		Siviso[] sivisos = new Siviso[count];
		Database database = mock(Database.class);
		when(database.sivisos()).thenReturn(sivisos);
		
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null);
		int actualItemCount = adapter.getItemCount();
		int expectedItemCount = count + 1;
		assertEquals(expectedItemCount, actualItemCount);
	}
}