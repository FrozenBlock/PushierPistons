package net.frozenblock.pushierpistons;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(PPConstants.MOD_ID)
public final class PushierPistonsNeoForge {

	public PushierPistonsNeoForge(IEventBus modBus) {
		PushierPistons.init();
	}
}
