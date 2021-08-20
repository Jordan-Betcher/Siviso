package com.jordan.betcher.siviso.siviso.add.confirm;

import android.widget.Button;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.A_Activity_Add;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

public class A_ConfirmButton
{
	public A_ConfirmButton(
	A_Activity_Add activity, PossibleSivisoData possibleSivisoData,
	Database database)
	{
		Button button = activity.findViewById(R.id.buttonConfirm);
		//TODO on click go back to home ?Database.save go to home
		OnClick_SaveSivisoDataAndFinishActivity saveData = new OnClick_SaveSivisoDataAndFinishActivity(
		activity, database, possibleSivisoData);
		ConfirmButton confirmButton = new ConfirmButton(button, saveData);
		OnComplete_EnableButton enableButton = new OnComplete_EnableButton(confirmButton);
		possibleSivisoData.setOnComplete(enableButton);
	}
}
