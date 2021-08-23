package alsender.earthworks.main.registry;


import alsender.earthworks.block.*;
import alsender.earthworks.block.timber.Daub_Cob;
import alsender.earthworks.block.timber.Plaster;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
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
public class BlockRegistry {

    public static Block adobe;
    public static Block chalk;
    public static Block cinder;
    public static Block cob;
    public static Block concrete;
    public static Block cordwood;
    public static Block dry_fitted_stone;
    public static Block GRAVEL_GABION;
    public static Block SAND_GABION;
    public static Block DIRT_GABION;

    public static Block mud;
    public static Block vertical_oak_planks;
    public static Block vertical_birch_planks;
    public static Block vertical_jungle_planks;
    public static Block vertical_spruce_planks;
    public static Block vertical_acacia_planks;
    public static Block vertical_dark_oak_planks;

    public static Block lath_and_plaster;
    public static Block rammed_earth;
    public static RotatedPillarBlock reed;
    public static Block blue_slate;
    public static Block green_slate;
    public static Block purple_slate;
    public static Block polished_blue_slate;
    public static Block polished_green_slate;
    public static Block polished_purple_slate;
    public static Block blue_slate_shingles;
    public static Block green_slate_shingles;
    public static Block purple_slate_shingles;
    public static Block blue_slate_tiles;
    public static Block green_slate_tiles;
    public static Block purple_slate_tiles;
    public static RotatedPillarBlock thatch;
    public static Block oak_timber;
    public static Block birch_timber;
    public static Block spruce_timber;
    public static Block jungle_timber;
    public static Block acacia_timber;
    public static Block dark_oak_timber;
    public static Block wattle_and_daub;
    public static Block wicker;
    public static Block oak_wood_shakes;
    public static Block birch_wood_shakes;
    public static Block jungle_wood_shakes;
    public static Block spruce_wood_shakes;
    public static Block acacia_wood_shakes;
    public static Block dark_oak_wood_shakes;

    public static Block vertical_oak_fence;
    public static Block vertical_spruce_fence;
    public static Block vertical_birch_fence;
    public static Block vertical_jungle_fence;
    public static Block vertical_acacia_fence;
    public static Block vertical_dark_oak_fence;

    public static SlabBlock adobe_slab;
    public static SlabBlock chalk_slab;
    public static SlabBlock cinder_slab;
    public static SlabBlock cob_slab;
    public static SlabBlock concrete_slab;
    public static SlabBlock cordwood_slab;
    public static SlabBlock dry_fitted_stone_slab;
    public static SlabBlock GRAVEL_GABION_SLAB;
    public static SlabBlock SAND_GABION_SLAB;
    public static SlabBlock DIRT_GABION_SLAB;
    public static SlabBlock mud_slab;
    public static SlabBlock vertical_oak_slab;
    public static SlabBlock vertical_spruce_slab;
    public static SlabBlock vertical_birch_slab;
    public static SlabBlock vertical_jungle_slab;
    public static SlabBlock vertical_acacia_slab;
    public static SlabBlock vertical_dark_oak_slab;
    public static SlabBlock lath_and_plaster_slab;
    public static SlabBlock rammed_earth_slab;
    public static SlabBlock reed_slab;
    public static SlabBlock blue_slate_slab;
    public static SlabBlock green_slate_slab;
    public static SlabBlock purple_slate_slab;
    public static SlabBlock polished_blue_slate_slab;
    public static SlabBlock polished_green_slate_slab;
    public static SlabBlock polished_purple_slate_slab;
    public static SlabBlock blue_slate_shingles_slab;
    public static SlabBlock green_slate_shingles_slab;
    public static SlabBlock purple_slate_shingles_slab;
    public static SlabBlock blue_slate_tiles_slab;
    public static SlabBlock green_slate_tiles_slab;
    public static SlabBlock purple_slate_tiles_slab;
    public static SlabBlock thatch_slab;
    public static SlabBlock oak_timber_slab;
    public static SlabBlock birch_timber_slab;
    public static SlabBlock spruce_timber_slab;
    public static SlabBlock jungle_timber_slab;
    public static SlabBlock acacia_timber_slab;
    public static SlabBlock dark_oak_timber_slab;
    public static SlabBlock wattle_and_daub_slab;
    public static SlabBlock wicker_slab;
    public static SlabBlock oak_wood_shakes_slab;
    public static SlabBlock spruce_wood_shakes_slab;
    public static SlabBlock birch_wood_shakes_slab;
    public static SlabBlock jungle_wood_shakes_slab;
    public static SlabBlock acacia_wood_shakes_slab;
    public static SlabBlock dark_oak_wood_shakes_slab;

