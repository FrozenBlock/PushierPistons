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

package net.frozenblock.pushierpistons.datagen.tag;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.frozenblock.lib.tag.api.FrozenLibBlockTags;
import net.frozenblock.pushierpistons.tag.PPBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.BlockIds;
import net.minecraft.references.BlockItemIds;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public final class PPBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {

	public PPBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries);
	}

	@Override
	protected void addTags(HolderLookup.Provider registries) {
		this.builder(FrozenLibBlockTags.HAS_PUSHABLE_BLOCK_ENTITY)
			// STORAGE
			.addOptionalTag(PPBlockTags.PUSHABLE_CHESTS)
			.addOptionalTag(PPBlockTags.PUSHABLE_BARRELS)
			.addOptionalTag(PPBlockTags.PUSHABLE_CHISELED_BOOKSHELVES)
			.addOptionalTag(PPBlockTags.PUSHABLE_LECTERNS)
			.addOptionalTag(PPBlockTags.PUSHABLE_SHELVES)
			// UTILITY
			.addOptionalTag(PPBlockTags.PUSHABLE_FURNACES)
			.addOptionalTag(PPBlockTags.PUSHABLE_BREWING_STANDS)
			.addOptionalTag(PPBlockTags.PUSHABLE_ENCHANTING_TABLES)
			// REDSTONE
			.addOptionalTag(PPBlockTags.PUSHABLE_ITEM_TRANSPORTERS)
			.addOptionalTag(PPBlockTags.PUSHABLE_EJECTORS)
			.addOptionalTag(PPBlockTags.PUSHABLE_CRAFTERS)
			.addOptionalTag(PPBlockTags.PUSHABLE_DAYLIGHT_DETECTORS)
			// COMBAT
			.addOptionalTag(PPBlockTags.PUSHABLE_CREAKING_HEARTS)
			.addOptionalTag(PPBlockTags.PUSHABLE_SPAWNERS)
			.addOptionalTag(PPBlockTags.PUSHABLE_TRIAL_SPAWNERS)
			.addOptionalTag(PPBlockTags.PUSHABLE_VAULTS)
			// BUFFS
			.addOptionalTag(PPBlockTags.PUSHABLE_BEACONS)
			.addOptionalTag(PPBlockTags.PUSHABLE_CONDUITS)
			// OTHER
			.addOptionalTag(PPBlockTags.PUSHABLE_BEEHIVES)
			.addOptionalTag(PPBlockTags.PUSHABLE_CAMPFIRES)
			.addOptionalTag(PPBlockTags.PUSHABLE_SIGNS)
			// WILDER WILD
			.addOptionalTag(PPBlockTags.PUSHABLE_GEYSERS)
			// TRAILIER TALES
			.addOptionalTag(PPBlockTags.PUSHABLE_SURVEYORS)
			// NETHERIER NETHER
			.addOptionalTag(PPBlockTags.PUSHABLE_NETHER_REACTOR_CORES);

		// STORAGE
		this.builder(PPBlockTags.PUSHABLE_CHESTS)
			.addOptionalTag(ConventionalBlockTags.CHESTS);

		this.builder(PPBlockTags.PUSHABLE_BARRELS)
			.addOptionalTag(ConventionalBlockTags.BARRELS);

		this.builder(PPBlockTags.PUSHABLE_CHISELED_BOOKSHELVES)
			.add(BlockItemIds.CHISELED_BOOKSHELF);

		this.builder(PPBlockTags.PUSHABLE_LECTERNS)
			.add(BlockItemIds.LECTERN);

		this.builder(PPBlockTags.PUSHABLE_SHELVES)
			.addOptionalTag(BlockTags.WOODEN_SHELVES);

		// UTILITY
		this.builder(PPBlockTags.PUSHABLE_FURNACES)
			.add(BlockItemIds.FURNACE, BlockItemIds.BLAST_FURNACE, BlockItemIds.SMOKER);

		this.builder(PPBlockTags.PUSHABLE_BREWING_STANDS)
			.add(BlockItemIds.BREWING_STAND);

		this.builder(PPBlockTags.PUSHABLE_ENCHANTING_TABLES)
			.add(BlockItemIds.ENCHANTING_TABLE);

		// REDSTONE
		this.builder(PPBlockTags.PUSHABLE_ITEM_TRANSPORTERS)
			.add(BlockItemIds.HOPPER);

		this.builder(PPBlockTags.PUSHABLE_EJECTORS)
			.add(BlockItemIds.DISPENSER, BlockItemIds.DROPPER);

		this.builder(PPBlockTags.PUSHABLE_CRAFTERS)
			.add(BlockItemIds.CRAFTER);

		this.builder(PPBlockTags.PUSHABLE_DAYLIGHT_DETECTORS)
			.add(BlockItemIds.DAYLIGHT_DETECTOR);

		// COMBAT
		this.builder(PPBlockTags.PUSHABLE_CREAKING_HEARTS)
			.add(BlockItemIds.CREAKING_HEART);

		this.builder(PPBlockTags.PUSHABLE_SPAWNERS)
			.add(BlockItemIds.SPAWNER);

		this.builder(PPBlockTags.PUSHABLE_TRIAL_SPAWNERS)
			.add(BlockItemIds.TRIAL_SPAWNER);

		this.builder(PPBlockTags.PUSHABLE_VAULTS)
			.add(BlockItemIds.VAULT);

		// BUFFS
		this.builder(PPBlockTags.PUSHABLE_BEACONS)
			.add(BlockItemIds.BEACON);

		this.builder(PPBlockTags.PUSHABLE_CONDUITS)
			.add(BlockItemIds.CONDUIT);

		// OTHER
		this.builder(PPBlockTags.PUSHABLE_BEEHIVES)
			.addOptionalTag(BlockTags.BEEHIVES);

		this.builder(PPBlockTags.PUSHABLE_CAMPFIRES)
			.addOptionalTag(BlockTags.CAMPFIRES);

		this.builder(PPBlockTags.PUSHABLE_SIGNS)
			.addOptionalTag(BlockTags.ALL_SIGNS);

		// WILDER WILD
		this.builder(PPBlockTags.PUSHABLE_GEYSERS)
			.addOptional(getKey("wilderwild", "geyser"));

		// TRAILIER TALES
		this.builder(PPBlockTags.PUSHABLE_SURVEYORS)
			.addOptional(getKey("trailiertales", "surveyor"));

		// NETHERIER NETHER
		this.builder(PPBlockTags.PUSHABLE_NETHER_REACTOR_CORES)
			.addOptional(getKey("netheriernether", "nether_reactor_core"));

		// EXCLUSIONS
		this.builder(PPBlockTags.EXCLUDED_BLOCK_ENTITIES)
			.add(BlockIds.END_PORTAL, BlockIds.END_GATEWAY);

		this.builder(PPBlockTags.EXCLUDED_BLOCK_ENTITIES)
			.addOptional(getKey("wilderwild", "stone_chest"))
			.addOptional(getKey("trailiertales", "coffin"));

		// CHAINSTONE
		this.builder(PPBlockTags.CHAINSTONE_BLOCKS)
			.addOptionalTag(ConventionalBlockTags.CHAINS)
			.addOptionalTag(BlockTags.CHAINS);
	}

	private TagKey<Block> getTag(String namespace, String path) {
		return TagKey.create(this.registryKey, Identifier.fromNamespaceAndPath(namespace, path));
	}

	private ResourceKey<Block> getKey(String namespace, String path) {
		return ResourceKey.create(this.registryKey, Identifier.fromNamespaceAndPath(namespace, path));
	}
}
