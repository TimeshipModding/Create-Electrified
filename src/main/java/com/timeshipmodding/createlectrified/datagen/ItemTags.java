package com.timeshipmodding.createlectrified.datagen;

import com.timeshipmodding.createlectrified.CreateElectrified;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.timeshipmodding.createlectrified.registries.ModBlockItems.*;
import static com.timeshipmodding.createlectrified.registries.ModTags.*;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, CreateElectrified.MODID, helper);
    }

    @Override
    protected void addTags() {
        // Create: Electrified Tags
        tag(ELECTRUM_ORE_ITEM)
                .add(ELECTRUM_ORE_BLOCKITEM.get())
                .add(DEEPSLATE_ELECTRUM_ORE_BLOCKITEM.get());

        tag(BAUXITE_ORE_ITEM)
                .add(BAUXITE_ORE_BLOCKITEM.get())
                .add(DEEPSLATE_BAUXITE_ORE_BLOCKITEM.get());

    }

    @Override
    public String getName() {
        return "Create: Electrified Tags";
    }
}