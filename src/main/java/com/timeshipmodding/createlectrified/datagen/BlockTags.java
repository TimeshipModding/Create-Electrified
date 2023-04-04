package com.timeshipmodding.createlectrified.datagen;

import com.timeshipmodding.createlectrified.CreateElectrified;
import com.timeshipmodding.createlectrified.registries.ModBlocks;
import com.timeshipmodding.createlectrified.registries.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTags extends BlockTagsProvider {

    public BlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, CreateElectrified.MODID, helper);
    }

    @Override
    protected void addTags() {

        // Minecraft Tags
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ELECTRUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get())
                .add(ModBlocks.BAUXITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_BAUXITE_ORE.get())
                .add(ModBlocks.RAW_ALUMINIUM_BLOCK.get())
                .add(ModBlocks.ALUMINIUM_BLOCK.get())
                .add(ModBlocks.ELECTRUM_BLOCK.get());

        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ELECTRUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get())
                .add(ModBlocks.BAUXITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_BAUXITE_ORE.get())
                .add(ModBlocks.RAW_ALUMINIUM_BLOCK.get())
                .add(ModBlocks.ALUMINIUM_BLOCK.get())
                .add(ModBlocks.ELECTRUM_BLOCK.get());

        // Create: Electrified Tags
        tag(ModTags.ELECTRUM_ORE_BLOCK)
                .add(ModBlocks.ELECTRUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get());

        tag(ModTags.BAUXITE_ORE_BLOCK)
                .add(ModBlocks.BAUXITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_BAUXITE_ORE.get());
    }

    @Override
    public String getName() {
        return "Create: Electrified Tags";
    }
}
