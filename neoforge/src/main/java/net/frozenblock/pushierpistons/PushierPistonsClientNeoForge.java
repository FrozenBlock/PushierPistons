package net.frozenblock.pushierpistons;

import net.frozenblock.pushierpistons.config.gui.PPConfigGui;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = PPConstants.MOD_ID, dist = Dist.CLIENT)
public class PushierPistonsClientNeoForge {

	public PushierPistonsClientNeoForge(IEventBus modBus) {
		PushierPistonsClient.init();

		ModLoadingContext.get().registerExtensionPoint(
			IConfigScreenFactory.class,
			() -> (container, parent) ->
				PPConfigGui.buildScreen(parent)
		);
	}
}
