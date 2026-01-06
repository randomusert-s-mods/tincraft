package io.github.randomusert.mods.tincraft.data;

import io.github.randomusert.mods.tincraft.init.ModBlocks;
import io.github.randomusert.mods.tincraft.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
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
                .save(recipeOutput, "tin_block_to_tin_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIN_BLOCK)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TIN_INGOT)
                .unlockedBy("has_tin_ingot", has(ModItems.TIN_INGOT))
                .save(recipeOutput);

        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(ModBlocks.TIN_ORE),
                RecipeCategory.MISC,
                ModItems.TIN_INGOT,
                0.1f,
                200
        )
                .unlockedBy("has_tin_ore", has(ModBlocks.TIN_ORE))
                .save(recipeOutput, "tin_ore_to_tin_ingot");
    }
}
