package com.jordan.betcher.siviso.siviso.add.siviso;

import android.widget.Spinner;

import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_Sivisos;

class SivisoView
{
	public SivisoView(Spinner spinner, ArrayAdapter_Sivisos arrayAdapter)
	{
		spinner.setAdapter(arrayAdapter);
	}
}
