package com.jordan.betcher.siviso.siviso.list;

import android.graphics.drawable.ColorDrawable;
import android.view.View;

class HighlightView
{
	public int previousColor;
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
			previous.setBackgroundColor(previousColor);
		}
		previous = view;
		previousColor = ((ColorDrawable) view.getBackground()).getColor();
		view.setBackgroundColor(highlightColor);
	}
}
