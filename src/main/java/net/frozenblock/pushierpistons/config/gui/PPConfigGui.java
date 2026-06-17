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

package net.frozenblock.pushierpistons.config.gui;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.frozenblock.lib.FrozenBools;
import net.frozenblock.lib.config.clothconfig.FrozenLibClothConfigGuiHelper;
import net.frozenblock.pushierpistons.PPConstants;
import net.frozenblock.pushierpistons.chainstone.ChainstoneType;
import net.frozenblock.pushierpistons.config.PPConfig;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.Contract;

@Environment(EnvType.CLIENT)
public final class PPConfigGui {
	private static final boolean WILDERWILD = FrozenBools.HAS_WILDERWILD;
	private static final boolean TRAILIERTALES = FrozenBools.HAS_TRAILIERTALES;
	private static final boolean NETHERIERNETHER = FabricLoader.getInstance().isModLoaded("netheriernether");

	private static void setupEntries(ConfigCategory category, ConfigEntryBuilder entryBuilder) {
		category.addEntry(
			FrozenLibClothConfigGuiHelper.syncedEntry(
				entryBuilder.startEnumSelector(text("chainstone_type"), ChainstoneType.class, PPConfig.CHAINSTONE_TYPE.getWithSync())
					.setEnumNameProvider(value -> enumNameProvider("chainstone_type." + value.toString()))
					.setTooltip(tooltip("chainstone_type")),
				PPConfig.CHAINSTONE_TYPE
			)
		);

		// STORAGE
		final var pushableChests = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_chests"), PPConfig.PUSHABLE_CHESTS.getWithSync())
				.setTooltip(tooltip("pushable_chests")),
			PPConfig.PUSHABLE_CHESTS
		);
		final var pushableBarrels = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_barrels"), PPConfig.PUSHABLE_BARRELS.getWithSync())
				.setTooltip(tooltip("pushable_barrels")),
			PPConfig.PUSHABLE_BARRELS
		);
		final var pushableChiseledBookshelves = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_chiseled_bookshelves"), PPConfig.PUSHABLE_CHISELED_BOOKSHELVES.getWithSync())
				.setTooltip(tooltip("pushable_chiseled_bookshelves")),
			PPConfig.PUSHABLE_CHISELED_BOOKSHELVES
		);
		final var pushableLecterns = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_lecterns"), PPConfig.PUSHABLE_LECTERNS.getWithSync())
				.setTooltip(tooltip("pushable_lecterns")),
			PPConfig.PUSHABLE_LECTERNS
		);
		final var pushableShelves = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_shelves"), PPConfig.PUSHABLE_SHELVES.getWithSync())
				.setTooltip(tooltip("pushable_shelves")),
			PPConfig.PUSHABLE_SHELVES
		);
		FrozenLibClothConfigGuiHelper.createSubCategory(entryBuilder, category, text("storage"),
			false,
			tooltip("storage"),
			pushableChests, pushableBarrels, pushableChiseledBookshelves, pushableLecterns, pushableShelves
		);

		// STORAGE
		final var pushableFurnaces = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_furnaces"), PPConfig.PUSHABLE_FURNACES.getWithSync())
				.setTooltip(tooltip("pushable_furnaces")),
			PPConfig.PUSHABLE_FURNACES
		);
		final var pushableBrewingStands = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_brewing_stands"), PPConfig.PUSHABLE_BREWING_STANDS.getWithSync())
				.setTooltip(tooltip("pushable_brewing_stands")),
			PPConfig.PUSHABLE_BREWING_STANDS
		);
		final var pushableEnchantingTables = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_enchanting_tables"), PPConfig.PUSHABLE_ENCHANTING_TABLES.getWithSync())
				.setTooltip(tooltip("pushable_enchanting_tables")),
			PPConfig.PUSHABLE_ENCHANTING_TABLES
		);
		FrozenLibClothConfigGuiHelper.createSubCategory(entryBuilder, category, text("utility"),
			false,
			tooltip("utility"),
			pushableFurnaces, pushableBrewingStands, pushableEnchantingTables
		);

		// REDSTONE
		final var pushableItemTransporters = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_item_transporters"), PPConfig.PUSHABLE_ITEM_TRANSPORTERS.getWithSync())
				.setTooltip(tooltip("pushable_item_transporters")),
			PPConfig.PUSHABLE_ITEM_TRANSPORTERS
		);
		final var pushableEjectors = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_ejectors"), PPConfig.PUSHABLE_EJECTORS.getWithSync())
				.setTooltip(tooltip("pushable_ejectors")),
			PPConfig.PUSHABLE_EJECTORS
		);
		final var pushableCrafters = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_crafters"), PPConfig.PUSHABLE_CRAFTERS.getWithSync())
				.setTooltip(tooltip("pushable_crafters")),
			PPConfig.PUSHABLE_CRAFTERS
		);
		final var pushableDaylightDetectors = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_daylight_detectors"), PPConfig.PUSHABLE_DAYLIGHT_DETECTORS.getWithSync())
				.setTooltip(tooltip("pushable_daylight_detectors")),
			PPConfig.PUSHABLE_DAYLIGHT_DETECTORS
		);
		FrozenLibClothConfigGuiHelper.createSubCategory(entryBuilder, category, text("redstone"),
			false,
			tooltip("redstone"),
			pushableItemTransporters, pushableEjectors, pushableCrafters, pushableDaylightDetectors
		);

		// COMBAT
		final var pushableCreakingHearts = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_creaking_hearts"), PPConfig.PUSHABLE_CREAKING_HEARTS.getWithSync())
				.setTooltip(tooltip("pushable_creaking_hearts")),
			PPConfig.PUSHABLE_CREAKING_HEARTS
		);
		final var pushableSpawners = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_spawners"), PPConfig.PUSHABLE_SPAWNERS.getWithSync())
				.setTooltip(tooltip("pushable_spawners")),
			PPConfig.PUSHABLE_SPAWNERS
		);
		final var pushableTrialSpawners = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_trial_spawners"), PPConfig.PUSHABLE_TRIAL_SPAWNERS.getWithSync())
				.setTooltip(tooltip("pushable_trial_spawners")),
			PPConfig.PUSHABLE_TRIAL_SPAWNERS
		);
		final var pushableVaults = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_vaults"), PPConfig.PUSHABLE_VAULTS.getWithSync())
				.setTooltip(tooltip("pushable_vaults")),
			PPConfig.PUSHABLE_VAULTS
		);
		FrozenLibClothConfigGuiHelper.createSubCategory(entryBuilder, category, text("combat"),
			false,
			tooltip("combat"),
			pushableCreakingHearts, pushableSpawners, pushableTrialSpawners, pushableVaults
		);

		// BUFFS
		final var pushableBeacons = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_beacons"), PPConfig.PUSHABLE_BEACONS.getWithSync())
				.setTooltip(tooltip("pushable_beacons")),
			PPConfig.PUSHABLE_BEACONS
		);
		final var pushableConduits = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_conduits"), PPConfig.PUSHABLE_CONDUITS.getWithSync())
				.setTooltip(tooltip("pushable_conduits")),
			PPConfig.PUSHABLE_CONDUITS
		);
		final var buffCategory = FrozenLibClothConfigGuiHelper.createSubCategory(entryBuilder, category, text("buff"),
			false,
			tooltip("buff"),
			pushableBeacons, pushableConduits
		);

		// OTHER
		final var pushableBeehives = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_beehives"), PPConfig.PUSHABLE_BEEHIVES.getWithSync())
				.setTooltip(tooltip("pushable_beehives")),
			PPConfig.PUSHABLE_BEEHIVES
		);
		final var pushableCampfires = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_campfires"), PPConfig.PUSHABLE_CAMPFIRES.getWithSync())
				.setTooltip(tooltip("pushable_campfires")),
			PPConfig.PUSHABLE_CAMPFIRES
		);
		final var pushableSigns = FrozenLibClothConfigGuiHelper.syncedEntry(
			entryBuilder.startBooleanToggle(text("pushable_signs"), PPConfig.PUSHABLE_SIGNS.getWithSync())
				.setTooltip(tooltip("pushable_signs")),
			PPConfig.PUSHABLE_SIGNS
		);
		FrozenLibClothConfigGuiHelper.createSubCategory(entryBuilder, category, text("other"),
			false,
			tooltip("other"),
			pushableBeehives, pushableCampfires, pushableSigns
		);

		// WILDER WILD
		if (WILDERWILD) {
			final var pushableGeysers = FrozenLibClothConfigGuiHelper.syncedEntry(
				entryBuilder.startBooleanToggle(text("pushable_geysers"), PPConfig.PUSHABLE_GEYSERS.getWithSync())
					.setTooltip(tooltip("pushable_geysers")),
				PPConfig.PUSHABLE_GEYSERS
			);
			final var wilderWildCategory = FrozenLibClothConfigGuiHelper.createSubCategory(entryBuilder, category, text("wilderwild"),
				false,
				tooltip("wilderwild"),
				pushableGeysers
			);
		}

		// TRAILIER TALES
		if (TRAILIERTALES) {
			final var pushableSurveyors = FrozenLibClothConfigGuiHelper.syncedEntry(
				entryBuilder.startBooleanToggle(text("pushable_surveyors"), PPConfig.PUSHABLE_SURVEYORS.getWithSync())
					.setTooltip(tooltip("pushable_surveyors")),
				PPConfig.PUSHABLE_SURVEYORS
			);
			FrozenLibClothConfigGuiHelper.createSubCategory(entryBuilder, category, text("trailiertales"),
				false,
				tooltip("trailiertales"),
				pushableSurveyors
			);
		}

		// NETHERIER NETHER
		if (NETHERIERNETHER) {
			final var pushableNetherReactorCores = FrozenLibClothConfigGuiHelper.syncedEntry(
				entryBuilder.startBooleanToggle(text("pushable_nether_reactor_cores"), PPConfig.PUSHABLE_NETHER_REACTOR_CORES.getWithSync())
					.setTooltip(tooltip("pushable_nether_reactor_cores")),
				PPConfig.PUSHABLE_NETHER_REACTOR_CORES
			);
			FrozenLibClothConfigGuiHelper.createSubCategory(entryBuilder, category, text("netheriernether"),
				false,
				tooltip("netheriernether"),
				pushableNetherReactorCores
			);
		}
	}

	public static Screen buildScreen(Screen parent) {
		final var configBuilder = ConfigBuilder.create().setParentScreen(parent).setTitle(text("component.title"));
		configBuilder.setSavingRunnable(PPConfig.CONFIG::save);
		final var config = configBuilder.getOrCreateCategory(text("config"));
		final ConfigEntryBuilder entryBuilder = configBuilder.entryBuilder();
		setupEntries(config, entryBuilder);
		return configBuilder.build();
	}

	@Contract(value = "_ -> new", pure = true)
	public static Component text(String key) {
		return Component.translatable("option." + PPConstants.MOD_ID + "." + key);
	}

	@Contract(value = "_ -> new", pure = true)
	public static Component tooltip(String key) {
		return Component.translatable("tooltip." + PPConstants.MOD_ID + "." + key);
	}

	@Contract(value = "_ -> new", pure = true)
	public static Component enumNameProvider(String key) {
		return Component.translatable("enum." + PPConstants.MOD_ID + "." + key);
	}
}
