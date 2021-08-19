package com.jordan.betcher.siviso.siviso.add.siviso;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.A_Activity_Add;
import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_CharSequence;

class Factory_SivisoView
{
	public SivisoView create(A_Activity_Add activity, LayoutInflater layoutInflater)
	{
		ViewGroup parent = activity.findViewById(R.id.addSiviso);
		View view = layoutInflater.inflate(R.layout.item_siviso, parent, true);
		Spinner spinner = view.findViewById(R.id.spinner);
		
		ArrayAdapter_CharSequence arrayAdapter_charSequence = new ArrayAdapter_CharSequence(activity, 0, new CharSequence[0]);
		return new SivisoView(spinner, arrayAdapter_charSequence);
	}
	
}
