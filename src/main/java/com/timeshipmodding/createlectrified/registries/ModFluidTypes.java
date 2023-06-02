package com.timeshipmodding.createlectrified.registries;

import com.mojang.math.Vector3f;
import com.timeshipmodding.createlectrified.CreateElectrified;

import com.timeshipmodding.createlectrified.content.fluid.BaseFluidType;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.timeshipmodding.createlectrified.content.fluid.FluidResourceLocations.*;

public class ModFluidTypes {
    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        FLUID_TYPES.register(bus);
    }
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateElectrified.MODID);

    // Fluid Types
    public static final RegistryObject<FluidType> MOLTEN_COPPER_FLUID_TYPE = register_copper("molten_copper_fluid", FluidType.Properties.create()
            .descriptionId("Molten Copper")
            .viscosity(3000)
            .density(1500)
            .lightLevel(15)
            .temperature(1300)
            .sound(SoundAction.get("pop"), SoundEvents.LAVA_POP)
            .canSwim(false)
            .canDrown(false));

    public static final RegistryObject<FluidType> MOLTEN_BRASS_FLUID_TYPE = register_brass("molten_brass_fluid", FluidType.Properties.create()
            .descriptionId("Molten Brass")
            .viscosity(3000)
            .density(1500)
            .lightLevel(15)
            .temperature(1300)
            .sound(SoundAction.get("pop"), SoundEvents.LAVA_POP)
            .canSwim(false)
            .canDrown(false));

    // Register Methods
    private static RegistryObject<FluidType> register_copper(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(MOLTEN_COPPER_SOURCE, MOLTEN_COPPER_FLOWING,
                 new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }

    private static RegistryObject<FluidType> register_brass(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(MOLTEN_BRASS_SOURCE, MOLTEN_BRASS_FLOWING,
                new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }
}
