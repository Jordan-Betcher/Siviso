package com.jordan.betcher.siviso.siviso.list;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Siviso;

class ViewHolder_Default extends ViewHolder_Abstract
{
	private Spinner spinner;
	
	public ViewHolder_Default(
	View view,
	OnClickListener_GoToCurrentLocation clickListener,
	ArrayAdapter sivisoSpinnerAdapter,
	OnItemClickListener_SetDefaultSiviso onItemClickListener)
	{
		super(view);
		TextView textView = view.findViewById(R.id.textViewName);
		textView.setText(R.string.siviso_list_name_default);
		
		CardView cardView = view.findViewById(R.id.cardViewHome);
		cardView.setOnClickListener(clickListener);
		
		spinner = view.findViewById(R.id.spinnerHome);
		spinner.setAdapter(sivisoSpinnerAdapter);
		
		spinner.setOnItemClickListener(onItemClickListener);
	}
	
	public void setSiviso(Siviso siviso)
	{
		spinner.setSelection(siviso.ordinal());
	}
}
