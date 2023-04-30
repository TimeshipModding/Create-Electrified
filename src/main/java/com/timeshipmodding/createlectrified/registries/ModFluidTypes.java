package com.timeshipmodding.createlectrified.registries;

import com.mojang.math.Vector3f;
import com.timeshipmodding.createlectrified.CreateElectrified;
import com.timeshipmodding.createlectrified.content.fluid.BaseFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        FLUID_TYPES.register(bus);
    }

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("createlectrified:block/molten_copper_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("createlectrified:block/molten_copper_flow");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateElectrified.MODID);

    public static final RegistryObject<FluidType> SOAP_WATER_FLUID_TYPE = register("soap_water_fluid",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5));



    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL,
                new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }
}
