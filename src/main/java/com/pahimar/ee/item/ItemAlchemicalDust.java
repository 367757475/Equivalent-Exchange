package com.pahimar.ee.item;

import com.pahimar.ee.item.base.ItemBase;

/**
 * TODO Finish Javadoc
 *
 * @author      pahimar
 *
 * @since       3.0.0
 */
public class ItemAlchemicalDust extends ItemBase {

    /**
     * TODO Finish Javadoc
     *
     * @since 3.0.0
     */
    public ItemAlchemicalDust() {
        super("alchemical_dust", "calcined_ash", "minium_dust");
        setHasSubtypes(true);
        setMaxStackSize(64);
    }
}
