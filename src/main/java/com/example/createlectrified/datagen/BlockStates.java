package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.registries.ModBlocks;
import com.example.createlectrified.registries.ModCasingBlocks;
import com.simibubi.create.AllTags;
import com.simibubi.create.content.contraptions.base.CasingBlock;
import com.simibubi.create.foundation.block.connected.ConnectedTextureBehaviour;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.checkerframework.checker.units.qual.C;

import java.util.function.Supplier;

import static com.simibubi.create.foundation.data.CreateRegistrate.connectedTextures;

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
