package com.jordan.betcher.siviso.siviso.list;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class ArrayAdapter_CharSequence extends ArrayAdapter<CharSequence>
{
	//TODO make it sivisos
	//Change class name to ArrayAdapater_sivisos
	//Make it not accept resource and objects, provide them instead
	public ArrayAdapter_CharSequence(
	@NonNull Context context, int resource, @NonNull CharSequence[] objects)
	{
		super(context, resource, objects);
	}
}
