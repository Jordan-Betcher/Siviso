package com.jordan.betcher.siviso.siviso.main.delete.button;

import android.widget.Button;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.main.A_Activity_Main;

public class A_DeleteButton
{
	private A_Activity_Main activity;
	private Database database;
	private SivisoList sivisoList;
	
	public A_DeleteButton(A_Activity_Main activity, Database database, SivisoList sivisoList)
	{
		this.activity = activity;
		this.database = database;
		this.sivisoList = sivisoList;
		
		DeleteButton deleteButton = deleteButton();
		OnSelect_EnableButton onSelect = new OnSelect_EnableButton(deleteButton);
		sivisoList.addOnSelect(onSelect);
	}
	
	private DeleteButton deleteButton()
	{
		Button button = activity.findViewById(R.id.buttonDelete);
		OnClickListener_DeleteSelected deleteSelected = new OnClickListener_DeleteSelected(database, sivisoList);
		return new DeleteButton(button, deleteSelected);
	}
}
