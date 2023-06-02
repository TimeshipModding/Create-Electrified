package com.timeshipmodding.createlectrified.datagen;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import static com.timeshipmodding.createlectrified.registries.ModBlocks.*;
import static com.timeshipmodding.createlectrified.registries.ModItems.*;
import static com.timeshipmodding.createlectrified.registries.ModTags.*;


import java.util.function.Consumer;
public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // Shapeless Crafting for Items
        ShapelessRecipeBuilder.shapeless(ALUMINIUM_NUGGET.get(), 9)
                .requires(ALUMINIUM_INGOT.get())
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ALUMINIUM_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless((ALUMINIUM_INGOT.get()))
                .requires(ALUMINIUM_NUGGET.get(), 9)
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ALUMINIUM_NUGGET.get()))
                .save(consumer, "aluminium1");
        ShapelessRecipeBuilder.shapeless(RAW_ALUMINIUM.get(), 9)
                .requires(RAW_ALUMINIUM_BLOCK.get())
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RAW_ALUMINIUM_BLOCK.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ALUMINIUM_INGOT.get(), 9)
                .requires(ALUMINIUM_BLOCK.get())
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ALUMINIUM_BLOCK.get()))
                .save(consumer, "aluminium2");
        ShapelessRecipeBuilder.shapeless(ELECTRUM.get(), 9)
                .requires(ELECTRUM_BLOCK.get())
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ELECTRUM_BLOCK.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(CABLE_INSULATION.get())
                .requires(Items.DRIED_KELP, 3)
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DRIED_KELP))
                .save(consumer);

        // Shapeless Crafting for Blocks
        ShapelessRecipeBuilder.shapeless(RAW_ALUMINIUM_BLOCK.get(), 9)
                .requires(RAW_ALUMINIUM.get(), 9)
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(RAW_ALUMINIUM.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ALUMINIUM_BLOCK.get(), 9)
                .requires(ALUMINIUM_INGOT.get(), 9)
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ALUMINIUM_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ELECTRUM_BLOCK.get())
                .requires(ELECTRUM.get(), 9)
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ELECTRUM.get()))
                .save(consumer);

        // Shaped Crafting for Blocks

        // Cooking for Furnaces
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ELECTRUM_ORE_ITEM), ELECTRUM.get(), 1.0F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(BAUXITE_ORE_ITEM).build()))
                .save(consumer, "electrum1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(RAW_ALUMINIUM.get()), ALUMINIUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(RAW_ALUMINIUM.get()).build()))
                .save(consumer, "raw_aluminium1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BAUXITE_ORE_ITEM), ALUMINIUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(BAUXITE_ORE_ITEM).build()))
                .save(consumer, "bauxite1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(CRUSHED_BAUXITE_ORE.get()), ALUMINIUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(CRUSHED_BAUXITE_ORE.get()).build()))
                .save(consumer, "crushedbauxite1");

        // Cooking for Blast Furnaces
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(RAW_ALUMINIUM.get()), ALUMINIUM_INGOT.get(), 0.7F, 100)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(RAW_ALUMINIUM.get()).build()))
                .save(consumer, "raw_aluminium2");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ELECTRUM_ORE_ITEM), ELECTRUM.get(), 1.0F, 100)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ELECTRUM_ORE_ITEM).build()))
                .save(consumer, "electrum2");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(BAUXITE_ORE_ITEM), ALUMINIUM_INGOT.get(), 0.7F, 100)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(BAUXITE_ORE_ITEM).build()))
                .save(consumer, "bauxite2");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(CRUSHED_BAUXITE_ORE.get()), ALUMINIUM_INGOT.get(), 0.7F, 100)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(CRUSHED_BAUXITE_ORE.get()).build()))
                .save(consumer, "crushedbauxite2");
    }
}


