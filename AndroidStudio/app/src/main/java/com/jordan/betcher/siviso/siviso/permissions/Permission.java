package com.jordan.betcher.siviso.siviso.permissions;

public interface Permission
{
	void request();
	
	void addOnGranted(AtPermissionGranted atPermissionGranted);
	
	boolean isGranted();
	
	void grant();
}
