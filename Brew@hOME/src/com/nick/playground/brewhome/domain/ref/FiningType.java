package com.nick.playground.brewhome.domain.ref;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public enum FiningType implements Addition{
	GYP("Gypsum","United States",0,BigDecimal.ONE),
	IRISH_MOSS("Irish Moss","United States",0,BigDecimal.ONE),
	GEL("Gelatin","United States",0,BigDecimal.ONE);
	
	private String name;
	private String origin;
	private int srmColor;
	private BigDecimal potentialSG;
	private static final String TABLE_NAME = "Fining_Ref";
	private static final String COLUMN_NAME_ORIGIN = "fining_origin";
	private static final String COLUMN_NAME_NAME = "fining_name";
	private static final String COLUMN_NAME_SRM = "fining_srm";
	private static final String COLUMN_NAME_POTENTIAL_SG = "fining_psg";	
	private FiningType(String name, String origin, int srmColor,BigDecimal potentialSG) {
		this.potentialSG=potentialSG;
		this.name = name;
		this.origin = origin;
		this.srmColor = srmColor;
	}

	public  String getColumnNameSrm() {
		return COLUMN_NAME_SRM;
	}
	public  String getColumnNameOrigin() {
		return COLUMN_NAME_ORIGIN;
	}
	public  String getTableName() {
		return TABLE_NAME;
	}
	public  String getColumnNamePotentialSg() {
		return COLUMN_NAME_POTENTIAL_SG;
	}
	public BigDecimal getPotentialSG() {
		return potentialSG;
	}
	public void setPotentialSG(BigDecimal potentialSG) {
		this.potentialSG = potentialSG;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getSrmColor() {
		return srmColor;
	}
	public void setSrmColor(int srmColor) {
		this.srmColor = srmColor;
	}
	@Override
	public List<? extends Addition> getValues() {
		return Arrays.asList(FiningType.values());
	}

	@Override
	public String getColumnNameName() {
		return COLUMN_NAME_NAME;
	}
}
