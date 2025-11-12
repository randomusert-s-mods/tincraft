package io.github.randomusert.mods.tincraft.api.inventory;

import net.minecraft.core.Direction;

@FunctionalInterface
public interface CanExtractFunction {
    boolean apply(int slot);

    @FunctionalInterface
    interface Sided {
        boolean apply(int slot, Direction direction);
    }
}
