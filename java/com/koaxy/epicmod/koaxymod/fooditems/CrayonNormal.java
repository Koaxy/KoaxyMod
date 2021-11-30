package com.koaxy.epicmod.koaxymod.fooditems;

import com.koaxy.epicmod.koaxymod.Koaxymod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CrayonNormal extends Item {


    public CrayonNormal() {
        super(new Item.Properties()
                .group(Koaxymod.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.9f)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 300, 1), 1.0f)
                        .effect(new EffectInstance(Effects.HUNGER, 300, 1), 0.5f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
