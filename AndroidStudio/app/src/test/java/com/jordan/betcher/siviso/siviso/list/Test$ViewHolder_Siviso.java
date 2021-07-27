package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class Test$ViewHolder_Siviso
{
	@Test
	public void equals_diffView_false()
	{
		View view1 = mock(View.class);
		View view2 = mock(View.class);
		ViewHolder_Siviso viewHolder = new ViewHolder_Siviso(view1);
		ViewHolder_Siviso expected = new ViewHolder_Siviso(view2);
		
		boolean actual = viewHolder.equals(expected);
		assertFalse(actual);
	}
	
	@Test
	public void equals_sameView_true()
	{
		View view = mock(View.class);
		ViewHolder_Siviso viewHolder = new ViewHolder_Siviso(view);
		ViewHolder_Siviso expected = new ViewHolder_Siviso(view);
		
		boolean actual = viewHolder.equals(expected);
		assertTrue(actual);
	}
}