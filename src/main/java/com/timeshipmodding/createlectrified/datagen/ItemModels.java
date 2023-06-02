package com.timeshipmodding.createlectrified.datagen;

import com.timeshipmodding.createlectrified.CreateElectrified;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.timeshipmodding.createlectrified.registries.ModItems.*;
import static com.timeshipmodding.createlectrified.registries.ModBlocks.*;
import static com.timeshipmodding.createlectrified.registries.ModCasingBlocks.*;

public class ItemModels extends ItemModelProvider {

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CreateElectrified.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        // Items
        singleTexture(ALUMINIUM_NUGGET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_nugget"));
        singleTexture(ALUMINIUM_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_ingot"));
        singleTexture(ELECTRUM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/electrum"));
        singleTexture(RAW_ALUMINIUM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_aluminium"));
        singleTexture(CRUSHED_BAUXITE_ORE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/crushed_bauxite_ore"));
        singleTexture(ALUMINIUM_SHEET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/aluminium_sheet"));
        singleTexture(BRASS_WIRE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/brass_wire"));
        singleTexture(COPPER_WIRE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/copper_wire"));
        singleTexture(CABLE_INSULATION.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/cable_insulation"));
        singleTexture(CHARGED_ELECTRUM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/charged_electrum"));
        singleTexture(ELECTRIC_MECHANISM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/electric_mechanism"));

        // Bucket Items
        singleTexture(MOLTEN_COPPER_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/molten_copper_bucket"));
        singleTexture(MOLTEN_BRASS_BUCKET.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/molten_brass_bucket"));

        // Unseen Items
        singleTexture(INCOMPLETE_COPPER_CABLE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/incomplete_copper_cable"));
        singleTexture(INCOMPLETE_ELECTRIC_MECHANISM.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/incomplete_electric_mechanism"));


        // Blocks
        withExistingParent(ELECTRUM_ORE.getId().getPath(), modLoc("block/electrum_ore"));
        withExistingParent(DEEPSLATE_ELECTRUM_ORE.getId().getPath(), modLoc("block/deepslate_electrum_ore"));
        withExistingParent(BAUXITE_ORE.getId().getPath(), modLoc("block/bauxite_ore"));
        withExistingParent(DEEPSLATE_BAUXITE_ORE.getId().getPath(), modLoc("block/deepslate_bauxite_ore"));

        withExistingParent(RAW_ALUMINIUM_BLOCK.getId().getPath(), modLoc("block/raw_aluminium_block"));
        withExistingParent(ALUMINIUM_BLOCK.getId().getPath(), modLoc("block/aluminium_block"));
        withExistingParent(ELECTRUM_BLOCK.getId().getPath(), modLoc("block/electrum_block"));

        // SpriteShift Blocks
        withExistingParent(ALUMINIUM_CASING.getId().getPath(), modLoc("block/aluminium_casing"));

        // Model Blocks
        withExistingParent(COPPER_CABLE.getId().getPath(), modLoc("block/copper_cable"));
        withExistingParent(CASTING_TABLE.getId().getPath(), modLoc("block/casting_table"));
    }
}
