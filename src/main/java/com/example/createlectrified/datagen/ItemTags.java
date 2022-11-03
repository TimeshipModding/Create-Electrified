package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.registry.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, CreateElectrified.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.INGOTS)
                .add(ModItems.ALUMINIUM_INGOT.get());
        tag(Tags.Items.NUGGETS)
                .add(ModItems.ALUMINIUM_INGOT.get());
    }

    @Override
    public String getName() {
        return "Create: Electrified Tags";
    }
}