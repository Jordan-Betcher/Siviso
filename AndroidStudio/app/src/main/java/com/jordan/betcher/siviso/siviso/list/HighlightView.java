package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

class HighlightView
{
	private int highlightColor;
	
	public HighlightView(int highlightColor)
	{
		
		this.highlightColor = highlightColor;
	}
	
	public void highlight(View view)
	{
		view.setBackgroundColor(highlightColor);
	}
}
