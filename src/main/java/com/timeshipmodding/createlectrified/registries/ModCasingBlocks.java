package com.timeshipmodding.createlectrified.registries;

import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.timeshipmodding.createlectrified.CreateElectrified;
import com.timeshipmodding.createlectrified.content.block.CECasingBlock;
import com.timeshipmodding.createlectrified.setup.ModCreativeModeTab;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MaterialColor;

public class ModCasingBlocks {
    private static final CreateRegistrate REGISTRATE = CreateElectrified.registrate();

    public static final BlockEntry<CasingBlock> ALUMINIUM_CASING = REGISTRATE.block("aluminium_casing", CasingBlock::new)
            .properties(p -> p.sound(SoundType.NETHER_BRICKS))
            .properties(p -> p.color(MaterialColor.TERRACOTTA_RED))
            .transform(CECasingBlock.casing(() -> ModSpriteShifts.ALUMINIUM_CASING))
            .register();



    public static void register() {}
}
