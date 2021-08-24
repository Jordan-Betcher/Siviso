package com.jordan.betcher.siviso.siviso.add.siviso;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.A_Activity_Add;
import com.jordan.betcher.siviso.siviso.database.PossibleSiviso;
import com.jordan.betcher.siviso.siviso.database.Ringmodes;
import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_Sivisos;

class Factory_SivisoView
{
	public SivisoView create(
	A_Activity_Add activity, LayoutInflater layoutInflater,
	PossibleSiviso possibleSiviso)
	{
		ViewGroup parent = activity.findViewById(R.id.addSiviso);
		View view = layoutInflater.inflate(R.layout.item_siviso, parent, true);
		Spinner spinner = view.findViewById(R.id.spinner);
		
		Ringmodes ringmodes = new Ringmodes();
		ArrayAdapter_Sivisos arrayAdapter_sivisos = new ArrayAdapter_Sivisos(activity, ringmodes);
		OnItemSelect_SetPossibleSiviso onItemSelect = new OnItemSelect_SetPossibleSiviso(
		possibleSiviso);
		return new SivisoView(spinner, arrayAdapter_sivisos, onItemSelect);
	}
	
}
