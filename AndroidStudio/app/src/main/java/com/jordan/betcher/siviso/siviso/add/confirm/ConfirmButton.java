package com.jordan.betcher.siviso.siviso.add.confirm;

import android.widget.Button;

class ConfirmButton
{
	public ConfirmButton(
	Button button, OnClick_SaveSivisoData saveData)
	{
		button.setOnClickListener(saveData);
	}
	//TODO
}
