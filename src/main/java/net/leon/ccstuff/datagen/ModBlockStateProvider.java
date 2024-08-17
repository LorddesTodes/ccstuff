package net.leon.ccstuff.datagen;

import net.leon.ccstuff.Ccstuff;
import net.leon.ccstuff.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Ccstuff.MOD_ID , exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.TELEPORTER_BLOCK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/teleporter")));
    }
}

