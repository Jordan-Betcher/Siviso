package com.jordan.betcher.siviso.siviso.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import androidx.recyclerview.widget.ItemTouchHelper;

import com.jordan.betcher.siviso.siviso.list.viewholderdefault.ViewHolder_Default;

import org.junit.Test;

public class Test$SimpleCallback_SwipeToDelete
{
	@Test
	public void getMovementFlags_viewHolderDefault_0()
	{
		ViewHolder_Abstract viewHolder = mock(ViewHolder_Default.class);
		
		SimpleCallback_SwipeToDelete swipeToDelete = new SimpleCallback_SwipeToDelete(null);
		
		int actualMovementFlag = swipeToDelete.getMovementFlags(null, viewHolder);
		assertEquals(0, actualMovementFlag);
	}
	
	@Test
	public void getMovementFlags_viewHolder_RIGHT()
	{
		ViewHolder_Abstract viewHolder = mock(ViewHolder_Abstract.class);
		
		SimpleCallback_SwipeToDelete swipeToDelete = new SimpleCallback_SwipeToDelete(null);
		
		int actualMovementFlag = swipeToDelete.getMovementFlags(null, viewHolder);
		assertEquals(ItemTouchHelper.RIGHT, actualMovementFlag);
	}
}