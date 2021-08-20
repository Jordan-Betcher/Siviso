package com.jordan.betcher.siviso.siviso.add.confirm;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import android.app.Activity;

import com.jordan.betcher.siviso.siviso.database.Database;
import com.jordan.betcher.siviso.siviso.database.PossibleSivisoData;

import org.junit.Test;

public class Test$OnClick_SaveSivisoDataAndFinishActivity
{
	@Test
	public void _activity_0finishActivity()
	{
		Database database = mock(Database.class);
		PossibleSivisoData possibleSivisoData = mock(PossibleSivisoData.class);
		Activity activity = mock(Activity.class);
		
		OnClick_SaveSivisoDataAndFinishActivity saveSivisoData = new OnClick_SaveSivisoDataAndFinishActivity(activity, database, possibleSivisoData);
		
		verify(activity, times(0)).finish();
	}
	
	@Test
	public void onClick_activity_finishActivity()
	{
		Database database = mock(Database.class);
		PossibleSivisoData possibleSivisoData = mock(PossibleSivisoData.class);
		Activity activity = mock(Activity.class);
		
		OnClick_SaveSivisoDataAndFinishActivity saveSivisoData = new OnClick_SaveSivisoDataAndFinishActivity(activity, database, possibleSivisoData);
		saveSivisoData.onClick(null);
		
		verify(activity, times(1)).finish();
	}
	
	@Test
	public void __0databaseSaveNewSivisoData()
	{
		Activity activity = mock(Activity.class);
		Database database = mock(Database.class);
		PossibleSivisoData possibleSivisoData = mock(PossibleSivisoData.class);
		
		OnClick_SaveSivisoDataAndFinishActivity saveSivisoData = new OnClick_SaveSivisoDataAndFinishActivity(
		activity, database, possibleSivisoData);
		
		verify(database, times(0)).saveNewSiviso(possibleSivisoData);
	}
	
	@Test
	public void onClick__databaseSaveNewSivisoData()
	{
		Activity activity = mock(Activity.class);
		Database database = mock(Database.class);
		PossibleSivisoData possibleSivisoData = mock(PossibleSivisoData.class);
		
		OnClick_SaveSivisoDataAndFinishActivity saveSivisoData = new OnClick_SaveSivisoDataAndFinishActivity(
		activity, database, possibleSivisoData);
		saveSivisoData.onClick(null);
		
		verify(database, times(1)).saveNewSiviso(possibleSivisoData);
	}
}