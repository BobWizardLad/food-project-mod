package com.bobwizardlad.brewprojectmod;

import net.fabricmc.api.ModInitializer;
import com.bobwizardlad.brewprojectmod.registry.*;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.EntityPropertiesLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.LootNumberProvider;
import net.minecraft.util.Identifier;

import javax.swing.text.html.parser.Entity;

public class BrewProjectMod implements ModInitializer {

    // MODID and item group for mod
    public static final String MOD_ID = "brewprojectmod";
    public static final ItemGroup BREW_ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "central"),
            () -> new ItemStack(BrewProjectItems.GREEN_TEA_LEAF)
            );

    // Loot table ID's
    private static final Identifier WITCH_LOOT_TABLE_ID = EntityType.WITCH.getLootTableId();

    @Override
    public void onInitialize() {
        // This block runs when the game reaches a mod-loading state.
        BrewProjectItems.registerItems();
        BrewProjectBlocks.registerBlocks();

        // Loot table listeners
        EntityLootListener();


    }

    private void EntityLootListener() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (WITCH_LOOT_TABLE_ID.equals(id)) {
                // Roll to drop green tea leaf from a witch
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1)) // Same as "rolls": 1 in the loot table json
                        .with(ItemEntry.builder(BrewProjectItems.GREEN_TEA_LEAF));
                table.pool(poolBuilder);
            }
        });
    }
}
