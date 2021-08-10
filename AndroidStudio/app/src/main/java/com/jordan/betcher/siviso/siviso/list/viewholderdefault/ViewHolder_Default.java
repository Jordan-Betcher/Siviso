package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_CharSequence;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;

class ViewHolder_Default extends ViewHolder_Abstract
{
	public ViewHolder_Default(
	View view, TextView textView, String name, Spinner spinner, ArrayAdapter_CharSequence adapter,
	OnItemClickListener_SetDefaultSiviso onItemClickListener, CardView background,
	OnClickListener_GoToCurrentLocation onClick)
	{
		super(view);
		textView.setText(name);
		spinner.setAdapter(adapter);
		spinner.setOnItemClickListener(onItemClickListener);
		background.setOnClickListener(onClick);
	}
	
	@Override
	public void init(Database database, int sivisoDataIndex)
	{
		//Do Nothing
	}
}
