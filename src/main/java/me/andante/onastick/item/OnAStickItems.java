package me.andante.onastick.item;

import me.andante.onastick.OnAStick;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Function;

@SuppressWarnings("unused")
public class OnAStickItems {
    public static final Item CRAFTING_TABLE_ON_A_STICK = unstackable("crafting_table_on_a_stick", CraftingTableOnAStickItem::new);
    public static final Item SMITHING_TABLE_ON_A_STICK = unstackable("smithing_table_on_a_stick", SmithingTableOnAStickItem::new);
    public static final Item LOOM_ON_A_STICK = unstackable("loom_on_a_stick", LoomOnAStickItem::new);
    public static final Item CARTOGRAPHY_TABLE_ON_A_STICK = unstackable("cartography_table_on_a_stick", CartographyTableOnAStickItem::new);
    public static final Item GRINDSTONE_ON_A_STICK = unstackable("grindstone_on_a_stick", GrindstoneOnAStickItem::new);
    public static final Item ANVIL_ON_A_STICK = unstackable("anvil_on_a_stick", AnvilOnAStickItem::new);
    public static final Item STONECUTTER_ON_A_STICK = unstackable("stonecutter_on_a_stick", StonecutterOnAStickItem::new);

    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OnAStick.MOD_ID, id), item);
    }

    private static Item register(String id, Function<Item.Settings, Item> factory) {
        return register(id, factory.apply(new FabricItemSettings().group(OnAStick.ITEM_GROUP)));
    }

    private static Item unstackable(String id, Function<Item.Settings, Item> factory) {
        return register(id, settings -> factory.apply(settings.maxCount(1)));
    }
}
