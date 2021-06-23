package com.bobwizardlad.brewprojectmod.itemclass;

import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.Item;

public class TeaKettle extends GlassBottleItem {

    public TeaKettle(Settings settings) {
        super(settings);
    }

    // TODO -- Override fill method to implement transition between kettle empty and kettle water
}
