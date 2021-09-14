package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

class HighlightView
{
	View previous;
	private int highlightColor;
	
	public HighlightView(int highlightColor)
	{
		this.highlightColor = highlightColor;
	}
	
	public void highlight(View view)
	{
		if(previous != null)
		{
			previous.getBackground().setTintList(null);
		}
		previous = view;
		view.setBackgroundColor(highlightColor);
	}
}
