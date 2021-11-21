package me.andante.onastick.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public abstract class AbstractOnAStickItem extends Item {
    public AbstractOnAStickItem(Properties settings) {
        super(settings);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player user, InteractionHand hand) {
        ItemStack stack = user.getItemInHand(hand);

        if (world.isClientSide) {
            return InteractionResultHolder.success(stack);
        } else {
            user.openMenu(this.createScreenHandlerFactory());
        }

        return super.use(world, user, hand);
    }

    public MenuProvider createScreenHandlerFactory() {
        return new SimpleMenuProvider(this::createScreenHandler, this.getScreenTitle());
    }

    public abstract AbstractContainerMenu createScreenHandler(int syncId, Inventory inventory, Player player);
    public abstract Component getScreenTitle();
}
