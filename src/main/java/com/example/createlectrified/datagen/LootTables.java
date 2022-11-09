package com.example.createlectrified.datagen;

import com.example.createlectrified.providers.BaseLootTableProvider;
import com.example.createlectrified.registries.ModBlocks;
import com.example.createlectrified.registries.ModItems;
import net.minecraft.data.DataGenerator;

public class LootTables extends BaseLootTableProvider {
    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }
    protected void addTables() {
        // Ore LootTables
        lootTables.put(ModBlocks.ELECTRUM_ORE.get(), createSilkTouchTable("electrum_ore", ModBlocks.ELECTRUM_ORE.get(), ModItems.ELECTRUM.get(), 1, 3));
        lootTables.put(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get(), createSilkTouchTable("mysterious_ore_nether", ModBlocks.DEEPSLATE_ELECTRUM_ORE.get(), ModItems.ELECTRUM.get(), 1, 3));
    }
}