    public static StairsBlock adobe_stairs;
    public static StairsBlock chalk_stairs;
    public static StairsBlock cinder_stairs;
    public static StairsBlock cob_stairs;
    public static StairsBlock concrete_stairs;
    public static StairsBlock cordwood_stairs;
    public static StairsBlock dry_fitted_stone_stairs;
    public static StairsBlock GRAVEL_GABION_STAIRS;
    public static StairsBlock SAND_GABION_STAIRS;
    public static StairsBlock DIRT_GABION_STAIRS;
    public static StairsBlock mud_stairs;
    public static StairsBlock vertical_oak_stairs;
    public static StairsBlock vertical_spruce_stairs;
    public static StairsBlock vertical_birch_stairs;
    public static StairsBlock vertical_jungle_stairs;
    public static StairsBlock vertical_acacia_stairs;
    public static StairsBlock vertical_dark_oak_stairs;
    public static StairsBlock plaster_stairs;
    public static StairsBlock rammed_earth_stairs;
    public static StairsBlock reed_stairs;
    public static StairsBlock blue_slate_stairs;
    public static StairsBlock green_slate_stairs;
    public static StairsBlock purple_slate_stairs;
    public static StairsBlock polished_blue_slate_stairs;
    public static StairsBlock polished_green_slate_stairs;
    public static StairsBlock polished_purple_slate_stairs;
    public static StairsBlock blue_slate_shingles_stairs;
    public static StairsBlock green_slate_shingles_stairs;
    public static StairsBlock purple_slate_shingles_stairs;
    public static StairsBlock blue_slate_tiles_stairs;
    public static StairsBlock green_slate_tiles_stairs;
    public static StairsBlock purple_slate_tiles_stairs;
    public static StairsBlock thatch_stairs;
    public static StairsBlock oak_timber_stairs;
    public static StairsBlock birch_timber_stairs;
    public static StairsBlock spruce_timber_stairs;
    public static StairsBlock jungle_timber_stairs;
    public static StairsBlock acacia_timber_stairs;
    public static StairsBlock dark_oak_timber_stairs;
    public static StairsBlock wattle_and_daub_stairs;
    public static StairsBlock wicker_stairs;
    public static StairsBlock oak_wood_shakes_stairs;
    public static StairsBlock spruce_wood_shakes_stairs;
    public static StairsBlock birch_wood_shakes_stairs;
    public static StairsBlock jungle_wood_shakes_stairs;
    public static StairsBlock acacia_wood_shakes_stairs;
    public static StairsBlock dark_oak_wood_shakes_stairs;

    public static WallBlock adobe_wall;
    public static WallBlock chalk_wall;
    public static WallBlock cinder_wall;
    public static WallBlock cob_wall;
    public static WallBlock concrete_wall;
    public static WallBlock cordwood_wall;
    public static WallBlock dry_fitted_stone_wall;
    public static WallBlock GRAVEL_GABION_WALL;
    public static WallBlock SAND_GABION_WALL;
    public static WallBlock DIRT_GABION_WALL;
    public static WallBlock mud_wall;
    public static WallBlock lath_and_plaster_wall;
    public static WallBlock rammed_earth_wall;
    public static WallBlock reed_wall;
    public static WallBlock blue_slate_wall;
    public static WallBlock green_slate_wall;
    public static WallBlock purple_slate_wall;
    public static WallBlock polished_blue_slate_wall;
    public static WallBlock polished_green_slate_wall;
    public static WallBlock polished_purple_slate_wall;
    public static WallBlock blue_slate_shingles_wall;
    public static WallBlock green_slate_shingles_wall;
    public static WallBlock purple_slate_shingles_wall;
    public static WallBlock blue_slate_tiles_wall;
    public static WallBlock green_slate_tiles_wall;
    public static WallBlock purple_slate_tiles_wall;
    public static WallBlock thatch_wall;
    public static WallBlock oak_timber_wall;
    public static WallBlock birch_timber_wall;
    public static WallBlock spruce_timber_wall;
    public static WallBlock jungle_timber_wall;
    public static WallBlock acacia_timber_wall;
    public static WallBlock dark_oak_timber_wall;
    public static WallBlock wattle_and_daub_wall;
    public static WallBlock wicker_wall;
    public static WallBlock oak_wood_shakes_wall;
    public static WallBlock spruce_wood_shakes_wall;
    public static WallBlock birch_wood_shakes_wall;
    public static WallBlock jungle_wood_shakes_wall;
    public static WallBlock acacia_wood_shakes_wall;
    public static WallBlock dark_oak_wood_shakes_wall;


