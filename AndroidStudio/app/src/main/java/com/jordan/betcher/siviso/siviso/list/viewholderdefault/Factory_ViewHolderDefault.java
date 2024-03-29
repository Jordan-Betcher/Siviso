package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_Sivisos;
import com.jordan.betcher.siviso.siviso.list.RingmodeConverter;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

public class Factory_ViewHolderDefault
{
	private LayoutInflater layoutInflater;
	private OnClickListener_GoToCurrentLocation clickListener;
	private Database database;
	private ArrayAdapter_Sivisos adapter;
	
	public Factory_ViewHolderDefault(
	LayoutInflater layoutInflater, ArrayAdapter_Sivisos adapter,
	SivisoMap sivisoMap, Database database)
	{
		this.layoutInflater = layoutInflater;
		this.adapter = adapter;
		this.clickListener = new OnClickListener_GoToCurrentLocation(sivisoMap);
		this.database = database;
	}
	
	public ViewHolder_Abstract create(ViewGroup parent)
	{
		View view = layoutInflater.inflate(R.layout.item_siviso, parent, false);
		TextView textView = view.findViewById(R.id.textViewName);
		Spinner spinner = view.findViewById(R.id.spinner);
		CardView background = view.findViewById(R.id.cardViewHome);
		String name = view.getResources().getString(R.string.siviso_list_name_default);
		RingmodeConverter ringmodeConverter = new RingmodeConverter();
		OnItemSelectedListener_SetDefaultSiviso onItemClickListener = new OnItemSelectedListener_SetDefaultSiviso(database,
		                                                                                                          ringmodeConverter);
		return new ViewHolder_Default(view, textView, name, spinner, adapter, onItemClickListener, background, clickListener);
	}
}
