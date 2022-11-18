package com.example.createlectrified;

import com.example.createlectrified.registries.*;
import com.example.createlectrified.setup.ClientSetup;
import com.example.createlectrified.setup.ModSetup;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
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
    private static final NonNullSupplier<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy(MOD_ID);


    public CreateElectrified() {

        // Register the registry classes
        ModItems.init();
        ModBlocks.init();
        ModTags.init();
        ModSpriteShifts.init();
        ModCasingBlocks.init();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register ModSetup and ClientSetup
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
    public static CreateRegistrate registrate() {
        return REGISTRATE.get();
    }
}
