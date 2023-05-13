package com.timeshipmodding.createlectrified.registries;

import com.timeshipmodding.createlectrified.CreateElectrified;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    private static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, CreateElectrified.MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        PLACED_FEATURES.register(bus);
    }


    public static final RegistryObject<PlacedFeature> BAUXITE_ORE_PLACED = PLACED_FEATURES.register("bauxite_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.BAUXITE_ORE.getHolder().get(), commonOrePlacement(5, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(80)))));

    public static final RegistryObject<PlacedFeature> ELECTRUM_ORE_PLACED = PLACED_FEATURES.register("electrum_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ELECTRUM_ORE.getHolder().get(), commonOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-128), VerticalAnchor.absolute(48)))));
    public static final RegistryObject<PlacedFeature> UPPER_ELCTRUM_ORE_PLACED = PLACED_FEATURES.register("upper_electrum_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.UPPER_ELCTRUM_ORE.getHolder().get(), rareOrePlacement(3, // VeinsPerChunk
                    HeightRangePlacement.uniform((VerticalAnchor.absolute(128)), VerticalAnchor.top()))));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}
