package com.jordan.betcher.siviso.siviso.database;

import java.util.ArrayList;

public interface Database
{
	ArrayList<SivisoData> sivisoDatas();
	
	Siviso defaultSiviso();
	
	void setDefaultSiviso(Siviso sivisoFromPosition);
}
