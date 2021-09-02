package com.jordan.betcher.siviso.siviso.list;

import java.util.ArrayList;

public class SivisoList_Siviso implements SivisoList
{
	
	private ArrayList<OnSelect> onSelects = new ArrayList<>();
	
	@Override
	public void select(int indexOfSiviso)
	{
		for(OnSelect onSelect : onSelects)
		{
			onSelect.onSelect(indexOfSiviso + 1);
		}
	}
	
	@Override
	public void addOnSelect(OnSelect onSelect)
	{
		onSelects.add(onSelect);
	}
}
