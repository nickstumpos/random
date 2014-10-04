package com.nick.playground.brewhome.domain.ref;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public enum AdjunctType implements Addition {
	B_HULLS("Barley Hulls", "United States", 0, BigDecimal.ONE), R_HULLS(
			"Rice Hulls", "United States", 0, BigDecimal.ONE), GRITS("Grits",
			"United States", 51, new BigDecimal(1.037));
	private static final String TABLE_NAME = "Grain_Ref";
	private static final String COLUMN_NAME_NAME = "grain_name";
	private static final String COLUMN_NAME_ORIGIN = "grain_origin";
	private static final String COLUMN_NAME_SRM = "grain_srm";
	private static final String COLUMN_NAME_POTENTIAL_SG = "grain_psg";

	public String getColumnNameSrm() {
		return COLUMN_NAME_SRM;
	}

	public String getColumnNameOrigin() {
		return COLUMN_NAME_ORIGIN;
	}

	public String getTableName() {
		return TABLE_NAME;
	}

	public String getColumnNamePotentialSg() {
		return COLUMN_NAME_POTENTIAL_SG;
	}

	private String name;
	private String origin;
	private int srmColor;
	private BigDecimal potentialSG;

	private AdjunctType(String name, String origin, int srmColor,
			BigDecimal potentialSG) {
		this.potentialSG = potentialSG;
		this.name = name;
		this.origin = origin;
		this.srmColor = srmColor;
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
		return Arrays.asList(AdjunctType.values());
	}

	@Override
	public String getColumnNameName() {
		return COLUMN_NAME_NAME;
	}
}
