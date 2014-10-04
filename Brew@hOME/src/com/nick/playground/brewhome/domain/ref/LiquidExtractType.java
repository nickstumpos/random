package com.nick.playground.brewhome.domain.ref;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public enum LiquidExtractType implements Addition{
	AMBER_L_EXT("Amber Liquid Extract","United States",13, new BigDecimal(1.036)),
	DL_EXT("Dark Liquid Extract","United States",18, new BigDecimal(1.036)),
	PL_EXT("Pale Liquid Extract","United States",8, new BigDecimal(1.036)),
	PILS_L_EXT("Pilsner Liquid Extract","United States",4, new BigDecimal(1.036)),
	RICE_EXT("Rice Extract","United States",7, new BigDecimal(1.032)),
	WHT_L_EXT("Wheat Liquid Extract","Untied States",8, new BigDecimal(1.036));
	private String name;
	private String origin;
	private int srmColor;
	private BigDecimal potentialSG;
	private final String TABLE_NAME = "Liq_ext_Ref";
	private final String COLUMN_NAME_ORIGIN = "Liq_ext_origin";
	private final String COLUMN_NAME_NAME = "Liq_ext_name";
	private final String COLUMN_NAME_SRM = "Liq_ext_srm";
	private final String COLUMN_NAME_POTENTIAL_SG = "Liq_ext_psg";
	private LiquidExtractType(String name, String origin, int srmColor,BigDecimal potentialSG) {
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
	public BigDecimal getPotentialSG() {
		return potentialSG;
	}
	public void setPotentialSG(BigDecimal potentialSG) {
		this.potentialSG = potentialSG;
	}
	@Override
	public List<? extends Addition> getValues() {
		return Arrays.asList(LiquidExtractType.values());
	}
	@Override
	public String getColumnNameName() {
		return COLUMN_NAME_NAME;
	}
}
