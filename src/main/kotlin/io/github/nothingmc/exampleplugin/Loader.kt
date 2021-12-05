package io.github.nothingmc.exampleplugin

import cn.nukkit.plugin.PluginBase

class Loader : PluginBase() {

    override fun onEnable() {
        logger.info("ExamplePlugin has been enabled!")
    }

    override fun onDisable() {
        logger.info("ExamplePlugin has been disabled!")
    }
}
