package com.example.createlectrified.registries;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.setup.ModCreativeModeTab;
import com.simibubi.create.AllSpriteShifts;
import com.simibubi.create.content.contraptions.base.CasingBlock;
import com.simibubi.create.foundation.block.connected.SimpleCTBehaviour;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
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

    public static final RegistryObject<Block> ELECTRUM_ORE
            = BLOCKS.register("electrum_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(1, 3)));
    public static final RegistryObject<Block> DEEPSLATE_ELECTRUM_ORE
            = BLOCKS.register("deepslate_electrum_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(ModBlocks.ELECTRUM_ORE.get()).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(1, 3)));
    public static final RegistryObject<Block> RAW_ALUMINIUM_BLOCK
            = BLOCKS.register("raw_aluminium_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> ALUMINIUM_BLOCK
            = BLOCKS.register("aluminium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> ELECTRUM_BLOCK
            = BLOCKS.register("electrum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> BAUXITE_ORE
            = BLOCKS.register("bauxite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> DEEPSLATE_BAUXITE_ORE
            = BLOCKS.register("deepslate_bauxite_ore", () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.BAUXITE_ORE.get()).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
}

