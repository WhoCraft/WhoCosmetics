package com.whocraft.whocosmetics.common;

import com.whocraft.whocosmetics.WhoCosmetics;
import com.whocraft.whocosmetics.common.blocks.GramophoneBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class WCBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, WhoCosmetics.MODID);


    public static final RegistryObject<Block> GRAMOPHONE = BLOCKS.register("gramophone", GramophoneBlock::new);

}