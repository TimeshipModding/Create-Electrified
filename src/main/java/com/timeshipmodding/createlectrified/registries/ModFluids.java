package com.timeshipmodding.createlectrified.registries;

import com.timeshipmodding.createlectrified.CreateElectrified;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        FLUIDS.register(bus);
    }

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateElectrified.MODID);

    public static final RegistryObject<FlowingFluid> MOLTEN_COPPER = FLUIDS.register("molten_copper",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_COPPER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_COPPER_FLOWING = FLUIDS.register("molten_copper_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_COPPER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_FLUID_TYPE, MOLTEN_COPPER, MOLTEN_COPPER_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.MOLTEN_COPPER_BLOCK)
            .bucket(ModItems.MOLTEN_COPPER_BUCKET);
}

