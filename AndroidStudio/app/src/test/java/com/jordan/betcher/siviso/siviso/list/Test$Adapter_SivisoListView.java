package com.jordan.betcher.siviso.siviso.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.view.ViewGroup;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import org.junit.Test;

import java.util.ArrayList;

public class Test$Adapter_SivisoListView
{
	@Test
	public void onBindViewHolder_Count0Position0_initMinus1()
	{
		ViewHolder_SivisoItem viewHolder_sivisoItem = mock(ViewHolder_SivisoItem.class);
		int position = 0;
		int count = 0;
		
		Database database = mock(Database.class);
		when(database.count()).thenReturn(count);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		adapter.onBindViewHolder(viewHolder_sivisoItem, position);
		
		verify(viewHolder_sivisoItem, times(1)).init(database, position - 1);
	}
	
	
	@Test
	public void onCreateViewHolder_itemTypeADD_viewHolderAdd()
	{
		Database database = mock(Database.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		ViewHolder_Add viewHolderAdd = mock(ViewHolder_Add.class);
		Factory_ViewHolderAdd factoryViewHolder = mock(Factory_ViewHolderAdd.class);
		when(factoryViewHolder.create(viewGroup)).thenReturn(viewHolderAdd);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, factoryViewHolder);
		
		int itemType = Adapter_SivisoListView.ViewType.ADD.ordinal();
		ViewHolder_Add viewHolder = (ViewHolder_Add)adapter.onCreateViewHolder(viewGroup, itemType);
		assertEquals(viewHolderAdd, viewHolder);
	}
	
	@Test
	public void onCreateViewHolder_itemTypeDEFAULT_viewHolderDefault()
	{
		Database database = mock(Database.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		ViewHolder_SivisoItem viewHolderDefault = mock(ViewHolder_SivisoItem.class);
		Factory_ViewHolderDefault factoryViewHolder = mock(Factory_ViewHolderDefault.class);
		when(factoryViewHolder.create(viewGroup)).thenReturn(viewHolderDefault);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, factoryViewHolder, null, null);
		
		int itemType = Adapter_SivisoListView.ViewType.DEFAULT.ordinal();
		ViewHolder_SetSpinner actualViewHolder = adapter.onCreateViewHolder(viewGroup, itemType);
		assertEquals(viewHolderDefault, actualViewHolder);
	}
	
	@Test
	public void onCreateViewHolder_itemTypeSIVISO_viewHolderSiviso()
	{
		Database database = mock(Database.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		ViewHolder_SivisoItem viewHolderSivisoItem = mock(ViewHolder_SivisoItem.class);
		Factory_ViewHolderSiviso factoryViewHolder = mock(Factory_ViewHolderSiviso.class);
		when(factoryViewHolder.create(viewGroup)).thenReturn(viewHolderSivisoItem);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, factoryViewHolder, null);
		
		int itemType = Adapter_SivisoListView.ViewType.SIVISO.ordinal();
		ViewHolder_SetSpinner actualViewHolder = adapter.onCreateViewHolder(viewGroup, itemType);
		assertEquals(viewHolderSivisoItem, actualViewHolder);
	}
	
	@Test
	public void getItemViewType_SivisoData1Position1_SIVISO()
	{
		int count = 1;
		int position = 1;
		
		Database database = mock(Database.class);
		when(database.count()).thenReturn(count);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.SIVISO.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	@Test
	public void getItemViewType_SivisoData0Position0_DEFAULT()
	{
		int position = 0;
		Database database = mock(Database.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.DEFAULT.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	
	@Test
	public void getItemViewType_SivisoData0Position1_ADD()
	{
		int position = 1;
		Database database = mock(Database.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.ADD.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	@Test
	public void getItemCount_0SivisoData_2()
	{
		int count = 0;
		Database database = mock(Database.class);
		when(database.count()).thenReturn(count);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		
		int actualItemCount = adapter.getItemCount();
		int expectedItemCount = count + 2;
		assertEquals(expectedItemCount, actualItemCount);
	}
	
	@Test
	public void getItemCount_1SivisoData_3()
	{
		int count = 1;
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		sivisoDatas.add(mock(SivisoData.class));
		Database database = mock(Database.class);
		when(database.count()).thenReturn(count);
		
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		int actualItemCount = adapter.getItemCount();
		int expectedItemCount = count + 2;
		assertEquals(expectedItemCount, actualItemCount);
	}
}