package com.jordan.betcher.siviso.siviso.database;

import com.google.android.gms.maps.model.LatLng;

public class Sivisos
{
	private final Factory_SivisoFromString sivisoFromString;
	private final RingmodeConverter ringmodeConverter;
	
	public Sivisos(Factory_SivisoFromString sivisoFromString, RingmodeConverter ringmodeConverter)
	{
		this.sivisoFromString = sivisoFromString;
		this.ringmodeConverter = ringmodeConverter;
	}
	
	//TODO make error proof
	public Siviso[] from(String sivisosString)
	{
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
			Ringmode ringmode = ringmodeConverter.ringmodeFrom(ringmodeInt);
			
			Siviso siviso = sivisoFromString.siviso(name, new LatLng(latitude, longitude), radius, ringmode);
			sivisos[i] = siviso;
		}
		
		return sivisos;
	}
}
