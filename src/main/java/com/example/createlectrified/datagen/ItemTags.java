package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.registries.ModItems;
import com.example.createlectrified.registries.ModTags;
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
        // Create: Electrified Tags
        tag(ModTags.ELECTRUM_ORE_ITEM)
                .add(ModItems.ELECTRUM_ORE_BLOCKITEM.get())
                .add(ModItems.DEEPSLATE_ELECTRUM_ORE_BLOCKITEM.get());

        tag(ModTags.BAUXITE_ORE_ITEM)
                .add(ModItems.BAUXITE_ORE_BLOCKITEM.get())
                .add(ModItems.DEEPSLATE_BAUXITE_ORE_BLOCKITEM.get());

    }

    @Override
    public String getName() {
        return "Create: Electrified Tags";
    }
}