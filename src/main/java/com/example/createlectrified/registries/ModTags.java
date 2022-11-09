package com.example.createlectrified.registries;

import com.example.createlectrified.CreateElectrified;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.createlectrified.CreateElectrified.MODID;

public class ModTags {

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    }
    // Block Tags
    public static final TagKey<Block> ELECTRUM_ORE_BLOCK = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(CreateElectrified.MODID, "electrum_ore_block"));

    // Item Tags
    public static final TagKey<Item> ELECTRUM_ORE_ITEM = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CreateElectrified.MODID, "electrum_ore_item"));
}
