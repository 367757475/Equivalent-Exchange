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
public final class ModItems {

    /**
     * TODO Finish Javadoc
     */
    private static final List<ItemBase> ITEMS = new ArrayList<>();

    // Misc
    public static final ItemBase ALCHEMICAL_BAG = null;
    public static final ItemBase ALCHEMICAL_DUST = null;
    public static final ItemBase ALCHEMICAL_FUEL = null;
    public static final ItemBase ALCHENOMICON = null;
    public static final ItemBase CHALK = null;
    public static final ItemBase CLOAK = null;
    public static final ItemBase DARK_MATTER = null;
    public static final ItemBase SCROLL = null;

    // Armor
    public static final ItemBase DARK_MATTER_BOOTS = null;
    public static final ItemBase DARK_MATTER_CHEST = null;
    public static final ItemBase DARK_MATTER_HELMET = null;
    public static final ItemBase DARK_MATTER_LEGGINGS = null;

    // Tools
    public static final ItemBase DARK_MATTER_AXE = null;
    public static final ItemBase DARK_MATTER_FISHING_ROD = null;
    public static final ItemBase DARK_MATTER_HOE = null;
    public static final ItemBase DARK_MATTER_PICKAXE = null;
    public static final ItemBase DARK_MATTER_SHEARS = null;
    public static final ItemBase DARK_MATTER_SHOVEL = null;
    public static final ItemBase DOWSING_ROD = null;
    public static final ItemBase LODEN_STONE = null;
    public static final ItemBase MERCURIAL_EYE = null;
    public static final ItemBase MINIUM_STONE = null;
    public static final ItemBase PHILOSOPHERS_STONE = null;
    public static final ItemBase WATCH = null;

    // Weapons
    public static final ItemBase DARK_MATTER_ARROW = null;
    public static final ItemBase DARK_MATTER_BOW = null;
    public static final ItemBase DARK_MATTER_SWORD = null;
    public static final ItemBase KUNAI = null;

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

    static {
        ITEMS.add(new ItemAlchemicalBag());
        ITEMS.add(new ItemAlchemicalDust());
        ITEMS.add(new ItemAlchemicalFuel());
        ITEMS.add(new ItemAlchenomicon());
        ITEMS.add(new ItemChalk());
        ITEMS.add(new ItemCloak());
        ITEMS.add(new ItemDarkMatter());
        ITEMS.add(new ItemScroll());
        ITEMS.add(new ItemDarkMatterBoots());
        ITEMS.add(new ItemDarkMatterChest());
        ITEMS.add(new ItemDarkMatterHelmet());
        ITEMS.add(new ItemDarkMatterLeggings());
        ITEMS.add(new ItemDarkMatterAxe());
        ITEMS.add(new ItemDarkMatterFishingRod());
        ITEMS.add(new ItemDarkMatterHoe());
        ITEMS.add(new ItemDarkMatterPickaxe());
        ITEMS.add(new ItemDarkMatterShears());
        ITEMS.add(new ItemDarkMatterShovel());
        ITEMS.add(new ItemDowsingRod());
        ITEMS.add(new ItemLodenStone());
        ITEMS.add(new ItemMercurialEye());
        ITEMS.add(new ItemMiniumStone());
        ITEMS.add(new ItemPhilosophersStone());
        ITEMS.add(new ItemWatch());
        ITEMS.add(new ItemDarkMatterArrow());
        ITEMS.add(new ItemDarkMatterBow());
        ITEMS.add(new ItemDarkMatterSword());
        ITEMS.add(new ItemKunai());
    }
}
