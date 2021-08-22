package alsender.earthworks.main.registry;


import alsender.earthworks.item.ModItemTool;
import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by alsender on 12/12/16.
 */
@Mod.EventBusSubscriber
public class ItemRegistry {

    public static Item
            item_adobe;
    public static Item item_cob;
    public static Item item_lime_plaster;
    public static Item item_mud;
    public static Item item_chalk;
    public static Item item_quicklime;
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
    public static BlockItem vertical_oak_slab;
    public static BlockItem vertical_spruce_slab;
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
    public static BlockItem green_slate_slab;
    public static BlockItem purple_slate_slab;
    public static BlockItem itemslab_slate_shingle;
    public static BlockItem itemslab_slate_shingle_verte;
    public static BlockItem itemslab_slate_shingle_purple;
    public static BlockItem slate_tile_slab;
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

    public static BlockItem adobe;

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

        adobe = blockItem(BlockRegistry.adobe);
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
        blockItem(BlockRegistry.purple_slate_slab);
        blockItem(BlockRegistry.slate_shingle);
        blockItem(BlockRegistry.slate_shingle_verte);
        blockItem(BlockRegistry.purple_slate_shingle);
        blockItem(BlockRegistry.slate_tile);
        blockItem(BlockRegistry.slate_tile_verte);
        blockItem(BlockRegistry.slate_tile_purple);
        blockItem(BlockRegistry.timber_oak);
        blockItem(BlockRegistry.timber_birch);
        blockItem(BlockRegistry.timber_spruce);
        blockItem(BlockRegistry.timber_jungle);
        blockItem(BlockRegistry.acacia_timber);
        blockItem(BlockRegistry.timber_dark_oak);
        blockItem(BlockRegistry.wattle);
        blockItem(BlockRegistry.wicker);
        blockItem(BlockRegistry.oak_wood_shingle);

        blockItem(BlockRegistry.vertical_oak_fence);
        blockItem(BlockRegistry.vertical_spruce_fence);
        blockItem(BlockRegistry.vertical_birch_fence);
        blockItem(BlockRegistry.vertical_jungle_fence);
        blockItem(BlockRegistry.vertical_acacia_fence);
        blockItem(BlockRegistry.vertical_dark_oak_fence);

