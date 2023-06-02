package com.timeshipmodding.createlectrified.datagen;

import com.timeshipmodding.createlectrified.CreateElectrified;
import net.minecraft.data.DataGenerator;

import static com.timeshipmodding.createlectrified.registries.ModBlocks.*;
import static com.timeshipmodding.createlectrified.registries.ModItems.*;
import static com.timeshipmodding.createlectrified.registries.ModCasingBlocks.*;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(DataGenerator gen, String locale) {
        super(gen, CreateElectrified.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        // CreativeModeTab Translations
        add("itemGroup.electrifiedtab1", "Create: Electrified");

        // Item Translations
        add(ALUMINIUM_INGOT.get(), "Aluminium Ingot");
        add(ALUMINIUM_NUGGET.get(), "Aluminium Nugget");
        add(ELECTRUM.get(),"Electrum");
        add(RAW_ALUMINIUM.get(), "Raw Aluminium");
        add(CRUSHED_BAUXITE_ORE.get(), "Crushed Bauxite Ore");
        add(ALUMINIUM_SHEET.get(), "Aluminium Sheet");
        add(COPPER_WIRE.get(), "Copper Wire");
        add(BRASS_WIRE.get(), "Brass Wire");
        add(CABLE_INSULATION.get(), "Cable Insulation");
        add(CHARGED_ELECTRUM.get(), "Charged Electrum");
        add(ELECTRIC_MECHANISM.get(), "Electric Mechanism");

        // Bucket Item Translations
        add(MOLTEN_COPPER_BUCKET.get(), "Bucket of Molten Copper");
        add(MOLTEN_BRASS_BUCKET.get(), "Bucket of Molten Brass");

        // Unseen Item and Block Translations
        add(INCOMPLETE_COPPER_CABLE.get(), "Incomplete Copper Cable");
        add(INCOMPLETE_ELECTRIC_MECHANISM.get(), "Incomplete Electric Mechanism");

        // Block Translations
        add(ELECTRUM_ORE.get(),"Electrum Ore");
        add(DEEPSLATE_ELECTRUM_ORE.get(),"Deepslate Electrum Ore");
        add(BAUXITE_ORE.get(), "Bauxite Ore");
        add(DEEPSLATE_BAUXITE_ORE.get(), "Deepslate Bauxite Ore");

        add(RAW_ALUMINIUM_BLOCK.get(), "Block of Raw Aluminium");
        add(ALUMINIUM_BLOCK.get(), "Block of Aluminium");
        add(ELECTRUM_BLOCK.get(), "Block of Electrum");

        // Model Block Translations
        add(COPPER_CABLE.get(), "Copper Cable");
        add(CASTING_TABLE.get(), "Casting Table");

        // Casing Block Translations
        add(ALUMINIUM_CASING.get(), "Aluminium Casing");
    }
}







