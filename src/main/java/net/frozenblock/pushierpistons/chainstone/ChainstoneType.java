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

package net.frozenblock.pushierpistons.chainstone;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.frozenblock.lib.config.v2.entry.EntryType;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import java.util.function.IntFunction;

public enum ChainstoneType implements StringRepresentable {
	DISABLED(0, "disabled"),
	CHAIN_FACING_INTO(1, "chain_facing_into"),
	CHAINS_ALONG_SAME_AXIS(2, "chains_along_same_axis"),
	ADJACENT_CHAINS_FACING_INTO(3, "adjacent_chains_facing_into");

	public static final Codec<ChainstoneType> CODEC = StringRepresentable.fromEnum(ChainstoneType::values);
	private static final IntFunction<ChainstoneType> BY_ID = ByIdMap.continuous(t -> t.id, values(), ByIdMap.OutOfBoundsStrategy.ZERO);
	public static final StreamCodec<ByteBuf, ChainstoneType> STREAM_CODEC = ByteBufCodecs.idMapper(BY_ID, t -> t.id);
	public static final EntryType<ChainstoneType> ENTRY_TYPE = EntryType.create(CODEC, STREAM_CODEC);

	private final int id;
	private final String name;

	ChainstoneType(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public String getSerializedName() {
		return this.name;
	}
}