    public static Block daub_cob_arrow0;
    public static Block daub_cob_arrow1;
    public static Block daub_cob_arrow2;
    public static Block daub_cob_arrow3;
    public static Block daub_cob_barndoor0;
    public static Block daub_cob_barndoor1;
    public static Block daub_cob_barndoor2;
    public static Block daub_cob_barndoor3;
    public static Block daub_cob_barndoor4;
    public static Block daub_cob_barndoor5;
    public static Block daub_cob_barndoor6;
    public static Block daub_cob_barndoor7;
    public static Block daub_cob_bottom_l;
    public static Block daub_cob_bottom;
    public static Block daub_cob_bottom_r;
    public static Block daub_cob_left;
    public static Block daub_cob_right;
    public static Block daub_cob_parallel_hor;
    public static Block daub_cob_parallel_vert;
    public static Block daub_cob_slash_back;
    public static Block daub_cob_slash;
    public static Block daub_cob_square;
    public static Block daub_cob_square_x;
    public static Block daub_cob_x;
    public static Block daub_cob_top_l;
    public static Block daub_cob_top;
    public static Block daub_cob_top_r;
    public static Block daub_cob_triangle0;
    public static Block daub_cob_triangle1;
    public static Block daub_cob_triangle2;
    public static Block daub_cob_triangle3;
    public static Block daub_cob_xbottom;
    public static Block daub_cob_xleft;
    public static Block daub_cob_xright;
    public static Block daub_cob_xtop;
    public static Block daub_cob_xdoor0;
    public static Block daub_cob_xdoor1;
    public static Block daub_cob_xdoor2;
    public static Block daub_cob_xdoor3;

    public static Block plaster_arrow0;
    public static Block plaster_arrow1;
    public static Block plaster_arrow2;
    public static Block plaster_arrow3;
    public static Block plaster_barndoor0;
    public static Block plaster_barndoor1;
    public static Block plaster_barndoor2;
    public static Block plaster_barndoor3;
    public static Block plaster_barndoor4;
    public static Block plaster_barndoor5;
    public static Block plaster_barndoor6;
    public static Block plaster_barndoor7;
    public static Block plaster_bottom_l;
    public static Block plaster_bottom;
    public static Block plaster_bottom_r;
    public static Block plaster_left;
    public static Block plaster_right;
    public static Block plaster_parallel_hor;
    public static Block plaster_parallel_vert;
    public static Block plaster_slash_back;
    public static Block plaster_slash;
    public static Block plaster_square;
    public static Block plaster_square_x;
    public static Block plaster_x;
    public static Block plaster_top_l;
    public static Block plaster_top;
    public static Block plaster_top_r;
    public static Block plaster_triangle0;
    public static Block plaster_triangle1;
    public static Block plaster_triangle2;
    public static Block plaster_triangle3;
    public static Block plaster_xbottom;
    public static Block plaster_xleft;
    public static Block plaster_xright;
    public static Block plaster_xtop;
    public static Block plaster_xdoor0;
    public static Block plaster_xdoor1;
    public static Block plaster_xdoor2;
    public static Block plaster_xdoor3;

