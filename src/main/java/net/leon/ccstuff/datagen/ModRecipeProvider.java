package net.leon.ccstuff.datagen;

import net.leon.ccstuff.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
    //    ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.TELEPORTER_BLOCK.get())
    //            .pattern("ovo")
    //            .pattern("beb")
    //            .pattern("bwb")
    //            .define("o","#forge:plates/obsidian")
    //            .define("v","create:propeller")
    //            .define("b","#forge:ingot/brass")
    //            .define("e","create:precision_mechanism")
    //            .define("w","create:shaft")
    //            .unlockedBy(getHasName(ModBlocks.TELEPORTER_BLOCK.get()), has(ModBlocks.TELEPORTER_BLOCK.get()))
    //            .save(consumer);
    }
}
