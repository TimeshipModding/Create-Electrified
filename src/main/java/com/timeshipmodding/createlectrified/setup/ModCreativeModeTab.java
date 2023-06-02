package com.timeshipmodding.createlectrified.setup;

import com.timeshipmodding.createlectrified.registries.ModBlocks;
import com.timeshipmodding.createlectrified.registries.ModCasingBlocks;
import com.timeshipmodding.createlectrified.registries.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab ELECTRIFIED_TAB_1 = new CreativeModeTab("electrifiedtab1") {
        @Override
        public ItemStack makeIcon() {
            // CreativeModeTab Icon
            return new ItemStack(ModItems.CHARGED_ELECTRUM.get());
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> pItems) {
            // CreativeModeTab Organization
            pItems.add(new ItemStack(ModBlocks.COPPER_CABLE.get()));
            pItems.add(new ItemStack(ModBlocks.CASTING_TABLE.get()));
            pItems.add(new ItemStack(ModCasingBlocks.ALUMINIUM_CASING.get()));
            pItems.add(new ItemStack(ModBlocks.ALUMINIUM_BLOCK.get()));
            pItems.add(new ItemStack(ModBlocks.ELECTRUM_BLOCK.get()));
            pItems.add(new ItemStack(ModBlocks.BAUXITE_ORE.get()));
            pItems.add(new ItemStack(ModBlocks.DEEPSLATE_BAUXITE_ORE.get()));
            pItems.add(new ItemStack(ModBlocks.ELECTRUM_ORE.get()));
            pItems.add(new ItemStack(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get()));
            pItems.add(new ItemStack(ModBlocks.RAW_ALUMINIUM_BLOCK.get()));
            pItems.add(new ItemStack(ModItems.RAW_ALUMINIUM.get()));
            pItems.add(new ItemStack(ModItems.ELECTRUM.get()));
            pItems.add(new ItemStack(ModItems.CRUSHED_BAUXITE_ORE.get()));
            pItems.add(new ItemStack(ModItems.ALUMINIUM_NUGGET.get()));
            pItems.add(new ItemStack(ModItems.ALUMINIUM_INGOT.get()));
            pItems.add(new ItemStack(ModItems.ALUMINIUM_SHEET.get()));
            pItems.add(new ItemStack(ModItems.COPPER_WIRE.get()));
            pItems.add(new ItemStack(ModItems.BRASS_WIRE.get()));
            pItems.add(new ItemStack(ModItems.ELECTRIC_MECHANISM.get()));
            pItems.add(new ItemStack(ModItems.CHARGED_ELECTRUM.get()));
            pItems.add(new ItemStack(ModItems.CABLE_INSULATION.get()));
            pItems.add(new ItemStack(ModItems.MOLTEN_COPPER_BUCKET.get()));
            pItems.add(new ItemStack(ModItems.MOLTEN_BRASS_BUCKET.get()));
        }
    };
}
