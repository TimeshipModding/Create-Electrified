package com.timeshipmodding.createlectrified.datagen;

import com.timeshipmodding.createlectrified.providers.BaseLootTableProvider;
import net.minecraft.data.DataGenerator;

import static com.timeshipmodding.createlectrified.registries.ModCasingBlocks.*;
import static com.timeshipmodding.createlectrified.registries.ModBlocks.*;
import static com.timeshipmodding.createlectrified.registries.ModItems.*;

public class LootTables extends BaseLootTableProvider {
    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }
    protected void addTables() {
        // Simple Tables
        lootTables.put(RAW_ALUMINIUM_BLOCK.get(), createSimpleTable("raw_aluminium_block", RAW_ALUMINIUM_BLOCK.get()));
        lootTables.put(ALUMINIUM_BLOCK.get(), createSimpleTable("aluminium_block", ALUMINIUM_BLOCK.get()));
        lootTables.put(ELECTRUM_BLOCK.get(), createSimpleTable("electrum_block", ELECTRUM_BLOCK.get()));
        lootTables.put(ALUMINIUM_CASING.get(), createSimpleTable("aluminium_casing.json", ALUMINIUM_CASING.get()));
        lootTables.put(COPPER_CABLE.get(), createSimpleTable("copper_cable", COPPER_CABLE.get()));
        lootTables.put(CASTING_TABLE.get(), createSimpleTable("casting_table", CASTING_TABLE.get()));

        // Ore LootTables
        lootTables.put(ELECTRUM_ORE.get(), createSilkTouchTable("electrum_ore", ELECTRUM_ORE.get(), ELECTRUM.get(), 1, 2));
        lootTables.put(DEEPSLATE_ELECTRUM_ORE.get(), createSilkTouchTable("deepslate_electrum_ore", DEEPSLATE_ELECTRUM_ORE.get(), ELECTRUM.get(), 1, 2));
        lootTables.put(BAUXITE_ORE.get(), createSilkTouchTable("bauxite_ore", BAUXITE_ORE.get(), RAW_ALUMINIUM.get(), 1, 1));
        lootTables.put(DEEPSLATE_BAUXITE_ORE.get(), createSilkTouchTable("deepslate_bauxite_ore", DEEPSLATE_BAUXITE_ORE.get(), RAW_ALUMINIUM.get(), 1,1));
    }
}
