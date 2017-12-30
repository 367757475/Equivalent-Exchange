package com.pahimar.ee.item.base;

import net.minecraft.client.renderer.ItemMeshDefinition;

/**
 * TODO Finish Javadoc
 *
 * @author      pahimar
 *
 * @since       3.0.0
 */
public interface IItemVariant<T extends ItemBase> {

    /**
     * TODO Finish Javadoc
     *
     * @return  TODO
     *
     * @since   3.0.0
     */
    T getItem();

    /**
     * TODO Finish Javadoc
     *
     * @return  TODO
     *
     * @since   3.0.0
     */
    String[] getVariants();

    /**
     * TODO Finish Javadoc
     *
     * @return  TODO
     *
     * @since   3.0.0
     */
    default ItemMeshDefinition getCustomMeshDefinition() {
        return null;
    }
}
