package com.nick.playground.brewhome.domain.ref;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public enum SugarType implements Addition{
	D_BRN_SGR("Dark Brown Sugar","United States",50,new BigDecimal(1.046)),
	L_BRN_SGR("Light Brown Sugar","United States",8,new BigDecimal(1.046)),
	AM_CND_SGR("Amber Candi Sugar","Belgium",75,new BigDecimal(1.036)),
	CL_CND_SGR("Clear Candi Sugar","Belgium",1,new BigDecimal(1.036)),
	D_CND_SGR("Dark Candi Sugar","Belgium",275,new BigDecimal(1.036)),
	CANE_SGR("Cane Sugar","United States",0,new BigDecimal(1.046)),
	BEET_SGR("Beet Sugar","United States",0,new BigDecimal(1.046)),
	CRN_SGR("Corn Sugar","United States",0,new BigDecimal(1.046)),
	DEXTROSE("Dextrose","United States",0,new BigDecimal(1.046)),
	CORN_SRP("Corn Syrup","United States",1,new BigDecimal(1.036)),
	D_SGR("Dememera Sugar","United Kingdom",2,new BigDecimal(1.046)),
	HNY("Honey","United States",1,new BigDecimal(1.035)),
	I_SGR("Invert Sugar","United Kingdom",0,new BigDecimal(1.046)),
	MPL_SRP("Maple Syrup","United States",35,new BigDecimal(1.030)),
	MPL_SRP2("Maple Syrup","Canada",35,new BigDecimal(1.030)),
	MLK_SGR("Milk Sugar","United States",0,new BigDecimal(1.035)),
	LAC("Lactose","United States",0,new BigDecimal(1.035)),
	MOL("Molasses","United States",80,new BigDecimal(1.036)),
	TBL_SGR("Table Sugar","United States",1,new BigDecimal(1.046)),
	SUC("Sucrose","United States",1,new BigDecimal(1.046)),
	TUR("Turbinado","United Kingdom",10,new BigDecimal(1.044));
	private final String TABLE_NAME = "Sugar_Ref";
	private final String COLUMN_NAME_ORIGIN = "Sugar_origin";
	private final String COLUMN_NAME_NAME = "Sugar_name";
	private final String COLUMN_NAME_SRM = "Sugar_srm";
	private final String COLUMN_NAME_POTENTIAL_SG = "Sugar_psg";
	private BigDecimal potentialSG;
	private String name;
	private String origin;
	private int srmColor;
	private SugarType(String name, String origin, int srmColor,BigDecimal potentialSG) {
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
		return Arrays.asList(SugarType.values());
	}
	@Override
	public String getColumnNameName() {
		return COLUMN_NAME_NAME;
	}
}
