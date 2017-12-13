package com.springinaction.knights;

import com.springinaction.quest.RescueDamselQuest;

public class DamselRescuingKnight implements Knight {
	private RescueDamselQuest quest;
	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}

	@Override
	public void embarkOnQuest() {
		quest.embark();
	}

}
