package com.jordan.betcher.siviso.siviso.database;

public interface Database
{
	Siviso[] sivisos();
	
	void setIsOn(int sivisoIndex, boolean isOn);
	
	void save(Siviso siviso);
	
	void addOnDataChange(OnDataChange onDataChange);
	
	void delete(int deleteIndex);
}
