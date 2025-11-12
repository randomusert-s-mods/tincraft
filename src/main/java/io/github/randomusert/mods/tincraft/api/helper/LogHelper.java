package io.github.randomusert.mods.tincraft.api.helper;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogHelper {
    private static final String NAME = "tincraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static void LogInfo(String msg) {
        LOGGER.info(msg);
    }
    public static void LogError(String msg) {
        LOGGER.error(msg);
    }
    public static void LogDebug(String msg) {
        LOGGER.debug(msg);
    }
    public static void LogWarn(String msg) {
        LOGGER.warn(msg);
    }
}
