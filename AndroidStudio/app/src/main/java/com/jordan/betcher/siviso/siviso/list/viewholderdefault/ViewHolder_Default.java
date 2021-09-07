package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_Sivisos;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;

class ViewHolder_Default extends ViewHolder_Abstract
{
	private Spinner spinner;
	private final CardView background;
	
	public ViewHolder_Default(
	View view, TextView textView, String name, Spinner spinner, ArrayAdapter_Sivisos adapter,
	OnItemSelectedListener_SetDefaultSiviso onItemSelected, CardView background,
	OnClickListener_GoToCurrentLocation onClick)
	{
		super(view);
		this.spinner = spinner;
		this.background = background;
		textView.setText(name);
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(onItemSelected);
		background.setOnClickListener(onClick);
	}
	
	@Override
	public void init(Database database, int sivisoDataIndex)
	{
		spinner.setSelection(database.defaultRingmode().ordinal());
	}
	
	@Override
	public View background()
	{
		return background;
	}
}
