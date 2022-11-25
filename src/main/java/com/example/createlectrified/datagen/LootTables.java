package com.example.createlectrified.datagen;

import com.example.createlectrified.providers.BaseLootTableProvider;
import com.example.createlectrified.registries.ModBlocks;
import com.example.createlectrified.registries.ModCasingBlocks;
import com.example.createlectrified.registries.ModItems;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider {
    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }
    protected void addTables() {
        // Ore LootTables
        lootTables.put(ModBlocks.ELECTRUM_ORE.get(), createSilkTouchTable("electrum_ore", ModBlocks.ELECTRUM_ORE.get(), ModItems.ELECTRUM.get(), 1, 3));
        lootTables.put(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get(), createSilkTouchTable("deepslate_electrum_ore", ModBlocks.DEEPSLATE_ELECTRUM_ORE.get(), ModItems.ELECTRUM.get(), 1, 3));
        lootTables.put(ModBlocks.BAUXITE_ORE.get(), createSilkTouchTable("bauxite_ore", ModBlocks.BAUXITE_ORE.get(), ModItems.RAW_ALUMINIUM.get(), 1, 2));
        lootTables.put(ModBlocks.DEEPSLATE_BAUXITE_ORE.get(), createSilkTouchTable("deepslate_bauxite_ore", ModBlocks.DEEPSLATE_BAUXITE_ORE.get(), ModItems.RAW_ALUMINIUM.get(), 1,2));

        // Simple Tables
        lootTables.put(ModBlocks.RAW_ALUMINIUM_BLOCK.get(), createSimpleTable("raw_aluminium_block", ModBlocks.RAW_ALUMINIUM_BLOCK.get()));
        lootTables.put(ModBlocks.ALUMINIUM_BLOCK.get(), createSimpleTable("aluminium_block", ModBlocks.ALUMINIUM_BLOCK.get()));
        lootTables.put(ModBlocks.ELECTRUM_BLOCK.get(), createSimpleTable("electrum_block", ModBlocks.ELECTRUM_BLOCK.get()));
    }
}
