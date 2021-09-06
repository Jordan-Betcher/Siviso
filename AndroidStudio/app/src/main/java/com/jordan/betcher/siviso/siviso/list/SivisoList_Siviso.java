package com.jordan.betcher.siviso.siviso.list;

import java.util.ArrayList;

public class SivisoList_Siviso implements SivisoList
{
	
	private ArrayList<OnSivisoSelect> onSivisoSelects = new ArrayList<>();
	
	@Override
	public void select(int indexOfSiviso)
	{
		for(OnSivisoSelect onSivisoSelect : onSivisoSelects)
		{
			onSivisoSelect.onSivisoSelect(indexOfSiviso + 1);
		}
	}
	
	@Override
	public void addOnSelect(OnSivisoSelect onSivisoSelect)
	{
		onSivisoSelects.add(onSivisoSelect);
	}
}
