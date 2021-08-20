package com.jordan.betcher.siviso.siviso.main.delete.button;

import android.widget.Button;

class DeleteButton
{
	private final Button button;
	
	public DeleteButton(Button button, OnClickListener_DeleteSelected deleteSelected)
	{
		this.button = button;
		button.setEnabled(false);
		button.setOnClickListener(deleteSelected);
	}
	
	public void enable()
	{
		button.setEnabled(true);
	}
}
