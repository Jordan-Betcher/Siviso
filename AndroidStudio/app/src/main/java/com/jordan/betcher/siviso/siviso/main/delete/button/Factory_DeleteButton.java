package com.jordan.betcher.siviso.siviso.main.delete.button;

import android.widget.Button;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.main.A_Activity_Main;

class Factory_DeleteButton
{
	DeleteButton deleteButton;
	
	public Factory_DeleteButton(
	A_Activity_Main activity, Database database, SivisoList sivisoList)
	{
		Button button = activity.findViewById(R.id.buttonDelete);
		OnClickListener_DeleteSelected deleteSelected = new OnClickListener_DeleteSelected(database, sivisoList);
		deleteButton = new DeleteButton(button, deleteSelected);
	}
	
	public DeleteButton deleteButton()
	{
		return deleteButton;
	}
}
