package com.jordan.betcher.siviso.siviso.add.siviso;

import android.view.View;
import android.widget.AdapterView;

import com.jordan.betcher.siviso.siviso.database.PossibleSiviso;

class OnItemSelect_SetPossibleSiviso
implements AdapterView.OnItemSelectedListener
{
	private PossibleSiviso possibleSiviso;
	
	public OnItemSelect_SetPossibleSiviso(PossibleSiviso possibleSiviso)
	{
		this.possibleSiviso = possibleSiviso;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> adapterView, View view, int index, long l)
	{
		possibleSiviso.setSiviso(index);
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> adapterView)
	{
	
	}
}
