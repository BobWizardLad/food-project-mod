package com.bobwizardlad.brewprojectmod.registry;

import com.bobwizardlad.brewprojectmod.*;
import com.bobwizardlad.brewprojectmod.itemclass.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BrewProjectItems {
    // Items
    public static final Item GREEN_TEA_LEAF = new AliasedBlockItem(BrewProjectBlocks.GREEN_TEA_BUSH, (new Item.Settings()).group(BrewProjectMod.BREW_ITEM_GROUP));
    public static final Item SEMIFERMENTED_TEA_LEAF = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP));
    public static final Item FERMENTED_TEA_LEAF = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP));
    public static final Item MUSHY_TEA_LEAF = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP));
    public static final Item MUG = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP).maxCount(4));
    public static final Item TEA_KETTLE = new TeaKettle(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP).maxCount(1));
    public static final Item TEA_KETTLE_COLD = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP).maxCount(1));
    public static final Item TEA_KETTLE_HOT = new Item(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP).maxCount(1).recipeRemainder(TEA_KETTLE));

    // Drinks
    public static final Item GREEN_TEA = new TeaItem(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP).maxCount(1), new StatusEffectInstance(StatusEffects.SATURATION, 3, 0));
    public static final Item OOLONG_TEA = new TeaItem(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP). maxCount(1), new StatusEffectInstance(StatusEffects.SATURATION, 6, 1));
    public static final Item BLACK_TEA = new TeaItem(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP). maxCount(1), new StatusEffectInstance(StatusEffects.SATURATION, 18, 2));
    public static final Item BURNT_TEA = new TeaItem(new Item.Settings().group(BrewProjectMod.BREW_ITEM_GROUP). maxCount(1), new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), new StatusEffectInstance(StatusEffects.BLINDNESS, 150, 0));

    // BlockItems


    public static void registerItems() {
        // Call the registry to register items
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "green_tea_leaf"), GREEN_TEA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "semifermented_tea_leaf"), SEMIFERMENTED_TEA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "fermented_tea_leaf"), FERMENTED_TEA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "mushy_tea_leaf"), MUSHY_TEA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "mug"), MUG);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "tea_kettle"), TEA_KETTLE);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "tea_kettle_cold"), TEA_KETTLE_COLD);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "tea_kettle_hot"), TEA_KETTLE_HOT);
        // Call registry to register drinks
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "green_tea"), GREEN_TEA);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "oolong_tea"), OOLONG_TEA);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "black_tea"), BLACK_TEA);
        Registry.register(Registry.ITEM, new Identifier(BrewProjectMod.MOD_ID, "burnt_tea"), BURNT_TEA);
    }
}
