package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;

class ViewHolder_SivisoItem extends ViewHolder_Abstract
{
	
	public ViewHolder_SivisoItem(
	View view, TextView textView, String name, Spinner spinner, ArrayAdapter spinnerAdapter, Factory_OnItemClickListener_SetSiviso factoryOnItemClickListenerSetSiviso, CardView background, Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground)
	{
		super(view);
		textView.setText(name);
	}
	
	@Override
	public void init(Database database, int sivisoDataIndex)
	{
		//TODO
	}
	
}
