package com.example.createlectrified.datagen;

import com.example.createlectrified.registries.ModItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;

import java.util.function.Consumer;
public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generatorIn){
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

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
    }
}
