package io.github.randomusert.mods.tincraft.api.inventory;

import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;

@FunctionalInterface
public interface CanInsertFunction {
    boolean apply(int slot, ItemStack stack);

    @FunctionalInterface
    interface Sided {
        boolean apply(int slot, ItemStack stack, Direction direction);
    }
}
