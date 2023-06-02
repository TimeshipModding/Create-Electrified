package com.timeshipmodding.createlectrified.datagen;

import com.timeshipmodding.createlectrified.CreateElectrified;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.timeshipmodding.createlectrified.registries.ModBlocks.*;
import static com.timeshipmodding.createlectrified.registries.ModCasingBlocks.*;

public class BlockStates extends BlockStateProvider {
    public BlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, CreateElectrified.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Ore Simple Blocks
        simpleBlock(ELECTRUM_ORE.get());
        simpleBlock(DEEPSLATE_ELECTRUM_ORE.get());
        simpleBlock(BAUXITE_ORE.get());
        simpleBlock(DEEPSLATE_BAUXITE_ORE.get());

        // Simple Blocks
        simpleBlock(RAW_ALUMINIUM_BLOCK.get());
        simpleBlock(ALUMINIUM_BLOCK.get());
        simpleBlock(ELECTRUM_BLOCK.get());

        // SpriteShift Blocks
        simpleBlock(ALUMINIUM_CASING.get());
    }
}
