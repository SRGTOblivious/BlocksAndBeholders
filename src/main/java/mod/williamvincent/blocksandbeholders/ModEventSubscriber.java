package mod.williamvincent.blocksandbeholders;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;

import static  net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = MOD)
public final class ModEventSubscriber {
    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(Main.MOD_ID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }

@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
         event.getRegistry().registerAll(
                 setup(new Item(new Item.Properties()),"adamantine_ingot")
         );

    }
}