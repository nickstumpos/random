package com.nick.playground.brewhome.domain.ref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum AdditionType {
	SUGAR(SugarType.values()),
	GRAIN(GrainType.values()),
	FINING(FiningType.values()),
	ADJUNCT(AdjunctType.values()),
	DRY_EXTRACT(DryExtractType.values()),
	LIQUID_EXTRACT(LiquidExtractType.values());
	private final List<Addition> additions = new ArrayList<Addition>();
	public List<Addition> getAdditions() {
		return additions;
	}
	private AdditionType(Addition[] additions) {
		this.additions.addAll(Arrays.asList(additions));
	}
	
}
