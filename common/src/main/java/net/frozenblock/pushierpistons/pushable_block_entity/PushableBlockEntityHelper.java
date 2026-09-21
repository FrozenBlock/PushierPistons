/*
 * Copyright 2025-2026 FrozenBlock
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

package net.frozenblock.pushierpistons.pushable_block_entity;

import net.frozenblock.lib.block.api.piston.PistonEvents;
import net.frozenblock.pushierpistons.config.PPConfig;
import net.frozenblock.pushierpistons.tag.PPBlockTags;
import net.minecraft.world.level.block.state.BlockState;

public final class PushableBlockEntityHelper {

	public static PistonEvents.PushResult determinePushResult(BlockState state) {
		if (!state.hasBlockEntity()) return PistonEvents.PushResult.PASS;
		if (state.is(PPBlockTags.EXCLUDED_BLOCK_ENTITIES)) return PistonEvents.PushResult.FAIL;

		// STORAGE
		if (PPConfig.PUSHABLE_CHESTS.get() && state.is(PPBlockTags.PUSHABLE_CHESTS)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_BARRELS.get() && state.is(PPBlockTags.PUSHABLE_BARRELS)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_CHISELED_BOOKSHELVES.get() && state.is(PPBlockTags.PUSHABLE_CHISELED_BOOKSHELVES)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_LECTERNS.get() && state.is(PPBlockTags.PUSHABLE_LECTERNS)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_SHELVES.get() && state.is(PPBlockTags.PUSHABLE_SHELVES)) return PistonEvents.PushResult.SUCCESS;

		// UTILITY
		if (PPConfig.PUSHABLE_FURNACES.get() && state.is(PPBlockTags.PUSHABLE_FURNACES)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_BREWING_STANDS.get() && state.is(PPBlockTags.PUSHABLE_BREWING_STANDS)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_ENCHANTING_TABLES.get() && state.is(PPBlockTags.PUSHABLE_ENCHANTING_TABLES)) return PistonEvents.PushResult.SUCCESS;

		// REDSTONE
		if (PPConfig.PUSHABLE_ITEM_TRANSPORTERS.get() && state.is(PPBlockTags.PUSHABLE_ITEM_TRANSPORTERS)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_EJECTORS.get() && state.is(PPBlockTags.PUSHABLE_EJECTORS)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_CRAFTERS.get() && state.is(PPBlockTags.PUSHABLE_CRAFTERS)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_DAYLIGHT_DETECTORS.get() && state.is(PPBlockTags.PUSHABLE_DAYLIGHT_DETECTORS)) return PistonEvents.PushResult.SUCCESS;

		// COMBAT
		if (PPConfig.PUSHABLE_CREAKING_HEARTS.get() && state.is(PPBlockTags.PUSHABLE_CREAKING_HEARTS)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_SPAWNERS.get() && state.is(PPBlockTags.PUSHABLE_SPAWNERS)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_TRIAL_SPAWNERS.get() && state.is(PPBlockTags.PUSHABLE_TRIAL_SPAWNERS)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_VAULTS.get() && state.is(PPBlockTags.PUSHABLE_VAULTS)) return PistonEvents.PushResult.SUCCESS;

		// BUFFS
		if (PPConfig.PUSHABLE_BEACONS.get() && state.is(PPBlockTags.PUSHABLE_BEACONS)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_CONDUITS.get() && state.is(PPBlockTags.PUSHABLE_CONDUITS)) return PistonEvents.PushResult.SUCCESS;

		// OTHER
		if (PPConfig.PUSHABLE_BEEHIVES.get() && state.is(PPBlockTags.PUSHABLE_BEEHIVES)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_CAMPFIRES.get() && state.is(PPBlockTags.PUSHABLE_CAMPFIRES)) return PistonEvents.PushResult.SUCCESS;
		if (PPConfig.PUSHABLE_SIGNS.get() && state.is(PPBlockTags.PUSHABLE_SIGNS)) return PistonEvents.PushResult.SUCCESS;

		// WILDER WILD
		if (PPConfig.PUSHABLE_GEYSERS.get() && state.is(PPBlockTags.PUSHABLE_GEYSERS)) return PistonEvents.PushResult.SUCCESS;

		// TRAILIER TALES
		if (PPConfig.PUSHABLE_SURVEYORS.get() && state.is(PPBlockTags.PUSHABLE_SURVEYORS)) return PistonEvents.PushResult.SUCCESS;

		// NETHERIER NETHER
		if (PPConfig.PUSHABLE_NETHER_REACTOR_CORES.get() && state.is(PPBlockTags.PUSHABLE_NETHER_REACTOR_CORES)) return PistonEvents.PushResult.SUCCESS;

		return PistonEvents.PushResult.PASS;
	}

	private PushableBlockEntityHelper() {}
}
