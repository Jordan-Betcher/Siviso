package com.jordan.betcher.siviso.siviso.list;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.jordan.betcher.siviso.siviso.database.Ringmode;
import com.jordan.betcher.siviso.siviso.database.Ringmodes;


public class ArrayAdapter_Sivisos extends ArrayAdapter<Ringmode>
{
	public ArrayAdapter_Sivisos(@NonNull Context context, Ringmodes ringmodes)
	{
		super(context, android.R.layout.simple_spinner_item, ringmodes.list());
	}
}
