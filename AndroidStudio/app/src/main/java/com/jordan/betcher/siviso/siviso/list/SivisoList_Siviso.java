package com.jordan.betcher.siviso.siviso.list;

public class SivisoList_Siviso implements SivisoList
{
	
	private OnSelect onSelect;
	
	@Override
	public void select(int indexOfSiviso)
	{
		onSelect.onSelect(indexOfSiviso + 1);
	}
	
	@Override
	public void addOnSelect(OnSelect onSelect)
	{
		if(this.onSelect == null) this.onSelect = onSelect;
	}
}
