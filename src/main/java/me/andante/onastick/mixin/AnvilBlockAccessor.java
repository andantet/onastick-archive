package me.andante.onastick.mixin;

import net.minecraft.block.AnvilBlock;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AnvilBlock.class)
public interface AnvilBlockAccessor {
    @Accessor("TITLE")
    static Text getTitle() {
        throw new AssertionError();
    }
}
