package me.andante.onastick.mixin;

import net.minecraft.block.GrindstoneBlock;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(GrindstoneBlock.class)
public interface GrindstoneBlockAccessor {
    @Accessor("TITLE")
    static Text getTitle() {
        throw new AssertionError();
    }
}
