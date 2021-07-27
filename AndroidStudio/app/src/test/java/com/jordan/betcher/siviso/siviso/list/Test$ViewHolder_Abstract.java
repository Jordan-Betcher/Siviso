package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class Test$ViewHolder_Abstract
{
	private class ViewHolder_Mock extends ViewHolder_Abstract
	{
		public ViewHolder_Mock(View view){super(view);}
	}
	
	private class ViewHolder_Mock2 extends ViewHolder_Abstract
	{
		public ViewHolder_Mock2(View view){super(view);}
	}
	
	@Test
	public void equals_DifferentClass_false()
	{
		View view = mock(View.class);
		ViewHolder_Abstract viewHolder = new ViewHolder_Mock(view);
		ViewHolder_Abstract expected = new ViewHolder_Mock2(view);
		
		boolean actual = viewHolder.equals(expected);
		assertFalse(actual);
	}
	
	@Test
	public void equals_diffViewSameClass_false()
	{
		View view1 = mock(View.class);
		View view2 = mock(View.class);
		ViewHolder_Abstract viewHolder = new ViewHolder_Mock(view1);
		ViewHolder_Abstract expected = new ViewHolder_Mock(view2);
		
		boolean actual = viewHolder.equals(expected);
		assertFalse(actual);
	}
	
	@Test
	public void equals_sameViewSameClass_true()
	{
		View view = mock(View.class);
		ViewHolder_Abstract viewHolder = new ViewHolder_Mock(view);
		ViewHolder_Abstract expected = new ViewHolder_Mock(view);
		
		boolean actual = viewHolder.equals(expected);
		assertTrue(actual);
	}
}