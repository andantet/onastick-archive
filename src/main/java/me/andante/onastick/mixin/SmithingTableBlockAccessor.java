package me.andante.onastick.mixin;

import net.minecraft.block.SmithingTableBlock;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(SmithingTableBlock.class)
public interface SmithingTableBlockAccessor {
    @Accessor("SCREEN_TITLE")
    static Text getTitle() {
        throw new AssertionError();
    }
}
