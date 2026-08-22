package net.frozenblock.pushierpistons;

import net.frozenblock.lib.menu.api.SplashTextEvents;
import net.mehvahdjukaar.candlelight.api.ClientOnly;

@ClientOnly
public final class PushierPistonsClient {
	private PushierPistonsClient() {}

	public static void init() {
		SplashTextEvents.ADD_SOURCE_FILES.register(sourceFiles -> sourceFiles.add(PPConstants.id("texts/splashes.txt")));
	}
}
