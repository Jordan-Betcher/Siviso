package com.jordan.betcher.siviso.siviso.add.confirm;

import android.app.Activity;
import android.view.View;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSiviso;

class OnClick_SaveSivisoAndFinishActivity implements View.OnClickListener
{
	private Activity activity;
	private Database database;
	private PossibleSiviso possibleSiviso;
	
	public OnClick_SaveSivisoAndFinishActivity(
	Activity activity, Database database, PossibleSiviso possibleSiviso)
	{
		this.activity = activity;
		this.database = database;
		this.possibleSiviso = possibleSiviso;
	}
	
	@Override
	public void onClick(View view)
	{
		activity.finish();
		database.saveNewSiviso(possibleSiviso);
	}
}
