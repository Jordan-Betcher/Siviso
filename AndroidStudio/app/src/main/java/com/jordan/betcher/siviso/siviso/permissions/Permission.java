package com.jordan.betcher.siviso.siviso.permissions;

public interface Permission
{
	boolean isGranted();
	
	void request();
	
	void addOnGranted(OnGranted unlock);
}
