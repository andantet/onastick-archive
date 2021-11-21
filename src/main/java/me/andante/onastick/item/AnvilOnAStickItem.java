package me.andante.onastick.item;

import me.andante.onastick.screen.AnvilOnAStickScreenHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.block.AnvilBlock;

public class AnvilOnAStickItem extends AbstractOnAStickItem {
    public AnvilOnAStickItem(Properties settings) {
        super(settings);
    }

    @Override
    public AbstractContainerMenu createScreenHandler(int syncId, Inventory inventory, Player player) {
        return new AnvilOnAStickScreenHandler(syncId, inventory, ContainerLevelAccess.create(player.level, player.blockPosition()), this);
    }

    @Override
    public Component getScreenTitle() {
        return AnvilBlock.CONTAINER_TITLE;
    }
}
