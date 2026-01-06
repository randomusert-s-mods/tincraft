package io.github.randomusert.mods.tincraft.data;

import io.github.randomusert.mods.tincraft.TinCraft;
import io.github.randomusert.mods.tincraft.init.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TinCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.TIN_INGOT.get());
    }
}
