package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import android.view.View;

public class OnClickListener_Multiple implements View.OnClickListener
{
	private OnRowClick[] onRowClicks;
	
	public OnClickListener_Multiple(OnRowClick... onRowClicks){this.onRowClicks = onRowClicks;}
	
	@Override
	public void onClick(View view)
	{
		//TODO
		onRowClicks[0].call(view);
	}
}
