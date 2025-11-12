package io.github.randomusert.mods.tincraft.api.inventory;

@FunctionalInterface
public interface OnContentsChangedFunction {
    void apply(int slot);
}
