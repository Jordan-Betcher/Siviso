package com.jordan.betcher.siviso.siviso.add.cancel;

import android.widget.Button;

import com.jordan.betcher.siviso.siviso.R;
import com.jordan.betcher.siviso.siviso.add.A_Activity_Add;

public class A_CancelButton
{
	public A_CancelButton(A_Activity_Add activity)
	{
		Button button = activity.findViewById(R.id.buttonCancel);
		OnClickListener_StopActivity stopActivity = new OnClickListener_StopActivity(activity);
		new CancelButton(button, stopActivity);
	}
}
