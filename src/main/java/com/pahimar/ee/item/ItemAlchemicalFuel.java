package com.pahimar.ee.item;

import com.pahimar.ee.item.base.ItemBase;

/**
 * TODO Finish Javadoc
 *
 * @author      pahimar
 *
 * @since       3.0.0
 */
public class ItemAlchemicalFuel extends ItemBase {

    /**
     * TODO Finish Javadoc
     *
     * @since   3.0.0
     */
    public ItemAlchemicalFuel() {
        super("alchemical_fuel", "alchemical_coal", "mobius_fuel", "aeternalis_fuel");
        setHasSubtypes(true);
        setMaxStackSize(64);
    }
}
