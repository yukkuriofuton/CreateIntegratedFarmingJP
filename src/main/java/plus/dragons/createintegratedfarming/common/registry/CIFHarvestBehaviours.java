/*
 * Copyright (C) 2025  DragonsPlus
 * SPDX-License-Identifier: LGPL-3.0-or-later
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package plus.dragons.createintegratedfarming.common.registry;

import plus.dragons.createintegratedfarming.api.harvester.CustomHarvestBehaviour;
import plus.dragons.createintegratedfarming.common.farming.harvest.HighCropHarvestBehaviour;
import plus.dragons.createintegratedfarming.common.farming.harvest.MushroomColonyHarvestBehaviour;
import plus.dragons.createintegratedfarming.common.farming.harvest.TomatoHarvestBehaviour;
import vectorwing.farmersdelight.common.block.TomatoVineBlock;
import vectorwing.farmersdelight.common.registry.ModBlocks;

public class CIFHarvestBehaviours {
    public static void registerFarmersDelight() {
        CustomHarvestBehaviour.REGISTRY.registerProvider(MushroomColonyHarvestBehaviour::create);
        var tomato = (TomatoVineBlock) ModBlocks.TOMATO_CROP.get();
        CustomHarvestBehaviour.REGISTRY.register(tomato, new TomatoHarvestBehaviour(tomato));
    }

    public static void registerMmlib() {
        CustomHarvestBehaviour.REGISTRY.registerProvider(HighCropHarvestBehaviour::create);
    }
}
