package alsender.earthworks.main;

import alsender.earthworks.datagen.ModDatagen;
import alsender.earthworks.main.crafting.ShapelessReturnRecipe;
import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.ItemRegistry;
import alsender.earthworks.main.world.Worldgen;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.Logger;

/**
 * Created by alsender on 12/12/16.
 */
@Mod(Earthworks.mod_id)

public class Earthworks {

    public static final String mod_id = "earthworks";

    public static final IRecipeSerializer<?> shapeless_return = new ShapelessReturnRecipe.ReturnSerializer();

    public Earthworks() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(ModDatagen::start);
        bus.addGenericListener(Block.class, this::blocks);
        bus.addGenericListener(Item.class, this::items);
        bus.addGenericListener(IRecipeSerializer.class, this::recipeSerializers);
        MinecraftForge.EVENT_BUS.addListener(Worldgen::addFeatures);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_SPEC);
    }

    public static final Config COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;

    static {
        final Pair<Config, ForgeConfigSpec> specPair2 = new ForgeConfigSpec.Builder().configure(Config::new);
        COMMON_SPEC = specPair2.getRight();
        COMMON = specPair2.getLeft();
    }

    public static final ItemGroup creativeTab = (new ItemGroup("earthworks") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockRegistry.wattle_and_daub);
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

    private void recipeSerializers(RegistryEvent.Register<IRecipeSerializer<?>> event) {
        event.getRegistry().register(shapeless_return.setRegistryName(new ResourceLocation(mod_id, "shapeless_return")));
    }
}
