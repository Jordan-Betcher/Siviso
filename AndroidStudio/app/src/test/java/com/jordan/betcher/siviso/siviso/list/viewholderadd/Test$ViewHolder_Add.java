package com.jordan.betcher.siviso.siviso.list.viewholderadd;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.view.View;
import android.widget.Button;

import com.jordan.betcher.siviso.siviso.add.Factory_OnClickListener_StartActivityAdd;

import org.junit.Test;

public class Test$ViewHolder_Add
{
	@Test
	public void init_Index1_setButtonOnClickFromFactory()
	{
		int index = 1;
		View view = mock(View.class);
		Button button = mock(Button.class);
		Factory_OnClickListener_StartActivityAdd factory = mock(Factory_OnClickListener_StartActivityAdd.class);
		View.OnClickListener onClickListener = mock(View.OnClickListener.class);
		when(factory.create(index)).thenReturn(onClickListener);
		
		ViewHolder_Add viewHolderAdd = new ViewHolder_Add(view, button, factory);
		viewHolderAdd.init(null, index);
		
		verify(button, times(1)).setOnClickListener(onClickListener);
	}
	
	@Test
	public void init_Index0_setButtonOnClickFromFactory()
	{
		int index = 0;
		View view = mock(View.class);
		Button button = mock(Button.class);
		Factory_OnClickListener_StartActivityAdd factory = mock(Factory_OnClickListener_StartActivityAdd.class);
		View.OnClickListener onClickListener = mock(View.OnClickListener.class);
		when(factory.create(index)).thenReturn(onClickListener);
		
		ViewHolder_Add viewHolderAdd = new ViewHolder_Add(view, button, factory);
		viewHolderAdd.init(null, index);
		
		verify(button, times(1)).setOnClickListener(onClickListener);
	}
}