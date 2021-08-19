package com.jordan.betcher.siviso.siviso.add.confirm;

import android.view.View;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

class OnClick_SaveSivisoData implements View.OnClickListener
{
	public OnClick_SaveSivisoData(
	Database database, PossibleSivisoData possibleSivisoData)
	{
		database.saveNewSiviso(possibleSivisoData);
	}
	
	@Override
	public void onClick(View view)
	{
	
	}
	//TODO
}
