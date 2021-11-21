package me.andante.onastick.screen;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.CartographyTableMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.item.Item;

import java.util.Set;

public class CartographyTableOnAStickScreenHandler extends CartographyTableMenu {
    protected final Set<Item> set;

    public CartographyTableOnAStickScreenHandler(int syncId, Inventory inventory, ContainerLevelAccess context, Item... items) {
        super(syncId, inventory, context);
        this.set = Set.of(items);
    }

    @Override
    public boolean stillValid(Player player) {
        return player.getInventory().hasAnyOf(this.set);
    }
}
