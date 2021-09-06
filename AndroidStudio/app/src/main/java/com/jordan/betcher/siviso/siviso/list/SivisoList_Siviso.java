package com.jordan.betcher.siviso.siviso.list;

import java.util.ArrayList;

public class SivisoList_Siviso implements SivisoList
{
	
	private ArrayList<OnRowSelect> onRowSelects = new ArrayList<>();
	
	@Override
	public void select(int indexOfSiviso)
	{
		for(OnRowSelect onRowSelect : onRowSelects)
		{
			onRowSelect.onSelect(indexOfSiviso + 1);
		}
	}
	
	@Override
	public void addOnSelect(OnRowSelect onRowSelect)
	{
		onRowSelects.add(onRowSelect);
	}
}
