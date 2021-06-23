package com.bobwizardlad.brewprojectmod.registry;

import com.bobwizardlad.brewprojectmod.BrewProjectMod;
import com.bobwizardlad.brewprojectmod.itemclass.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BrewProjectItems {
    // Items
    public static final Item GREEN_TEA_LEAF = new GreenTeaLeaf(BrewProjectBlocks.GREEN_TEA_BUSH, (new Item.Settings()).group(BrewProjectMod.BREW_ITEM_GROUP));
    public static final Item SEMIFERMENTED_TEA_LEAF = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP));
    public static final Item FERMENTED_TEA_LEAF = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP));
    public static final Item MUSHY_TEA_LEAF = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP));
    public static final Item MUG = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP));
    public static final Item TEA_KETTLE = new TeaKettle(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP).maxCount(1));
    public static final Item TEA_KETTLE_COLD = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP).maxCount(1));
    public static final Item TEA_KETTLE_HOT = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP).maxCount(1));

    // BlockItems


    public static void registerItems() {
        // Call the registry to register items here
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "green_tea_leaf"), GREEN_TEA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "semifermented_tea_leaf"), SEMIFERMENTED_TEA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "fermented_tea_leaf"), FERMENTED_TEA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "mushy_tea_leaf"), MUSHY_TEA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "mug"), MUG);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "tea_kettle"), TEA_KETTLE);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "tea_kettle_cold"), TEA_KETTLE_COLD);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "tea_kettle_hot"), TEA_KETTLE_HOT);
    }
}
