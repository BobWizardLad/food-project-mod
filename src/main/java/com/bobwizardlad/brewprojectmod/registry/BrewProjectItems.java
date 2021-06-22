package com.bobwizardlad.brewprojectmod.registry;

import com.bobwizardlad.brewprojectmod.BrewProjectMod;
import com.bobwizardlad.brewprojectmod.itemclass.GreenTeaLeaf;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BrewProjectItems {
    // Items
    public static final Item GREEN_TEA_LEAF = new GreenTeaLeaf(BrewProjectBlocks.GREEN_TEA_BUSH, (new Item.Settings()).group(BrewProjectMod.BREW_ITEM_GROUP));

    // BlockItems


    public static void registerItems() {
        // Call the registry to register items here
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "green_tea_leaf"), GREEN_TEA_LEAF);
    }
}
