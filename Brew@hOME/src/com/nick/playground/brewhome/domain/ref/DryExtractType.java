package com.nick.playground.brewhome.domain.ref;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public enum DryExtractType implements Addition{
	AMBER_EXT("Amber Dry Extract","United States",13, new BigDecimal(1.044)),
	DD_EXT("Dark Dry Extract","United States",18, new BigDecimal(1.044)),
	EL_EXT("Extra Light Dry Extract","United States",3, new BigDecimal(1.044)),
	L_EXT("Light Dry Extract","United States",8, new BigDecimal(1.044)),
	WHT_EXT("Wheat Dry Extract","Untied States",8, new BigDecimal(1.044));
	private static final String TABLE_NAME = "DryExt_Ref";
	private static final String COLUMN_NAME_ORIGIN = "dryExt_origin";
	private static final String COLUMN_NAME_NAME = "dryExt_name";
	private static final String COLUMN_NAME_SRM = "dryExt_srm";
	private static final String COLUMN_NAME_POTENTIAL_SG = "dryExt_psg";

	private BigDecimal potentialSG;
	private String name;
	private String origin;
	private int srmColor;
	private DryExtractType(String name, String origin, int srmColor,BigDecimal potentialSG) {
		this.setPotentialSG(potentialSG);
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
		return Arrays.asList(DryExtractType.values());
	}
	@Override
	public String getColumnNameName() {
		return COLUMN_NAME_NAME;
	}
}
