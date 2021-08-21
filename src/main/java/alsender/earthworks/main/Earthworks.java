package alsender.earthworks.main;

import alsender.earthworks.datagen.ModDatagen;
import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.Logger;

/**
 * Created by alsender on 12/12/16.
 */
@Mod(Earthworks.mod_id)

public class Earthworks {

    public static final String mod_id = "earthworks";

    public Earthworks() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(ModDatagen::start);
    }

    public static final ItemGroup creativeTab = (new ItemGroup("earthworks") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockRegistry.block_wattle);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }).setBackgroundImageName("item_search.png");

    public static Logger logger;

    private void blocks(RegistryEvent.Register<Block> event) {
        BlockRegistry.initBlocks(event);
    }

    private void items(RegistryEvent.Register<Item> event) {
        ItemRegistry.initItems(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(ItemRegistry.item_chalk, new ItemStack(ItemRegistry.item_quicklime), 0.1F);
        GameRegistry.addSmelting(BlockRegistry.chalk, new ItemStack(ItemRegistry.item_quicklime, 4), 0.1F);
    }
}