    @SuppressWarnings("deprecation")//shut up forge
    public static void initBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> r = event.getRegistry();
        adobe = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 3.3F));
        chalk = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.0F, 2.5F));
        cinder = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 5.83F));
        cob = new Block(Block.Properties.create(Material.EARTH).sound(SoundType.GROUND).hardnessAndResistance(1.0F, 3.0F));
        concrete = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 10.0F));
        cordwood = new ModBlockFacing(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5F, 2.83F));
        dry_fitted_stone = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 1333.3F));
        GRAVEL_GABION = new FallingBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1, 1));
        SAND_GABION = new FallingBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1, 1));
        DIRT_GABION = new FallingBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1, 1));
        mud = new MudBlock(AbstractBlock.Properties.create(Material.CLAY).sound(SoundType.SLIME).hardnessAndResistance(0.6F, 1.0F));
        lath_and_plaster = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 7.5F));
        rammed_earth = new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance( 2.0F, 10.0F));
        blue_slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        green_slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        purple_slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        polished_blue_slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        polished_green_slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        polished_purple_slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        blue_slate_shingles = new ModBlockFacing(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        green_slate_shingles = new ModBlockFacing(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        purple_slate_shingles = new ModBlockFacing(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        blue_slate_tiles = new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.2F, 10.0F));
        green_slate_tiles = new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.2F, 10.0F));
        purple_slate_tiles = new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        oak_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        birch_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        spruce_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        jungle_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        acacia_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        dark_oak_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        wattle_and_daub = new Block(AbstractBlock.Properties.create(Material.ROCK).sound( SoundType.STONE).hardnessAndResistance( 1.5F, 8.33F));
        wicker = new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.CLOTH).hardnessAndResistance( 0.8F, 1.0F));

        oak_wood_shakes = new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        birch_wood_shakes = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        jungle_wood_shakes = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        spruce_wood_shakes = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        acacia_wood_shakes = new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        dark_oak_wood_shakes = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));


        vertical_oak_planks = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        vertical_birch_planks = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        vertical_jungle_planks = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        vertical_spruce_planks = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        vertical_acacia_planks = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        vertical_dark_oak_planks = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));

        // OreDictionary.registerOre( oak_planks_vert);

