package io.github.randomusert.mods.tincraft.data;

import io.github.randomusert.mods.tincraft.init.ModBlocks;
import io.github.randomusert.mods.tincraft.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT)
                .requires(ModBlocks.TIN_BLOCK)
                .unlockedBy("has_tin_block", has(ModBlocks.TIN_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIN_BLOCK)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TIN_INGOT)
                .unlockedBy("has_tin_ingot", has(ModItems.TIN_INGOT))
                .save(recipeOutput);
    }
}
