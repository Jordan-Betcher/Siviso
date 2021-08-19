package com.jordan.betcher.siviso.siviso.add.confirm;

import android.view.View;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

class OnClick_SaveSivisoData implements View.OnClickListener
{
	private Database database;
	private PossibleSivisoData possibleSivisoData;
	
	public OnClick_SaveSivisoData(
	Database database, PossibleSivisoData possibleSivisoData)
	{
		this.database = database;
		this.possibleSivisoData = possibleSivisoData;
	}
	
	@Override
	public void onClick(View view)
	{
		database.saveNewSiviso(possibleSivisoData);
	}
}
