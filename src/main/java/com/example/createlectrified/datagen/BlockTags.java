package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.registries.ModBlocks;
import com.example.createlectrified.registries.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTags extends BlockTagsProvider {

    public BlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, CreateElectrified.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ELECTRUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get());
        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ELECTRUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get());
        tag(Tags.Blocks.ORES)
                .add(ModBlocks.ELECTRUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get());

        tag(ModTags.ELECTRUM_ORE_BLOCK)
                .add(ModBlocks.ELECTRUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get());
    }

    @Override
    public String getName() {
        return "Create: Electrified Tags";
    }
}
