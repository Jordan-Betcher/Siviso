package com.jordan.betcher.siviso.siviso.add.siviso;

import android.widget.Spinner;

import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_CharSequence;

class SivisoView
{
	public SivisoView(Spinner spinner, ArrayAdapter_CharSequence arrayAdapter)
	{
		spinner.setAdapter(arrayAdapter);
	}
}
