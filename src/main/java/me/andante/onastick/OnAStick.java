package me.andante.onastick;

import com.google.common.reflect.Reflection;
import me.andante.onastick.item.OnAStickItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(OnAStick.MOD_ID)
public class OnAStick {
    public static final String MOD_ID = "onastick";
    public static final String MOD_NAME = "On A Stick";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("%s.item_group".formatted(MOD_ID)) {
        @SuppressWarnings("NullableProblems")
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(OnAStickItems.CRAFTING_TABLE_ON_A_STICK);
        }
    };

    @SuppressWarnings("UnstableApiUsage")
    public OnAStick() {
        LOGGER.info("Initializing {}", MOD_NAME);

        Reflection.initialize(OnAStickItems.class);
        MinecraftForge.EVENT_BUS.register(this);

        LOGGER.info("Initialized {}", MOD_NAME);
    }
}
