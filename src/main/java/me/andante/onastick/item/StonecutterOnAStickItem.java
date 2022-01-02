package me.andante.onastick.item;

import me.andante.onastick.mixin.StonecutterBlockAccessor;
import me.andante.onastick.screen.StonecutterOnAStickScreenHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.Text;

public class StonecutterOnAStickItem extends AbstractOnAStickItem {
    public StonecutterOnAStickItem(Settings settings) {
        super(settings);
    }

    @Override
    public ScreenHandler createScreenHandler(int syncId, PlayerInventory inventory, PlayerEntity player) {
        return new StonecutterOnAStickScreenHandler(syncId, inventory, ScreenHandlerContext.create(player.world, player.getBlockPos()), this);
    }

    @Override
    public Text getScreenTitle() {
        return StonecutterBlockAccessor.getTITLE();
    }
}
