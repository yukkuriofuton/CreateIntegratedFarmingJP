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

package plus.dragons.createintegratedfarming.mixin.create;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.simibubi.create.content.kinetics.saw.TreeCutter;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import plus.dragons.createintegratedfarming.api.saw.SawableBlockTags;

@Mixin(TreeCutter.class)
public class TreeCutterMixin {
    @ModifyReturnValue(method = "isVerticalPlant", at = @At("TAIL"))
    private static boolean createintegratedfarming$addFragileVerticalPlants(boolean original, BlockState state) {
        return state.is(SawableBlockTags.VERTICAL_PLANTS) || original;
    }
}
