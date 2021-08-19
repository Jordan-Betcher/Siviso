package com.jordan.betcher.siviso.siviso.add.siviso;

import android.widget.Spinner;

import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_Sivisos;

class SivisoView
{
	public SivisoView(
	Spinner spinner, ArrayAdapter_Sivisos arrayAdapter,
	OnItemSelect_SetPossibleSiviso onItemSelect)
	{
		spinner.setAdapter(arrayAdapter);
		spinner.setOnItemSelectedListener(onItemSelect);
	}
}
