package com.example.createlectrified.datagen.LanguageProviders;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.registries.ModItems;
import net.minecraft.data.DataGenerator;

public class CreativeModeTab extends net.minecraftforge.common.data.LanguageProvider {
    public CreativeModeTab(DataGenerator generator, String locale) {
        super(generator, CreateElectrified.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.electrifiedtab1", "Create: Electrified");
    }
}
