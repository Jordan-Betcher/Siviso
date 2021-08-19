package com.jordan.betcher.siviso.siviso.add.confirm;

import com.jordan.betcher.siviso.siviso.database.OnComplete;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

class OnComplete_EnableButton implements OnComplete
{
	public OnComplete_EnableButton(ConfirmButton confirmButton)
	{
		confirmButton.enable();
	}
	
	@Override
	public void onComplete(
	PossibleSivisoData possibleSivisoData)
	{
	
	}
	//TODO
}
