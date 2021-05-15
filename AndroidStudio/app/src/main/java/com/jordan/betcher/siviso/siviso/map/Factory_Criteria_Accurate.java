package com.jordan.betcher.siviso.siviso.map;

import android.location.Criteria;

class Factory_Criteria_Accurate
{
	public Criteria build()
	{
		Criteria criteria = new Criteria();
		criteria.setAccuracy(Criteria.ACCURACY_FINE);
		return criteria;
	}
}
