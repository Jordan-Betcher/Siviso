package com.jordan.betcher.siviso.siviso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jordan.betcher.siviso.siviso.map.A_Map;

public class A_Activity extends AppCompatActivity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		A_Map map = new A_Map(this);
	}
}