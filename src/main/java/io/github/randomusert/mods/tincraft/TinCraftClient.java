package io.github.randomusert.mods.tincraft;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import org.slf4j.Logger;
import io.github.randomusert.mods.tincraft.helper.LogHelper;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = TinCraft.MODID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = TinCraft.MODID, value = Dist.CLIENT)
public class TinCraftClient {
    public static final Logger LOGGER = LogUtils.getLogger();
    public TinCraftClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        LogHelper.LogInfo("[tincraft]: tincraft client loading... please wait");

    }
}
