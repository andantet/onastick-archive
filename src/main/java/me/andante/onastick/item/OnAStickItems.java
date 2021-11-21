package me.andante.onastick.item;

import me.andante.onastick.OnAStick;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Function;

@SuppressWarnings("unused")
public class OnAStickItems {
    private static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Item.class, OnAStick.MOD_ID);

    public static final Item CRAFTING_TABLE_ON_A_STICK = registerOAS("crafting_table_on_a_stick", CraftingTableOnAStickItem::new);
    public static final Item SMITHING_TABLE_ON_A_STICK = registerOAS("smithing_table_on_a_stick", SmithingTableOnAStickItem::new);
    public static final Item CARTOGRAPHY_TABLE_ON_A_STICK = registerOAS("cartography_table_on_a_stick", CartographyTableOnAStickItem::new);
    public static final Item ANVIL_ON_A_STICK = registerOAS("anvil_on_a_stick", AnvilOnAStickItem::new);
    public static final Item LOOM_ON_A_STICK = registerOAS("loom_on_a_stick", LoomOnAStickItem::new);
    public static final Item GRINDSTONE_ON_A_STICK = registerOAS("grindstone_on_a_stick", GrindstoneOnAStickItem::new);

    static {
        REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private static Item register(String id, Item item) {
        REGISTRY.register(id, () -> item);
        return item;
    }

    private static Item register(String id, Function<Item.Properties, Item> factory) {
        return register(id, factory.apply(new Item.Properties().tab(OnAStick.ITEM_GROUP)));
    }

    private static Item registerOAS(String id, Function<Item.Properties, Item> factory) {
        return register(id, settings -> factory.apply(settings.stacksTo(1)));
    }
}
