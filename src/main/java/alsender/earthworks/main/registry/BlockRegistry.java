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
    public static Block dry_stone;
    public static Block GRAVEL_GABION;
    public static Block SAND_GABION;
    public static Block DIRT_GABION;

    public static Block mud;
    public static Block mud_bottom;
    public static Block vertical_oak_planks;
    public static Block vertical_birch_planks;
    public static Block vertical_jungle_planks;
    public static Block vertical_spruce_planks;
    public static Block vertical_acacia_planks;
    public static Block vertical_dark_oak_planks;

    public static Block plaster;
    public static Block rammed_earth;
    public static Block reed;
    public static Block slate;
    public static Block green_slate;
    public static Block purple_slate;
    public static Block slate_slabs;
    public static Block polished_green_slate;
    public static Block polished_purple_slate;
    public static Block slate_shingle;
    public static Block green_slate_shingle;
    public static Block purple_slate_shingle;
    public static Block slate_tile;
    public static Block green_slate_tile;
    public static Block purple_slate_tile;
    public static Block thatch;
    public static Block oak_timber;
    public static Block birch_timber;
    public static Block spruce_timber;
    public static Block jungle_timber;
    public static Block acacia_timber;
    public static Block dark_oak_timber;
    public static Block wattle;
    public static Block wicker;
    public static Block oak_shingle;
    public static Block birch_shingle;
    public static Block jungle_shingle;
    public static Block spruce_shingle;
    public static Block acacia_shingle;
    public static Block dark_oak_shingle;

    public static Block vertical_oak_fence;
    public static Block vertical_spruce_fence;
    public static Block vertical_birch_fence;
    public static Block vertical_jungle_fence;
    public static Block vertical_acacia_fence;
    public static Block vertical_dark_oak_fence;

    public static Block adobe_slab;
    public static Block chalk_slab;
    public static Block cinder_slab;
    public static Block cob_slab;
    public static Block concrete_slab;
    public static Block cordwood_slab;
    public static Block dry_stone_slab;
    public static Block GRAVEL_GABION_SLAB;
    public static Block SAND_GABION_SLAB;
    public static Block DIRT_GABION_SLAB;
    public static Block mud_slab;
    public static Block vertical_oak_slab;
    public static Block vertical_spruce_slab;
    public static Block vertical_birch_slab;
    public static Block vertical_jungle_slab;
    public static Block vertical_acacia_slab;
    public static Block vertical_dark_oak_slab;
    public static Block plaster_slab;
    public static Block rammed_earth_slab;
    public static Block reed_slab;
    public static Block slate_slab;
    public static Block green_slate_slab;
    public static Block slab_slate_purple;
    public static Block slab_slate_slab;
    public static Block slab_slate_slab_green;
    public static Block slab_slate_slab_purple;
    public static Block slab_slate_shingle;
    public static Block green_slate_shingle_slab;
    public static Block purple_slate_shingle_slab;
    public static Block slate_tile_slab;
    public static Block green_slate_tile_slab;
    public static Block purple_slate_tile_slab;
    public static Block thatch_slab;
    public static Block oak_timber_slab;
    public static Block birch_timber_slab;
    public static Block slab_timber_spruce;
    public static Block slab_timber_jungle;
    public static Block slab_timber_acacia;
    public static Block slab_timber_dark_oak;
    public static Block wattle_slab;
    public static Block wicker_slab;
    public static Block oak_shingle_slab;
    public static Block spruce_shingle_slab;
    public static Block birch_shingle_slab;
    public static Block jungle_shingle_slab;
    public static Block acacia_shingle_slab;
    public static Block dark_oak_shingle_slab;

    public static Block adobe_stairs;
    public static Block chalk_stairs;
    public static Block cinder_stairs;
    public static Block cob_stairs;
    public static Block concrete_stairs;
    public static Block cordwood_stairs;
    public static Block dry_stone_stairs;
    public static Block GRAVEL_GABION_STAIRS;
    public static Block SAND_GABION_STAIRS;
    public static Block DIRT_GABION_STAIRS;
    public static Block mud_stairs;
    public static Block vertical_oak_stairs;
    public static Block vertical_spruce_stairs;
    public static Block vertical_birch_stairs;
    public static Block vertical_jungle_stairs;
    public static Block vertical_acacia_stairs;
    public static Block vertical_dark_oak_stairs;
    public static Block plaster_stairs;
    public static Block rammed_earth_stairs;
    public static Block stair_reed;
    public static Block slate_stairs;
    public static Block green_slate_stairs;
    public static Block stair_slate_purple;
    public static Block slate_slab_stairs;
    public static Block green_slate_slab_stairs;
    public static Block purple_slate_slab_stairs;
    public static Block slate_shingle_stairs;
    public static Block green_slate_shingle_stairs;
    public static Block purple_slate_shingle_stairs;
    public static Block slate_tile_stairs;
    public static Block green_slate_tile_stairs;
    public static Block purple_slate_tile_stairs;
    public static Block stair_thatch;
    public static Block oak_timber_stairs;
    public static Block birch_timber_stairs;
    public static Block spruce_timber_stairs;
    public static Block jungle_timber_stairs;
    public static Block acacia_timber_stairs;
    public static Block dark_oak_timber_stairs;
    public static Block wattle_stairs;
    public static Block wicker_stairs;
    public static Block oak_shingle_stairs;
    public static Block spruce_shingle_stairs;
    public static Block birch_shingle_stairs;
    public static Block jungle_shingle_stairs;
    public static Block acacia_shingle_stairs;
    public static Block dark_oak_shingle_stairs;

    public static Block adobe_wall;
    public static Block wall_chalk;
    public static Block wall_cinder;
    public static Block wall_cob;
    public static Block wall_concrete;
    public static Block wall_cordwood;
    public static Block wall_dry_stone;
    public static Block wall_gabion0;
    public static Block wall_gabion1;
    public static Block wall_gabion2;
    public static Block wall_mud;
    public static Block wall_plaster;
    public static Block wall_rammed_earth;
    public static Block wall_reed;
    public static Block wall_slate;
    public static Block wall_slate_green;
    public static Block wall_slate_purple;
    public static Block wall_slate_slab;
    public static Block wall_slate_slab_green;
    public static Block wall_slate_slab_purple;
    public static Block wall_slate_shingle;
    public static Block wall_slate_shingle_verte;
    public static Block wall_slate_shingle_purple;
    public static Block wall_slate_tile;
    public static Block wall_slate_tile_verte;
    public static Block wall_slate_tile_purple;
    public static Block wall_thatch;
    public static Block wall_timber_oak;
    public static Block wall_timber_birch;
    public static Block wall_timber_spruce;
    public static Block wall_timber_jungle;
    public static Block wall_timber_acacia;
    public static Block wall_timber_dark_oak;
    public static Block wall_wattle;
    public static Block wall_wicker;
    public static Block wall_wood_shingle_oak;
    public static Block wall_wood_shingle_spruce;
    public static Block wall_wood_shingle_birch;
    public static Block wall_wood_shingle_jungle;
    public static Block wall_wood_shingle_acacia;
    public static Block wall_wood_shingle_dark_oak;


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
        dry_stone = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 1333.3F));
        GRAVEL_GABION = new FallingBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1, 1));
        SAND_GABION = new FallingBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1, 1));
        DIRT_GABION = new FallingBlock(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1, 1));
        mud = new Block_Mud(AbstractBlock.Properties.create(Material.CLAY).sound(SoundType.SLIME).hardnessAndResistance(0.6F, 1.0F));
        mud_bottom = new Block_Mud_Bottom(Block.Properties.create(Material.CLAY).sound(SoundType.SLIME).hardnessAndResistance( 0.6F, 1.0F));
        plaster = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 7.5F));
        rammed_earth = new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance( 2.0F, 10.0F));
        slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        green_slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        purple_slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        slate_slabs = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        polished_green_slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        polished_purple_slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        slate_shingle = new ModBlockFacing(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        green_slate_shingle = new ModBlockFacing(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        purple_slate_shingle = new ModBlockFacing(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        slate_tile = new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.2F, 10.0F));
        green_slate_tile = new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.2F, 10.0F));
        purple_slate_tile = new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        oak_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        birch_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        spruce_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        jungle_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        acacia_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        dark_oak_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        wattle = new Block(AbstractBlock.Properties.create(Material.ROCK).sound( SoundType.STONE).hardnessAndResistance( 1.5F, 8.33F));
        wicker = new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.CLOTH).hardnessAndResistance( 0.8F, 1.0F));

        oak_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        birch_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        jungle_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        spruce_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        acacia_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        dark_oak_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));


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
        dry_stone_slab = new SlabBlock(Block.Properties.from(dry_stone));
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
        plaster_slab = new SlabBlock(Block.Properties.from(plaster));
        rammed_earth_slab = new SlabBlock(Block.Properties.from(rammed_earth));
        slate_slab = new SlabBlock(Block.Properties.from(slate));
        green_slate_slab = new SlabBlock(Block.Properties.from(green_slate));
        slab_slate_purple = new SlabBlock(Block.Properties.from(purple_slate));
        slab_slate_slab = new SlabBlock(Block.Properties.from(slate_slabs));
        slab_slate_slab_green = new SlabBlock(Block.Properties.from(polished_green_slate));
        slab_slate_slab_purple = new SlabBlock(Block.Properties.from(polished_purple_slate));
        slab_slate_shingle = new SlabBlock(Block.Properties.from(slate_shingle));
        green_slate_shingle_slab = new SlabBlock(Block.Properties.from(green_slate_shingle));
        purple_slate_shingle_slab = new SlabBlock(Block.Properties.from(purple_slate_shingle));
        slate_tile_slab = new SlabBlock(Block.Properties.from(slate_tile));
        green_slate_tile_slab = new SlabBlock(Block.Properties.from(green_slate_tile));
        purple_slate_tile_slab = new SlabBlock(Block.Properties.from(purple_slate_tile));
        oak_timber_slab = new SlabBlock(Block.Properties.from(oak_timber));
        birch_timber_slab = new SlabBlock(Block.Properties.from(birch_timber));
        slab_timber_spruce = new SlabBlock(Block.Properties.from(spruce_timber));
        slab_timber_jungle = new SlabBlock(Block.Properties.from(jungle_timber));
        slab_timber_acacia = new SlabBlock(Block.Properties.from(acacia_timber));
        slab_timber_dark_oak = new SlabBlock(Block.Properties.from(dark_oak_timber));
        wattle_slab = new SlabBlock(Block.Properties.from(wattle));
        wicker_slab = new SlabBlock(Block.Properties.from(wicker));
        oak_shingle_slab = new SlabBlock(Block.Properties.from(oak_shingle));
        spruce_shingle_slab = new SlabBlock(Block.Properties.from(oak_shingle));
        birch_shingle_slab = new SlabBlock(Block.Properties.from(oak_shingle));
        jungle_shingle_slab = new SlabBlock(Block.Properties.from(oak_shingle));
        acacia_shingle_slab = new SlabBlock(Block.Properties.from(oak_shingle));
        dark_oak_shingle_slab = new SlabBlock(Block.Properties.from(oak_shingle));

        adobe_stairs = new StairsBlock(adobe.getDefaultState(), Block.Properties.from(adobe));
        chalk_stairs = new StairsBlock(chalk.getDefaultState(),Block.Properties.from(chalk));
        cinder_stairs = new StairsBlock(cinder.getDefaultState(),Block.Properties.from(cinder));
        cob_stairs = new StairsBlock(cob.getDefaultState(),Block.Properties.from(cob));
        concrete_stairs = new StairsBlock(concrete.getDefaultState(),Block.Properties.from(concrete));
        cordwood_stairs = new StairsBlock(cordwood.getDefaultState(),Block.Properties.from(cordwood));
        dry_stone_stairs = new StairsBlock(dry_stone.getDefaultState(),Block.Properties.from(dry_stone));
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
        plaster_stairs = new StairsBlock(plaster.getDefaultState(),Block.Properties.from(plaster));
        rammed_earth_stairs = new StairsBlock(rammed_earth.getDefaultState(),Block.Properties.from(rammed_earth));
        slate_stairs = new StairsBlock(slate.getDefaultState(),Block.Properties.from(slate));
        green_slate_stairs = new StairsBlock(green_slate.getDefaultState(),Block.Properties.from(green_slate));
        stair_slate_purple = new StairsBlock(purple_slate.getDefaultState(),Block.Properties.from(purple_slate));
        slate_slab_stairs = new StairsBlock(slate_slabs.getDefaultState(),Block.Properties.from(slate_slabs));
        green_slate_slab_stairs = new StairsBlock(polished_green_slate.getDefaultState(),Block.Properties.from(polished_green_slate));
        purple_slate_slab_stairs = new StairsBlock(polished_purple_slate.getDefaultState(),Block.Properties.from(polished_purple_slate));
        slate_shingle_stairs = new StairsBlock(slate_shingle.getDefaultState(),Block.Properties.from(slate_shingle));
        green_slate_shingle_stairs = new StairsBlock(green_slate_shingle.getDefaultState(),Block.Properties.from(green_slate_shingle));
        purple_slate_shingle_stairs = new StairsBlock(purple_slate_shingle.getDefaultState(),Block.Properties.from(purple_slate_shingle));
        slate_tile_stairs = new StairsBlock(slate_tile.getDefaultState(),Block.Properties.from(slate_tile));
        green_slate_tile_stairs = new StairsBlock(green_slate_tile.getDefaultState(),Block.Properties.from(green_slate_tile));
        purple_slate_tile_stairs = new StairsBlock(purple_slate_tile.getDefaultState(),Block.Properties.from(purple_slate_tile));
        oak_timber_stairs = new StairsBlock(oak_timber.getDefaultState(),Block.Properties.from(oak_timber));
        spruce_timber_stairs = new StairsBlock(spruce_timber.getDefaultState(),Block.Properties.from(spruce_timber));
        birch_timber_stairs = new StairsBlock(birch_timber.getDefaultState(),Block.Properties.from(birch_timber));
        jungle_timber_stairs = new StairsBlock(jungle_timber.getDefaultState(),Block.Properties.from(jungle_timber));
        acacia_timber_stairs = new StairsBlock(acacia_timber.getDefaultState(),Block.Properties.from(acacia_timber));
        dark_oak_timber_stairs = new StairsBlock(dark_oak_timber.getDefaultState(),Block.Properties.from(dark_oak_timber));
        wattle_stairs = new StairsBlock(wattle.getDefaultState(),Block.Properties.from(wattle));
        wicker_stairs = new StairsBlock(wicker.getDefaultState(),Block.Properties.from(wicker));
        oak_shingle_stairs = new StairsBlock(oak_shingle.getDefaultState(),Block.Properties.from(oak_shingle));
        spruce_shingle_stairs = new StairsBlock(spruce_shingle.getDefaultState(),Block.Properties.from(oak_shingle));
        birch_shingle_stairs = new StairsBlock(birch_shingle.getDefaultState(),Block.Properties.from(oak_shingle));
        jungle_shingle_stairs = new StairsBlock(oak_shingle.getDefaultState(),Block.Properties.from(oak_shingle));
        acacia_shingle_stairs = new StairsBlock(oak_shingle.getDefaultState(),Block.Properties.from(oak_shingle));
        dark_oak_shingle_stairs = new StairsBlock(oak_shingle.getDefaultState(),Block.Properties.from(oak_shingle));

        adobe_wall = new WallBlock(Block.Properties.from(adobe));
        wall_chalk = new WallBlock(Block.Properties.from(chalk));
        wall_cinder = new WallBlock(Block.Properties.from(cinder));
        wall_cob = new WallBlock(Block.Properties.from(cob));
        wall_concrete = new WallBlock(Block.Properties.from(concrete));
        wall_cordwood = new WallBlock(Block.Properties.from(cordwood));
        wall_dry_stone = new WallBlock(Block.Properties.from(dry_stone));
        wall_gabion0 = new WallBlock(Block.Properties.from(GRAVEL_GABION));
        wall_gabion1 = new WallBlock(Block.Properties.from(SAND_GABION));
        wall_gabion2 = new WallBlock(Block.Properties.from(DIRT_GABION));
        wall_mud = new WallBlock(Block.Properties.from(mud));
        wall_plaster = new WallBlock(Block.Properties.from(plaster));
        wall_rammed_earth = new WallBlock(Block.Properties.from(rammed_earth));
        wall_slate = new WallBlock(Block.Properties.from(slate));
        wall_slate_green = new WallBlock(Block.Properties.from(green_slate));
        wall_slate_purple = new WallBlock(Block.Properties.from(purple_slate));
        wall_slate_slab = new WallBlock(Block.Properties.from(slate_slabs));
        wall_slate_slab_green = new WallBlock(Block.Properties.from(polished_green_slate));
        wall_slate_slab_purple = new WallBlock(Block.Properties.from(polished_purple_slate));
        wall_slate_shingle = new WallBlock(Block.Properties.from(slate_shingle));
        wall_slate_shingle_verte = new WallBlock(Block.Properties.from(green_slate_shingle));
        wall_slate_shingle_purple = new WallBlock(Block.Properties.from(purple_slate_shingle));
        wall_slate_tile = new WallBlock(Block.Properties.from(slate_tile));
        wall_slate_tile_verte = new WallBlock(Block.Properties.from(green_slate_tile));
        wall_slate_tile_purple = new WallBlock(Block.Properties.from(purple_slate_tile));
        wall_timber_oak = new WallBlock(Block.Properties.from(oak_timber));
        wall_timber_spruce = new WallBlock(Block.Properties.from(spruce_timber));
        wall_timber_birch = new WallBlock(Block.Properties.from(birch_timber));
        wall_timber_jungle = new WallBlock(Block.Properties.from(jungle_timber));
        wall_timber_acacia = new WallBlock(Block.Properties.from(acacia_timber));
        wall_timber_dark_oak = new WallBlock(Block.Properties.from(dark_oak_timber));
        wall_wattle = new WallBlock(Block.Properties.from(wattle));
        wall_wicker = new WallBlock(Block.Properties.from(wicker));
        wall_wood_shingle_oak = new WallBlock(Block.Properties.from(oak_shingle));
        wall_wood_shingle_spruce = new WallBlock(Block.Properties.from(oak_shingle));
        wall_wood_shingle_birch = new WallBlock(Block.Properties.from(oak_shingle));
        wall_wood_shingle_jungle = new WallBlock(Block.Properties.from(oak_shingle));
        wall_wood_shingle_acacia = new WallBlock(Block.Properties.from(oak_shingle));
        wall_wood_shingle_dark_oak = new WallBlock(Block.Properties.from(oak_shingle));

        //  QUARK COMPAT    //

        reed = new RotatedPillarBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.CLOTH).hardnessAndResistance( 0.8F, 1.0F));
        thatch = new RotatedPillarBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.CLOTH).hardnessAndResistance(  0.8F, 1.0F));

        reed_slab = new SlabBlock(Block.Properties.from(reed));

        thatch_slab = new SlabBlock(Block.Properties.from(thatch));


        stair_reed = new StairsBlock(reed.getDefaultState(),Block.Properties.from(reed));
        stair_thatch = new StairsBlock(reed.getDefaultState(),Block.Properties.from(thatch));

        wall_reed = new WallBlock(Block.Properties.from(reed));
        wall_thatch = new WallBlock(Block.Properties.from(thatch));

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