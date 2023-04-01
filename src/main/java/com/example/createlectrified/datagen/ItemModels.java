package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.registries.ModBlocks;
import com.example.createlectrified.registries.ModCasingBlocks;
import com.example.createlectrified.registries.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CreateElectrified.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        // Items
        singleTexture(ModItems.ALUMINIUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_nugget"));
        singleTexture(ModItems.ALUMINIUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_ingot"));
        singleTexture(ModItems.ELECTRUM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/electrum"));
        singleTexture(ModItems.RAW_ALUMINIUM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_aluminium"));
        singleTexture(ModItems.CRUSHED_BAUXITE_ORE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/crushed_bauxite_ore"));
        singleTexture(ModItems.ALUMINIUM_SHEET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_sheet"));
        singleTexture(ModItems.BRASS_WIRE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/brass_wire"));
        singleTexture(ModItems.COPPER_WIRE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_wire"));
        singleTexture(ModItems.CABLE_INSULATION.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/cable_insulation"));
        singleTexture(ModItems.CHARGED_ELECTRUM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/charged_electrum"));
        singleTexture(ModItems.ELECTRIC_MECHANISM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/electric_mechanism"));

        // Unseen Items
        singleTexture(ModItems.INCOMPLETE_COPPER_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/incomplete_copper_cable"));
        singleTexture(ModItems.INCOMPLETE_ELECTRIC_MECHANISM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/incomplete_electric_mechanism"));


        // Blocks
        withExistingParent(ModBlocks.ELECTRUM_ORE.getId().getPath(), modLoc("block/electrum_ore"));
        withExistingParent(ModBlocks.DEEPSLATE_ELECTRUM_ORE.getId().getPath(), modLoc("block/deepslate_electrum_ore"));
        withExistingParent(ModBlocks.BAUXITE_ORE.getId().getPath(), modLoc("block/bauxite_ore"));
        withExistingParent(ModBlocks.DEEPSLATE_BAUXITE_ORE.getId().getPath(), modLoc("block/deepslate_bauxite_ore"));

        withExistingParent(ModBlocks.RAW_ALUMINIUM_BLOCK.getId().getPath(), modLoc("block/raw_aluminium_block"));
        withExistingParent(ModBlocks.ALUMINIUM_BLOCK.getId().getPath(), modLoc("block/aluminium_block"));
        withExistingParent(ModBlocks.ELECTRUM_BLOCK.getId().getPath(), modLoc("block/electrum_block"));

        withExistingParent(ModCasingBlocks.ALUMINIUM_CASING.getId().getPath(), modLoc("block/aluminium_casing"));

        withExistingParent(ModBlocks.COPPER_CABLE.getId().getPath(), modLoc("block/copper_cable"));
    }
}
