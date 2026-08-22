package net.frozenblock.pushierpistons;

import net.frozenblock.pushierpistons.config.PPConfig;

public final class PushierPistons {
	private PushierPistons() {}

	public static void init() {
		PPConfig.CONFIG.load(true);
	}
}
