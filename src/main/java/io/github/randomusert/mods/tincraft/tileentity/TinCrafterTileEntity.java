package io.github.randomusert.mods.tincraft.tileentity;

import io.github.randomusert.mods.tincraft.api.inventory.BaseItemStackHandler;
import io.github.randomusert.mods.tincraft.api.inventory.OnContentsChangedFunction;
import io.github.randomusert.mods.tincraft.init.ModTileEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;+

public class TinCrafterTileEntity extends BlockEntity {
    private final BaseItemStackHandler inventory;

    public TinCrafterTileEntity(BlockPos pos, BlockState state) {
        super(ModTileEntities.TIN_CRAFTER.get(), pos, state);
        this.inventory = createInventoryHandler((slot) -> this.setChangedAndDispatch());
    }


    @Override
    public BaseItemStackHandler getInventory() {
        return this.inventory;
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.tincraft.tincrafter");
    }

    @Override
    public AbstractContainerMenu createMenu(int id, Inventory playerInventory, Player player) {
        return TinCrafterContainer.create(id, playerInventory, this.inventory, this.getBlockPos());
    }

    public static BaseItemStackHandler createInventoryHandler() {
        return createInventoryHandler(null);
    }

    public static BaseItemStackHandler createInventoryHandler(OnContentsChangedFunction onContentsChanged) {
        return BaseItemStackHandler.create(3, onContentsChanged, handler -> {
            handler.addSlotLimit(0, 512);
            handler.addSlotLimit(1, 512);
        });
    }
}
