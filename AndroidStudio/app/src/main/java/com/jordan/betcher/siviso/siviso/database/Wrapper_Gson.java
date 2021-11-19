package com.jordan.betcher.siviso.siviso.database;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Wrapper_Gson
{
	Gson gson = new Gson();
	
	public ArrayList<Siviso> fromJson(String sivisosString)
	{
		return gson.fromJson(sivisosString, ArrayList.class);
	}
	
	public String toJsonString(ArrayList<Siviso> sivisos)
	{
		return gson.toJson(sivisos);
	}
}
