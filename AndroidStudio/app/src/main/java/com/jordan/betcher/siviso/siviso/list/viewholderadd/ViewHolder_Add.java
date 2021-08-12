package com.jordan.betcher.siviso.siviso.list.viewholderadd;

import android.view.View;
import android.widget.Button;

import com.jordan.betcher.siviso.siviso.add.OnClickListener_StartActivityAdd;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;

public class ViewHolder_Add extends ViewHolder_Abstract
{
	public ViewHolder_Add(
	View view, Button button,
	OnClickListener_StartActivityAdd startActivityAdd)
	{
		super(view);
		button.setOnClickListener(startActivityAdd);
	}
	
	@Override
	public void init(Database database, int sivisoDataIndex)
	{
		//TODO
		//Go To A_Activity_Add giving index
	}
}
