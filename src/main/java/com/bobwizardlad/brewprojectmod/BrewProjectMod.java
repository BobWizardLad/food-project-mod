package com.bobwizardlad.brewprojectmod;

import net.fabricmc.api.ModInitializer;
import com.bobwizardlad.brewprojectmod.registry.*;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class BrewProjectMod implements ModInitializer {

    public static final String MOD_ID = "brewprojectmod";

    public static final ItemGroup BREW_ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "central"),
            () -> new ItemStack(BrewProjectItems.GREEN_TEA_LEAF)
            );

    @Override
    public void onInitialize() {
        // This block runs when the game reaches a mod-loading state.
        BrewProjectItems.registerItems();
        BrewProjectBlocks.registerBlocks();
    }
}
