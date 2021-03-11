package com.g0ldensp00n.plugin

import org.bukkit.plugin.java.JavaPlugin

class Plugin: JavaPlugin() {
  override fun onEnable() {
    getLogger().info("Enabled Plugin v1.0")
  }

  override fun onDisable() {
    getLogger().info("Disabled Plugin v1.0")
  }
}
