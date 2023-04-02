package com.timeshipmodding.createlectrified.registries;

import com.timeshipmodding.createlectrified.CreateElectrified;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ModTags {

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    }
    // Block Tags
    public static final TagKey<Block> ELECTRUM_ORE_BLOCK = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(CreateElectrified.MODID, "electrum_ore_block"));
    public static final TagKey<Block> BAUXITE_ORE_BLOCK = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(CreateElectrified.MODID, "bauxite_ore_block"));

    // Item Tags
    public static final TagKey<Item> ELECTRUM_ORE_ITEM = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CreateElectrified.MODID, "electrum_ore_item"));
    public static final TagKey<Item> BAUXITE_ORE_ITEM = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CreateElectrified.MODID, "bauxite_ore_block"));
}
