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

import net.frozenblock.lib.menu.api.SplashTextEvents;
import net.mehvahdjukaar.candlelight.api.ClientOnly;

@ClientOnly
public final class PushierPistonsClient {

	public static void init() {
		SplashTextEvents.ADD_SOURCE_FILES.register(sourceFiles -> sourceFiles.add(PPConstants.id("texts/splashes.txt")));
	}

	private PushierPistonsClient() {}
}
