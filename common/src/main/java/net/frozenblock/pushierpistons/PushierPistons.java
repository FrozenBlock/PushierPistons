package net.frozenblock.pushierpistons;

import net.frozenblock.lib.block.api.piston.PistonEvents;
import net.frozenblock.pushierpistons.chainstone.ChainstoneHelper;
import net.frozenblock.pushierpistons.config.PPConfig;
import net.frozenblock.pushierpistons.pushable_block_entity.PushableBlockEntityHelper;

public final class PushierPistons {

	public static void init() {
		PistonEvents.DETERMINE_BLOCK_ENTITY_PUSH_RESULT.register(((state, direction) -> {
			return PushableBlockEntityHelper.determinePushResult(state);
		}));

		PistonEvents.DETERMINE_BLOCK_STICKINESS.register(((state, direction) -> {
			if (ChainstoneHelper.isChainstoneBlock(state)) return PistonEvents.StickyResult.SUCCESS;
			return PistonEvents.StickyResult.PASS;
		}));

		PistonEvents.TRY_STICK_BLOCKS_TOGETHER.register(((previousState, nextState, direction) -> {
			if (ChainstoneHelper.verifyCombination(previousState, nextState, direction.getAxis())) return PistonEvents.StickTogetherResult.SUCCESS;
			return PistonEvents.StickTogetherResult.PASS;
		}));

		PPConfig.CONFIG.load(true);
	}

	private PushierPistons() {}
}
