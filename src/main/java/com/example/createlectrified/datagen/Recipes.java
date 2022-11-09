package com.example.createlectrified.datagen;

import com.example.createlectrified.registries.ModItems;
import com.example.createlectrified.registries.ModTags;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;
public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generatorIn){
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        // Shapeless Recipes
        ShapelessRecipeBuilder.shapeless(ModItems.ALUMINIUM_NUGGET.get(), 9)
                .requires(ModItems.ALUMINIUM_INGOT.get())
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALUMINIUM_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless((ModItems.ALUMINIUM_INGOT.get()))
                .requires(ModItems.ALUMINIUM_NUGGET.get(), 9)
                .group("createlectrified")
                .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALUMINIUM_NUGGET.get()))
                .save(consumer);

        // Cooking Recipes
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModTags.ELECTRUM_ORE_ITEM), ModItems.ELECTRUM.get(), 1.0F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ELECTRUM_ORE_BLOCKITEM.get()).build()))
                .save(consumer, "electrum1");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModTags.ELECTRUM_ORE_ITEM), ModItems.ELECTRUM.get(), 1.0F, 100)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ELECTRUM_ORE_BLOCKITEM.get()).build()))
                .save(consumer, "electrum2");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_ALUMINIUM.get()), ModItems.ALUMINIUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RAW_ALUMINIUM.get()).build()))
                .save(consumer, "raw_aluminium1");
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_ALUMINIUM.get()), ModItems.ALUMINIUM_INGOT.get(), 0.7F, 100)
                .unlockedBy("criteria", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RAW_ALUMINIUM.get()).build()))
                .save(consumer, "raw_aluminium2");

    }
}
