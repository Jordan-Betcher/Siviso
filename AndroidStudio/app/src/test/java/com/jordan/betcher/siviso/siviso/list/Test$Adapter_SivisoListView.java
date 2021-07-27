package com.jordan.betcher.siviso.siviso.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;
import com.jordan.betcher.siviso.siviso.database.SivisoData;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Test$Adapter_SivisoListView
{
	
	@Test
	public void onBindViewHolder_viewHolderSivisoPosition1Database1SivisoData_setSivisoData()
	{
		ViewHolder_Siviso viewHolder_Siviso = mock(ViewHolder_Siviso.class);
		int position = 1;
		
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoData sivisoData = mock(SivisoData.class);
		sivisoDatas.add(sivisoData);
		SivisoList sivisoList = mock(SivisoList.class);
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, sivisoList);
		adapter.onBindViewHolder(viewHolder_Siviso, position);
		
		verify(viewHolder_Siviso, times(1)).setSivisoData(sivisoData);
	}
	
	@Test
	public void onBindViewHolder_viewHolderAddPosition1_doNothing()
	{
		ViewHolder_Add viewHolder_add = mock(ViewHolder_Add.class);
		int position = 1;
		
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoList sivisoList = mock(SivisoList.class);
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, sivisoList);
		adapter.onBindViewHolder(viewHolder_add, position);
	}
	
	@Test
	public void onBindViewHolder_viewHolderDefaultPosition0DatabaseDefaultSivisoSilent_setSivisoSilent()
	{
		ViewHolder_Default viewHolder_default = mock(ViewHolder_Default.class);
		int position = 0;
		Siviso siviso = Siviso.SILENT;
		
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoList sivisoList = mock(SivisoList.class);
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		when(database.defaultSiviso()).thenReturn(siviso);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, sivisoList);
		adapter.onBindViewHolder(viewHolder_default, position);
		
		verify(viewHolder_default, times(1)).setSiviso(siviso);
	}
	
	
	@Test
	public void onCreateViewHolder_itemTypeADD_viewHolderAdd()
	{
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoList sivisoList = mock(SivisoList.class);
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		View view = mock(View.class);
		when(layoutInflater.inflate(R.layout.item_siviso_add_button, viewGroup, false)).thenReturn(view);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, sivisoList);
		
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
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		View view = mock(View.class);
		when(layoutInflater.inflate(R.layout.item_siviso, viewGroup, false)).thenReturn(view);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, sivisoList);
		
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
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		View view = mock(View.class);
		when(layoutInflater.inflate(R.layout.item_siviso, viewGroup, false)).thenReturn(view);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, sivisoList);
		
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
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		SivisoList sivisoList = mock(SivisoList.class);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, sivisoList);
		
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
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, sivisoList);
		
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
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, sivisoList);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.ADD.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	@Test
	public void getItemCount_0SivisoData_2()
	{
		ArrayList<SivisoData> sivisoDatas = new ArrayList<>();
		SivisoList sivisoList = mock(SivisoList.class);
		Database database = mock(Database.class);
		when(database.sivisoDatas()).thenReturn(sivisoDatas);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, sivisoList);
		
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
		SivisoList sivisoList = mock(SivisoList.class);
		LayoutInflater layoutInflater = mock(LayoutInflater.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, layoutInflater, sivisoList);
		
		int actualItemCount = adapter.getItemCount();
		int expectedItemCount = sivisoDatas.size() + 2;
		assertEquals(expectedItemCount, actualItemCount);
	}
}