package com.example.createlectrified.datagen.LanguageProviders;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.registries.ModItems;
import net.minecraft.data.DataGenerator;

public class Items extends net.minecraftforge.common.data.LanguageProvider {
    public Items(DataGenerator generator, String locale) {
        super(generator, CreateElectrified.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add(ModItems.ALUMINIUM_INGOT.get(), "Aluminium Ingot");
        add(ModItems.ALUMINIUM_NUGGET.get(), "Aluminium Nugget");
    }
}







