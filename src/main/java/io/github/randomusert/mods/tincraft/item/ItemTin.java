package io.github.randomusert.mods.tincraft.item;

import io.github.randomusert.mods.tincraft.TinCraft;
import io.github.randomusert.mods.tincraft.block.TinBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemTin {
    public static final DeferredRegister.Items TIN_ITEMS = DeferredRegister.createItems(TinCraft.MODID);

    public static final DeferredItem<Item> TIN_INGOT = TIN_ITEMS.registerSimpleItem("tin_ingot", new Item.Properties().stacksTo(64));

    public static final DeferredItem<BlockItem> TIN_BLOCK_ITEM = TIN_ITEMS.register("tin_block",
            () -> new BlockItem(TinBlock.TIN_BLOCK.get(), new Item.Properties()));

    public static final DeferredItem<BlockItem> TIN_ORE_ITEM = TIN_ITEMS.register("tin_ore",
            () -> new BlockItem(TinBlock.TIN_ORE.get(), new Item.Properties()));


}
