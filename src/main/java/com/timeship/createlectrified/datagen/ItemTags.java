package com.timeship.createlectrified.datagen;

import com.timeship.createlectrified.CreateElectrified;
import com.timeship.createlectrified.registries.ModItems;
import com.timeship.createlectrified.registries.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
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