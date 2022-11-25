package com.example.createlectrified.builders;

import com.example.createlectrified.CreateElectrified;
import com.simibubi.create.AllSpriteShifts;
import com.simibubi.create.AllTags;
import com.simibubi.create.content.contraptions.base.CasingBlock;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.SimpleCTBehaviour;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.minecraft.world.level.block.SoundType;

import java.util.function.Supplier;

import static com.simibubi.create.AllTags.axeOrPickaxe;
import static com.simibubi.create.foundation.data.CreateRegistrate.casingConnectivity;
import static com.simibubi.create.foundation.data.CreateRegistrate.connectedTextures;

public class CasingBlockBuilder {
    private static final CreateRegistrate REGISTRATE = CreateElectrified.registrate();

    public static <B extends CasingBlock> NonNullUnaryOperator<BlockBuilder<B, CreateRegistrate>> casing(
            Supplier<CTSpriteShiftEntry> ct) {
        return b -> b.initialProperties(SharedProperties::stone)
                .properties(p -> p.sound(SoundType.WOOD))
                .transform(axeOrPickaxe())
                .blockstate((c, p) -> p.simpleBlock(c.get()))
                .onRegister(connectedTextures(() -> new SimpleCTBehaviour(AllSpriteShifts.ANDESITE_CASING)))
                .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ct.get())))
                .tag(AllTags.AllBlockTags.CASING.tag)
                .item()
                .tag(AllTags.AllItemTags.CASING.tag)
                .build();
    }
}

