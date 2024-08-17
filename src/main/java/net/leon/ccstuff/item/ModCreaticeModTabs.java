package net.leon.ccstuff.item;

import net.leon.ccstuff.Ccstuff;
import net.leon.ccstuff.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreaticeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Ccstuff.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CC_STUFF_TAB = CREATIVE_MODE_TABS.register("ccstuff_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TELEPORTER_BLOCK.get()))
                    .title(Component.translatable("creativetab.ccstuff_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //output.accept(ModItems.TELEPORTERCC.get());
                        output.accept(ModBlocks.TELEPORTER_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
