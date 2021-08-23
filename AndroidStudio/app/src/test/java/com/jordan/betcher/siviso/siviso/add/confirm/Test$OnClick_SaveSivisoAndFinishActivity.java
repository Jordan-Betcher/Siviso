package com.jordan.betcher.siviso.siviso.add.confirm;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.app.Activity;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSiviso;

import org.junit.Test;

public class Test$OnClick_SaveSivisoAndFinishActivity
{
	@Test
	public void _activity_0finishActivity()
	{
		Database database = mock(Database.class);
		PossibleSiviso possibleSiviso = mock(PossibleSiviso.class);
		Activity activity = mock(Activity.class);
		
		OnClick_SaveSivisoAndFinishActivity saveSivisoData = new OnClick_SaveSivisoAndFinishActivity(activity, database,
		                                                                                             possibleSiviso);
		
		verify(activity, times(0)).finish();
	}
	
	@Test
	public void onClick_activity_finishActivity()
	{
		Database database = mock(Database.class);
		PossibleSiviso possibleSiviso = mock(PossibleSiviso.class);
		Activity activity = mock(Activity.class);
		
		OnClick_SaveSivisoAndFinishActivity saveSivisoData = new OnClick_SaveSivisoAndFinishActivity(activity, database,
		                                                                                             possibleSiviso);
		saveSivisoData.onClick(null);
		
		verify(activity, times(1)).finish();
	}
	
	@Test
	public void __0databaseSaveNewSivisoData()
	{
		Activity activity = mock(Activity.class);
		Database database = mock(Database.class);
		PossibleSiviso possibleSiviso = mock(PossibleSiviso.class);
		
		OnClick_SaveSivisoAndFinishActivity saveSivisoData = new OnClick_SaveSivisoAndFinishActivity(
		activity, database, possibleSiviso);
		
		verify(database, times(0)).saveNewSiviso(possibleSiviso);
	}
	
	@Test
	public void onClick__databaseSaveNewSivisoData()
	{
		Activity activity = mock(Activity.class);
		Database database = mock(Database.class);
		PossibleSiviso possibleSiviso = mock(PossibleSiviso.class);
		
		OnClick_SaveSivisoAndFinishActivity saveSivisoData = new OnClick_SaveSivisoAndFinishActivity(
		activity, database, possibleSiviso);
		saveSivisoData.onClick(null);
		
		verify(database, times(1)).saveNewSiviso(possibleSiviso);
	}
}