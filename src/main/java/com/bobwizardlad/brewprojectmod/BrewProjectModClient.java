package com.bobwizardlad.brewprojectmod;

import com.bobwizardlad.brewprojectmod.util.BlockRenders;
import net.fabricmc.api.ClientModInitializer;

public class BrewProjectModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenders.defineRenders();
    }
}
