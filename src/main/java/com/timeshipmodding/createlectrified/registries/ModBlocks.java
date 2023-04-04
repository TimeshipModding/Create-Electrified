package com.timeshipmodding.createlectrified.registries;

<<<<<<< HEAD
=======
import com.timeshipmodding.createlectrified.CreateElectrified;
import com.timeshipmodding.createlectrified.content.block.CopperCableBlock;
import com.timeshipmodding.createlectrified.content.block.RodBlock;
>>>>>>> 1.19.2-v0.2
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

<<<<<<< HEAD
import static com.timeshipmodding.createlectrified.CreateElectrified.MODID;

=======
>>>>>>> 1.19.2-v0.2
public class ModBlocks {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateElectrified.MODID);

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

    public static final RegistryObject<Block> COPPER_CABLE
            = BLOCKS.register("copper_cable", () -> new CopperCableBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> COPPER_ROD
            = BLOCKS.register("copper_rod", () -> new RodBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
}

