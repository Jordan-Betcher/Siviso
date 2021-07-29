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
	public ViewHolder_Default(
	View view,
	OnClickListener_GoToCurrentLocation clickListener,
	ArrayAdapter<CharSequence> sivisoSpinnerAdapter)
	{
		super(view);
		TextView textView = view.findViewById(R.id.textViewName);
		textView.setText(R.string.siviso_list_name_default);
		
		CardView cardView = view.findViewById(R.id.cardViewHome);
		cardView.setOnClickListener(clickListener);
		
		Spinner spinner = view.findViewById(R.id.spinnerHome);
		spinner.setAdapter(sivisoSpinnerAdapter);
	}
	
	public void setSiviso(Siviso siviso)
	{
		//TODO: set spinner to corrisponding index of Siviso
	}
}
