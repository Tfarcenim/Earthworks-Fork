package alsender.earthworks.main.registry;


import alsender.earthworks.item.ModItemTool;
import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 12/12/16.
 */
@Mod.EventBusSubscriber
public class ItemRegistry {

    public static Item
            item_adobe;
    public static Item item_cob;
    public static Item item_dirt;
    public static Item item_lime_plaster;
    public static Item item_mud;
    public static Item item_chalk;
    public static Item item_quicklime;
    public static Item item_sand;
    public static Item item_slaked_lime;
    public static Item item_timber;

    public static Item

            tool_square;
    public static Item tool_Acheulean;
    public static Item tool_adz;
    public static Item tool_compass;
    public static Item tool_froe;
    public static Item tool_planer;
    public static Item tool_level;
    public static Item tool_saw;

    public static Item wood_hammer;
    public static Item stone_hammer;
    public static Item iron_hammer;
    public static Item gold_hammer;
    public static Item diamond_hammer;
    public static BlockItem
            itemslab_adobe;
    public static BlockItem chalk_slab;
    public static BlockItem cinder_slab;
    public static BlockItem itemslab_cob;
    public static BlockItem itemslab_concrete;
    public static BlockItem itemslab_cordwood;
    public static BlockItem itemslab_dry_stone;
    public static BlockItem itemslab_gabion0;
    public static BlockItem itemslab_gabion1;
    public static BlockItem itemslab_gabion2;
    public static BlockItem itemslab_mud;
    public static BlockItem itemslab_planks_vert0;
    public static BlockItem itemslab_planks_vert1;
    public static BlockItem itemslab_planks_vert2;
    public static BlockItem itemslab_planks_vert3;
    public static BlockItem itemslab_planks_vert4;
    public static BlockItem itemslab_planks_vert5;
    public static BlockItem itemslab_plaster;
    public static BlockItem itemslab_rammed_earth;
    public static BlockItem itemslab_reed;
    public static BlockItem itemslab_slate;
    public static BlockItem itemslab_slate_green;
    public static BlockItem itemslab_slate_purple;
    public static BlockItem itemslab_slate_slab;
    public static BlockItem itemslab_slate_slab_green;
    public static BlockItem itemslab_slate_slab_purple;
    public static BlockItem itemslab_slate_shingle;
    public static BlockItem itemslab_slate_shingle_verte;
    public static BlockItem itemslab_slate_shingle_purple;
    public static BlockItem itemslab_slate_tile;
    public static BlockItem itemslab_slate_tile_verte;
    public static BlockItem itemslab_slate_tile_purple;
    public static BlockItem itemslab_thatch;
    public static BlockItem itemslab_timber_oak;
    public static BlockItem itemslab_timber_birch;
    public static BlockItem itemslab_timber_spruce;
    public static BlockItem itemslab_timber_jungle;
    public static BlockItem itemslab_timber_acacia;
    public static BlockItem itemslab_timber_dark_oak;
    public static BlockItem itemslab_wattle;
    public static BlockItem itemslab_wicker;
    public static BlockItem itemslab_wood_shingle_oak;
    public static BlockItem itemslab_wood_shingle_spruce;
    public static BlockItem itemslab_wood_shingle_birch;
    public static BlockItem itemslab_wood_shingle_jungle;
    public static BlockItem itemslab_wood_shingle_acacia;
    public static BlockItem itemslab_wood_shingle_dark_oak;

    public static void initItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        item_adobe = new Item(new Item.Properties().group(Earthworks.creativeTab));
        item_chalk = new Item(new Item.Properties().group(Earthworks.creativeTab));
        item_cob = new Item(new Item.Properties().group(Earthworks.creativeTab));
        item_lime_plaster = new Item(new Item.Properties().group(Earthworks.creativeTab));
        item_mud = new Item(new Item.Properties().group(Earthworks.creativeTab));
        item_quicklime = new Item(new Item.Properties().group(Earthworks.creativeTab));
        item_slaked_lime = new Item(new Item.Properties().group(Earthworks.creativeTab));
        item_timber = new Item(new Item.Properties().group(Earthworks.creativeTab));

