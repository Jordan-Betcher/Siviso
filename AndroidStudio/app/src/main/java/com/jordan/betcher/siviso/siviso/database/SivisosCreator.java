package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public class SivisosCreator
{
	private final Factory_SivisoFromString sivisoFromString;
	private final Ringmodes ringmodes;
	Siviso[] previousSivisos;
	String previousSivisosString;
	
	public SivisosCreator(Factory_SivisoFromString sivisoFromString, Ringmodes ringmodes)
	{
		this.sivisoFromString = sivisoFromString;
		this.ringmodes = ringmodes;
	}
	
	//TODO make error proof, check the number of boxes, handle wrong ints and wrong doubles
	//TODO make it so that if the same string is passed in, the same return is passed out
	public Siviso[] from(String sivisosString)
	{
		if(previousSivisos != null && previousSivisosString == sivisosString)
		{
			return previousSivisos;
		}
		
		String[] sivisosStrings = sivisosString.replaceAll("[{]","").split("[}]");
		Siviso[] sivisos = new Siviso[sivisosStrings.length];
		for(int i = 0; i < sivisosStrings.length; i++)
		{
			String sivisoString = sivisosStrings[i];
			String[] vars = sivisoString.replaceAll("\\[", "").split("\\]");
			String[] latLngString = vars[1].split(",");
			int ringmodeInt = Integer.parseInt(vars[3]);
			String name = vars[0];
			double latitude = Double.parseDouble(latLngString[0]);
			double longitude = Double.parseDouble(latLngString[1]);
			int radius = Integer.parseInt(vars[2]);
			Ringmode ringmode = ringmodes.from(ringmodeInt);
			
			Siviso siviso = sivisoFromString.siviso(name, new LatLng(latitude, longitude), radius, ringmode);
			sivisos[i] = siviso;
		}
		
		return sivisos;
	}
}
