/*
 * Copyright 2026 FrozenBlock
 * This file is part of Pushier Pistons.
 *
 * This program is free software; you can modify it under
 * the terms of version 1 of the FrozenBlock Modding Oasis License
 * as published by FrozenBlock Modding Oasis.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * FrozenBlock Modding Oasis License for more details.
 *
 * You should have received a copy of the FrozenBlock Modding Oasis License
 * along with this program; if not, see <https://github.com/FrozenBlock/Licenses>.
 */

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
