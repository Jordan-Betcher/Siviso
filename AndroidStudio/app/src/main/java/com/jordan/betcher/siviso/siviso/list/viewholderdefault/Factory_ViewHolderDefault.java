package com.jordan.betcher.siviso.siviso.list.viewholderdefault;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.list.ArrayAdapter_CharSequence;
import com.jordan.betcher.siviso.siviso.list.ViewHolder_Abstract;
import com.jordan.betcher.siviso.siviso.map.SivisoMap;

public class Factory_ViewHolderDefault
{
	private LayoutInflater layoutInflater;
	private OnClickListener_GoToCurrentLocation clickListener;
	private Database database;
	private ArrayAdapter_CharSequence adapter;
	
	public Factory_ViewHolderDefault(
	LayoutInflater layoutInflater, ArrayAdapter_CharSequence adapter,
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
		Spinner spinner = view.findViewById(R.id.spinnerHome);
		CardView background = view.findViewById(R.id.cardViewHome);
		String name = view.getResources().getString(R.string.siviso_list_name_default);
		Factory_OnItemClickListenerSetDefaultSiviso onItemClickListener = new Factory_OnItemClickListenerSetDefaultSiviso(database);
		return new ViewHolder_Default(view, textView, name, spinner, adapter, onItemClickListener, background, clickListener);
	}
}
