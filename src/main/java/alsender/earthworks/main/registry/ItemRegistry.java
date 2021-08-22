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
    public static BlockItem adobe_slab;
    public static BlockItem chalk_slab;
    public static BlockItem cinder_slab;
    public static BlockItem cob_slab;
    public static BlockItem concrete_slab;
    public static BlockItem cordwood_slab;
    public static BlockItem dry_stone_slab;
    public static BlockItem GRAVEL_GABION_SLAB;
    public static BlockItem SAND_GABION_SLAB;
    public static BlockItem DIRT_GABION_SLAB;
    public static BlockItem mud_slab;
    public static BlockItem vertical_oak_slab;
    public static BlockItem vertical_spruce_slab;
    public static BlockItem vertical_birch_slab;
    public static BlockItem vertical_jungle_slab;
    public static BlockItem vertical_acacia_slab;
    public static BlockItem vertical_dark_oak_slab;
    public static BlockItem plaster_slab;
    public static BlockItem rammed_earth_slab;
    public static BlockItem itemslab_reed;
    public static BlockItem slate_slab;
    public static BlockItem slate_green_slab;
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

        blockItem(BlockRegistry.vertical_oak_planks);

        blockItem(BlockRegistry.plaster);
        blockItem(BlockRegistry.rammed_earth);
        blockItem(BlockRegistry.slate);
        blockItem(BlockRegistry.green_slate);
        blockItem(BlockRegistry.purple_slate);
        blockItem(BlockRegistry.slate_slabs);
        blockItem(BlockRegistry.polished_green_slate);
        blockItem(BlockRegistry.polished_purple_slate);
        blockItem(BlockRegistry.slate_shingle);
        blockItem(BlockRegistry.green_slate_shingle);
        blockItem(BlockRegistry.purple_slate_shingle);
        blockItem(BlockRegistry.slate_tile);
        blockItem(BlockRegistry.green_slate_tile);
        blockItem(BlockRegistry.purple_slate_tile);
        blockItem(BlockRegistry.oak_timber);
        blockItem(BlockRegistry.birch_timber);
        blockItem(BlockRegistry.spruce_timber);
        blockItem(BlockRegistry.jungle_timber);
        blockItem(BlockRegistry.acacia_timber);
        blockItem(BlockRegistry.dark_oak_timber);
        blockItem(BlockRegistry.wattle);
        blockItem(BlockRegistry.wicker);
        blockItem(BlockRegistry.oak_shingle);

        blockItem(BlockRegistry.vertical_oak_fence);
        blockItem(BlockRegistry.vertical_spruce_fence);
        blockItem(BlockRegistry.vertical_birch_fence);
        blockItem(BlockRegistry.vertical_jungle_fence);
        blockItem(BlockRegistry.vertical_acacia_fence);
        blockItem(BlockRegistry.vertical_dark_oak_fence);

        adobe_slab = blockItem(BlockRegistry.adobe_slab);
        chalk_slab = blockItem(BlockRegistry.chalk_slab);
        cinder_slab = blockItem(BlockRegistry.cinder_slab);
        cob_slab = blockItem(BlockRegistry.cob_slab);
        concrete_slab = blockItem(BlockRegistry.concrete_slab);
        cordwood_slab = blockItem(BlockRegistry.cordwood_slab);
        dry_stone_slab = blockItem(BlockRegistry.dry_stone_slab);
        GRAVEL_GABION_SLAB = blockItem(BlockRegistry.GRAVEL_GABION_SLAB);
        SAND_GABION_SLAB = blockItem(BlockRegistry.SAND_GABION_SLAB);
        DIRT_GABION_SLAB = blockItem(BlockRegistry.DIRT_GABION_SLAB);
        mud_slab = blockItem(BlockRegistry.mud_slab);
        vertical_oak_slab = blockItem(BlockRegistry.vertical_oak_slab);
        vertical_spruce_slab = blockItem(BlockRegistry.vertical_spruce_slab);
        vertical_birch_slab = blockItem(BlockRegistry.vertical_birch_slab);
        vertical_jungle_slab = blockItem(BlockRegistry.vertical_jungle_slab);
        vertical_acacia_slab = blockItem(BlockRegistry.vertical_acacia_slab);
        vertical_dark_oak_slab = blockItem(BlockRegistry.vertical_dark_oak_slab);
        plaster_slab = blockItem(BlockRegistry.plaster_slab);
        rammed_earth_slab = blockItem(BlockRegistry.rammed_earth_slab);
        slate_slab = blockItem(BlockRegistry.slate_slab);
        slate_green_slab = blockItem(BlockRegistry.green_slate_slab);
        itemslab_slate_purple = blockItem(BlockRegistry.slab_slate_purple);
        itemslab_slate_slab = blockItem(BlockRegistry.slab_slate_slab);
        green_slate_slab = blockItem(BlockRegistry.slab_slate_slab_green);
        purple_slate_slab = blockItem(BlockRegistry.slab_slate_slab_purple);
        itemslab_slate_shingle = blockItem(BlockRegistry.slab_slate_shingle);
        itemslab_slate_shingle_verte = blockItem(BlockRegistry.green_slate_shingle_slab);
        itemslab_slate_shingle_purple = blockItem(BlockRegistry.purple_slate_shingle_slab);
        slate_tile_slab = blockItem(BlockRegistry.slate_tile_slab);
        itemslab_slate_tile_verte = blockItem(BlockRegistry.green_slate_tile_slab);
        itemslab_slate_tile_purple = blockItem(BlockRegistry.purple_slate_tile_slab);
        itemslab_timber_oak = blockItem(BlockRegistry.oak_timber_slab);
        itemslab_timber_birch = blockItem(BlockRegistry.birch_timber_slab);
        itemslab_timber_spruce = blockItem(BlockRegistry.slab_timber_spruce);
        itemslab_timber_jungle = blockItem(BlockRegistry.slab_timber_jungle);
        itemslab_timber_acacia = blockItem(BlockRegistry.slab_timber_acacia);
        itemslab_timber_dark_oak = blockItem(BlockRegistry.slab_timber_dark_oak);
        itemslab_wattle = blockItem(BlockRegistry.wattle_slab);
        itemslab_wicker = blockItem(BlockRegistry.wicker_slab);
        itemslab_wood_shingle_oak = blockItem(BlockRegistry.oak_shingle_slab);
        itemslab_wood_shingle_spruce = blockItem(BlockRegistry.spruce_shingle_slab);
        itemslab_wood_shingle_birch = blockItem(BlockRegistry.birch_shingle_slab);
        itemslab_wood_shingle_jungle = blockItem(BlockRegistry.jungle_shingle_slab);
        itemslab_wood_shingle_acacia = blockItem(BlockRegistry.acacia_shingle_slab);
        itemslab_wood_shingle_dark_oak = blockItem(BlockRegistry.dark_oak_shingle_slab);

        blockItem(BlockRegistry.adobe_stairs);
        blockItem(BlockRegistry.chalk_stairs);
        blockItem(BlockRegistry.cinder_stairs);
        blockItem(BlockRegistry.cob_stairs);
        blockItem(BlockRegistry.concrete_stairs);
        blockItem(BlockRegistry.cordwood_stairs);
        blockItem(BlockRegistry.dry_stone_stairs);
        blockItem(BlockRegistry.GRAVEL_GABION_STAIRS);
        blockItem(BlockRegistry.SAND_GABION_STAIRS);
        blockItem(BlockRegistry.DIRT_GABION_STAIRS);
        blockItem(BlockRegistry.mud_stairs);
        blockItem(BlockRegistry.vertical_oak_stairs);
        blockItem(BlockRegistry.vertical_spruce_stairs);
        blockItem(BlockRegistry.vertical_birch_stairs);
        blockItem(BlockRegistry.vertical_jungle_stairs);
        blockItem(BlockRegistry.vertical_acacia_stairs);
        blockItem(BlockRegistry.vertical_dark_oak_stairs);
        blockItem(BlockRegistry.plaster_stairs);
        blockItem(BlockRegistry.rammed_earth_stairs);
        blockItem(BlockRegistry.slate_stairs);
        blockItem(BlockRegistry.green_slate_stairs);
        blockItem(BlockRegistry.stair_slate_purple);
        blockItem(BlockRegistry.slate_slab_stairs);
        blockItem(BlockRegistry.green_slate_slab_stairs);
        blockItem(BlockRegistry.purple_slate_slab_stairs);
        blockItem(BlockRegistry.slate_shingle_stairs);
        blockItem(BlockRegistry.green_slate_shingle_stairs);
        blockItem(BlockRegistry.purple_slate_shingle_stairs);
        blockItem(BlockRegistry.slate_tile_stairs);
        blockItem(BlockRegistry.green_slate_tile_stairs);
        blockItem(BlockRegistry.purple_slate_tile_stairs);
        blockItem(BlockRegistry.oak_timber_stairs);
        blockItem(BlockRegistry.birch_timber_stairs);
        blockItem(BlockRegistry.spruce_timber_stairs);
        blockItem(BlockRegistry.jungle_timber_stairs);
        blockItem(BlockRegistry.acacia_timber_stairs);
        blockItem(BlockRegistry.dark_oak_timber_stairs);
        blockItem(BlockRegistry.wattle_stairs);
        blockItem(BlockRegistry.wicker_stairs);
        blockItem(BlockRegistry.oak_shingle_stairs);
        blockItem(BlockRegistry.spruce_shingle_stairs);
        blockItem(BlockRegistry.birch_shingle_stairs);
        blockItem(BlockRegistry.jungle_shingle_stairs);
        blockItem(BlockRegistry.acacia_shingle_stairs);
        blockItem(BlockRegistry.dark_oak_shingle_stairs);

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
        itemslab_reed = blockItem(BlockRegistry.reed_slab);
        itemslab_thatch = blockItem(BlockRegistry.thatch_slab);
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
