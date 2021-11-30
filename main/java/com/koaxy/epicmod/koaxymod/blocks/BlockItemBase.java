package com.koaxy.epicmod.koaxymod.blocks;

import com.koaxy.epicmod.koaxymod.Koaxymod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(Koaxymod.TAB));
    }
}
