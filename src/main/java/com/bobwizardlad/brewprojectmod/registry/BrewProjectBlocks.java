package com.bobwizardlad.brewprojectmod.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BrewProjectBlocks {

    // Blocks
    public static final Block GREEN_TEA_BLOCK = new Block(FabricBlockSettings.of(Material.PLANT).ticksRandomly().noCollision().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP).nonOpaque());
    

    public static void registerBlocks() {
        // Call the registry to register blocks here
    }
}
