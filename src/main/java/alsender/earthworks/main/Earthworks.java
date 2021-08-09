package alsender.earthworks.main;

import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.ItemRegistry;
import alsender.earthworks.main.registry.OreDictRegistry;
import alsender.earthworks.main.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

/**
 * Created by alsender on 12/12/16.
 */
@Mod(modid = Earthworks.mod_id, name = Earthworks.name, version = Earthworks.version)

public class Earthworks {

    public static final String mod_id = "earthworks";
    public static final String name = "Earthworks";
    public static final String version = "1.3.4.3";

    public static final CreativeTabs creativeTab = (new CreativeTabs("earthworks") {

        public String getTabLabel() {
            return "earthworks";
        }
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockRegistry.block_wattle);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }).setBackgroundImageName("item_search.png");

    public static Earthworks instance;
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        Config.init(event.getSuggestedConfigurationFile());
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(ItemRegistry.item_chalk, new ItemStack(ItemRegistry.item_quicklime), 0.1F);
        GameRegistry.addSmelting(BlockRegistry.block_chalk, new ItemStack(ItemRegistry.item_quicklime, 4), 0.1F);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        OreDictRegistry.init();
    }
}
