package com.example.createlectrified.registries;

import com.example.createlectrified.CreateElectrified;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import com.example.createlectrified.setup.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.createlectrified.CreateElectrified.MODID;

public class ModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModCreativeModeTab.ELECTRIFIED_TAB_1);

    // Items
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ELECTRUM = ITEMS.register("electrum", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> CRUSHED_BAUXITE_ORE = ITEMS.register("crushed_bauxite_ore", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ALUMINIUM_SHEET = ITEMS.register("aluminium_sheet", () -> new Item(ITEM_PROPERTIES));

    // Ore BlockItems
    public static final RegistryObject<Item> ELECTRUM_ORE_BLOCKITEM = fromBlock(ModBlocks.ELECTRUM_ORE);
    public static final RegistryObject<Item> DEEPSLATE_ELECTRUM_ORE_BLOCKITEM = fromBlock(ModBlocks.DEEPSLATE_ELECTRUM_ORE);
    public static final RegistryObject<Item> BAUXITE_ORE_BLOCKITEM = fromBlock(ModBlocks.BAUXITE_ORE);
    public static final RegistryObject<Item> DEEPSLATE_BAUXITE_ORE_BLOCKITEM = fromBlock(ModBlocks.DEEPSLATE_BAUXITE_ORE);

    // BlockItems
    public static final RegistryObject<Item> RAW_ALUMINIUM_BLOCK_ITEM = fromBlock(ModBlocks.RAW_ALUMINIUM_BLOCK);
    public static final RegistryObject<Item> ALUMINIUM_BLOCK_ITEM = fromBlock(ModBlocks.ALUMINIUM_BLOCK);
    public static final RegistryObject<Item> ELECTRUM_BLOCK_ITEM = fromBlock(ModBlocks.ELECTRUM_BLOCK);

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }

}

