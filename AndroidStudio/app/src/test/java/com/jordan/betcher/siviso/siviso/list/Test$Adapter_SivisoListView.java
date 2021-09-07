package com.jordan.betcher.siviso.siviso.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.view.ViewGroup;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.Siviso;
import com.jordan.betcher.siviso.siviso.list.viewholderdefault.Factory_ViewHolderDefault;
import com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem.Factory_ViewHolderSiviso;

import org.junit.Test;

public class Test$Adapter_SivisoListView
{
	@Test
	public void onBindViewHolder_onBindViewHolder0_OnBindViewHolder0ViewHolder()
	{
		Database database = mock(Database.class);
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null);
		
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
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null);
		adapter.onBindViewHolder(viewHolder_sivisoItem, position);
		
		verify(viewHolder_sivisoItem, times(1)).init(database, position - 1);
	}
	
	@Test
	public void onCreateViewHolder_itemTypeDEFAULT_viewHolderDefault()
	{
		Database database = mock(Database.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		ViewHolder_Abstract viewHolderDefault = mock(ViewHolder_Abstract.class);
		Factory_ViewHolderDefault factoryViewHolder = mock(Factory_ViewHolderDefault.class);
		when(factoryViewHolder.create(viewGroup)).thenReturn(viewHolderDefault);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, factoryViewHolder, null);
		
		int itemType = Adapter_SivisoListView.ViewType.DEFAULT.ordinal();
		ViewHolder_Abstract actualViewHolder = adapter.onCreateViewHolder(viewGroup, itemType);
		assertEquals(viewHolderDefault, actualViewHolder);
	}
	
	@Test
	public void onCreateViewHolder_itemTypeSIVISO_viewHolderSiviso()
	{
		Database database = mock(Database.class);
		ViewGroup viewGroup = mock(ViewGroup.class);
		ViewHolder_Abstract viewHolderSivisoItem = mock(ViewHolder_Abstract.class);
		Factory_ViewHolderSiviso factoryViewHolder = mock(Factory_ViewHolderSiviso.class);
		when(factoryViewHolder.create(viewGroup)).thenReturn(viewHolderSivisoItem);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, factoryViewHolder);
		
		int itemType = Adapter_SivisoListView.ViewType.SIVISO.ordinal();
		ViewHolder_Abstract actualViewHolder = adapter.onCreateViewHolder(viewGroup, itemType);
		assertEquals(viewHolderSivisoItem, actualViewHolder);
	}
	
	@Test
	public void getItemViewType_SivisoData1Position1_SIVISO()
	{
		int count = 1;
		int position = 1;
		
		Siviso[] sivisos = new Siviso[count];
		Database database = mock(Database.class);
		when(database.sivisos()).thenReturn(sivisos);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.SIVISO.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	@Test
	public void getItemViewType_SivisoData0Position0_DEFAULT()
	{
		int position = 0;
		Database database = mock(Database.class);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null);
		
		int actualViewType = adapter.getItemViewType(position);
		int expected = Adapter_SivisoListView.ViewType.DEFAULT.ordinal();
		assertEquals(expected, actualViewType);
	}
	
	@Test
	public void getItemCount_0SivisoData_1()
	{
		int count = 0;
		Siviso[] sivisos = new Siviso[count];
		Database database = mock(Database.class);
		when(database.sivisos()).thenReturn(sivisos);
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null);
		
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
		
		
		Adapter_SivisoListView adapter = new Adapter_SivisoListView(database, null, null);
		int actualItemCount = adapter.getItemCount();
		int expectedItemCount = count + 1;
		assertEquals(expectedItemCount, actualItemCount);
	}
}