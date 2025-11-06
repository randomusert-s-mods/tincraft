package io.github.randomusert.mods.tincraft.block;


import io.github.randomusert.mods.tincraft.TinCraft;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TinBlock {

    public static final DeferredRegister.Blocks TINBLOCKS = DeferredRegister.createBlocks(TinCraft.MODID);

    public static final DeferredBlock<Block> TIN_BLOCK = TINBLOCKS.register("tin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(2.5f)
                    .sound(SoundType.STONE)
                    .explosionResistance(0.1f)
                    .requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> TIN_ORE = TINBLOCKS.register("tin_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(2.5f)
                    .sound(SoundType.STONE)
                    .explosionResistance(0.1f)
                    .requiresCorrectToolForDrops()));
}
