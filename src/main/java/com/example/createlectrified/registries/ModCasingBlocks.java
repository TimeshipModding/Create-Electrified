package com.example.createlectrified.registries;

import com.example.createlectrified.CreateElectrified;
import com.example.createlectrified.setup.ModCreativeModeTab;
import com.simibubi.create.content.contraptions.base.CasingBlock;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ModCasingBlocks {

    private static final
    CreateRegistrate REGISTRATE = CreateElectrified.registrate().creativeModeTab(() -> ModCreativeModeTab.ELECTRIFIED_TAB_1);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    }

    public static final BlockEntry<CasingBlock> ALUMINIUM_CASING = REGISTRATE.block("aluminium_casing", CasingBlock::new)
            .properties(p -> p.color(MaterialColor.TERRACOTTA_BROWN))
            .transform(BuilderTransformers.casing(() -> ModSpriteShifts.ALUMINIUM_CASING))
            .register();
}