package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.registry.ModItems;
import net.minecraft.data.DataGenerator;

import static com.example.createlectrified.setup.ModSetup.TAB_NAME;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(DataGenerator generator, String locale) {
        super(generator, CreateElectrified.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "CreateElectrified");
        add(ModItems.ALUMINIUM_INGOT.get(), "Aluminium Ingot");
        add(ModItems.ALUMINIUM_NUGGET.get(), "Aluminium Nugget");
    }
}







