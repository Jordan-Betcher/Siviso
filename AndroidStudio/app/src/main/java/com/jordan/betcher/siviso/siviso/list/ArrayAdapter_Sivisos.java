package com.jordan.betcher.siviso.siviso.list;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.jordan.betcher.siviso.siviso.R;


public class ArrayAdapter_Sivisos extends ArrayAdapter<CharSequence>
{
	public ArrayAdapter_Sivisos(@NonNull Context context)
	{
		super(context, android.R.layout.simple_spinner_item, getSivisos(context));
	}
	
	private static String[] getSivisos(Context context)
	{
		return context.getResources().getStringArray(R.array.sivisos);
	}
}
