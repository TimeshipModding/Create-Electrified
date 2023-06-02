package com.timeshipmodding.createlectrified.registries;

import com.timeshipmodding.createlectrified.CreateElectrified;
import com.timeshipmodding.createlectrified.setup.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.timeshipmodding.createlectrified.registries.ModBlocks.*;

public class ModBlockItems {
    private static final DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateElectrified.MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKITEMS.register(bus);
    }
    public static final Item.Properties BLOCKITEM_PROPERTIES = new Item.Properties().tab(ModCreativeModeTab.ELECTRIFIED_TAB_1);

    // BlockItems
    public static final RegistryObject<Item> RAW_ALUMINIUM_BLOCKITEM = fromBlock(RAW_ALUMINIUM_BLOCK);
    public static final RegistryObject<Item> ALUMINIUM_BLOCKITEM = fromBlock(ALUMINIUM_BLOCK);
    public static final RegistryObject<Item> ELECTRUM_BLOCKITEM = fromBlock(ELECTRUM_BLOCK);

    // Ore BlockItems
    public static final RegistryObject<Item> ELECTRUM_ORE_BLOCKITEM = fromBlock(ELECTRUM_ORE);
    public static final RegistryObject<Item> DEEPSLATE_ELECTRUM_ORE_BLOCKITEM = fromBlock(DEEPSLATE_ELECTRUM_ORE);
    public static final RegistryObject<Item> BAUXITE_ORE_BLOCKITEM = fromBlock(BAUXITE_ORE);
    public static final RegistryObject<Item> DEEPSLATE_BAUXITE_ORE_BLOCKITEM = fromBlock(DEEPSLATE_BAUXITE_ORE);

    // Model BlockItems
    public static final RegistryObject<Item> COPPER_CABLE_BLOCKITEM = fromBlock(COPPER_CABLE);
    public static final RegistryObject<Item> CASTING_TABLE_BLOCKITEM = fromBlock(CASTING_TABLE);

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return BLOCKITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), BLOCKITEM_PROPERTIES));
    }
}
