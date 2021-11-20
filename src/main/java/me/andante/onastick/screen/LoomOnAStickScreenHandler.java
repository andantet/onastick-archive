package me.andante.onastick.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.screen.LoomScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

import java.util.Set;

public class LoomOnAStickScreenHandler extends LoomScreenHandler {
    protected final Set<Item> set;

    public LoomOnAStickScreenHandler(int syncId, PlayerInventory inventory, ScreenHandlerContext context, Item... items) {
        super(syncId, inventory, context);
        this.set = Set.of(items);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return player.getInventory().containsAny(this.set);
    }
}
