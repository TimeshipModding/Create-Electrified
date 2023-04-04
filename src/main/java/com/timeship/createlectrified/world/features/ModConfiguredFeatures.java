package com.timeship.createlectrified.world.features;

import com.timeship.createlectrified.CreateElectrified;
import com.timeship.createlectrified.registries.ModBlocks;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, CreateElectrified.MODID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BAUXITE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BAUXITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BAUXITE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ELECTRUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ELECTRUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ELECTRUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> UPPER_OVERWORLD_ELECTRUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ELECTRUM_ORE.get().defaultBlockState())));



    public static final RegistryObject<ConfiguredFeature<?, ?>> BAUXITE_ORE = CONFIGURED_FEATURES.register("bauxite_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_BAUXITE_ORES.get(),8)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ELECTRUM_ORE = CONFIGURED_FEATURES.register("electrum_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ELECTRUM_ORES.get(),3)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> UPPER_ELCTRUM_ORE = CONFIGURED_FEATURES.register("upper_electrum_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(UPPER_OVERWORLD_ELECTRUM_ORES.get(), 2)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
