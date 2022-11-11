package com.example.createlectrified.setup;

import com.example.createlectrified.registries.ModBlocks;
import com.example.createlectrified.registries.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {

    public static final CreativeModeTab ELECTRIFIED_TAB_1 = new CreativeModeTab("electrifiedtab1") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ELECTRUM.get());
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> pItems) {
            pItems.add(new ItemStack(ModItems.ELECTRUM.get()));
            pItems.add(new ItemStack(ModItems.RAW_ALUMINIUM.get()));
            pItems.add(new ItemStack(ModItems.ALUMINIUM_INGOT.get()));
            pItems.add(new ItemStack(ModItems.ALUMINIUM_NUGGET.get()));
            pItems.add(new ItemStack(ModBlocks.ELECTRUM_ORE.get()));
            pItems.add(new ItemStack(ModBlocks.DEEPSLATE_ELECTRUM_ORE.get()));
            pItems.add(new ItemStack(ModBlocks.RAW_ALUMINIUM_BLOCK.get()));
        }
    };
}
