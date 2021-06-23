package com.bobwizardlad.brewprojectmod.registry;

import com.bobwizardlad.brewprojectmod.BrewProjectMod;
import com.bobwizardlad.brewprojectmod.blockclass.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BrewProjectBlocks {

    // Blocks
    public static final Block GREEN_TEA_BUSH = new GreenTeaBush(FabricBlockSettings.of(Material.PLANT).ticksRandomly().noCollision().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP).nonOpaque());


    public static void registerBlocks() {
        // Call the registry to register blocks here
        Registry.register(Registry.BLOCK, new Identifier(BrewProjectMod.MOD_ID, "green_tea_bush"), GREEN_TEA_BUSH);
    }
}
