package com.timeshipmodding.createlectrified.registries;

import com.mojang.math.Vector3f;
import com.timeshipmodding.createlectrified.CreateElectrified;
import com.timeshipmodding.createlectrified.content.fluid.BaseFluidType;
import net.minecraft.resources.ResourceLocation;
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

    public static final ResourceLocation MOLTEN_COPPER_SOURCE = new ResourceLocation(CreateElectrified.MODID,"block/molten_copper_source");
    public static final ResourceLocation MOLTEN_COPPER_FLOWING = new ResourceLocation(CreateElectrified.MODID,"block/molten_copper_flowing");
    public static final ResourceLocation MOLTEN_COPPER_OVERLAY = null;

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateElectrified.MODID);

    public static final RegistryObject<FluidType> MOLTEN_FLUID_TYPE = register("molten_fluid",
            FluidType.Properties.create().lightLevel(15).density(3000).viscosity(6000).temperature(1300).canSwim(false).canDrown(false));



    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(MOLTEN_COPPER_SOURCE, MOLTEN_COPPER_FLOWING, MOLTEN_COPPER_OVERLAY,
                0xffff6347, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }

}
