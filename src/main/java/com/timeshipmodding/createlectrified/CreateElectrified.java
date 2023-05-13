package com.timeshipmodding.createlectrified;

import com.timeshipmodding.createlectrified.registries.*;
import com.timeshipmodding.createlectrified.registries.ModBlocks;
import com.timeshipmodding.createlectrified.registries.ModCasingBlocks;
import com.timeshipmodding.createlectrified.registries.ModItems;
import com.timeshipmodding.createlectrified.setup.ClientSetup;
import com.timeshipmodding.createlectrified.setup.ModSetup;
import com.timeshipmodding.createlectrified.registries.ModConfiguredFeatures;
import com.timeshipmodding.createlectrified.registries.ModPlacedFeatures;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CreateElectrified.MODID)
public class    CreateElectrified {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "createlectrified";
    private static final NonNullSupplier<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy(MODID);


    public CreateElectrified() {

        // Register the registry classes
        ModItems.init();
        ModBlocks.init();
        ModTags.init();
        ModFluids.init();
        ModFluidTypes.init();
        ModConfiguredFeatures.init();
        ModPlacedFeatures.init();

        ModCasingBlocks.register();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        // Register ModSetup and ClientSetup
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MODID, path);
    }
    public static CreateRegistrate registrate() {
        return REGISTRATE.get();
    }
}
