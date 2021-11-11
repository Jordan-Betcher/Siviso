package com.jordan.betcher.siviso.siviso.list.viewholdersivisoitem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.list.HighlightView;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

public class Factory_ViewHolderSiviso
{
	private final LayoutInflater layoutInflater;
	private final Factory_OnClickListenerGoToSivisoLocation factoryOnClickBackground;
	
	public Factory_ViewHolderSiviso(
	LayoutInflater layoutInflater, SivisoMap sivisoMap,
	HighlightView highlightView)
	{
		this.layoutInflater = layoutInflater;
		this.factoryOnClickBackground = new Factory_OnClickListenerGoToSivisoLocation(sivisoMap,
		                                                                              highlightView);
	}
	
	public ViewHolder_Abstract create(ViewGroup parent)
	{
		View view = layoutInflater.inflate(R.layout.item_siviso, parent, false);
		//TODO swap spinner for switch
		Spinner spinner = view.findViewById(R.id.spinner);
		TextView textView = view.findViewById(R.id.textViewName);
		CardView background = view.findViewById(R.id.cardViewHome);
		String name = "";
		return new ViewHolder_SivisoItem(view, textView, name, spinner, background,
		                                 factoryOnClickBackground);
	}
}
