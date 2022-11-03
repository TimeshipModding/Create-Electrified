package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTags extends BlockTagsProvider {

    public BlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, CreateElectrified.MODID, helper);
    }

    @Override
    protected void addTags() {
    }

    @Override
    public String getName() {
        return "Create: Electrified Tags";
    }
}
