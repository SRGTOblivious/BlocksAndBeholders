package mod.williamvincent.blocksandbeholders;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.ObjectHolder;

import static  net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = MOD)
@ObjectHolder(Main.MOD_ID)
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
                 new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("adamantine_ingot"),
                 new Dice(new Item.Properties().maxStackSize(32).group(ItemGroup.MISC ),"d4",4).setRegistryName(Main.MOD_ID,"d4"),
                 new Dice(new Item.Properties().maxStackSize(32).group(ItemGroup.MISC ),"d6",6).setRegistryName(Main.MOD_ID,"d6"),
                 new Dice(new Item.Properties().maxStackSize(32).group(ItemGroup.MISC ),"d8",8).setRegistryName(Main.MOD_ID,"d8"),
                 new Dice(new Item.Properties().maxStackSize(32).group(ItemGroup.MISC ),"d10",10).setRegistryName(Main.MOD_ID,"d10"),
                 new Dice(new Item.Properties().maxStackSize(32).group(ItemGroup.MISC ),"d12",12).setRegistryName(Main.MOD_ID,"d12"),
                 new Dice(new Item.Properties().maxStackSize(32).group(ItemGroup.MISC ),"d100",100).setRegistryName(Main.MOD_ID,"d100"),
                 new Dice(new Item.Properties().maxStackSize(32).group(ItemGroup.MISC ),"d20",20).setRegistryName(Main.MOD_ID,"d20"),
                 new CharacterSheet(new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)).setRegistryName(Main.MOD_ID,"example_sheet")

         );

    }
}