//      block_chalk_dust = new Block_ChalkDust();

        vertical_oak_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_FENCE));
        vertical_spruce_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.SPRUCE_FENCE));
        vertical_birch_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        vertical_jungle_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        vertical_acacia_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        vertical_dark_oak_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.DARK_OAK_FENCE));


        adobe_slab = new SlabBlock(Block.Properties.from(adobe));
        chalk_slab = new SlabBlock(Block.Properties.from(chalk));
        cinder_slab = new SlabBlock(Block.Properties.from(cinder));
        cob_slab = new SlabBlock(Block.Properties.from(cob));
        concrete_slab = new SlabBlock(Block.Properties.from(concrete));
        cordwood_slab = new SlabBlock(Block.Properties.from(cordwood));
        dry_fitted_stone_slab = new SlabBlock(Block.Properties.from(dry_fitted_stone));
        GRAVEL_GABION_SLAB = new SlabBlock(Block.Properties.from(GRAVEL_GABION));
        SAND_GABION_SLAB = new SlabBlock(Block.Properties.from(SAND_GABION));
        DIRT_GABION_SLAB = new SlabBlock(Block.Properties.from(DIRT_GABION));
        mud_slab = new SlabBlock(Block.Properties.from(mud));
        vertical_oak_slab = new SlabBlock(Block.Properties.from(vertical_oak_planks));
        vertical_spruce_slab = new SlabBlock(Block.Properties.from(vertical_spruce_planks));
        vertical_birch_slab = new SlabBlock(Block.Properties.from(vertical_birch_planks));
        vertical_jungle_slab = new SlabBlock(Block.Properties.from(vertical_jungle_planks));
        vertical_acacia_slab = new SlabBlock(Block.Properties.from(vertical_acacia_planks));
        vertical_dark_oak_slab = new SlabBlock(Block.Properties.from(vertical_dark_oak_planks));
        lath_and_plaster_slab = new SlabBlock(Block.Properties.from(lath_and_plaster));
        rammed_earth_slab = new SlabBlock(Block.Properties.from(rammed_earth));
        blue_slate_slab = new SlabBlock(Block.Properties.from(blue_slate));
        green_slate_slab = new SlabBlock(Block.Properties.from(green_slate));
        purple_slate_slab = new SlabBlock(Block.Properties.from(purple_slate));
        polished_blue_slate_slab = new SlabBlock(Block.Properties.from(polished_blue_slate));
        polished_green_slate_slab = new SlabBlock(Block.Properties.from(polished_green_slate));
        polished_purple_slate_slab = new SlabBlock(Block.Properties.from(polished_purple_slate));
        blue_slate_shingles_slab = new SlabBlock(Block.Properties.from(blue_slate_shingles));
        green_slate_shingles_slab = new SlabBlock(Block.Properties.from(green_slate_shingles));
        purple_slate_shingles_slab = new SlabBlock(Block.Properties.from(purple_slate_shingles));
        blue_slate_tiles_slab = new SlabBlock(Block.Properties.from(blue_slate_tiles));
        green_slate_tiles_slab = new SlabBlock(Block.Properties.from(green_slate_tiles));
        purple_slate_tiles_slab = new SlabBlock(Block.Properties.from(purple_slate_tiles));
        oak_timber_slab = new SlabBlock(Block.Properties.from(oak_timber));
        birch_timber_slab = new SlabBlock(Block.Properties.from(birch_timber));
        spruce_timber_slab = new SlabBlock(Block.Properties.from(spruce_timber));
        jungle_timber_slab = new SlabBlock(Block.Properties.from(jungle_timber));
        acacia_timber_slab = new SlabBlock(Block.Properties.from(acacia_timber));
        dark_oak_timber_slab = new SlabBlock(Block.Properties.from(dark_oak_timber));
        wattle_and_daub_slab = new SlabBlock(Block.Properties.from(wattle_and_daub));
        wicker_slab = new SlabBlock(Block.Properties.from(wicker));
        oak_wood_shakes_slab = new SlabBlock(Block.Properties.from(oak_wood_shakes));
        spruce_wood_shakes_slab = new SlabBlock(Block.Properties.from(oak_wood_shakes));
        birch_wood_shakes_slab = new SlabBlock(Block.Properties.from(oak_wood_shakes));
        jungle_wood_shakes_slab = new SlabBlock(Block.Properties.from(oak_wood_shakes));
        acacia_wood_shakes_slab = new SlabBlock(Block.Properties.from(oak_wood_shakes));
        dark_oak_wood_shakes_slab = new SlabBlock(Block.Properties.from(oak_wood_shakes));

        adobe_stairs = new StairsBlock(adobe.getDefaultState(), Block.Properties.from(adobe));
        chalk_stairs = new StairsBlock(chalk.getDefaultState(),Block.Properties.from(chalk));
        cinder_stairs = new StairsBlock(cinder.getDefaultState(),Block.Properties.from(cinder));
        cob_stairs = new StairsBlock(cob.getDefaultState(),Block.Properties.from(cob));
        concrete_stairs = new StairsBlock(concrete.getDefaultState(),Block.Properties.from(concrete));
        cordwood_stairs = new StairsBlock(cordwood.getDefaultState(),Block.Properties.from(cordwood));
        dry_fitted_stone_stairs = new StairsBlock(dry_fitted_stone.getDefaultState(),Block.Properties.from(dry_fitted_stone));
        GRAVEL_GABION_STAIRS = new StairsBlock(GRAVEL_GABION.getDefaultState(),Block.Properties.from(GRAVEL_GABION));
        SAND_GABION_STAIRS = new StairsBlock(SAND_GABION.getDefaultState(),Block.Properties.from(SAND_GABION));
        DIRT_GABION_STAIRS = new StairsBlock(DIRT_GABION.getDefaultState(),Block.Properties.from(DIRT_GABION));
        mud_stairs = new StairsBlock(mud.getDefaultState(),Block.Properties.from(mud));
        vertical_oak_stairs = new StairsBlock(vertical_oak_planks.getDefaultState(),Block.Properties.from(vertical_oak_planks));
        vertical_spruce_stairs = new StairsBlock(vertical_spruce_planks.getDefaultState(),Block.Properties.from(vertical_spruce_planks));
        vertical_birch_stairs = new StairsBlock(vertical_birch_planks.getDefaultState(),Block.Properties.from(vertical_birch_planks));
        vertical_jungle_stairs = new StairsBlock(vertical_oak_planks.getDefaultState(),Block.Properties.from(vertical_jungle_planks));
        vertical_acacia_stairs = new StairsBlock(vertical_acacia_planks.getDefaultState(),Block.Properties.from(vertical_acacia_planks));
        vertical_dark_oak_stairs = new StairsBlock(vertical_dark_oak_planks.getDefaultState(),Block.Properties.from(vertical_dark_oak_planks));
        plaster_stairs = new StairsBlock(lath_and_plaster.getDefaultState(),Block.Properties.from(lath_and_plaster));
        rammed_earth_stairs = new StairsBlock(rammed_earth.getDefaultState(),Block.Properties.from(rammed_earth));
        blue_slate_stairs = new StairsBlock(blue_slate.getDefaultState(),Block.Properties.from(blue_slate));
        green_slate_stairs = new StairsBlock(green_slate.getDefaultState(),Block.Properties.from(green_slate));
        purple_slate_stairs = new StairsBlock(purple_slate.getDefaultState(),Block.Properties.from(purple_slate));
        polished_blue_slate_stairs = new StairsBlock(polished_blue_slate.getDefaultState(),Block.Properties.from(polished_blue_slate));
        polished_green_slate_stairs = new StairsBlock(polished_green_slate.getDefaultState(),Block.Properties.from(polished_green_slate));
        polished_purple_slate_stairs = new StairsBlock(polished_purple_slate.getDefaultState(),Block.Properties.from(polished_purple_slate));
        blue_slate_shingles_stairs = new StairsBlock(blue_slate_shingles.getDefaultState(),Block.Properties.from(blue_slate_shingles));
        green_slate_shingles_stairs = new StairsBlock(green_slate_shingles.getDefaultState(),Block.Properties.from(green_slate_shingles));
        purple_slate_shingles_stairs = new StairsBlock(purple_slate_shingles.getDefaultState(),Block.Properties.from(purple_slate_shingles));
        blue_slate_tiles_stairs = new StairsBlock(blue_slate_tiles.getDefaultState(),Block.Properties.from(blue_slate_tiles));
        green_slate_tiles_stairs = new StairsBlock(green_slate_tiles.getDefaultState(),Block.Properties.from(green_slate_tiles));
        purple_slate_tiles_stairs = new StairsBlock(purple_slate_tiles.getDefaultState(),Block.Properties.from(purple_slate_tiles));
        oak_timber_stairs = new StairsBlock(oak_timber.getDefaultState(),Block.Properties.from(oak_timber));
        spruce_timber_stairs = new StairsBlock(spruce_timber.getDefaultState(),Block.Properties.from(spruce_timber));
        birch_timber_stairs = new StairsBlock(birch_timber.getDefaultState(),Block.Properties.from(birch_timber));
        jungle_timber_stairs = new StairsBlock(jungle_timber.getDefaultState(),Block.Properties.from(jungle_timber));
        acacia_timber_stairs = new StairsBlock(acacia_timber.getDefaultState(),Block.Properties.from(acacia_timber));
        dark_oak_timber_stairs = new StairsBlock(dark_oak_timber.getDefaultState(),Block.Properties.from(dark_oak_timber));
        wattle_and_daub_stairs = new StairsBlock(wattle_and_daub.getDefaultState(),Block.Properties.from(wattle_and_daub));
        wicker_stairs = new StairsBlock(wicker.getDefaultState(),Block.Properties.from(wicker));
        oak_wood_shakes_stairs = new StairsBlock(oak_wood_shakes.getDefaultState(),Block.Properties.from(oak_wood_shakes));
        spruce_wood_shakes_stairs = new StairsBlock(spruce_wood_shakes.getDefaultState(),Block.Properties.from(oak_wood_shakes));
        birch_wood_shakes_stairs = new StairsBlock(birch_wood_shakes.getDefaultState(),Block.Properties.from(oak_wood_shakes));
        jungle_wood_shakes_stairs = new StairsBlock(oak_wood_shakes.getDefaultState(),Block.Properties.from(oak_wood_shakes));
        acacia_wood_shakes_stairs = new StairsBlock(oak_wood_shakes.getDefaultState(),Block.Properties.from(oak_wood_shakes));
        dark_oak_wood_shakes_stairs = new StairsBlock(oak_wood_shakes.getDefaultState(),Block.Properties.from(oak_wood_shakes));

        adobe_wall = new WallBlock(Block.Properties.from(adobe));
        chalk_wall = new WallBlock(Block.Properties.from(chalk));
        cinder_wall = new WallBlock(Block.Properties.from(cinder));
        cob_wall = new WallBlock(Block.Properties.from(cob));
        concrete_wall = new WallBlock(Block.Properties.from(concrete));
        cordwood_wall = new WallBlock(Block.Properties.from(cordwood));
        dry_fitted_stone_wall = new WallBlock(Block.Properties.from(dry_fitted_stone));
        GRAVEL_GABION_WALL = new WallBlock(Block.Properties.from(GRAVEL_GABION));
        SAND_GABION_WALL = new WallBlock(Block.Properties.from(SAND_GABION));
        DIRT_GABION_WALL = new WallBlock(Block.Properties.from(DIRT_GABION));
        mud_wall = new WallBlock(Block.Properties.from(mud));
        lath_and_plaster_wall = new WallBlock(Block.Properties.from(lath_and_plaster));
        rammed_earth_wall = new WallBlock(Block.Properties.from(rammed_earth));
        blue_slate_wall = new WallBlock(Block.Properties.from(blue_slate));
        green_slate_wall = new WallBlock(Block.Properties.from(green_slate));
        purple_slate_wall = new WallBlock(Block.Properties.from(purple_slate));
        polished_blue_slate_wall = new WallBlock(Block.Properties.from(polished_blue_slate));
        polished_green_slate_wall = new WallBlock(Block.Properties.from(polished_green_slate));
        polished_purple_slate_wall = new WallBlock(Block.Properties.from(polished_purple_slate));
        blue_slate_shingles_wall = new WallBlock(Block.Properties.from(blue_slate_shingles));
        green_slate_shingles_wall = new WallBlock(Block.Properties.from(green_slate_shingles));
        purple_slate_shingles_wall = new WallBlock(Block.Properties.from(purple_slate_shingles));
        blue_slate_tiles_wall = new WallBlock(Block.Properties.from(blue_slate_tiles));
        green_slate_tiles_wall = new WallBlock(Block.Properties.from(green_slate_tiles));
        purple_slate_tiles_wall = new WallBlock(Block.Properties.from(purple_slate_tiles));
        oak_timber_wall = new WallBlock(Block.Properties.from(oak_timber));
        spruce_timber_wall = new WallBlock(Block.Properties.from(spruce_timber));
        birch_timber_wall = new WallBlock(Block.Properties.from(birch_timber));
        jungle_timber_wall = new WallBlock(Block.Properties.from(jungle_timber));
        acacia_timber_wall = new WallBlock(Block.Properties.from(acacia_timber));
        dark_oak_timber_wall = new WallBlock(Block.Properties.from(dark_oak_timber));
        wattle_and_daub_wall = new WallBlock(Block.Properties.from(wattle_and_daub));
        wicker_wall = new WallBlock(Block.Properties.from(wicker));
        oak_wood_shakes_wall = new WallBlock(Block.Properties.from(oak_wood_shakes));
        spruce_wood_shakes_wall = new WallBlock(Block.Properties.from(oak_wood_shakes));
        birch_wood_shakes_wall = new WallBlock(Block.Properties.from(oak_wood_shakes));
        jungle_wood_shakes_wall = new WallBlock(Block.Properties.from(oak_wood_shakes));
        acacia_wood_shakes_wall = new WallBlock(Block.Properties.from(oak_wood_shakes));
        dark_oak_wood_shakes_wall = new WallBlock(Block.Properties.from(oak_wood_shakes));

        reed = new RotatedPillarBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.CLOTH).hardnessAndResistance( 0.8F, 1.0F));
        thatch = new RotatedPillarBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.CLOTH).hardnessAndResistance(  0.8F, 1.0F));

        reed_slab = new SlabBlock(Block.Properties.from(reed));

        thatch_slab = new SlabBlock(Block.Properties.from(thatch));


        reed_stairs = new StairsBlock(reed.getDefaultState(),Block.Properties.from(reed));
        thatch_stairs = new StairsBlock(reed.getDefaultState(),Block.Properties.from(thatch));

        reed_wall = new WallBlock(Block.Properties.from(reed));
        thatch_wall = new WallBlock(Block.Properties.from(thatch));

        daub_cob_arrow0 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Framed Arrow",0);
        daub_cob_arrow1 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Framed Arrow",1);
        daub_cob_arrow2 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Framed Arrow",2);
        daub_cob_arrow3 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Framed Arrow",3);
        daub_cob_barndoor0 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower Left Barndoor",4);
        daub_cob_barndoor1 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways Barndoor",5);
        daub_cob_barndoor2 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways Barndoor",6);
        daub_cob_barndoor3 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper Left Barndoor",7);
        daub_cob_barndoor4 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower Right Barndoor",8);
        daub_cob_barndoor5 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways Barndoor",9);
        daub_cob_barndoor6 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways Barndoor",10);
        daub_cob_barndoor7 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper Right Barndoor",11);
        daub_cob_bottom_l = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Framed",12);
        daub_cob_bottom = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Framed",13);
        daub_cob_bottom_r = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Framed",14);
        daub_cob_left = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Framed",15);
        daub_cob_parallel_hor = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Parallel Horizontals",16);
        daub_cob_parallel_vert = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Parallel Verticals",17);
        daub_cob_right = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Framed",18);
        daub_cob_slash_back = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"\\ Diagonal",19);
        daub_cob_slash = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"/ Diagonal",20);
        daub_cob_square = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Square Framed",21);
        daub_cob_square_x = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Square Framed X",22);
        daub_cob_top_l = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Framed",23);
        daub_cob_top = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Framed",24);
        daub_cob_top_r = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Framed",25);
        daub_cob_triangle0 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Triangle",26);
        daub_cob_triangle1 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Triangle",27);
        daub_cob_triangle2 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Triangle",28);
        daub_cob_triangle3 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Triangle",29);
        daub_cob_xbottom = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottomless Framed",30);
        daub_cob_xdoor0 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower X Framed Barndoor",31);
        daub_cob_xdoor1 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways X Framed Barndoor",32);
        daub_cob_xdoor2 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways X Framed Barndoor",33);
        daub_cob_xdoor3 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper X Framed Barndoor",34);
        daub_cob_xleft = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left-less Framed",35);
        daub_cob_x = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Frame-less X",36);
        daub_cob_xright = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right-less Framed",37);
        daub_cob_xtop = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Topless Framed",38);

        //Material.ROCK, SoundType.WOOD, 3.0F, 7.5F

        plaster_arrow0 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Framed Arrow",0);
        plaster_arrow1 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Framed Arrow",1);
        plaster_arrow2 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Framed Arrow",2);
        plaster_arrow3 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Framed Arrow",3);
        plaster_barndoor0 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower Left Barndoor",4);
        plaster_barndoor1 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways Barndoor",5);
        plaster_barndoor2 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways Barndoor",6);
        plaster_barndoor3 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper Left Barndoor",7);
        plaster_barndoor4 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower Right Barndoor",8);
        plaster_barndoor5 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways Barndoor",9);
        plaster_barndoor6 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways Barndoor",10);
        plaster_barndoor7 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper Right Barndoor",11);
        plaster_bottom_l = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Framed",12);
        plaster_bottom = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Framed",13);
        plaster_bottom_r = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Framed",14);
        plaster_left = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Framed",15);
        plaster_parallel_hor = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Parallel Horizontals",16);
        plaster_parallel_vert = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Parallel Verticals",17);
        plaster_right = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Framed",18);
        plaster_slash_back = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"\\ Diagonal",19);
        plaster_slash = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"/ Diagonal",20);
        plaster_square = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Square Framed",21);
        plaster_square_x = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Square Framed X",22);
        plaster_top_l = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Framed",23);
        plaster_top = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Framed",24);
        plaster_top_r = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Framed",25);
        plaster_triangle0 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Triangle",26);
        plaster_triangle1 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Triangle",27);
        plaster_triangle2 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Triangle",28);
        plaster_triangle3 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Triangle",29);
        plaster_xbottom = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottomless Framed",30);
        plaster_xdoor0 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower X Framed Barndoor",31);
        plaster_xdoor1 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways X Framed Barndoor",32);
        plaster_xdoor2 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways X Framed Barndoor",33);
        plaster_xdoor3 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper X Framed Barndoor",34);
        plaster_xleft = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left-less Framed",35);
        plaster_x = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Frame-less X",36);
        plaster_xright = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right-less Framed",37);
        plaster_xtop = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Topless Framed",38);

        Field[] fields = BlockRegistry.class.getFields();

        for (Field field : fields) {
            try {
                if (field.get(null) instanceof Block) {
                    Block block = (Block) field.get(null);
                    block.setRegistryName(field.getName().toLowerCase(Locale.ROOT));
                    r.register(block);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }

    private static final List<Block> cache = new ArrayList<>();

    public static List<Block> getAllBlocks() {
        if (cache.isEmpty()) {
            Field[] fields = BlockRegistry.class.getFields();

            for (Field field : fields) {
                try {
                    if (field.get(null) instanceof Block) {
                        cache.add((Block) field.get(null));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return cache;
    }

}