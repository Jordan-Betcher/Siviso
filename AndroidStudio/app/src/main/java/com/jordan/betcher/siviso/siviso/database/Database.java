package com.jordan.betcher.siviso.siviso.database;

public interface Database
{
	Ringmode defaultRingmode();
	
	void setDefaultRingmode(Ringmode ringmode);
	
	Siviso[] sivisos();
	
	void setRingmode(int sivisoIndex, Ringmode ringmode);
	
	void save(Siviso siviso);
	
	void addOnDataChange(OnDataChange onDataChange);
	
	void delete(int deleteIndex);
}
