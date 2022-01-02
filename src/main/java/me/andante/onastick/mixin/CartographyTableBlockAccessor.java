package me.andante.onastick.mixin;

import net.minecraft.block.CartographyTableBlock;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(CartographyTableBlock.class)
public interface CartographyTableBlockAccessor {
    @Accessor
    static Text getTITLE() {
        throw new AssertionError();
    }
}
