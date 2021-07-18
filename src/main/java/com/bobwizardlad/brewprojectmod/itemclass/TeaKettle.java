package com.bobwizardlad.brewprojectmod.itemclass;

import com.bobwizardlad.brewprojectmod.registry.BrewProjectItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class TeaKettle extends Item{

    public TeaKettle(Settings settings) {
        super(settings);
    }

    // Use tea kettle to get water from the world -- Code modified from GlassBottleItem class
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // Get item in hand and raycast to get world data
        ItemStack itemStack = user.getStackInHand(hand);
        HitResult hitResult = raycast(world, user, RaycastContext.FluidHandling.SOURCE_ONLY);
        // If miss, pass
        if (hitResult.getType() == HitResult.Type.MISS) {
            return TypedActionResult.pass(itemStack);
        } else {
            // If a block, check if modifiable. If true and is water then commit to gathering water
            if (hitResult.getType() == HitResult.Type.BLOCK) {
                BlockPos blockPos = ((BlockHitResult)hitResult).getBlockPos();
                if (!world.canPlayerModifyAt(user, blockPos)) {
                    return TypedActionResult.pass(itemStack);
                }
                if (world.getFluidState(blockPos).isIn(FluidTags.WATER)) {
                    world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);
                    world.emitGameEvent(user, GameEvent.FLUID_PICKUP, blockPos);
                    return TypedActionResult.success(this.fill(itemStack, user, new ItemStack(BrewProjectItems.TEA_KETTLE_COLD)), world.isClient());
                }
            }

            return TypedActionResult.pass(itemStack);
        }
    }

    // fill to facilitate change of item from empty to cold kettle -- Code modified from GlassBottleItem class
    protected ItemStack fill(ItemStack stack, PlayerEntity player, ItemStack outputStack) {
        // Unsure of stat functionality, will leave out for the time being
        //player.incrementStat(Stats.USED.getOrCreateStat(this));
        return ItemUsage.exchangeStack(stack, player, outputStack);
    }
}
