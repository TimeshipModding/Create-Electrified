package setup;

import com.example.createlectrified.registries.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {

    public static final CreativeModeTab ELECTRIFIED_TAB_1 = new CreativeModeTab("electrifiedtab1") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ELECTRUM.get());
        }
    };
}
