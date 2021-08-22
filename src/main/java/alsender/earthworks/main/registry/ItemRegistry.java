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

    public static Item adobe_brick;
    public static Item cob_ball;
    public static Item lime_plaster;
    public static Item mud_ball;
    public static Item chalk_dust;
    public static Item quicklime;
    public static Item slaked_lime;
    public static Item timber_framing;

    public static Item tool_square;
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
    public static BlockItem reed_slab;
    public static BlockItem slate_slab;
    public static BlockItem slate_green_slab;
    public static BlockItem itemslab_slate_purple;
    public static BlockItem itemslab_slate_slab;
    public static BlockItem polished_green_slate_slab;
    public static BlockItem polished_purple_slate_slab;
    public static BlockItem blue_slate_shingles_slab;
    public static BlockItem green_slate_shingles_slab;
    public static BlockItem purple_slate_shingles_slab;
    public static BlockItem blue_slate_tiles_slab;
    public static BlockItem green_slate_tiles_slab;
    public static BlockItem purple_slate_tiles_slab;
    public static BlockItem thatch_slab;
    public static BlockItem oak_timber_slab;
    public static BlockItem birch_timber_slab;
    public static BlockItem spruce_timber_slab;
    public static BlockItem jungle_timber_slab;
    public static BlockItem acacia_timber_slab;
    public static BlockItem dark_oak_timber_slab;
    public static BlockItem wattle_and_daub_slab;
    public static BlockItem wicker_slab;
    public static BlockItem oak_wood_shakes_slab;
    public static BlockItem spruce_wood_shakes_slab;
    public static BlockItem birch_wood_shakes_slab;
    public static BlockItem jungle_wood_shakes_slab;
    public static BlockItem acacia_wood_shakes_slab;
    public static BlockItem dark_oak_wood_shakes_slab;

    public static BlockItem vertical_oak_planks;
    public static BlockItem vertical_spruce_planks;
    public static BlockItem vertical_birch_planks;
    public static BlockItem vertical_jungle_planks;
    public static BlockItem vertical_acacia_planks;
    public static BlockItem vertical_dark_oak_planks;

    public static BlockItem lath_and_plaster;
    public static BlockItem rammed_earth;
    public static BlockItem blue_slate;
    public static BlockItem green_slate;
    public static BlockItem purple_slate;
    public static BlockItem polished_blue_slate;
    public static BlockItem polished_green_slate;
    public static BlockItem polished_purple_slate;
    public static BlockItem blue_slate_shingle;
    public static BlockItem green_slate_shingle;
    public static BlockItem purple_slate_shingle;
    public static BlockItem blue_slate_tiles;
    public static BlockItem green_slate_tiles;
    public static BlockItem purple_slate_tiles;
    public static BlockItem oak_timber;
    public static BlockItem birch_timber;
    public static BlockItem spruce_timber;
    public static BlockItem jungle_timber;
    public static BlockItem acacia_timber;
    public static BlockItem dark_oak_timber;
    public static BlockItem wattle_and_daub;
    public static BlockItem wicker;
    public static BlockItem oak_shingle;

    public static BlockItem vertical_oak_fence;
    public static BlockItem vertical_spruce_fence;
    public static BlockItem vertical_birch_fence;
    public static BlockItem vertical_jungle_fence;
    public static BlockItem vertical_acacia_fence;
    public static BlockItem vertical_dark_oak_fence;


    public static BlockItem adobe_stairs;
    public static BlockItem chalk_stairs;
    public static BlockItem cinder_stairs;
    public static BlockItem cob_stairs;
    public static BlockItem concrete_stairs;
    public static BlockItem cordwood_stairs;
    public static BlockItem dry_fitted_stone_stairs;
    public static BlockItem GRAVEL_GABION_STAIRS;
    public static BlockItem SAND_GABION_STAIRS;
    public static BlockItem DIRT_GABION_STAIRS;
    public static BlockItem mud_stairs;
    public static BlockItem vertical_oak_stairs;
    public static BlockItem vertical_spruce_stairs;
    public static BlockItem vertical_birch_stairs;
    public static BlockItem vertical_jungle_stairs;
    public static BlockItem vertical_acacia_stairs;
    public static BlockItem vertical_dark_oak_stairs;
    public static BlockItem plaster_stairs;
    public static BlockItem rammed_earth_stairs;
    public static BlockItem blue_slate_stairs;
    public static BlockItem green_slate_stairs;
    public static BlockItem purple_slate_stairs;


    public static BlockItem daub_cob_arrow0;
    public static BlockItem daub_cob_arrow1;
    public static BlockItem daub_cob_arrow2;
    public static BlockItem daub_cob_arrow3;
    public static BlockItem daub_cob_barndoor0;
    public static BlockItem daub_cob_barndoor1;
    public static BlockItem daub_cob_barndoor2;
    public static BlockItem daub_cob_barndoor3;
    public static BlockItem daub_cob_barndoor4;
    public static BlockItem daub_cob_barndoor5;
    public static BlockItem daub_cob_barndoor6;
    public static BlockItem daub_cob_barndoor7;
    public static BlockItem daub_cob_bottom_l;
    public static BlockItem daub_cob_bottom;
    public static BlockItem daub_cob_bottom_r;
    public static BlockItem daub_cob_left;
    public static BlockItem daub_cob_parallel_hor;
    public static BlockItem daub_cob_parallel_vert;
    public static BlockItem daub_cob_right;
    public static BlockItem daub_cob_slash_back;
    public static BlockItem daub_cob_slash;
    public static BlockItem daub_cob_square;
    public static BlockItem daub_cob_square_x;
    public static BlockItem daub_cob_top_l;
    public static BlockItem daub_cob_top;
    public static BlockItem daub_cob_top_r;
    public static BlockItem daub_cob_triangle0;
    public static BlockItem daub_cob_triangle1;
    public static BlockItem daub_cob_triangle2;
    public static BlockItem daub_cob_triangle3;
    public static BlockItem daub_cob_xbottom;
    public static BlockItem daub_cob_xdoor0;
    public static BlockItem daub_cob_xdoor1;
    public static BlockItem daub_cob_xdoor2;
    public static BlockItem daub_cob_xdoor3;
    public static BlockItem daub_cob_xleft;
    public static BlockItem daub_cob_x;
    public static BlockItem daub_cob_xright;
    public static BlockItem daub_cob_xtop;

    public static BlockItem plaster_arrow0;
    public static BlockItem plaster_arrow1;
    public static BlockItem plaster_arrow2;
    public static BlockItem plaster_arrow3;
    public static BlockItem plaster_barndoor0;
    public static BlockItem plaster_barndoor1;
    public static BlockItem plaster_barndoor2;
    public static BlockItem plaster_barndoor3;
    public static BlockItem plaster_barndoor4;
    public static BlockItem plaster_barndoor5;
    public static BlockItem plaster_barndoor6;
    public static BlockItem plaster_barndoor7;
    public static BlockItem plaster_bottom_l;
    public static BlockItem plaster_bottom;
    public static BlockItem plaster_bottom_r;
    public static BlockItem plaster_left;
    public static BlockItem plaster_parallel_hor;
    public static BlockItem plaster_parallel_vert;
    public static BlockItem plaster_right;
    public static BlockItem plaster_slash_back;
    public static BlockItem plaster_slash;
    public static BlockItem plaster_square;
    public static BlockItem plaster_square_x;
    public static BlockItem plaster_top_l;
    public static BlockItem plaster_top;
    public static BlockItem plaster_top_r;
    public static BlockItem plaster_triangle0;
    public static BlockItem plaster_triangle1;
    public static BlockItem plaster_triangle2;
    public static BlockItem plaster_triangle3;
    public static BlockItem plaster_xbottom;
    public static BlockItem plaster_xdoor0;
    public static BlockItem plaster_xdoor1;
    public static BlockItem plaster_xdoor2;
    public static BlockItem plaster_xdoor3;
    public static BlockItem plaster_xleft;
    public static BlockItem plaster_x;
    public static BlockItem plaster_xright;
    public static BlockItem plaster_xtop;

    public static BlockItem adobe;
    public static BlockItem chalk;
    public static BlockItem cinder;
    public static BlockItem cob;
    public static BlockItem concrete;
    public static BlockItem cordwood;
    public static BlockItem dry_fitted_stone;
    public static BlockItem GRAVEL_GABION;
    public static BlockItem SAND_GABION;
    public static BlockItem DIRT_GABION;
    public static BlockItem mud;

    public static void initItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        adobe_brick = new Item(new Item.Properties().group(Earthworks.creativeTab));
        chalk_dust = new Item(new Item.Properties().group(Earthworks.creativeTab));
        cob_ball = new Item(new Item.Properties().group(Earthworks.creativeTab));
        lime_plaster = new Item(new Item.Properties().group(Earthworks.creativeTab));
        mud_ball = new Item(new Item.Properties().group(Earthworks.creativeTab));
        quicklime = new Item(new Item.Properties().group(Earthworks.creativeTab));
        slaked_lime = new Item(new Item.Properties().group(Earthworks.creativeTab));
        timber_framing = new Item(new Item.Properties().group(Earthworks.creativeTab));

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
        chalk = blockItem(BlockRegistry.chalk);
        cinder = blockItem(BlockRegistry.cinder);
        cob = blockItem(BlockRegistry.cob);
        concrete = blockItem(BlockRegistry.concrete);
        cordwood = blockItem(BlockRegistry.cordwood);
        dry_fitted_stone = blockItem(BlockRegistry.dry_fitted_stone);
        GRAVEL_GABION = blockItem(BlockRegistry.GRAVEL_GABION);
        SAND_GABION = blockItem(BlockRegistry.SAND_GABION);
        DIRT_GABION = blockItem(BlockRegistry.DIRT_GABION);
        mud = blockItem(BlockRegistry.mud);

        vertical_oak_planks = blockItem(BlockRegistry.vertical_oak_planks);
        vertical_spruce_planks = blockItem(BlockRegistry.vertical_spruce_planks);
        vertical_birch_planks = blockItem(BlockRegistry.vertical_birch_planks);
        vertical_jungle_planks = blockItem(BlockRegistry.vertical_jungle_planks);
        vertical_acacia_planks = blockItem(BlockRegistry.vertical_acacia_planks);
        vertical_dark_oak_planks = blockItem(BlockRegistry.vertical_dark_oak_planks);

        lath_and_plaster = blockItem(BlockRegistry.lath_and_plaster);
        rammed_earth = blockItem(BlockRegistry.rammed_earth);
        blue_slate = blockItem(BlockRegistry.blue_slate);
        green_slate = blockItem(BlockRegistry.green_slate);
        purple_slate = blockItem(BlockRegistry.purple_slate);
        polished_blue_slate = blockItem(BlockRegistry.polished_blue_slate);
        polished_green_slate = blockItem(BlockRegistry.polished_green_slate);
        polished_purple_slate = blockItem(BlockRegistry.polished_purple_slate);
        blue_slate_shingle = blockItem(BlockRegistry.blue_slate_shingles);
        green_slate_shingle = blockItem(BlockRegistry.green_slate_shingles);
        purple_slate_shingle = blockItem(BlockRegistry.purple_slate_shingles);
        blue_slate_tiles = blockItem(BlockRegistry.blue_slate_tiles);
        green_slate_tiles = blockItem(BlockRegistry.green_slate_tiles);
        purple_slate_tiles = blockItem(BlockRegistry.purple_slate_tiles);
        oak_timber = blockItem(BlockRegistry.oak_timber);
        birch_timber = blockItem(BlockRegistry.birch_timber);
        spruce_timber = blockItem(BlockRegistry.spruce_timber);
        jungle_timber = blockItem(BlockRegistry.jungle_timber);
        acacia_timber = blockItem(BlockRegistry.acacia_timber);
        dark_oak_timber = blockItem(BlockRegistry.dark_oak_timber);
        wattle_and_daub = blockItem(BlockRegistry.wattle_and_daub);
        wicker = blockItem(BlockRegistry.wicker);
        oak_shingle = blockItem(BlockRegistry.oak_wood_shakes);

        vertical_oak_fence = blockItem(BlockRegistry.vertical_oak_fence);
        vertical_spruce_fence = blockItem(BlockRegistry.vertical_spruce_fence);
        vertical_birch_fence = blockItem(BlockRegistry.vertical_birch_fence);
        vertical_jungle_fence = blockItem(BlockRegistry.vertical_jungle_fence);
        vertical_acacia_fence = blockItem(BlockRegistry.vertical_acacia_fence);
        vertical_dark_oak_fence = blockItem(BlockRegistry.vertical_dark_oak_fence);

        adobe_slab = blockItem(BlockRegistry.adobe_slab);
        chalk_slab = blockItem(BlockRegistry.chalk_slab);
        cinder_slab = blockItem(BlockRegistry.cinder_slab);
        cob_slab = blockItem(BlockRegistry.cob_slab);
        concrete_slab = blockItem(BlockRegistry.concrete_slab);
        cordwood_slab = blockItem(BlockRegistry.cordwood_slab);
        dry_stone_slab = blockItem(BlockRegistry.dry_fitted_stone_slab);
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
        plaster_slab = blockItem(BlockRegistry.lath_and_plaster_slab);
        rammed_earth_slab = blockItem(BlockRegistry.rammed_earth_slab);
        slate_slab = blockItem(BlockRegistry.blue_slate_slab);
        slate_green_slab = blockItem(BlockRegistry.green_slate_slab);
        itemslab_slate_purple = blockItem(BlockRegistry.purple_slate_slab);
        itemslab_slate_slab = blockItem(BlockRegistry.polished_blue_slate_slab);
        polished_green_slate_slab = blockItem(BlockRegistry.polished_green_slate_slab);
        polished_purple_slate_slab = blockItem(BlockRegistry.polished_purple_slate_slab);
        blue_slate_shingles_slab = blockItem(BlockRegistry.blue_slate_shingles_slab);
        green_slate_shingles_slab = blockItem(BlockRegistry.green_slate_shingles_slab);
        purple_slate_shingles_slab = blockItem(BlockRegistry.purple_slate_shingles_slab);
        blue_slate_tiles_slab = blockItem(BlockRegistry.blue_slate_tiles_slab);
        green_slate_tiles_slab = blockItem(BlockRegistry.green_slate_tiles_slab);
        purple_slate_tiles_slab = blockItem(BlockRegistry.purple_slate_tiles_slab);
        oak_timber_slab = blockItem(BlockRegistry.oak_timber_slab);
        birch_timber_slab = blockItem(BlockRegistry.birch_timber_slab);
        spruce_timber_slab = blockItem(BlockRegistry.spruce_timber_slab);
        jungle_timber_slab = blockItem(BlockRegistry.jungle_timber_slab);
        acacia_timber_slab = blockItem(BlockRegistry.acacia_timber_slab);
        dark_oak_timber_slab = blockItem(BlockRegistry.dark_oak_timber_slab);
        wattle_and_daub_slab = blockItem(BlockRegistry.wattle_and_daub_slab);
        wicker_slab = blockItem(BlockRegistry.wicker_slab);
        oak_wood_shakes_slab = blockItem(BlockRegistry.oak_wood_shakes_slab);
        spruce_wood_shakes_slab = blockItem(BlockRegistry.spruce_wood_shakes_slab);
        birch_wood_shakes_slab = blockItem(BlockRegistry.birch_wood_shakes_slab);
        jungle_wood_shakes_slab = blockItem(BlockRegistry.jungle_wood_shakes_slab);
        acacia_wood_shakes_slab = blockItem(BlockRegistry.acacia_wood_shakes_slab);
        dark_oak_wood_shakes_slab = blockItem(BlockRegistry.dark_oak_wood_shakes_slab);

        adobe_stairs = blockItem(BlockRegistry.adobe_stairs);
        chalk_stairs = blockItem(BlockRegistry.chalk_stairs);
        cinder_stairs = blockItem(BlockRegistry.cinder_stairs);
        cob_stairs = blockItem(BlockRegistry.cob_stairs);
        concrete_stairs = blockItem(BlockRegistry.concrete_stairs);
        cordwood_stairs = blockItem(BlockRegistry.cordwood_stairs);
        dry_fitted_stone_stairs = blockItem(BlockRegistry.dry_fitted_stone_stairs);
        GRAVEL_GABION_STAIRS = blockItem(BlockRegistry.GRAVEL_GABION_STAIRS);
        SAND_GABION_STAIRS = blockItem(BlockRegistry.SAND_GABION_STAIRS);
        DIRT_GABION_STAIRS = blockItem(BlockRegistry.DIRT_GABION_STAIRS);
        mud_stairs = blockItem(BlockRegistry.mud_stairs);
        vertical_oak_stairs = blockItem(BlockRegistry.vertical_oak_stairs);
        vertical_spruce_stairs = blockItem(BlockRegistry.vertical_spruce_stairs);
        vertical_birch_stairs = blockItem(BlockRegistry.vertical_birch_stairs);
        vertical_jungle_stairs = blockItem(BlockRegistry.vertical_jungle_stairs);
        vertical_acacia_stairs = blockItem(BlockRegistry.vertical_acacia_stairs);
        vertical_dark_oak_stairs = blockItem(BlockRegistry.vertical_dark_oak_stairs);
        plaster_stairs = blockItem(BlockRegistry.plaster_stairs);
        rammed_earth_stairs = blockItem(BlockRegistry.rammed_earth_stairs);
        blue_slate_stairs = blockItem(BlockRegistry.blue_slate_stairs);
        green_slate_stairs = blockItem(BlockRegistry.green_slate_stairs);
        purple_slate_stairs = blockItem(BlockRegistry.purple_slate_stairs);
        blockItem(BlockRegistry.polished_blue_slate_stairs);
        blockItem(BlockRegistry.polished_green_slate_stairs);
        blockItem(BlockRegistry.polished_purple_slate_stairs);
        blockItem(BlockRegistry.blue_slate_shingles_stairs);
        blockItem(BlockRegistry.green_slate_shingles_stairs);
        blockItem(BlockRegistry.purple_slate_shingles_stairs);
        blockItem(BlockRegistry.blue_slate_tile_stairs);
        blockItem(BlockRegistry.green_slate_tile_stairs);
        blockItem(BlockRegistry.purple_slate_tile_stairs);
        blockItem(BlockRegistry.oak_timber_stairs);
        blockItem(BlockRegistry.birch_timber_stairs);
        blockItem(BlockRegistry.spruce_timber_stairs);
        blockItem(BlockRegistry.jungle_timber_stairs);
        blockItem(BlockRegistry.acacia_timber_stairs);
        blockItem(BlockRegistry.dark_oak_timber_stairs);
        blockItem(BlockRegistry.wattle_and_daub_stairs);
        blockItem(BlockRegistry.wicker_stairs);
        blockItem(BlockRegistry.oak_shingle_stairs);
        blockItem(BlockRegistry.spruce_shingle_stairs);
        blockItem(BlockRegistry.birch_shingle_stairs);
        blockItem(BlockRegistry.jungle_shingle_stairs);
        blockItem(BlockRegistry.acacia_shingle_stairs);
        blockItem(BlockRegistry.dark_oak_shingle_stairs);

        blockItem(BlockRegistry.adobe_wall);
        blockItem(BlockRegistry.chalk_wall);
        blockItem(BlockRegistry.cinder_wall);
        blockItem(BlockRegistry.cob_wall);
        blockItem(BlockRegistry.concrete_wall);
        blockItem(BlockRegistry.cordwood_wall);
        blockItem(BlockRegistry.dry_fitted_stone_wall);
        blockItem(BlockRegistry.GRAVEL_GABION_WALL);
        blockItem(BlockRegistry.SAND_GABION_WALL);
        blockItem(BlockRegistry.DIRT_GABION_WALL);
        blockItem(BlockRegistry.mud_wall);
        blockItem(BlockRegistry.lath_and_plaster_wall);
        blockItem(BlockRegistry.rammed_earth_wall);
        blockItem(BlockRegistry.blue_slate_wall);
        blockItem(BlockRegistry.green_slate_wall);
        blockItem(BlockRegistry.purple_slate_wall);
        blockItem(BlockRegistry.polished_blue_slate_wall);
        blockItem(BlockRegistry.polished_green_slate_wall);
        blockItem(BlockRegistry.polished_purple_slate_wall);
        blockItem(BlockRegistry.blue_slate_shingles_wall);
        blockItem(BlockRegistry.wall_slate_shingle_verte);
        blockItem(BlockRegistry.wall_slate_shingle_purple);
        blockItem(BlockRegistry.blue_slate_tiles_wall);
        blockItem(BlockRegistry.green_slate_tiles_wall);
        blockItem(BlockRegistry.purple_slate_tiles_wall);
        blockItem(BlockRegistry.oak_timber_wall);
        blockItem(BlockRegistry.birch_timber_wall);
        blockItem(BlockRegistry.spruce_timber_wall);
        blockItem(BlockRegistry.jungle_timber_wall);
        blockItem(BlockRegistry.acacia_timber_wall);
        blockItem(BlockRegistry.dark_oak_timber_wall);
        blockItem(BlockRegistry.wattle_and_daub_wall);
        blockItem(BlockRegistry.wicker_wall);
        blockItem(BlockRegistry.oak_wood_shakes_wall);
        blockItem(BlockRegistry.spruce_wood_shakes_wall);
        blockItem(BlockRegistry.birch_wood_shakes_wall);
        blockItem(BlockRegistry.jungle_wood_shakes_wall);
        blockItem(BlockRegistry.acacia_wood_shakes_wall);
        blockItem(BlockRegistry.dark_oak_wood_shakes_wall);
        blockItem(BlockRegistry.reed);
        blockItem(BlockRegistry.thatch);
        reed_slab = blockItem(BlockRegistry.reed_slab);
        thatch_slab = blockItem(BlockRegistry.thatch_slab);
        blockItem(BlockRegistry.reed_stairs);
        blockItem(BlockRegistry.thatch_stairs);
        blockItem(BlockRegistry.reed_wall);
        blockItem(BlockRegistry.thatch_wall);

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
