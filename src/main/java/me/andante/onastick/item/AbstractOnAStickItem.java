package me.andante.onastick.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class AbstractOnAStickItem extends Item {
    public AbstractOnAStickItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (world.isClient) {
            return TypedActionResult.success(stack);
        } else {
            user.openHandledScreen(this.createScreenHandlerFactory(world, user.getBlockPos()));
        }

        return super.use(world, user, hand);
    }

    public NamedScreenHandlerFactory createScreenHandlerFactory(World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory(this::createScreenHandler, this.getScreenTitle());
    }

    public abstract ScreenHandler createScreenHandler(int syncId, PlayerInventory inventory, PlayerEntity player);
    public abstract Text getScreenTitle();
}
