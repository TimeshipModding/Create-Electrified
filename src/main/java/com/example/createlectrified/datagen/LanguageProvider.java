package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import net.minecraft.data.DataGenerator;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public LanguageProvider(DataGenerator generator, String locale) {
        super(generator, CreateElectrified.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add(Registration.RAW_MYSTERIOUS_CHUNK.get(), "Mysterious Raw Chunk");
    }
}







