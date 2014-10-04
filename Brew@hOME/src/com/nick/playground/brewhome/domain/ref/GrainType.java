package com.nick.playground.brewhome.domain.ref;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public enum GrainType implements Addition{
	ACID_MALT("Acid Malt","Germany",3,new BigDecimal(1.027)),
	AMBER_MALT("Amber Malt","United Kingdom",13,new BigDecimal(1.035)),
	ARO_MALT("Aromatic Malt","Belgium",26,new BigDecimal(1.036)),
	FLK_BARLEY("Flaked Barley","Untied States",2,new BigDecimal(1.032)),
	RAW_BARLEY("Raw Barley","Untied States",2,new BigDecimal(1.028)),
	TOR_BARLEY("Torrefied Barley","Untied States",2,new BigDecimal(1.036)),
	BSQT_MALT("Bisquit Malt","Belgium",23,new BigDecimal(1.036)),
	BP_MALT("Black (Patent) Malt","Untied States",500,new BigDecimal(1.025)),
	BLK_BARLEY("Black Barley (Stout)","Untied States",500,new BigDecimal(1.025)),
	BWN_MALT("Brown Malt","United Kingdom",65,new BigDecimal(1.032)),
	BRUMALT("Brumalt","Germany",23,new BigDecimal(1.033)),
	CARA_PILS("Cara-Pils","Untied States",2,new BigDecimal(1.033)),
	DEX("Dextrine","Untied States",2,new BigDecimal(1.033)),
	CARA_AMBER("Caraamber","United States",30,new BigDecimal(1.035)),
	CARA_FOAM("Cara Foam","United States",2,new BigDecimal(1.035)),
	CML_MALT_10("Caramel Malt 10L","United States",10,new BigDecimal(1.035)),
	CML_MALT_20("Caramel Malt 20L","United States",20,new BigDecimal(1.035)),
	CML_MALT_30("Caramel Malt 30L","United States",30,new BigDecimal(1.035)),
	CML_MALT_40("Caramel Malt 40L","United States",40,new BigDecimal(1.034)),
	CML_MALT_60("Caramel Malt 60L","United States",60,new BigDecimal(1.034)),
	CML_MALT_80("Caramel Malt 80L","United States",80,new BigDecimal(1.034)),
	CML_MALT_120("Caramel Malt 120L","United States",120,new BigDecimal(1.033)),
	CRL_MALT_10("Crystal Malt 10L","United States",10,new BigDecimal(1.035)),
	CRL_MALT_20("Crystal Malt 20L","United States",20,new BigDecimal(1.035)),
	CRL_MALT_30("Crystal Malt 30L","United States",30,new BigDecimal(1.035)),
	CRL_MALT_40("Crystal Malt 40L","United States",40,new BigDecimal(1.034)),
	CRL_MALT_60("Crystal Malt 60L","United States",60,new BigDecimal(1.034)),
	CRL_MALT_80("Crystal Malt 80L","United States",80,new BigDecimal(1.034)),
	CRL_MALT_120("Crystal Malt 120L","United States",120,new BigDecimal(1.033)),
	CARAM_MALT("Caramunich Malt","Belgium",56,new BigDecimal(1.033)),
	CARARED("Carared","United States",20,new BigDecimal(1.035)),
	CARV_MALT("Caravienne Malt","Belgium",22,new BigDecimal(1.034)),
	CHK_MALT("Chocolate Malt","United States",350,new BigDecimal(1.028)),
	CHK2_MALT("Chocolate Malt","United Kingdom",450,new BigDecimal(1.034)),
	FLK_CRN("Flaked Corn","United States",1,new BigDecimal(1.037)),
	MEL_MALT("Melanoiden Malt","Germany",20,new BigDecimal(1.037)),
	MILD_MALT("Mild Malt","United Kingdom",4,new BigDecimal(1.037)),
	MUNIC_MALT("Munich Malt","Germany",9,new BigDecimal(1.037)),
	MUNIC10_MALT("Munich Malt 10L","United States",10,new BigDecimal(1.035)),
	MUNIC20_MALT("Munich Malt 20L","United States",2,new BigDecimal(1.035)),
	FLK_OAT("Flaked Oats","United States",1,new BigDecimal(1.037)),
	MALT_OATS("Malted Oats","United States",1,new BigDecimal(1.037)),
	TWO_ROW_BEL_MALT("2 Row Pale Malt","Belgium",3,new BigDecimal(1.037)),
	TWO_ROW_UK_MALT("2 Row Pale Malt","United Kingdom",3,new BigDecimal(1.036)),
	TWO_ROW_US_MALT("2 Row Pale Malt","United States",2,new BigDecimal(1.036)),
	SIX_ROW_BEL_MALT("6 Row Pale Malt","United States",3,new BigDecimal(1.035)),
	PEAT_MALT("Peat Smoked Malt","United Kingdom",3,new BigDecimal(1.034)),
	TWO_ROW_BEL_PIL_MALT("2 Row Pilsner","Belgium",2,new BigDecimal(1.036)),
	TWO_ROW_UK_PIL_MALT("2 Row Pilsner","United Kingdom",1,new BigDecimal(1.037)),
	TWO_ROW_GER_PIL_MALT("2 Row Pilsner","Germany",2,new BigDecimal(1.036)),
	FLK_RICE("Flaked Rice","United States",1,new BigDecimal(1.032)),
	RST_BARLEY("Roasted Barley","United States",300,new BigDecimal(1.025)),
	RYE_MALT("Rye Malt","United States",5,new BigDecimal(1.029)),
	FLK_RYE("Flaked Rye","United States",2,new BigDecimal(1.036)),
	SMK_MALT("Smoked Malt","Germany",9,new BigDecimal(1.037)),
	SP_B_MALT("Special B Malt","Belgium",180,new BigDecimal(1.030)),
	SP_RST("Special Roast","United States",50,new BigDecimal(1.033)),
	TST_MALT("Toasted Malt","United States",27,new BigDecimal(1.034)),
	VNA_MALT("Vienna Malt","Germany",4,new BigDecimal(1.036)),
	WHT_MALT("Wheat Malt","Belgium",2,new BigDecimal(1.037)),
	D_WHT_MALT("Dark Wheat Malt","Germany",9,new BigDecimal(1.039)),
	WHT_GER_MALT("Wheat Malt","Germany",2,new BigDecimal(1.039)),
	FLK_WHT_MALT("Flaked Wheat Malt","United States",2,new BigDecimal(1.035)),
	RST_WHT_MALT("Roasted Wheat Malt","Germany",425,new BigDecimal(1.025)),
	TOR_WHT_MALT("Torrified Wheat Malt","United States",2,new BigDecimal(1.036)),
	W_WHT_MALT("White Wheat Malt","United States",2,new BigDecimal(1.040)),
	VIC_MALT("Victory Malt","United States",25,new BigDecimal(1.034));
	private String name;
	private String origin;
	private int srmColor;
	private BigDecimal potentialSG;
	private final String TABLE_NAME = "Grain_Ref";
	private final String COLUMN_NAME_ORIGIN = "grain_origin";
	private final String COLUMN_NAME_NAME = "grain_name";
	private final String COLUMN_NAME_SRM = "grain_srm";
	private final String COLUMN_NAME_POTENTIAL_SG = "grain_psg";
	private GrainType(String name, String origin, int srmColor,BigDecimal potentialSG) {
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
		return Arrays.asList(GrainType.values());
	}
	@Override
	public String getColumnNameName() {
		return COLUMN_NAME_NAME;
	}

}
