package com.jordan.betcher.siviso.siviso.add;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jordan.betcher.siviso.siviso.R;

public class A_Activity_Add extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		
		new A_AddMap();
		new A_AddSiviso();
		new A_CancelButton(this);
		new A_ConfirmButton();
	}
}
