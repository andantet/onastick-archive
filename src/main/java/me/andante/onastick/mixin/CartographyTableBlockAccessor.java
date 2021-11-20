package me.andante.onastick.mixin;

import net.minecraft.block.CartographyTableBlock;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(CartographyTableBlock.class)
public interface CartographyTableBlockAccessor {
    @Accessor("TITLE")
    static Text getTitle() {
        throw new AssertionError();
    }
}
