package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {
    public BlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, CreateElectrified.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
    }
}
