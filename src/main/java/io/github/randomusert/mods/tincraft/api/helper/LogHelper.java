package io.github.randomusert.mods.tincraft.api.helper;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class LogHelper {
    public static final Logger LOGGER = LogUtils.getLogger();

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
