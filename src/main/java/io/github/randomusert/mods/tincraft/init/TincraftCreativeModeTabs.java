package io.github.randomusert.mods.tincraft.init;

import io.github.randomusert.mods.tincraft.TinCraft;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TIN_INGOT.get()))
                    .title(Component.translatable("creativetab.tincraft.main"))
                    .displayItems((itemDisplayParameter, output) -> {
                        output.accept(ModItems.TIN_INGOT);
                        output.accept(ModBlocks.TIN_BLOCK);
                        output.accept(ModBlocks.TIN_ORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
