package com.jordan.betcher.siviso.siviso.add.confirm;

import com.jordan.betcher.siviso.siviso.database.OnComplete;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

class OnComplete_EnableButton implements OnComplete
{
	private ConfirmButton confirmButton;
	
	public OnComplete_EnableButton(ConfirmButton confirmButton)
	{
		this.confirmButton = confirmButton;
	}
	
	@Override
	public void onComplete(
	PossibleSivisoData possibleSivisoData)
	{
		confirmButton.enable();
	}
}
