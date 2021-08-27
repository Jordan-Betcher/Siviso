package com.jordan.betcher.siviso.siviso.database;

import com.google.gson.Gson;

public class Wrapper_Gson
{
	Gson gson = new Gson();
	
	public Siviso[] fromJson(String sivisosString)
	{
		return gson.fromJson(sivisosString, Siviso[].class);
	}
}
