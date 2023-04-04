package com.timeshipmodding.createlectrified.datagen;

import com.timeshipmodding.createlectrified.providers.BaseLootTableProvider;
import com.timeshipmodding.createlectrified.registries.ModBlocks;
<<<<<<< HEAD
import com.timeshipmodding.createlectrified.registries.ModCasingBlocks;
=======
>>>>>>> 1.19.2-v0.2
import com.timeshipmodding.createlectrified.registries.ModItems;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider {
    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }
    protected void addTables() {
        // Ore LootTables
        lootTables.put(ModBlocks.ELECTRUM_ORE.get(), createSilkTouchTable("electrum_ore", ModBlocks.ELECTRUM_ORE.get(), ModItems.ELECTRUM.get(), 1, 2));
        lootTables.put(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get(), createSilkTouchTable("deepslate_electrum_ore", ModBlocks.DEEPSLATE_ELECTRUM_ORE.get(), ModItems.ELECTRUM.get(), 1, 2));
        lootTables.put(ModBlocks.BAUXITE_ORE.get(), createSilkTouchTable("bauxite_ore", ModBlocks.BAUXITE_ORE.get(), ModItems.RAW_ALUMINIUM.get(), 1, 1));
        lootTables.put(ModBlocks.DEEPSLATE_BAUXITE_ORE.get(), createSilkTouchTable("deepslate_bauxite_ore", ModBlocks.DEEPSLATE_BAUXITE_ORE.get(), ModItems.RAW_ALUMINIUM.get(), 1,1));

        // Simple Tables
        lootTables.put(ModBlocks.RAW_ALUMINIUM_BLOCK.get(), createSimpleTable("raw_aluminium_block", ModBlocks.RAW_ALUMINIUM_BLOCK.get()));
        lootTables.put(ModBlocks.ALUMINIUM_BLOCK.get(), createSimpleTable("aluminium_block", ModBlocks.ALUMINIUM_BLOCK.get()));
        lootTables.put(ModBlocks.ELECTRUM_BLOCK.get(), createSimpleTable("electrum_block", ModBlocks.ELECTRUM_BLOCK.get()));
<<<<<<< HEAD
        lootTables.put(ModCasingBlocks.ALUMINIUM_CASING.get(), createSimpleTable("aluminium_casing", ModCasingBlocks.ALUMINIUM_CASING.get()));
=======
        lootTables.put(ModBlocks.COPPER_CABLE.get(), createSimpleTable("copper_cable", ModBlocks.COPPER_CABLE.get()));
        lootTables.put(ModBlocks.COPPER_ROD.get(), createSimpleTable("copper_rod", ModBlocks.COPPER_ROD.get()));
>>>>>>> 1.19.2-v0.2
    }
}
