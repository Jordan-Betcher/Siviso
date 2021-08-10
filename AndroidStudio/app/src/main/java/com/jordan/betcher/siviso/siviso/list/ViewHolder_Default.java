package com.jordan.betcher.siviso.siviso.list;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.database.Database;

class ViewHolder_Default extends ViewHolder_Abstract
{
	public ViewHolder_Default(
	View view, TextView textView, String name, Spinner spinner, ArrayAdapter sivisoSpinnerAdapter,
	OnItemClickListener_SetDefaultSiviso onItemClickListener, CardView background,
	OnClickListener_GoToCurrentLocation clickListener)
	{
		super(view);
	}
	
	@Override
	public void init(Database database, int sivisoDataIndex)
	{
	
	}
	//TODO
}
