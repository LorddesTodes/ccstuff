package net.leon.ccstuff.block;

import net.leon.ccstuff.Ccstuff;
import net.leon.ccstuff.block.entity.TeleporterBlock;
import net.leon.ccstuff.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

//<>
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ccstuff.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ccstuff.MOD_ID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Ccstuff.MOD_ID);

    public static final RegistryObject<Block> TELEPORTER_BLOCK = registerBlock("teleporter",
            () -> new TeleporterBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties()));
    };

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        BLOCK_ENTITIES.register(eventBus);
    }

    //all    public static final RegistryObject<Block> CC_BLOCK = register("tutorial_block", CCBlock::new);
    //
    //    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
    //        RegistryObject<T> registryObject = BLOCKS.register(name, block);
    //        ITEMS.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    //        return registryObject;
    //    }
    //
    //    // Tile Entities
    //    public static final RegistryObject<BlockEntityType<CCTileEntity>> CC_TILEENTITY = Registration.BLOCK_ENTITIES.register("tutorial_block", () -> new BlockEntityType<>(CCTileEntity::new, Sets.newHashSet(CC_BLOCK.get()), null));
    //
    //    // Register our stuff
    //    public static void register() {
    //        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    //        BLOCKS.register(modEventBus);
    //        ITEMS.register(modEventBus);
    //        BLOCK_ENTITIES.register(modEventBus);
    //    }
}
