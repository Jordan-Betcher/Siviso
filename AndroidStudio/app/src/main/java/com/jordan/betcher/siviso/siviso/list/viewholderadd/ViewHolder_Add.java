package com.jordan.betcher.siviso.siviso.list.viewholderadd;

import android.view.View;
import android.widget.Button;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;

public class ViewHolder_Add extends ViewHolder_Abstract
{
	public ViewHolder_Add(
	View view, Button button,
	View.OnClickListener onClickListener)
	{
		super(view);
		button.setOnClickListener(onClickListener);
	}
	
	@Override
	public void init(Database database, int sivisoDataIndex)
	{
	}
}
