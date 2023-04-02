package com.timeshipmodding.createlectrified.datagen;

import com.timeshipmodding.createlectrified.CreateElectrified;
import com.timeshipmodding.createlectrified.registries.ModBlocks;
import com.timeshipmodding.createlectrified.registries.ModCasingBlocks;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {
    public BlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, CreateElectrified.MODID, helper);
    }
    private static final CreateRegistrate REGISTRATE = CreateElectrified.registrate();

    @Override
    protected void registerStatesAndModels() {
        // Ore Simple Blocks
        simpleBlock(ModBlocks.ELECTRUM_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get());
        simpleBlock(ModBlocks.BAUXITE_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_BAUXITE_ORE.get());

        // Simple Blocks
        simpleBlock(ModBlocks.RAW_ALUMINIUM_BLOCK.get());
        simpleBlock(ModBlocks.ALUMINIUM_BLOCK.get());
        simpleBlock(ModBlocks.ELECTRUM_BLOCK.get());

        simpleBlock(ModCasingBlocks.ALUMINIUM_CASING.get());
    }
}
