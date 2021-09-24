package com.jordan.betcher.siviso.siviso.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import androidx.recyclerview.widget.ItemTouchHelper;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.viewholderdefault.ViewHolder_Default;

import org.junit.Test;

public class Test$SimpleCallback_SwipeToDelete
{
	@Test
	public void onSwiped_0_0databaseDelete()
	{
		int viewHolderPosition = 0;
		int sivisoIndex = viewHolderPosition - 1;
		ViewHolder_Abstract viewHolder = mock(ViewHolder_Abstract.class);
		Database database = mock(Database.class);
		Adapter_SivisoListView adapter = mock(Adapter_SivisoListView.class);
		A_ViewHolderHelper viewHolderHelper = mock(A_ViewHolderHelper.class);
		when(adapter.database()).thenReturn(database);
		when(adapter.listPositionToSivisoIndex(viewHolderPosition)).thenReturn(sivisoIndex);
		when(viewHolderHelper.positionOf(viewHolder)).thenReturn(viewHolderPosition);
		
		SimpleCallback_SwipeToDelete swipeToDelete = new SimpleCallback_SwipeToDelete(adapter,
		                                                                              viewHolderHelper);
		swipeToDelete.onSwiped(viewHolder, ItemTouchHelper.RIGHT);
		
		verify(database, times(0)).delete(anyInt());
	}
	
	@Test
	public void onSwiped_2_databaseDelete1()
	{
		int viewHolderPosition = 2;
		int sivisoIndex = viewHolderPosition - 1;
		ViewHolder_Abstract viewHolder = mock(ViewHolder_Abstract.class);
		Database database = mock(Database.class);
		Adapter_SivisoListView adapter = mock(Adapter_SivisoListView.class);
		A_ViewHolderHelper viewHolderHelper = mock(A_ViewHolderHelper.class);
		when(adapter.database()).thenReturn(database);
		when(adapter.listPositionToSivisoIndex(viewHolderPosition)).thenReturn(sivisoIndex);
		when(viewHolderHelper.positionOf(viewHolder)).thenReturn(viewHolderPosition);
		
		SimpleCallback_SwipeToDelete swipeToDelete = new SimpleCallback_SwipeToDelete(adapter,
		                                                                              viewHolderHelper);
		swipeToDelete.onSwiped(viewHolder, ItemTouchHelper.RIGHT);
		
		verify(database, times(1)).delete(sivisoIndex);
	}
	
	@Test
	public void onSwiped_1_databaseDelete0()
	{
		int viewHolderPosition = 1;
		int sivisoIndex = viewHolderPosition - 1;
		ViewHolder_Abstract viewHolder = mock(ViewHolder_Abstract.class);
		Database database = mock(Database.class);
		Adapter_SivisoListView adapter = mock(Adapter_SivisoListView.class);
		A_ViewHolderHelper viewHolderHelper = mock(A_ViewHolderHelper.class);
		when(adapter.database()).thenReturn(database);
		when(adapter.listPositionToSivisoIndex(viewHolderPosition)).thenReturn(sivisoIndex);
		when(viewHolderHelper.positionOf(viewHolder)).thenReturn(viewHolderPosition);
		
		SimpleCallback_SwipeToDelete swipeToDelete = new SimpleCallback_SwipeToDelete(adapter,
		                                                                              viewHolderHelper);
		swipeToDelete.onSwiped(viewHolder, ItemTouchHelper.RIGHT);
		
		verify(database, times(1)).delete(sivisoIndex);
	}
	
	@Test
	public void getMovementFlags_viewHolderDefault_0()
	{
		ViewHolder_Abstract viewHolder = mock(ViewHolder_Default.class);
		
		SimpleCallback_SwipeToDelete swipeToDelete = new SimpleCallback_SwipeToDelete(null,
		                                                                              null);
		
		int actualMovementFlag = swipeToDelete.getMovementFlags(null, viewHolder);
		assertEquals(0, actualMovementFlag);
	}
	
	@Test
	public void getMovementFlags_viewHolder_RIGHT()
	{
		ViewHolder_Abstract viewHolder = mock(ViewHolder_Abstract.class);
		
		SimpleCallback_SwipeToDelete swipeToDelete = new SimpleCallback_SwipeToDelete(null,
		                                                                              null);
		
		int actualMovementFlag = swipeToDelete.getMovementFlags(null, viewHolder);
		assertEquals(ItemTouchHelper.RIGHT, actualMovementFlag);
	}
}