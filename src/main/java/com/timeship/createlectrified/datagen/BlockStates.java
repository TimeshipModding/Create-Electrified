package com.timeship.createlectrified.datagen;

import com.timeship.createlectrified.CreateElectrified;
import com.timeship.createlectrified.registries.ModBlocks;
import com.timeship.createlectrified.registries.ModCasingBlocks;
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

        // SpriteShift Blocks
        simpleBlock(ModCasingBlocks.ALUMINIUM_CASING.get());
    }
}
