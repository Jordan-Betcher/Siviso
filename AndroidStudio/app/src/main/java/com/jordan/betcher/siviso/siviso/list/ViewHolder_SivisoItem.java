package com.jordan.betcher.siviso.siviso.list;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.database.Siviso;

class ViewHolder_SivisoItem extends ViewHolder_SetSpinner
{
	private Spinner spinner;
	
	public ViewHolder_SivisoItem(
	View view,
	Spinner spinner,
	TextView name,
	CardView background,
	int nameID,
	OnClickListener_GoToCurrentLocation clickListener,
	ArrayAdapter sivisoSpinnerAdapter,
	OnItemClickListener_SetDefaultSiviso onItemClickListener)
	{
		super(view);
		this.spinner = spinner;
//		TODO
//		name.setText(nameID);
//		background.setOnClickListener(clickListener);
//		spinner.setAdapter(sivisoSpinnerAdapter);
//		spinner.setOnItemClickListener(onItemClickListener);
	}
	
	public void setSiviso(Siviso siviso)
	{
//		spinner.setSelection(siviso.ordinal());
		//TODO
	}
}
