package com.timeshipmodding.createlectrified.datagen;

import com.timeshipmodding.createlectrified.CreateElectrified;
import com.timeshipmodding.createlectrified.content.block.CastingTableBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.timeshipmodding.createlectrified.registries.ModCasingBlocks.*;
import static com.timeshipmodding.createlectrified.registries.ModBlocks.*;
import static com.timeshipmodding.createlectrified.registries.ModTags.*;

public class BlockTags extends BlockTagsProvider {

    public BlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, CreateElectrified.MODID, helper);
    }

    @Override
    protected void addTags() {

        // Minecraft Tags
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ELECTRUM_ORE.get())
                .add(DEEPSLATE_ELECTRUM_ORE.get())
                .add(BAUXITE_ORE.get())
                .add(DEEPSLATE_BAUXITE_ORE.get())
                .add(RAW_ALUMINIUM_BLOCK.get())
                .add(ALUMINIUM_BLOCK.get())
                .add(ELECTRUM_BLOCK.get())
                .add(CASTING_TABLE.get())
                .add(ALUMINIUM_CASING.get());

        tag(net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL)
                .add(ELECTRUM_ORE.get())
                .add(DEEPSLATE_ELECTRUM_ORE.get())
                .add(BAUXITE_ORE.get())
                .add(DEEPSLATE_BAUXITE_ORE.get())
                .add(RAW_ALUMINIUM_BLOCK.get())
                .add(ALUMINIUM_BLOCK.get())
                .add(CASTING_TABLE.get())
                .add(ELECTRUM_BLOCK.get());

        // Create: Electrified Tags
        tag(ELECTRUM_ORE_BLOCK)
                .add(ELECTRUM_ORE.get())
                .add(DEEPSLATE_ELECTRUM_ORE.get());

        tag(BAUXITE_ORE_BLOCK)
                .add(BAUXITE_ORE.get())
                .add(DEEPSLATE_BAUXITE_ORE.get());
    }

    @Override
    public String getName() {
        return "Create: Electrified Tags";
    }
}
