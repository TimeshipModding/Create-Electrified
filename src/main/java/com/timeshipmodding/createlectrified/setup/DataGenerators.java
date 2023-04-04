package com.timeshipmodding.createlectrified.setup;

import com.timeshipmodding.createlectrified.CreateElectrified;
<<<<<<< HEAD
=======
import com.timeship.createlectrified.datagen.*;
>>>>>>> 1.19.2-v0.2
import com.timeshipmodding.createlectrified.datagen.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreateElectrified.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(event.includeServer(), new Recipes(generator));
        generator.addProvider(event.includeServer(), new LootTables(generator));
        BlockTags blockTags = new BlockTags(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ItemTags(generator, blockTags, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new BlockStates(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new ItemModels(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new LanguageProvider(generator,"en_us"));

    }
}
