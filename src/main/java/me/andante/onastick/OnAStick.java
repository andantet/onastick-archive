package me.andante.onastick;

import com.google.common.reflect.Reflection;
import me.andante.onastick.item.OnAStickItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OnAStick implements ModInitializer {
    public static final String MOD_ID   = "onastick";
    public static final String MOD_NAME = "On A Stick";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(OnAStickItems.CRAFTING_TABLE_ON_A_STICK));

	@SuppressWarnings("UnstableApiUsage")
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing {}", MOD_NAME);
		Reflection.initialize(OnAStickItems.class);
		LOGGER.info("Initialized {}", MOD_NAME);
	}
}
