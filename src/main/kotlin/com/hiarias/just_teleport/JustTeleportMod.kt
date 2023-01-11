package com.hiarias.just_teleport

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object JustTeleportMod : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("Example Mod")

    override fun onInitialize(mod: ModContainer) {
        LOGGER.info("Hello Quilt world from {}!", mod.metadata()?.name())
    }
}
