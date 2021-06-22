package com.bobwizardlad.brewprojectmod.util;

import com.bobwizardlad.brewprojectmod.registry.BrewProjectBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BlockRenders {

    public static void defineRenders() {
        BlockRenderLayerMap.INSTANCE.putBlock(BrewProjectBlocks.GREEN_TEA_BUSH, RenderLayer.getCutoutMipped());
    }
}
