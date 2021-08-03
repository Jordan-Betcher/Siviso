package com.jordan.betcher.siviso.siviso.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.view.ViewGroup;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import org.junit.Test;

import java.util.ArrayList;

public class Test$Adapter_SivisoListView
{
	
	@Test
	public void onBindViewHolder_viewHolderSivisoPosition1Database1SivisoData_setSivisoData()
	{
		ViewHolder_SetSpinner viewHolderSetSpinner = mock(ViewHolder_SetSpinner.class);
		int position = 1;
		
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoData sivisoData = mock(SivisoData.class);
		sivisoDatas.add(sivisoData);
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		adapter.onBindViewHolder(viewHolderSetSpinner, position);
		
		verify(viewHolderSetSpinner, times(1)).setSivisoData(sivisoData);
	}
	
	@Test
	public void onBindViewHolder_viewHolderAddPosition1_doNothing()
	{
		ViewHolder_Add viewHolder_add = mock(ViewHolder_Add.class);
		int position = 1;
		
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		adapter.onBindViewHolder(viewHolder_add, position);
		
		verify(viewHolder_add, times(0)).setSivisoData(any());
	}
	
	@Test
	public void onBindViewHolder_viewHolderDefaultPosition0DatabaseDefaultSivisoSilent_setSivisoSilent()
	{
		ViewHolder_SivisoItem viewHolder_sivisoItem = mock(ViewHolder_SivisoItem.class);
		int position = 0;
		Siviso siviso = Siviso.SILENT;
		
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		when(database.defaultSiviso()).thenReturn(siviso);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		adapter.onBindViewHolder(viewHolder_sivisoItem, position);
		
		verify(viewHolder_sivisoItem, times(1)).setSiviso(siviso);
	}
	
	
	@Test
	public void onCreateViewHolder_itemTypeADD_viewHolderAdd()
	{
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
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
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
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
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
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
		int position = 1;
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		sivisoDatas.add(mock(SivisoData.class));
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.SIVISO.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	@Test
	public void getItemViewType_SivisoData0Position0_DEFAULT()
	{
		int position = 0;
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.DEFAULT.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	
	@Test
	public void getItemViewType_SivisoData0Position1_ADD()
	{
		int position = 1;
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.ADD.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	@Test
	public void getItemCount_0SivisoData_2()
	{
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		
		int actualItemCount = adapter.getItemCount();
		int expectedItemCount = sivisoDatas.size() + 2;
		assertEquals(expectedItemCount, actualItemCount);
	}
	
	@Test
	public void getItemCount_1SivisoData_3()
	{
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		sivisoDatas.add(mock(SivisoData.class));
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null, null);
		int actualItemCount = adapter.getItemCount();
		int expectedItemCount = sivisoDatas.size() + 2;
		assertEquals(expectedItemCount, actualItemCount);
	}
}