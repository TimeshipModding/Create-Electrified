package com.example.createlectrified.registries;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.createlectrified.CreateElectrified.MODID;

public class ModBlocks {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
    }

    public static final RegistryObject<Block> ELECTRUM_ORE = BLOCKS.register("electrum_ore", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Block> DEEPSLATE_ELECTRUM_ORE = BLOCKS.register("deepslate_electrum_ore_", () -> new Block(BlockBehaviour.Properties.of(Material.S))

}

