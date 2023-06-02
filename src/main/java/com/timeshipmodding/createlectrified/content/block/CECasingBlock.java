package com.timeshipmodding.createlectrified.content.block;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.content.decoration.encasing.EncasedCTBehaviour;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;

import java.util.function.Supplier;

import static com.simibubi.create.foundation.data.CreateRegistrate.casingConnectivity;
import static com.simibubi.create.foundation.data.CreateRegistrate.connectedTextures;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;

public class CECasingBlock {
    public static <B extends CasingBlock> NonNullUnaryOperator<BlockBuilder<B, CreateRegistrate>> casing(
            Supplier<CTSpriteShiftEntry> ct) {
            return b -> b.initialProperties(SharedProperties::stone)
                .transform(pickaxeOnly())
                .blockstate((c, p) -> p.simpleBlock(c.get()))
                .onRegister(connectedTextures(() -> new EncasedCTBehaviour(ct.get())))
                .onRegister(casingConnectivity((block, cc) -> cc.makeCasing(block, ct.get())))
                .tag(AllTags.AllBlockTags.CASING.tag)
                .item()
                .tag(AllTags.AllItemTags.CASING.tag)
                .build();
    }
}
