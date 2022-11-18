package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.registries.ModBlocks;
import com.example.createlectrified.registries.ModItems;
import net.minecraft.data.DataGenerator;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(DataGenerator gen, String locale) {
        super(gen, CreateElectrified.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        // CreativeModeTab Translations
        add("itemGroup.electrifiedtab1", "Create: Electrified");

        // Item Translations
        add(ModItems.ALUMINIUM_INGOT.get(), "Aluminium Ingot");
        add(ModItems.ALUMINIUM_NUGGET.get(), "Aluminium Nugget");
        add(ModItems.ELECTRUM.get(),"Electrum");
        add(ModItems.RAW_ALUMINIUM.get(), "Raw Aluminium");
        add(ModItems.CRUSHED_BAUXITE_ORE.get(), "Crushed Bauxite Ore");
        add(ModItems.ALUMINIUM_SHEET.get(), "Aluminium Sheet");

        // Block Translations
        add(ModBlocks.ELECTRUM_ORE.get(),"Electrum Ore");
        add(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get(),"Deepslate Electrum Ore");
        add(ModBlocks.BAUXITE_ORE.get(), "Bauxite Ore");
        add(ModBlocks.DEEPSLATE_BAUXITE_ORE.get(), "Deepslate Bauxite Ore");

        add(ModBlocks.RAW_ALUMINIUM_BLOCK.get(), "Block of Raw Aluminium");
        add(ModBlocks.ALUMINIUM_BLOCK.get(), "Block of Aluminium");
        add(ModBlocks.ELECTRUM_BLOCK.get(), "Block of Electrum");
    }
}







