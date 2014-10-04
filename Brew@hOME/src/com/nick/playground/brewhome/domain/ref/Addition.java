package com.nick.playground.brewhome.domain.ref;

import java.math.BigDecimal;
import java.util.List;

import android.provider.BaseColumns;

public interface Addition extends BaseColumns{
	public String getName();
	public String getOrigin();
	public int getSrmColor();
	public BigDecimal getPotentialSG();
	public  String getColumnNameSrm();
	public  String getColumnNameOrigin();
	public  String getColumnNameName();
	public  String getTableName();
	public  String getColumnNamePotentialSg();
	public  List<? extends Addition> getValues();
}
