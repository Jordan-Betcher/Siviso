package com.jordan.betcher.siviso.siviso.add.confirm;

import android.app.Activity;
import android.view.View;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

class OnClick_SaveSivisoDataAndFinishActivity implements View.OnClickListener
{
	private Database database;
	private PossibleSivisoData possibleSivisoData;
	
	public OnClick_SaveSivisoDataAndFinishActivity(
	Activity activity, Database database, PossibleSivisoData possibleSivisoData)
	{
		this.database = database;
		this.possibleSivisoData = possibleSivisoData;
		activity.finish();
	}
	
	@Override
	public void onClick(View view)
	{
		database.saveNewSiviso(possibleSivisoData);
	}
}
