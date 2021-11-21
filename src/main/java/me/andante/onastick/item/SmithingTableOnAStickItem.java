package me.andante.onastick.item;

import me.andante.onastick.screen.SmithingTableOnAStickScreenHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.block.SmithingTableBlock;

public class SmithingTableOnAStickItem extends AbstractOnAStickItem {
    public SmithingTableOnAStickItem(Properties settings) {
        super(settings);
    }

    @Override
    public AbstractContainerMenu createScreenHandler(int syncId, Inventory inventory, Player player) {
        return new SmithingTableOnAStickScreenHandler(syncId, inventory, ContainerLevelAccess.create(player.level, player.blockPosition()), this);
    }

    @Override
    public Component getScreenTitle() {
        return SmithingTableBlock.CONTAINER_TITLE;
    }
}