        itemslab_adobe = blockItem(BlockRegistry.slab_adobe);
        chalk_slab = blockItem(BlockRegistry.chalk_slab);
        cinder_slab = blockItem(BlockRegistry.slab_cinder);
        itemslab_cob = blockItem(BlockRegistry.slab_cob);
        itemslab_concrete = blockItem(BlockRegistry.slab_concrete);
        itemslab_cordwood = blockItem(BlockRegistry.slab_cordwood);
        itemslab_dry_stone = blockItem(BlockRegistry.slab_dry_stone);
        itemslab_gabion0 = blockItem(BlockRegistry.slab_gabion0);
        itemslab_gabion1 = blockItem(BlockRegistry.slab_gabion1);
        itemslab_gabion2 = blockItem(BlockRegistry.slab_gabion2);
        itemslab_mud = blockItem(BlockRegistry.slab_mud);
        vertical_oak_slab = blockItem(BlockRegistry.vertical_oak_slab);
        vertical_spruce_slab = blockItem(BlockRegistry.vertical_spruce_slab);
        itemslab_planks_vert2 = blockItem(BlockRegistry.vertical_birch_slab);
        itemslab_planks_vert3 = blockItem(BlockRegistry.vertical_jungle_slab);
        itemslab_planks_vert4 = blockItem(BlockRegistry.vertical_acacia_slab);
        itemslab_planks_vert5 = blockItem(BlockRegistry.vertical_dark_oak_slab);
        itemslab_plaster = blockItem(BlockRegistry.plaster_slab);
        itemslab_rammed_earth = blockItem(BlockRegistry.slab_rammed_earth);
        itemslab_slate = blockItem(BlockRegistry.slab_slate);
        itemslab_slate_green = blockItem(BlockRegistry.slab_slate_green);
        itemslab_slate_purple = blockItem(BlockRegistry.slab_slate_purple);
        itemslab_slate_slab = blockItem(BlockRegistry.slab_slate_slab);
        green_slate_slab = blockItem(BlockRegistry.slab_slate_slab_green);
        purple_slate_slab = blockItem(BlockRegistry.slab_slate_slab_purple);
        itemslab_slate_shingle = blockItem(BlockRegistry.slab_slate_shingle);
        itemslab_slate_shingle_verte = blockItem(BlockRegistry.slab_slate_shingle_verte);
        itemslab_slate_shingle_purple = blockItem(BlockRegistry.slab_slate_shingle_purple);
        slate_tile_slab = blockItem(BlockRegistry.slate_tile_slab);
        itemslab_slate_tile_verte = blockItem(BlockRegistry.slab_slate_tile_verte);
        itemslab_slate_tile_purple = blockItem(BlockRegistry.slab_slate_tile_purple);
        itemslab_timber_oak = blockItem(BlockRegistry.slab_timber_oak);
        itemslab_timber_birch = blockItem(BlockRegistry.slab_timber_birch);
        itemslab_timber_spruce = blockItem(BlockRegistry.slab_timber_spruce);
        itemslab_timber_jungle = blockItem(BlockRegistry.slab_timber_jungle);
        itemslab_timber_acacia = blockItem(BlockRegistry.slab_timber_acacia);
        itemslab_timber_dark_oak = blockItem(BlockRegistry.slab_timber_dark_oak);
        itemslab_wattle = blockItem(BlockRegistry.slab_wattle);
        itemslab_wicker = blockItem(BlockRegistry.slab_wicker);
        itemslab_wood_shingle_oak = blockItem(BlockRegistry.slab_wood_shingle_oak);
        itemslab_wood_shingle_spruce = blockItem(BlockRegistry.slab_wood_shingle_spruce);
        itemslab_wood_shingle_birch = blockItem(BlockRegistry.slab_wood_shingle_birch);
        itemslab_wood_shingle_jungle = blockItem(BlockRegistry.slab_wood_shingle_jungle);
        itemslab_wood_shingle_acacia = blockItem(BlockRegistry.slab_wood_shingle_acacia);
        itemslab_wood_shingle_dark_oak = blockItem(BlockRegistry.slab_wood_shingle_dark_oak);

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
        blockItem(BlockRegistry.purple_slate_slab_stairs);
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

        blockItem(BlockRegistry.adobe_wall);
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

        blockItem(BlockRegistry.daub_cob_arrow0);
        blockItem(BlockRegistry.daub_cob_arrow1);
        blockItem(BlockRegistry.daub_cob_arrow2);
        blockItem(BlockRegistry.daub_cob_arrow3);
        blockItem(BlockRegistry.daub_cob_barndoor0);
        blockItem(BlockRegistry.daub_cob_barndoor1);
        blockItem(BlockRegistry.daub_cob_barndoor2);
        blockItem(BlockRegistry.daub_cob_barndoor3);
        blockItem(BlockRegistry.daub_cob_barndoor4);
        blockItem(BlockRegistry.daub_cob_barndoor5);
        blockItem(BlockRegistry.daub_cob_barndoor6);
        blockItem(BlockRegistry.daub_cob_barndoor7);
        blockItem(BlockRegistry.daub_cob_bottom_l);
        blockItem(BlockRegistry.daub_cob_bottom);
        blockItem(BlockRegistry.daub_cob_bottom_r);
        blockItem(BlockRegistry.daub_cob_left);
        blockItem(BlockRegistry.daub_cob_parallel_hor);
        blockItem(BlockRegistry.daub_cob_parallel_vert);
        blockItem(BlockRegistry.daub_cob_right);
        blockItem(BlockRegistry.daub_cob_slash_back);
        blockItem(BlockRegistry.daub_cob_slash);
        blockItem(BlockRegistry.daub_cob_square);
        blockItem(BlockRegistry.daub_cob_square_x);
        blockItem(BlockRegistry.daub_cob_top_l);
        blockItem(BlockRegistry.daub_cob_top);
        blockItem(BlockRegistry.daub_cob_top_r);
        blockItem(BlockRegistry.daub_cob_triangle0);
        blockItem(BlockRegistry.daub_cob_triangle1);
        blockItem(BlockRegistry.daub_cob_triangle2);
        blockItem(BlockRegistry.daub_cob_triangle3);
        blockItem(BlockRegistry.daub_cob_xbottom);
        blockItem(BlockRegistry.daub_cob_xdoor0);
        blockItem(BlockRegistry.daub_cob_xdoor1);
        blockItem(BlockRegistry.daub_cob_xdoor2);
        blockItem(BlockRegistry.daub_cob_xdoor3);
        blockItem(BlockRegistry.daub_cob_xleft);
        blockItem(BlockRegistry.daub_cob_x);
        blockItem(BlockRegistry.daub_cob_xright);
        blockItem(BlockRegistry.daub_cob_xtop);

