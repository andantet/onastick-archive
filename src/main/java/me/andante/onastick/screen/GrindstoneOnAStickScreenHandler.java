package me.andante.onastick.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.screen.GrindstoneScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

import java.util.Set;

public class GrindstoneOnAStickScreenHandler extends GrindstoneScreenHandler {
    protected final Set<Item> set;

    public GrindstoneOnAStickScreenHandler(int syncId, PlayerInventory inventory, ScreenHandlerContext context, Item... items) {
        super(syncId, inventory, context);
        this.set = Set.of(items);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return player.getInventory().containsAny(this.set);
    }
}
