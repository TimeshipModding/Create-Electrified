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
        // Items
        tag(Tags.Items.INGOTS)
                .add(ModItems.ALUMINIUM_INGOT.get());
        tag(Tags.Items.NUGGETS)
                .add(ModItems.ALUMINIUM_INGOT.get());
        tag(Tags.Items.GEMS)
                .add(ModItems.ELECTRUM.get());
        tag(Tags.Items.RAW_MATERIALS)
                .add(ModItems.RAW_ALUMINIUM.get());

        // BlockItems
        tag(Tags.Items.ORES)
                .add(ModItems.ELECTRUM_ORE_BLOCKITEM.get())
                .add(ModItems.DEEPSLATE_ELECTRUM_ORE_BLOCKITEM.get());
        tag(ModTags.ELECTRUM_ORE_ITEM)
                .add(ModItems.ELECTRUM_ORE_BLOCKITEM.get())
                .add(ModItems.DEEPSLATE_ELECTRUM_ORE_BLOCKITEM.get());

    }

    @Override
    public String getName() {
        return "Create: Electrified Tags";
    }
}