package com.jordan.betcher.siviso.siviso.permissions;

public interface Permission
{
	void request();
	
	void addOnGranted(OnGranted onGranted);
	
	boolean isGranted();
}
