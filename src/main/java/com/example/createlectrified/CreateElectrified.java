package com.example.createlectrified;

import com.example.createlectrified.registry.ModBlocks;
import com.example.createlectrified.registry.ModItems;
import com.example.createlectrified.setup.ClientSetup;
import com.example.createlectrified.setup.ModSetup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.logging.LogManager;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateElectrified.MODID)
public class CreateElectrified {

    public static final String MODID = "createlectrified";

    public CreateElectrified() {

        // Register the deferred registry
        ModItems.init();
        ModBlocks.init();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register 'ModSetup::init' to be called at mod setup time (server and client)
        modbus.addListener(ModSetup::init);
        // Register 'ClientSetup::init' to be called at mod setup time (client only)
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
}