package com.koaxy.epicmod.koaxymod.fooditems;


import com.koaxy.epicmod.koaxymod.Koaxymod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Muffin extends Item {

    public Muffin() {
        super(new Item.Properties()
                .group(Koaxymod.TAB)
                .food(new Food.Builder()
                        .saturation(1.9f)
                        .hunger(4)
                        .effect(new EffectInstance(Effects.REGENERATION, 1000, 1), 1.0f)
                        .effect(new EffectInstance(Effects.ABSORPTION, 1000, 1), 0.5f)
                        .setAlwaysEdible()
                .build())
        );
    }
}