        blockItem(BlockRegistry.plaster_arrow0);
        blockItem(BlockRegistry.plaster_arrow1);
        blockItem(BlockRegistry.plaster_arrow2);
        blockItem(BlockRegistry.plaster_arrow3);
        blockItem(BlockRegistry.plaster_barndoor0);
        blockItem(BlockRegistry.plaster_barndoor1);
        blockItem(BlockRegistry.plaster_barndoor2);
        blockItem(BlockRegistry.plaster_barndoor3);
        blockItem(BlockRegistry.plaster_barndoor4);
        blockItem(BlockRegistry.plaster_barndoor5);
        blockItem(BlockRegistry.plaster_barndoor6);
        blockItem(BlockRegistry.plaster_barndoor7);
        blockItem(BlockRegistry.plaster_bottom_l);
        blockItem(BlockRegistry.plaster_bottom);
        blockItem(BlockRegistry.plaster_bottom_r);
        blockItem(BlockRegistry.plaster_left);
        blockItem(BlockRegistry.plaster_parallel_hor);
        blockItem(BlockRegistry.plaster_parallel_vert);
        blockItem(BlockRegistry.plaster_right);
        blockItem(BlockRegistry.plaster_slash_back);
        blockItem(BlockRegistry.plaster_slash);
        blockItem(BlockRegistry.plaster_square);
        blockItem(BlockRegistry.plaster_square_x);
        blockItem(BlockRegistry.plaster_top_l);
        blockItem(BlockRegistry.plaster_top);
        blockItem(BlockRegistry.plaster_top_r);
        blockItem(BlockRegistry.plaster_triangle0);
        blockItem(BlockRegistry.plaster_triangle1);
        blockItem(BlockRegistry.plaster_triangle2);
        blockItem(BlockRegistry.plaster_triangle3);
        blockItem(BlockRegistry.plaster_xbottom);
        blockItem(BlockRegistry.plaster_xdoor0);
        blockItem(BlockRegistry.plaster_xdoor1);
        blockItem(BlockRegistry.plaster_xdoor2);
        blockItem(BlockRegistry.plaster_xdoor3);
        blockItem(BlockRegistry.plaster_xleft);
        blockItem(BlockRegistry.plaster_x);
        blockItem(BlockRegistry.plaster_xright);
        blockItem(BlockRegistry.plaster_xtop);

        Field[] fields = ItemRegistry.class.getFields();

        for (Field field : fields) {
            try {
                if (field.get(null) instanceof Item) {
                    Item item = (Item) field.get(null);
                    item.setRegistryName(field.getName().toLowerCase(Locale.ROOT));
                    r.register(item);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static BlockItem blockItem(Block block) {
        return new BlockItem(block, new Item.Properties().group(Earthworks.creativeTab));
    }

    private static final List<Item> cache = new ArrayList<>();

    public static List<Item> getAllItems() {
        if (cache.isEmpty()) {
            Field[] fields = ItemRegistry.class.getFields();

            for (Field field : fields) {
                try {
                    if (field.get(null) instanceof Item) {
                        cache.add((Item) field.get(null));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return cache;
    }

}
