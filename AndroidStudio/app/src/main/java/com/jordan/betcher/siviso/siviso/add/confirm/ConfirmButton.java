package com.jordan.betcher.siviso.siviso.add.confirm;

import android.widget.Button;

class ConfirmButton
{
	@androidx.annotation.NonNull
	private final Button button;
	
	public ConfirmButton(
	Button button, OnClick_SaveSivisoAndFinishActivity saveData)
	{
		this.button = button;
		button.setOnClickListener(saveData);
		button.setEnabled(false);
	}
	
	public void enable()
	{
		button.setEnabled(true);
	}
}
