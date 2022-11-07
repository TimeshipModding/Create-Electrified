package com.example.createlectrified.datagen.ItemModels;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.registries.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CreateElectrified.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        singleTexture(ModItems.ALUMINIUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_nugget"));
        singleTexture(ModItems.ALUMINIUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_ingot"));
    }
}