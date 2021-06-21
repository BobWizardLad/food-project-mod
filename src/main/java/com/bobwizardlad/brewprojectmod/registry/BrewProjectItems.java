package com.bobwizardlad.brewprojectmod.registry;

import com.bobwizardlad.brewprojectmod.BrewProjectMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BrewProjectItems {
    // Items
    public static final Item GREEN_TEA_LEAF = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP).);
    //SWEET_BERRIES = register((String)"sweet_berries", (Item)(new AliasedBlockItem(Blocks.SWEET_BERRY_BUSH, (new Settings()).group(ItemGroup.FOOD).food(FoodComponents.SWEET_BERRIES))));

    // BlockItems


    public static void registerItems() {
        // Call the registry to register items here
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "green_tea_leaf"), GREEN_TEA_LEAF);
    }
}
