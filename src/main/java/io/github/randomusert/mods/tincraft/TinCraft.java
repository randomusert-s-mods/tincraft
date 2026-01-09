package io.github.randomusert.mods.tincraft;

import io.github.randomusert.mods.tincraft.helper.LogHelper;
import io.github.randomusert.mods.tincraft.init.ModBlockEntities;
import io.github.randomusert.mods.tincraft.init.ModBlocks;
import io.github.randomusert.mods.tincraft.config.Config;
import io.github.randomusert.mods.tincraft.init.TincraftCreativeModeTabs;
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

import static io.github.randomusert.mods.tincraft.init.ModItems.ITEMS;


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
        ModBlocks.BLOCKS.register(modEventBus);

        ITEMS.register(modEventBus);

        //ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
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
