package com.timeshipmodding.createlectrified.builders;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.contraptions.base.CasingBlock;
import com.simibubi.create.content.contraptions.relays.encased.EncasedCTBehaviour;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
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

    public static <B extends CasingBlock> NonNullUnaryOperator<BlockBuilder<B, CreateRegistrate>> casing(
            Supplier<CTSpriteShiftEntry> ct) {
            return b -> b.initialProperties(SharedProperties::stone)
                .properties(p -> p.sound(SoundType.NETHER_BRICKS))
                .transform(axeOrPickaxe())
                .blockstate((c, p) -> p.simpleBlock(c.get()))
                .onRegister(connectedTextures(() -> new EncasedCTBehaviour(ct.get())))
                .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ct.get())))
                .tag(AllTags.AllBlockTags.CASING.tag)
                .item()
                .tag(AllTags.AllItemTags.CASING.tag)
                .build();
    }
}

