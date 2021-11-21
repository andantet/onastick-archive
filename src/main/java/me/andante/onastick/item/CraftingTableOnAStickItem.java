package me.andante.onastick.item;

import me.andante.onastick.screen.CraftingTableOnAStickScreenHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.block.CraftingTableBlock;

public class CraftingTableOnAStickItem extends AbstractOnAStickItem {
    public CraftingTableOnAStickItem(Properties settings) {
        super(settings);
    }

    @Override
    public AbstractContainerMenu createScreenHandler(int syncId, Inventory inventory, Player player) {
        return new CraftingTableOnAStickScreenHandler(syncId, inventory, ContainerLevelAccess.create(player.level, player.blockPosition()), this);
    }

    @Override
    public Component getScreenTitle() {
        return CraftingTableBlock.CONTAINER_TITLE;
    }
}