        tool_square = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(60));
        tool_Acheulean = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(132));
        tool_adz = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(251));
        tool_compass = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(251));
        tool_froe = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(251));
        tool_planer = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(251));
        tool_level = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(33));
        tool_saw = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(1562));

        wood_hammer = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(60));
        stone_hammer = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(132));
        iron_hammer = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(251));
        gold_hammer = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(33));
        diamond_hammer = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(1562));

    }

    public static void initItemBlocks(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        blockItem(BlockRegistry.adobe);
        blockItem(BlockRegistry.chalk);
        blockItem(BlockRegistry.cinder);
        blockItem(BlockRegistry.cob);
        blockItem(BlockRegistry.concrete);
        blockItem(BlockRegistry.cordwood);
        blockItem(BlockRegistry.dry_stone);
        blockItem(BlockRegistry.GRAVEL_GABION);
        blockItem(BlockRegistry.SAND_GABION);
        blockItem(BlockRegistry.DIRT_GABION);
        blockItem(BlockRegistry.mud);

        blockItem(BlockRegistry.oak_planks_vert);

        blockItem(BlockRegistry.plaster);
        blockItem(BlockRegistry.rammed_earth);
        blockItem(BlockRegistry.slate);
        blockItem(BlockRegistry.slate_green);
        blockItem(BlockRegistry.slate_purple);
        blockItem(BlockRegistry.slate_slab);
        blockItem(BlockRegistry.green_slate_slab);
        blockItem(BlockRegistry.slate_slab_purple);
        blockItem(BlockRegistry.slate_shingle);
        blockItem(BlockRegistry.block_slate_shingle_verte);
        blockItem(BlockRegistry.block_slate_shingle_purple);
        blockItem(BlockRegistry.block_slate_tile);
        blockItem(BlockRegistry.block_slate_tile_verte);
        blockItem(BlockRegistry.block_slate_tile_purple);
        blockItem(BlockRegistry.block_timber_oak);
        blockItem(BlockRegistry.block_timber_birch);
        blockItem(BlockRegistry.block_timber_spruce);
        blockItem(BlockRegistry.block_timber_jungle);
        blockItem(BlockRegistry.acacia_timber);
        blockItem(BlockRegistry.block_timber_dark_oak);
        blockItem(BlockRegistry.wattle);
        blockItem(BlockRegistry.wicker);
        blockItem(BlockRegistry.oak_wood_shingle);

        blockItem(BlockRegistry.vertical_oak_fence);
        blockItem(BlockRegistry.vertical_spruce_fence);
        blockItem(BlockRegistry.vertical_birch_fence);
        blockItem(BlockRegistry.vertical_jungle_fence);
        blockItem(BlockRegistry.vertical_acacia_fence);
        blockItem(BlockRegistry.vertical_dark_oak_fence);

        itemslab_adobe = new BlockItem(r, BlockRegistry.slab_adobe, BlockRegistry.doubleslab_adobe);
        chalk_slab = new BlockItem(r, BlockRegistry.slab_chalk, BlockRegistry.doubleslab_chalk);
        cinder_slab = new BlockItem(r, BlockRegistry.slab_cinder, BlockRegistry.doubleslab_cinder);
        itemslab_cob = new BlockItem(r, BlockRegistry.slab_cob, BlockRegistry.doubleslab_cob);
        itemslab_concrete = new BlockItem(r, BlockRegistry.slab_concrete, BlockRegistry.doubleslab_concrete);
        itemslab_cordwood = new BlockItem(r, BlockRegistry.slab_cordwood, BlockRegistry.doubleslab_cordwood);
        itemslab_dry_stone = new BlockItem(r, BlockRegistry.slab_dry_stone, BlockRegistry.doubleslab_dry_stone);
        itemslab_gabion0 = new BlockItem(r, BlockRegistry.slab_gabion0, BlockRegistry.doubleslab_gabion0);
        itemslab_gabion1 = new BlockItem(r, BlockRegistry.slab_gabion1, BlockRegistry.doubleslab_gabion1);
        itemslab_gabion2 = new BlockItem(r, BlockRegistry.slab_gabion2, BlockRegistry.doubleslab_gabion2);
        itemslab_mud = new BlockItem(r, BlockRegistry.slab_mud, BlockRegistry.doubleslab_mud);
        itemslab_planks_vert0 = new BlockItem(r, BlockRegistry.vertical_oak_slab, BlockRegistry.doubleslab_planks_vert0);
        itemslab_planks_vert1 = new BlockItem(r, BlockRegistry.vertical_spruce_slab, BlockRegistry.doubleslab_planks_vert1);
        itemslab_planks_vert2 = new BlockItem(r, BlockRegistry.slab_planks_vert2, BlockRegistry.doubleslab_planks_vert2);
        itemslab_planks_vert3 = new BlockItem(r, BlockRegistry.slab_planks_vert3, BlockRegistry.doubleslab_planks_vert3);
        itemslab_planks_vert4 = new BlockItem(r, BlockRegistry.slab_planks_vert4, BlockRegistry.doubleslab_planks_vert4);
        itemslab_planks_vert5 = new BlockItem(r, BlockRegistry.slab_planks_vert5, BlockRegistry.doubleslab_planks_vert5);
        itemslab_plaster = new BlockItem(r, BlockRegistry.plaster_slab, BlockRegistry.doubleslab_plaster);
        itemslab_rammed_earth = new BlockItem(r, BlockRegistry.slab_rammed_earth, BlockRegistry.doubleslab_rammed_earth);
        itemslab_slate = new BlockItem(r, BlockRegistry.slab_slate, BlockRegistry.doubleslab_slate);
        itemslab_slate_green = new BlockItem(r, BlockRegistry.slab_slate_green, BlockRegistry.doubleslab_slate_green);
        itemslab_slate_purple = new BlockItem(r, BlockRegistry.slab_slate_purple, BlockRegistry.doubleslab_slate_purple);
        itemslab_slate_slab = new BlockItem(r, BlockRegistry.slab_slate_slab, BlockRegistry.doubleslab_slate_slab);
        itemslab_slate_slab_green = new BlockItem(r, BlockRegistry.slab_slate_slab_green, BlockRegistry.doubleslab_slate_slab_green);
        itemslab_slate_slab_purple = new BlockItem(r, BlockRegistry.slab_slate_slab_purple, BlockRegistry.doubleslab_slate_slab_purple);
        itemslab_slate_shingle = new BlockItem(r, BlockRegistry.slab_slate_shingle, BlockRegistry.doubleslab_slate_shingle);
        itemslab_slate_shingle_verte = new BlockItem(r, BlockRegistry.slab_slate_shingle_verte, BlockRegistry.doubleslab_slate_shingle_verte);
        itemslab_slate_shingle_purple = new BlockItem(r, BlockRegistry.slab_slate_shingle_purple, BlockRegistry.doubleslab_slate_shingle_purple);
        itemslab_slate_tile = new BlockItem(r, BlockRegistry.slab_slate_tile, BlockRegistry.doubleslab_slate_tile);
        itemslab_slate_tile_verte = new BlockItem(r, BlockRegistry.slab_slate_tile_verte, BlockRegistry.doubleslab_slate_tile_verte);
        itemslab_slate_tile_purple = new BlockItem(r, BlockRegistry.slab_slate_tile_purple, BlockRegistry.doubleslab_slate_tile_purple);
        itemslab_timber_oak = new BlockItem(r, BlockRegistry.slab_timber_oak, BlockRegistry.doubleslab_timber_oak);
        itemslab_timber_birch = new BlockItem(r, BlockRegistry.slab_timber_birch, BlockRegistry.doubleslab_timber_birch);
        itemslab_timber_spruce = new BlockItem(r, BlockRegistry.slab_timber_spruce, BlockRegistry.doubleslab_timber_spruce);
        itemslab_timber_jungle = new BlockItem(r, BlockRegistry.slab_timber_jungle, BlockRegistry.doubleslab_timber_jungle);
        itemslab_timber_acacia = new BlockItem(r, BlockRegistry.slab_timber_acacia, BlockRegistry.doubleslab_timber_acacia);
        itemslab_timber_dark_oak = new BlockItem(r, BlockRegistry.slab_timber_dark_oak, BlockRegistry.doubleslab_timber_dark_oak);
        itemslab_wattle = new BlockItem(r, BlockRegistry.slab_wattle, BlockRegistry.doubleslab_wattle);
        itemslab_wicker = new BlockItem(r, BlockRegistry.slab_wicker, BlockRegistry.doubleslab_wicker);
        itemslab_wood_shingle_oak = new BlockItem(r, BlockRegistry.slab_wood_shingle_oak, BlockRegistry.doubleslab_wood_shingle_oak);
        itemslab_wood_shingle_spruce = new BlockItem(r, BlockRegistry.slab_wood_shingle_spruce, BlockRegistry.doubleslab_wood_shingle_spruce);
        itemslab_wood_shingle_birch = new BlockItem(r, BlockRegistry.slab_wood_shingle_birch, BlockRegistry.doubleslab_wood_shingle_birch);
        itemslab_wood_shingle_jungle = new BlockItem(r, BlockRegistry.slab_wood_shingle_jungle, BlockRegistry.doubleslab_wood_shingle_jungle);
        itemslab_wood_shingle_acacia = new BlockItem(r, BlockRegistry.slab_wood_shingle_acacia, BlockRegistry.doubleslab_wood_shingle_acacia);
        itemslab_wood_shingle_dark_oak = new BlockItem(r, BlockRegistry.slab_wood_shingle_dark_oak, BlockRegistry.doubleslab_wood_shingle_dark_oak);

        blockItem(BlockRegistry.stair_adobe);
        blockItem(BlockRegistry.stair_chalk);
        blockItem(BlockRegistry.stair_cinder);
        blockItem(BlockRegistry.stair_cob);
        blockItem(BlockRegistry.stair_concrete);
        blockItem(BlockRegistry.stair_cordwood);
        blockItem(BlockRegistry.stair_dry_stone);
        blockItem(BlockRegistry.GRAVEL_GABION_STAIRS);
        blockItem(BlockRegistry.SAND_GABION_STAIRS);
        blockItem(BlockRegistry.DIRT_GABION_STAIRS);
        blockItem(BlockRegistry.stair_mud);
        blockItem(BlockRegistry.stair_planks_vert0);
        blockItem(BlockRegistry.stair_planks_vert1);
        blockItem(BlockRegistry.stair_planks_vert2);
        blockItem(BlockRegistry.stair_planks_vert3);
        blockItem(BlockRegistry.stair_planks_vert4);
        blockItem(BlockRegistry.stair_planks_vert5);
        blockItem(BlockRegistry.stair_plaster);
        blockItem(BlockRegistry.stair_rammed_earth);
        blockItem(BlockRegistry.stair_slate);
        blockItem(BlockRegistry.stair_slate_green);
        blockItem(BlockRegistry.stair_slate_purple);
        blockItem(BlockRegistry.stair_slate_slab);
        blockItem(BlockRegistry.stair_slate_slab_green);
        blockItem(BlockRegistry.stair_slate_slab_purple);
        blockItem(BlockRegistry.stair_slate_shingle);
        blockItem(BlockRegistry.stair_slate_shingle_verte);
        blockItem(BlockRegistry.stair_slate_shingle_purple);
        blockItem(BlockRegistry.stair_slate_tile);
        blockItem(BlockRegistry.stair_slate_tile_verte);
        blockItem(BlockRegistry.stair_slate_tile_purple);
        blockItem(BlockRegistry.stair_timber_oak);
        blockItem(BlockRegistry.stair_timber_birch);
        blockItem(BlockRegistry.stair_timber_spruce);
        blockItem(BlockRegistry.stair_timber_jungle);
        blockItem(BlockRegistry.stair_timber_acacia);
        blockItem(BlockRegistry.stair_timber_dark_oak);
        blockItem(BlockRegistry.stair_wattle);
        blockItem(BlockRegistry.stair_wicker);
        blockItem(BlockRegistry.stair_wood_shingle_oak);
        blockItem(BlockRegistry.stair_wood_shingle_spruce);
        blockItem(BlockRegistry.stair_wood_shingle_birch);
        blockItem(BlockRegistry.stair_wood_shingle_jungle);
        blockItem(BlockRegistry.stair_wood_shingle_acacia);
        blockItem(BlockRegistry.stair_wood_shingle_dark_oak);

        blockItem(BlockRegistry.wall_adobe);
        blockItem(BlockRegistry.wall_chalk);
        blockItem(BlockRegistry.wall_cinder);
        blockItem(BlockRegistry.wall_cob);
        blockItem(BlockRegistry.wall_concrete);
        blockItem(BlockRegistry.wall_cordwood);
        blockItem(BlockRegistry.wall_dry_stone);
        blockItem(BlockRegistry.wall_gabion0);
        blockItem(BlockRegistry.wall_gabion1);
        blockItem(BlockRegistry.wall_gabion2);
        blockItem(BlockRegistry.wall_mud);
        blockItem(BlockRegistry.wall_plaster);
        blockItem(BlockRegistry.wall_rammed_earth);
        blockItem(BlockRegistry.wall_slate);
        blockItem(BlockRegistry.wall_slate_green);
        blockItem(BlockRegistry.wall_slate_purple);
        blockItem(BlockRegistry.wall_slate_slab);
        blockItem(BlockRegistry.wall_slate_slab_green);
        blockItem(BlockRegistry.wall_slate_slab_purple);
        blockItem(BlockRegistry.wall_slate_shingle);
        blockItem(BlockRegistry.wall_slate_shingle_verte);
        blockItem(BlockRegistry.wall_slate_shingle_purple);
        blockItem(BlockRegistry.wall_slate_tile);
        blockItem(BlockRegistry.wall_slate_tile_verte);
        blockItem(BlockRegistry.wall_slate_tile_purple);
        blockItem(BlockRegistry.wall_timber_oak);
        blockItem(BlockRegistry.wall_timber_birch);
        blockItem(BlockRegistry.wall_timber_spruce);
        blockItem(BlockRegistry.wall_timber_jungle);
        blockItem(BlockRegistry.wall_timber_acacia);
        blockItem(BlockRegistry.wall_timber_dark_oak);
        blockItem(BlockRegistry.wall_wattle);
        blockItem(BlockRegistry.wall_wicker);
        blockItem(BlockRegistry.wall_wood_shingle_oak);
        blockItem(BlockRegistry.wall_wood_shingle_spruce);
        blockItem(BlockRegistry.wall_wood_shingle_birch);
        blockItem(BlockRegistry.wall_wood_shingle_jungle);
        blockItem(BlockRegistry.wall_wood_shingle_acacia);
        blockItem(BlockRegistry.wall_wood_shingle_dark_oak);
        blockItem(BlockRegistry.reed);
        blockItem(BlockRegistry.thatch);
        itemslab_reed = blockItem(BlockRegistry.slab_reed);
        itemslab_thatch = blockItem(BlockRegistry.slab_thatch);
        blockItem(BlockRegistry.stair_reed);
        blockItem(BlockRegistry.stair_thatch);
        blockItem(BlockRegistry.wall_reed);
        blockItem(BlockRegistry.wall_thatch);
    }

    private static BlockItem blockItem(Block block) {
        return new BlockItem(block, new Item.Properties().group(Earthworks.creativeTab));
    }
}
