package com.timeship.createlectrified.registries;

import com.timeship.createlectrified.CreateElectrified;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import com.timeship.createlectrified.setup.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateElectrified.MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModCreativeModeTab.ELECTRIFIED_TAB_1);
    public static final Item.Properties UNSEEN_ITEM_PROPERTIES = new Item.Properties();

    // Items
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ELECTRUM = ITEMS.register("electrum", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> CRUSHED_BAUXITE_ORE = ITEMS.register("crushed_bauxite_ore", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ALUMINIUM_SHEET = ITEMS.register("aluminium_sheet", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> BRASS_WIRE = ITEMS.register("brass_wire", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire",() -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> CABLE_INSULATION = ITEMS.register("cable_insulation", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> CHARGED_ELECTRUM = ITEMS.register("charged_electrum", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ELECTRIC_MECHANISM = ITEMS.register("electric_mechanism", () -> new Item(ITEM_PROPERTIES));

    // Unseen Items
    public static final RegistryObject<Item> INCOMPLETE_COPPER_CABLE = ITEMS.register("incomplete_copper_cable", () -> new Item(UNSEEN_ITEM_PROPERTIES));
    public static final RegistryObject<Item> INCOMPLETE_ELECTRIC_MECHANISM = ITEMS.register("incomplete_electric_mechanism", () -> new Item(UNSEEN_ITEM_PROPERTIES));

    // Ore BlockItems
    public static final RegistryObject<Item> ELECTRUM_ORE_BLOCKITEM = fromBlock(ModBlocks.ELECTRUM_ORE);
    public static final RegistryObject<Item> DEEPSLATE_ELECTRUM_ORE_BLOCKITEM = fromBlock(ModBlocks.DEEPSLATE_ELECTRUM_ORE);
    public static final RegistryObject<Item> BAUXITE_ORE_BLOCKITEM = fromBlock(ModBlocks.BAUXITE_ORE);
    public static final RegistryObject<Item> DEEPSLATE_BAUXITE_ORE_BLOCKITEM = fromBlock(ModBlocks.DEEPSLATE_BAUXITE_ORE);

    // BlockItems
    public static final RegistryObject<Item> RAW_ALUMINIUM_BLOCK_ITEM = fromBlock(ModBlocks.RAW_ALUMINIUM_BLOCK);
    public static final RegistryObject<Item> ALUMINIUM_BLOCK_ITEM = fromBlock(ModBlocks.ALUMINIUM_BLOCK);
    public static final RegistryObject<Item> ELECTRUM_BLOCK_ITEM = fromBlock(ModBlocks.ELECTRUM_BLOCK);

    // Model BlockItems
    public static final RegistryObject<Item> COPPER_CABLE_BLOCK_ITEM = fromBlock(ModBlocks.COPPER_CABLE);
    public static final RegistryObject<Item> COPPER_ROD_BLOCK_ITEM = fromBlock(ModBlocks.COPPER_ROD);

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }

}

