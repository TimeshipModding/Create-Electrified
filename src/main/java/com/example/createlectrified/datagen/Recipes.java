package com.example.createlectrified.datagen;

import com.example.createlectrified.registry.ModItems;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import org.spongepowered.asm.util.IConsumer;

import java.util.function.Consumer;
public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generatorIn){
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
    }
    ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(ModItems.ALUMINIUM_NUGGET.get(), 9)
            .requires(ModItems.ALUMINIUM_INGOT.get()) // Add item to the recipe
            .unlockedBy("criteria", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALUMINIUM_INGOT.get())) // How the recipe is unlocked
            .group("createletrified");
}
