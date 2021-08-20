package com.jordan.betcher.siviso.siviso.main.delete.button;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.SivisoList;
import com.jordan.betcher.siviso.siviso.main.A_Activity_Main;

public class A_DeleteButton
{
	public A_DeleteButton(A_Activity_Main activity, Database database, SivisoList sivisoList)
	{
		Factory_DeleteButton deleteButtonFactory = new Factory_DeleteButton(activity, database, sivisoList);
		DeleteButton deleteButton = deleteButtonFactory.deleteButton();
		
		OnSelect_EnableButton onSelect = new OnSelect_EnableButton(deleteButton);
		sivisoList.addOnSelect(onSelect);
	}
}
