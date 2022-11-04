package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.registry.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CreateElectrified.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        singleTexture(ModItems.ALUMINIUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_mysterious_chunk"));
        singleTexture(ModItems.ALUMINIUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/mysterious_ingot"));
    }
}
