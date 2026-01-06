package io.github.randomusert.mods.tincraft.init;

import io.github.randomusert.mods.tincraft.TinCraft;
import io.github.randomusert.mods.tincraft.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TinCraft.MODID);

    //register tin ingot
    public static final DeferredItem<TinIngot> TIN_INGOT = ITEMS.registerItem(
            "tin_ingot",
            TinIngot::new,
            new Item.Properties().rarity(Rarity.COMMON)
    );

    public static final DeferredItem<BlockItem> TIN_BLOCK_ITEM = ITEMS.register("tin_block",
            () -> new BlockItem(ModBlocks.TIN_BLOCK.get(), new Item.Properties()));

    public static final DeferredItem<BlockItem> TIN_ORE_ITEM = ITEMS.register("tin_ore",
            () -> new BlockItem(ModBlocks.TIN_ORE.get(), new Item.Properties()));

}
