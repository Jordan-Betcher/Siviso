package com.jordan.betcher.siviso.siviso.add.siviso;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

class OnItemSelect_SetPossibleSiviso
implements AdapterView.OnItemSelectedListener
{
	private PossibleSivisoData possibleSivisoData;
	
	public OnItemSelect_SetPossibleSiviso(PossibleSivisoData possibleSivisoData)
	{
		this.possibleSivisoData = possibleSivisoData;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> adapterView, View view, int index, long l)
	{
		possibleSivisoData.setSiviso(index);
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> adapterView)
	{
	
	}
	//TODO
}
