package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
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
    }
}






