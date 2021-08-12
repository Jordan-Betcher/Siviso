package com.jordan.betcher.siviso.siviso.list.viewholderadd;

import android.view.View;
import android.widget.Button;

import com.jordan.betcher.siviso.siviso.add.Factory_OnClickListener_StartActivityAdd;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;

public class ViewHolder_Add extends ViewHolder_Abstract
{
	private Button button;
	private Factory_OnClickListener_StartActivityAdd factory;
	
	public ViewHolder_Add(
	View view, Button button,
	Factory_OnClickListener_StartActivityAdd factory)
	{
		super(view);
		View.OnClickListener onClickListener = factory.create();
		button.setOnClickListener(onClickListener);
	}
	
	@Override
	public void init(Database database, int sivisoDataIndex)
	{
	}
}
