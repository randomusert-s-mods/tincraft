package io.github.randomusert.mods.tincraft.item;

import io.github.randomusert.mods.tincraft.TinCraft;
import io.github.randomusert.mods.tincraft.block.TinBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class TincraftCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TinCraft.MODID);

    public static final Supplier<CreativeModeTab> TINCRAFT_MAIN_TAB = CREATIVE_MODE_TAB.register("main_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemTin.TIN_INGOT.get()))
                    .title(Component.translatable("creativetab.tincraft.main"))
                    .displayItems((itemDisplayParameter, output) -> {
                        output.accept(ItemTin.TIN_INGOT);
                        output.accept(TinBlock.TIN_BLOCK);
                        output.accept(TinBlock.TIN_ORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
