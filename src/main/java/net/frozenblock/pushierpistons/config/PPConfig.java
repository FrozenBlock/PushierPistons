/*
 * Copyright 2025 FrozenBlock
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

package net.frozenblock.pushierpistons.config;

import net.frozenblock.lib.config.v2.config.ConfigData;
import net.frozenblock.lib.config.v2.config.ConfigSettings;
import net.frozenblock.lib.config.v2.entry.ConfigEntry;
import net.frozenblock.lib.config.v2.entry.EntryType;
import net.frozenblock.lib.config.v2.registry.ID;
import net.frozenblock.pushierpistons.PPConstants;
import net.frozenblock.pushierpistons.chainstone.ChainstoneType;

public class PPConfig {
	public static final ConfigData<?> CONFIG = ConfigData.createAndRegister(
		ID.of(PPConstants.MOD_ID, "main"),
		ConfigSettings.JSON5_UNQUOTED_KEYS
	);

	// CHAINSTONE
	public static final ConfigEntry<ChainstoneType> CHAINSTONE_TYPE = CONFIG.entry("chainstoneType",
		ChainstoneType.ENTRY_TYPE, ChainstoneType.CHAIN_FACING_INTO
	);

	// STORAGE
	public static final ConfigEntry<Boolean> PUSHABLE_CHESTS = CONFIG.entry("pushableChests", EntryType.BOOL, false);

	public static final ConfigEntry<Boolean> PUSHABLE_BARRELS = CONFIG.entry("pushableBarrels", EntryType.BOOL, false);

	public static final ConfigEntry<Boolean> PUSHABLE_CHISELED_BOOKSHELVES = CONFIG.entry("pushableChiseledBookshelves", EntryType.BOOL, true);

	public static final ConfigEntry<Boolean> PUSHABLE_LECTERNS = CONFIG.entry("pushableLecterns", EntryType.BOOL, true);

	public static final ConfigEntry<Boolean> PUSHABLE_SHELVES = CONFIG.entry("pushableShelves", EntryType.BOOL, true);

	// UTILITY
	public static final ConfigEntry<Boolean> PUSHABLE_FURNACES = CONFIG.entry("pushableFurnaces", EntryType.BOOL, true);

	public static final ConfigEntry<Boolean> PUSHABLE_BREWING_STANDS = CONFIG.entry("pushableBrewingStands", EntryType.BOOL, true);

	public static final ConfigEntry<Boolean> PUSHABLE_ENCHANTING_TABLES = CONFIG.entry("pushableEnchantingTables", EntryType.BOOL, true);

	// REDSTONE
	public static final ConfigEntry<Boolean> PUSHABLE_ITEM_TRANSPORTERS = CONFIG.entry("pushableItemTransporters", EntryType.BOOL, false);

	public static final ConfigEntry<Boolean> PUSHABLE_EJECTORS = CONFIG.entry("pushableEjectors", EntryType.BOOL, true);

	public static final ConfigEntry<Boolean> PUSHABLE_CRAFTERS = CONFIG.entry("pushableCrafters", EntryType.BOOL, true);

	public static final ConfigEntry<Boolean> PUSHABLE_DAYLIGHT_DETECTORS = CONFIG.entry("pushableDaylightDetectors", EntryType.BOOL, true);

	// COMBAT
	public static final ConfigEntry<Boolean> PUSHABLE_CREAKING_HEARTS = CONFIG.entry("pushableCreakingHearts", EntryType.BOOL, true);

	public static final ConfigEntry<Boolean> PUSHABLE_SPAWNERS = CONFIG.entry("pushableSpawners", EntryType.BOOL, false);

	public static final ConfigEntry<Boolean> PUSHABLE_TRIAL_SPAWNERS = CONFIG.entry("pushableTrialSpawners", EntryType.BOOL, false);

	public static final ConfigEntry<Boolean> PUSHABLE_VAULTS = CONFIG.entry("pushableVaults", EntryType.BOOL, false);

	// BUFFS
	public static final ConfigEntry<Boolean> PUSHABLE_BEACONS = CONFIG.entry("pushableBeacons", EntryType.BOOL, true);

	public static final ConfigEntry<Boolean> PUSHABLE_CONDUITS = CONFIG.entry("pushableConduits", EntryType.BOOL, true);

	// OTHER
	public static final ConfigEntry<Boolean> PUSHABLE_BEEHIVES = CONFIG.entry("pushableBeehives", EntryType.BOOL, true);

	public static final ConfigEntry<Boolean> PUSHABLE_CAMPFIRES = CONFIG.entry("pushableCampfires", EntryType.BOOL, true);

	public static final ConfigEntry<Boolean> PUSHABLE_SIGNS = CONFIG.entry("pushableSigns", EntryType.BOOL, false);

	// WILDER WILD
	public static final ConfigEntry<Boolean> PUSHABLE_GEYSERS = CONFIG.entry("pushableGeysers", EntryType.BOOL, true);

	// TRAILIER TALES
	public static final ConfigEntry<Boolean> PUSHABLE_SURVEYORS = CONFIG.entry("pushableSurveyors", EntryType.BOOL, true);

	// NETHERIER NETHER
	public static final ConfigEntry<Boolean> PUSHABLE_NETHER_REACTOR_CORES = CONFIG.entry("pushableNetherReactorCores", EntryType.BOOL, true);

	// SIMPLE COPPER PIPES
	public static final ConfigEntry<Boolean> PUSHABLE_COPPER_PIPES = CONFIG.entry("pushableCopperPipes", EntryType.BOOL, false);

	public static final ConfigEntry<Boolean> PUSHABLE_COPPER_FITTINGS = CONFIG.entry("pushableCopperFittings", EntryType.BOOL, false);
}
