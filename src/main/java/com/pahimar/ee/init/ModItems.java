package com.pahimar.ee.init;

import com.pahimar.ee.EquivalentExchange;
import com.pahimar.ee.item.*;
import com.pahimar.ee.item.armor.ItemDarkMatterBoots;
import com.pahimar.ee.item.armor.ItemDarkMatterChest;
import com.pahimar.ee.item.armor.ItemDarkMatterHelmet;
import com.pahimar.ee.item.armor.ItemDarkMatterLeggings;
import com.pahimar.ee.item.base.ItemBase;
import com.pahimar.ee.item.tool.*;
import com.pahimar.ee.item.weapon.ItemDarkMatterArrow;
import com.pahimar.ee.item.weapon.ItemDarkMatterBow;
import com.pahimar.ee.item.weapon.ItemDarkMatterSword;
import com.pahimar.ee.item.weapon.ItemKunai;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO Finish Javadoc
 *
 * @author      pahimar
 *
 * @since       3.0.0
 */
@GameRegistry.ObjectHolder(EquivalentExchange.MOD_ID)
@Mod.EventBusSubscriber
public class ModItems {

    /**
     * TODO Finish Javadoc
     */
    private static final List<ItemBase> ITEMS = new ArrayList<>();

    // Misc
    public static final ItemBase ALCHEMICAL_BAG = new ItemAlchemicalBag();
    public static final ItemBase ALCHEMICAL_DUST = new ItemAlchemicalDust();
    public static final ItemBase ALCHEMICAL_FUEL = new ItemAlchemicalFuel();
    public static final ItemBase ALCHENOMICON = new ItemAlchenomicon();
    public static final ItemBase CHALK = new ItemChalk();
    public static final ItemBase CLOAK = new ItemCloak();
    public static final ItemBase DARK_MATTER = new ItemDarkMatter();
    public static final ItemBase SCROLL = new ItemScroll();

    // Armor
    public static final ItemBase DARK_MATTER_BOOTS = new ItemDarkMatterBoots();
    public static final ItemBase DARK_MATTER_CHEST = new ItemDarkMatterChest();
    public static final ItemBase DARK_MATTER_HELMET = new ItemDarkMatterHelmet();
    public static final ItemBase DARK_MATTER_LEGGINGS = new ItemDarkMatterLeggings();

    // Tools
    public static final ItemBase DARK_MATTER_AXE = new ItemDarkMatterAxe();
    public static final ItemBase DARK_MATTER_FISHING_ROD = new ItemDarkMatterFishingRod();
    public static final ItemBase DARK_MATTER_HOE = new ItemDarkMatterHoe();
    public static final ItemBase DARK_MATTER_PICKAXE = new ItemDarkMatterPickaxe();
    public static final ItemBase DARK_MATTER_SHEARS = new ItemDarkMatterShears();
    public static final ItemBase DARK_MATTER_SHOVEL = new ItemDarkMatterShovel();
    public static final ItemBase DOWSING_ROD = new ItemDowsingRod();
    public static final ItemBase LODEN_STONE = new ItemLodenStone();
    public static final ItemBase MERCURIAL_EYE = new ItemMercurialEye();
    public static final ItemBase MINIUM_STONE = new ItemMiniumStone();
    public static final ItemBase PHILOSOPHERS_STONE = new ItemPhilosophersStone();
    public static final ItemBase WATCH = new ItemWatch();

    // Weapons
    public static final ItemBase DARK_MATTER_ARROW = new ItemDarkMatterArrow();
    public static final ItemBase DARK_MATTER_BOW = new ItemDarkMatterBow();
    public static final ItemBase DARK_MATTER_SWORD = new ItemDarkMatterSword();
    public static final ItemBase KUNAI = new ItemKunai();

    /**
     * TODO Finish Javadoc
     */
    private ModItems() {
        // NO-OP
    }

    /**
     * TODO Finish Javadoc
     *
     * @return  TODO
     *
     * @since   3.0.0
     */
    public static List<ItemBase> getItems() {
        return ITEMS;
    }

    /**
     * TODO Finish Javadoc
     *
     * @param   itemBase
     *          TODO
     *
     * @since   3.0.0
     */
    public static void register(ItemBase itemBase) {
        ITEMS.add(itemBase);
    }

    /**
     * TODO Finish Javadoc
     *
     * @param   event
     *          TODO
     *
     * @since   3.0.0
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        for (ItemBase itemBase : ITEMS) {
            event.getRegistry().register(itemBase);
        }
    }
}
