package com.jordan.betcher.siviso.siviso.list;

import com.jordan.betcher.siviso.siviso.database.OnDataChange;

class A_OnDataChange_NotifyAdapter
implements OnDataChange
{
	private Adapter_SivisoListView adapter;
	
	public A_OnDataChange_NotifyAdapter(Adapter_SivisoListView adapter)
	{
		this.adapter = adapter;
	}
	
	@Override
	public void dataChanged()
	{
		adapter.notifyDataSetChanged();
	}
}
