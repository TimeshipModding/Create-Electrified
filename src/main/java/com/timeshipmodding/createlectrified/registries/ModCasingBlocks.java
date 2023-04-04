package com.timeshipmodding.createlectrified.registries;

import com.timeshipmodding.createlectrified.CreateElectrified;
import com.timeshipmodding.createlectrified.setup.ModCreativeModeTab;
import com.simibubi.create.content.contraptions.base.CasingBlock;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.material.MaterialColor;

import static com.simibubi.create.AllTags.axeOrPickaxe;

public class ModCasingBlocks {
    private static final
    CreateRegistrate REGISTRATE = CreateElectrified.registrate().creativeModeTab(() -> ModCreativeModeTab.ELECTRIFIED_TAB_1);

    public static final BlockEntry<CasingBlock> ALUMINIUM_CASING = REGISTRATE.block("aluminium_casing", CasingBlock::new)
            .properties(p -> p.color(MaterialColor.TERRACOTTA_RED))
            .transform(BuilderTransformers.casing(() -> ModSpriteShifts.ALUMINIUM_CASING))
            .transform(axeOrPickaxe())
            .register();

    public static void register() {}
}
