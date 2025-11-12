package io.github.randomusert.mods.tincraft.init;

import io.github.randomusert.mods.tincraft.TinCraft;
import io.github.randomusert.mods.tincraft.tileentity.TinCrafterTileEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModTileEntities {

    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, TinCraft.MODID);


    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TinCrafterTileEntity>> TIN_CRAFTER = register("tin_crafter", TinCrafterTileEntity::new, () -> new Block[] {});



    private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String name, BlockEntityType.BlockEntitySupplier<T> tile, Supplier<Block[]> blocks) {
        return REGISTRY.register(name, () -> BlockEntityType.Builder.of(tile, blocks.get()).build(null));
    }
}
