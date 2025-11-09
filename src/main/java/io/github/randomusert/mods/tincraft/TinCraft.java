package io.github.randomusert.mods.tincraft;

import io.github.randomusert.mods.tincraft.api.helper.LogHelper;
import io.github.randomusert.mods.tincraft.block.TinBlock;
import io.github.randomusert.mods.tincraft.config.Config;
import io.github.randomusert.mods.tincraft.item.TincraftCreativeModeTabs;
import net.minecraft.world.item.*;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import java.util.List;
import java.util.Map;
import static io.github.randomusert.mods.tincraft.item.ItemTin.TIN_INGOT;
import static io.github.randomusert.mods.tincraft.item.ItemTin.TIN_ITEMS;
import io.github.randomusert.mods.tincraft.api.TinCraftApi;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(TinCraft.MODID)
public class TinCraft {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "tincraft";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();


    //mods constructor
    public TinCraft(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        TinBlock.TINBLOCKS.register(modEventBus);
        TIN_ITEMS.register(modEventBus);
        TincraftCreativeModeTabs.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LogHelper.LogInfo("Tincraft loading common");
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LogHelper.LogInfo("loading tincraft on server side");
    }
}
