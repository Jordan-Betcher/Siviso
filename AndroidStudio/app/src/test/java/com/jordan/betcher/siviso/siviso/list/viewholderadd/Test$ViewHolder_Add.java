package com.jordan.betcher.siviso.siviso.list.viewholderadd;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.view.View;
import android.widget.Button;

import com.jordan.betcher.siviso.siviso.add.OnClickListener_StartActivityAdd;

import org.junit.Test;

public class Test$ViewHolder_Add
{
	@Test
	public void _ButtonOnClickStartActivityAdd_setButtonOnClickToStartActivityAdd()
	{
		View view = mock(View.class);
		Button button = mock(Button.class);
		OnClickListener_StartActivityAdd startActivityAdd = mock(OnClickListener_StartActivityAdd.class);
		
		ViewHolder_Add viewHolderAdd = new ViewHolder_Add(view, button, startActivityAdd);
		
		verify(button, times(1)).setOnClickListener(startActivityAdd);
	}
}