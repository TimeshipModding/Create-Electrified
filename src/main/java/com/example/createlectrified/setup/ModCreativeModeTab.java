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
            super.fillItemList(pItems);
        }
        ModBlocks.ELECTRUM_ORE.get();
            ModBlocks.DEEPSLATE_ELECTRUM_ORE.get();
            ModItems.RAW_ALUMINIUM.get();
            ModItems.ELECTRUM.get();
            ModItems.ALUMINIUM_NUGGET.get();
            ModItems.ALUMINIUM_INGOT.get();



    };
}
