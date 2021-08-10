package com.jordan.betcher.siviso.siviso.database;

import java.util.ArrayList;

public interface Database
{
	Siviso defaultSiviso();
	
	void setDefaultSiviso(Siviso sivisoFromPosition);
	
	int count();
	
	ArrayList<SivisoData> sivisos();
}
