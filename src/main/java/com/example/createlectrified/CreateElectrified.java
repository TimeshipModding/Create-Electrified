package com.example.createlectrified;

import com.example.createlectrified.registries.*;
import com.example.createlectrified.setup.ClientSetup;
import com.example.createlectrified.setup.ModSetup;
import com.example.createlectrified.world.features.ModConfiguredFeatures;
import com.example.createlectrified.world.features.ModPlacedFeatures;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.Registrate;
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

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

@Mod(CreateElectrified.MODID)
public class CreateElectrified {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "createlectrified";
    private static final NonNullSupplier<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy(MODID);


    public CreateElectrified() {

        // Register the registry classes
        ModItems.init();
        ModBlocks.init();
        ModTags.init();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        // Register ModSetup and ClientSetup
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
        // Register World Gen classes
        ModPlacedFeatures.register(modbus);
        ModConfiguredFeatures.register(modbus);
        ModCasingBlocks.register();

    }
    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MODID, path);
    }
    public static CreateRegistrate registrate() {
        return REGISTRATE.get();
    }
}
