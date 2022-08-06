package me.skunky.utils;

import me.skunky.main.Main;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;

public class pdc {

    static NamespacedKey KEY_LVL = new NamespacedKey(Main.getPlugin(), "level");
    static NamespacedKey KEY_ID = new NamespacedKey(Main.getPlugin(), "id");

    public static PersistentDataContainer data(Player p) {
        return p.getPersistentDataContainer();
    }
}
