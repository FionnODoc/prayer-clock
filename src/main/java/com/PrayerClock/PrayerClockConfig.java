package com.PrayerClock;

import com.google.inject.Provides;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigManager;

@ConfigGroup("PrayerClock")
public interface PrayerClockConfig extends Config {
	@ConfigItem(
			keyName = "Ticks Till Flash",
			name = "Ticks Till Flash",
			description = "The amount of ticks until the counter flashes green",
			position = 1
	)
	default int ticksTillFlash() {
		return 0;
	}


}