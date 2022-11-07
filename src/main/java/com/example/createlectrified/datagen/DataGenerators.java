package com.example.createlectrified.datagen;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.datagen.BlockStates.PlaceHolder;
import com.example.createlectrified.datagen.ItemModels.Items;
import com.example.createlectrified.datagen.LootTables.Ores;
import com.example.createlectrified.datagen.Recipes.Shapeless;
import com.example.createlectrified.datagen.Tags.BlockTags;
import com.example.createlectrified.datagen.Tags.ItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreateElectrified.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        // Recipes
        generator.addProvider(event.includeServer(), new Shapeless(generator));
        // LootTables
        generator.addProvider(event.includeServer(), new Ores(generator));
        BlockTags blockTags = new BlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ItemTags(generator, blockTags, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new PlaceHolder(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new Items(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new com.example.createlectrified.datagen.LanguageProviders.Items(generator, "en_us"));
    }
}
