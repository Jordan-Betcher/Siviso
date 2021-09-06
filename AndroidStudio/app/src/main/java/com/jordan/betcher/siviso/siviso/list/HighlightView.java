package com.jordan.betcher.siviso.siviso.list;

import android.view.View;

class HighlightView
{
	public int previousColor = 1;
	View previous;
	private int highlightColor;
	
	public HighlightView(int highlightColor)
	{
		this.highlightColor = highlightColor;
	}
	
	public void highlight(View view)
	{
		view.setBackgroundColor(highlightColor);
		previous = view;
	}
}
