package com.koaxy.epicmod.koaxymod.util;

import com.koaxy.epicmod.koaxymod.Koaxymod;
import com.koaxy.epicmod.koaxymod.blocks.BlockItemBase;
import com.koaxy.epicmod.koaxymod.blocks.RubyBlock;
import com.koaxy.epicmod.koaxymod.fooditems.CrayonNormal;
import com.koaxy.epicmod.koaxymod.fooditems.Muffin;
import com.koaxy.epicmod.koaxymod.items.ItemBase;
import com.koaxy.epicmod.koaxymod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistryHandler {


    // Below is the way to register my custom items.
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Koaxymod.MOD_ID);


    // Below is my way to register the custom block's we can add into the game!
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Koaxymod.MOD_ID);//DeferredRegister.create(ForgeRegistries.ITEMS, Koaxymod.MOD_ID);

    // Tools

    //public static final DeferredRegister<>

    private static final Logger Logga = LogManager.getLogger();


    //  LOGGER.info("Hello world from the MDK");
    public static void init()
    {
        //System.console().printf("Initilisation: Is being done\n");
        //Logga.info("Init: Initilising...");
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //System.console().printf("Initilisation: Finished!\n");
        //Logga.info("Init: Finished Successfully!");
    }

    //public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Koaxymod.MOD_ID);
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    //public static final RegistryObject<Item> CRAYON = ITEMS.register("crayon", ItemBase::new);
    public static final RegistryObject<CrayonNormal> CRAYON = ITEMS.register("crayon", CrayonNormal::new);
    public static final RegistryObject<Muffin> Muffin_ = ITEMS.register("muffin_koax", Muffin::new);

    // ^ Above is  Food Item's.

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);

    // Below this comment is Blocks, that we CAN register.
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));

    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 20, 0.0f, new Item.Properties().group(Koaxymod.TAB)));


}
