package com.timeshipmodding.createlectrified.datagen;

import com.timeshipmodding.createlectrified.registries.ModBlocks;
import com.timeshipmodding.createlectrified.registries.ModItems;
import com.timeshipmodding.createlectrified.registries.ModTags;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;
public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // Shapeless Crafting for Items
        ShapelessRecipeBuilder.shapeless(ModItems.ALUMINIUM_NUGGET.get(), 9)
                .requires(ModItems.ALUMINIUM_INGOT.get())
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALUMINIUM_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless((ModItems.ALUMINIUM_INGOT.get()))
                .requires(ModItems.ALUMINIUM_NUGGET.get(), 9)
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALUMINIUM_NUGGET.get()))
                .save(consumer, "aluminium1");
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_ALUMINIUM.get(), 9)
                .requires(ModBlocks.RAW_ALUMINIUM_BLOCK.get())
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.RAW_ALUMINIUM_BLOCK.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.ALUMINIUM_INGOT.get(), 9)
                .requires(ModBlocks.ALUMINIUM_BLOCK.get())
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ALUMINIUM_BLOCK.get()))
                .save(consumer, "aluminium2");
        ShapelessRecipeBuilder.shapeless(ModItems.ELECTRUM.get(), 9)
                .requires(ModBlocks.ELECTRUM_BLOCK.get())
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ELECTRUM_BLOCK.get()))
                .save(consumer);

        // Shapeless Crafting for Blocks
        ShapelessRecipeBuilder.shapeless(ModBlocks.RAW_ALUMINIUM_BLOCK.get(), 9)
                .requires(ModItems.RAW_ALUMINIUM.get(), 9)
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RAW_ALUMINIUM.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ALUMINIUM_BLOCK.get(), 9)
                .requires(ModItems.ALUMINIUM_INGOT.get(), 9)
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALUMINIUM_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModBlocks.ELECTRUM_BLOCK.get())
                .requires(ModItems.ELECTRUM.get(), 9)
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ELECTRUM.get()))
                .save(consumer);

        // Cooking for Furnaces
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModTags.ELECTRUM_ORE_ITEM), ModItems.ELECTRUM.get(), 1.0F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.BAUXITE_ORE_ITEM).build()))
                .save(consumer, "electrum1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_ALUMINIUM.get()), ModItems.ALUMINIUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RAW_ALUMINIUM.get()).build()))
                .save(consumer, "raw_aluminium1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModTags.BAUXITE_ORE_ITEM), ModItems.ALUMINIUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.BAUXITE_ORE_ITEM).build()))
                .save(consumer, "bauxite1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.CRUSHED_BAUXITE_ORE.get()), ModItems.ALUMINIUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.CRUSHED_BAUXITE_ORE.get()).build()))
                .save(consumer, "crushedbauxite1");

        // Cooking for Blast Furnaces
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_ALUMINIUM.get()), ModItems.ALUMINIUM_INGOT.get(), 0.7F, 100)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RAW_ALUMINIUM.get()).build()))
                .save(consumer, "raw_aluminium2");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModTags.ELECTRUM_ORE_ITEM), ModItems.ELECTRUM.get(), 1.0F, 100)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ELECTRUM_ORE_BLOCKITEM.get()).build()))
                .save(consumer, "electrum2");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModTags.BAUXITE_ORE_ITEM), ModItems.ALUMINIUM_INGOT.get(), 0.7F, 100)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModTags.BAUXITE_ORE_ITEM).build()))
                .save(consumer, "bauxite2");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.CRUSHED_BAUXITE_ORE.get()), ModItems.ALUMINIUM_INGOT.get(), 0.7F, 100)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.CRUSHED_BAUXITE_ORE.get()).build()))
                .save(consumer, "crushedbauxite2");
    }
}


