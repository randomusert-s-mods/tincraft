package io.github.randomusert.mods.tincraft.api.crafting;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingInput;

import java.util.List;

public class ShapelessCraftingInput{
    private final CraftingInput input;

    public ShapelessCraftingInput(List<ItemStack> items) {
        this.input = CraftingInput.of(items.size(), 1, items);
    }

    public CraftingInput asVanilla() {
        return input;
    }
}
