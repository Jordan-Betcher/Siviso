package com.jordan.betcher.siviso.siviso.main.delete.button;

import android.widget.Button;

class DeleteButton
{
	public DeleteButton(Button button, OnClickListener_DeleteSelected deleteSelected)
	{
		button.setEnabled(false);
		button.setOnClickListener(deleteSelected);
	}
	
	public void enable()
	{
		//TODO DeleteButton enable
	}
}
