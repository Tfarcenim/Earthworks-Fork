package alsender.earthworks.main.registry;


import alsender.earthworks.block.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

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
    public static Block oak_planks_vert;
    public static Block birch_planks_vert;
    public static Block jungle_planks_vert;
    public static Block spruce_planks_vert;
    public static Block acacia_planks_vert;
    public static Block dark_oak_planks_vert;

    public static Block plaster;
    public static Block rammed_earth;
    public static Block reed;
    public static Block slate;
    public static Block slate_green;
    public static Block slate_purple;
    public static Block slate_slab;
    public static Block green_slate_slab;
    public static Block slate_slab_purple;
    public static Block slate_shingle;
    public static Block block_slate_shingle_verte;
    public static Block block_slate_shingle_purple;
    public static Block block_slate_tile;
    public static Block block_slate_tile_verte;
    public static Block block_slate_tile_purple;
    public static Block thatch;
    public static Block block_timber_oak;
    public static Block block_timber_birch;
    public static Block block_timber_spruce;
    public static Block block_timber_jungle;
    public static Block acacia_timber;
    public static Block block_timber_dark_oak;
    public static Block wattle;
    public static Block wicker;
    public static Block oak_wood_shingle;
    public static Block birch_wood_shingle;
    public static Block jungle_wood_shingle;
    public static Block spruce_wood_shingle;
    public static Block acacia_wood_shingle;
    public static Block dark_oak_wood_shingle;

    public static Block vertical_oak_fence;
    public static Block vertical_spruce_fence;
    public static Block vertical_birch_fence;
    public static Block vertical_jungle_fence;
    public static Block vertical_acacia_fence;
    public static Block vertical_dark_oak_fence;

    public static Block slab_adobe;
    public static Block slab_chalk;
    public static Block slab_cinder;
    public static Block slab_cob;
    public static Block slab_concrete;
    public static Block slab_cordwood;
    public static Block slab_dry_stone;
    public static Block slab_gabion0;
    public static Block slab_gabion1;
    public static Block slab_gabion2;
    public static Block slab_mud;
    public static Block vertical_oak_slab;
    public static Block vertical_spruce_slab;
    public static Block slab_planks_vert2;
    public static Block slab_planks_vert3;
    public static Block slab_planks_vert4;
    public static Block slab_planks_vert5;
    public static Block plaster_slab;
    public static Block slab_rammed_earth;
    public static Block slab_reed;
    public static Block slab_slate;
    public static Block slab_slate_green;
    public static Block slab_slate_purple;
    public static Block slab_slate_slab;
    public static Block slab_slate_slab_green;
    public static Block slab_slate_slab_purple;
    public static Block slab_slate_shingle;
    public static Block slab_slate_shingle_verte;
    public static Block slab_slate_shingle_purple;
    public static Block slab_slate_tile;
    public static Block slab_slate_tile_verte;
    public static Block slab_slate_tile_purple;
    public static Block slab_thatch;
    public static Block slab_timber_oak;
    public static Block slab_timber_birch;
    public static Block slab_timber_spruce;
    public static Block slab_timber_jungle;
    public static Block slab_timber_acacia;
    public static Block slab_timber_dark_oak;
    public static Block slab_wattle;
    public static Block slab_wicker;
    public static Block slab_wood_shingle_oak;
    public static Block slab_wood_shingle_spruce;
    public static Block slab_wood_shingle_birch;
    public static Block slab_wood_shingle_jungle;
    public static Block slab_wood_shingle_acacia;
    public static Block slab_wood_shingle_dark_oak;

    public static Block
            stair_adobe;
    public static Block stair_chalk;
    public static Block stair_cinder;
    public static Block stair_cob;
    public static Block stair_concrete;
    public static Block stair_cordwood;
    public static Block stair_dry_stone;
    public static Block GRAVEL_GABION_STAIRS;
    public static Block SAND_GABION_STAIRS;
    public static Block DIRT_GABION_STAIRS;
    public static Block stair_mud;
    public static Block stair_planks_vert0;
    public static Block stair_planks_vert1;
    public static Block stair_planks_vert2;
    public static Block stair_planks_vert3;
    public static Block stair_planks_vert4;
    public static Block stair_planks_vert5;
    public static Block stair_plaster;
    public static Block stair_rammed_earth;
    public static Block stair_reed;
    public static Block stair_slate;
    public static Block stair_slate_green;
    public static Block stair_slate_purple;
    public static Block stair_slate_slab;
    public static Block stair_slate_slab_green;
    public static Block stair_slate_slab_purple;
    public static Block stair_slate_shingle;
    public static Block stair_slate_shingle_verte;
    public static Block stair_slate_shingle_purple;
    public static Block stair_slate_tile;
    public static Block stair_slate_tile_verte;
    public static Block stair_slate_tile_purple;
    public static Block stair_thatch;
    public static Block stair_timber_oak;
    public static Block stair_timber_birch;
    public static Block stair_timber_spruce;
    public static Block stair_timber_jungle;
    public static Block stair_timber_acacia;
    public static Block stair_timber_dark_oak;
    public static Block stair_wattle;
    public static Block stair_wicker;
    public static Block stair_wood_shingle_oak;
    public static Block stair_wood_shingle_spruce;
    public static Block stair_wood_shingle_birch;
    public static Block stair_wood_shingle_jungle;
    public static Block stair_wood_shingle_acacia;
    public static Block stair_wood_shingle_dark_oak;

    public static Block wall_adobe;
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
        mud_bottom = new Block_Mud_Bottom(r, "block_mud_bottom");
        plaster = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(2.0F, 7.5F));
        rammed_earth = new Block(Block.Properties.create(Material.EARTH).sound(SoundType.STONE).hardnessAndResistance( 2.0F, 10.0F));
        slate = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        slate_green = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        slate_purple = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        slate_slab = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        green_slate_slab = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        slate_slab_purple = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.5F, 10.0F));
        slate_shingle = new ModBlockFacing(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        block_slate_shingle_verte = new ModBlockFacing(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        block_slate_shingle_purple = new ModBlockFacing(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        block_slate_tile = new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.2F, 10.0F));
        block_slate_tile_verte = new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance( 1.2F, 10.0F));
        block_slate_tile_purple = new Block(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.2F, 10.0F));
        block_timber_oak = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        block_timber_birch = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        block_timber_spruce = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        block_timber_jungle = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        acacia_timber = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        block_timber_dark_oak = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.0F, 3.33F));
        wattle = new Block(AbstractBlock.Properties.create(Material.ROCK).sound( SoundType.STONE).hardnessAndResistance( 1.5F, 8.33F));
        wicker = new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.CLOTH).hardnessAndResistance( 0.8F, 1.0F));

        oak_wood_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        birch_wood_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        jungle_wood_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        spruce_wood_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        acacia_wood_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));
        dark_oak_wood_shingle = new Block(AbstractBlock.Properties.create(Material.WOOD).sound( SoundType.WOOD).hardnessAndResistance( 2.0F, 3.33F));


        oak_planks_vert = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        birch_planks_vert = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        jungle_planks_vert = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        spruce_planks_vert = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        acacia_planks_vert = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        dark_oak_planks_vert = new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));

        // OreDictionary.registerOre( oak_planks_vert);

//      block_chalk_dust = new Block_ChalkDust();

        vertical_oak_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_FENCE));
        vertical_spruce_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.SPRUCE_FENCE));
        vertical_birch_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        vertical_jungle_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        vertical_acacia_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_PLANKS));
        vertical_dark_oak_fence = new FenceBlock(AbstractBlock.Properties.from(Blocks.DARK_OAK_FENCE));


        slab_adobe = new SlabBlock(Block.Properties.from(adobe));
        slab_chalk = new SlabBlock(Block.Properties.from(chalk));
        slab_cinder = new SlabBlock(Block.Properties.from(cinder));
        slab_cob = new SlabBlock(Block.Properties.from(cob));
        slab_concrete = new SlabBlock(Block.Properties.from(concrete));
        slab_cordwood = new SlabBlock(Block.Properties.from(cordwood));
        slab_dry_stone = new SlabBlock(Block.Properties.from(dry_stone));
        slab_gabion0 = new SlabBlock(Block.Properties.from(GRAVEL_GABION));
        slab_gabion1 = new SlabBlock(Block.Properties.from(SAND_GABION));
        slab_gabion2 = new SlabBlock(Block.Properties.from(DIRT_GABION));
        slab_mud = new SlabBlock(Block.Properties.from(mud));
        vertical_oak_slab = new SlabBlock(Block.Properties.from(oak_planks_vert));
        vertical_spruce_slab = new SlabBlock(Block.Properties.from(spruce_planks_vert));
        slab_planks_vert2 = new SlabBlock(Block.Properties.from(birch_planks_vert));
        slab_planks_vert3 = new SlabBlock(Block.Properties.from(jungle_planks_vert));
        slab_planks_vert4 = new SlabBlock(Block.Properties.from(acacia_planks_vert));
        slab_planks_vert5 = new SlabBlock(Block.Properties.from(dark_oak_planks_vert));
        plaster_slab = new SlabBlock(Block.Properties.from(plaster));
        slab_rammed_earth = new SlabBlock(Block.Properties.from(rammed_earth));
        slab_slate = new SlabBlock(Block.Properties.from(slate));
        slab_slate_green = new SlabBlock(Block.Properties.from(slate_green));
        slab_slate_purple = new SlabBlock(Block.Properties.from(slate_purple));
        slab_slate_slab = new SlabBlock(Block.Properties.from(slate_slab));
        slab_slate_slab_green = new SlabBlock(Block.Properties.from(green_slate_slab));
        slab_slate_slab_purple = new SlabBlock(Block.Properties.from(slate_slab_purple));
        slab_slate_shingle = new SlabBlock(Block.Properties.from(slate_shingle));
        slab_slate_shingle_verte = new SlabBlock(Block.Properties.from(block_slate_shingle_verte));
        slab_slate_shingle_purple = new SlabBlock(Block.Properties.from(block_slate_shingle_purple));
        slab_slate_tile = new SlabBlock(Block.Properties.from(block_slate_tile));
        slab_slate_tile_verte = new SlabBlock(Block.Properties.from(block_slate_tile_verte));
        slab_slate_tile_purple = new SlabBlock(Block.Properties.from(block_slate_tile_purple));
        slab_timber_oak = new SlabBlock(Block.Properties.from(block_timber_oak));
        slab_timber_birch = new SlabBlock(Block.Properties.from(block_timber_birch));
        slab_timber_spruce = new SlabBlock(Block.Properties.from(block_timber_spruce));
        slab_timber_jungle = new SlabBlock(Block.Properties.from(block_timber_jungle));
        slab_timber_acacia = new SlabBlock(Block.Properties.from(acacia_timber));
        slab_timber_dark_oak = new SlabBlock(Block.Properties.from(block_timber_dark_oak));
        slab_wattle = new SlabBlock(Block.Properties.from(wattle));
        slab_wicker = new SlabBlock(Block.Properties.from(wicker));
        slab_wood_shingle_oak = new SlabBlock(Block.Properties.from(oak_wood_shingle));
        slab_wood_shingle_spruce = new SlabBlock(Block.Properties.from(oak_wood_shingle));
        slab_wood_shingle_birch = new SlabBlock(Block.Properties.from(oak_wood_shingle));
        slab_wood_shingle_jungle = new SlabBlock(Block.Properties.from(oak_wood_shingle));
        slab_wood_shingle_acacia = new SlabBlock(Block.Properties.from(oak_wood_shingle));
        slab_wood_shingle_dark_oak = new SlabBlock(Block.Properties.from(oak_wood_shingle));

        stair_adobe = new StairsBlock(adobe.getDefaultState(), Block.Properties.from(adobe));
        stair_chalk = new StairsBlock(chalk.getDefaultState(),Block.Properties.from(chalk));
        stair_cinder = new StairsBlock(cinder.getDefaultState(),Block.Properties.from(cinder));
        stair_cob = new StairsBlock(cob.getDefaultState(),Block.Properties.from(cob));
        stair_concrete = new StairsBlock(concrete.getDefaultState(),Block.Properties.from(concrete));
        stair_cordwood = new StairsBlock(cordwood.getDefaultState(),Block.Properties.from(cordwood));
        stair_dry_stone = new StairsBlock(dry_stone.getDefaultState(),Block.Properties.from(dry_stone));
        GRAVEL_GABION_STAIRS = new StairsBlock(GRAVEL_GABION.getDefaultState(),Block.Properties.from(GRAVEL_GABION));
        SAND_GABION_STAIRS = new StairsBlock(SAND_GABION.getDefaultState(),Block.Properties.from(SAND_GABION));
        DIRT_GABION_STAIRS = new StairsBlock(DIRT_GABION.getDefaultState(),Block.Properties.from(DIRT_GABION));
        stair_mud = new StairsBlock(mud.getDefaultState(),Block.Properties.from(mud));
        stair_planks_vert0 = new StairsBlock(oak_planks_vert.getDefaultState(),Block.Properties.from(oak_planks_vert));
        stair_planks_vert1 = new StairsBlock(spruce_planks_vert.getDefaultState(),Block.Properties.from(spruce_planks_vert));
        stair_planks_vert2 = new StairsBlock(birch_planks_vert.getDefaultState(),Block.Properties.from(birch_planks_vert));
        stair_planks_vert3 = new StairsBlock(oak_planks_vert.getDefaultState(),Block.Properties.from(jungle_planks_vert));
        stair_planks_vert4 = new StairsBlock(acacia_planks_vert.getDefaultState(),Block.Properties.from(acacia_planks_vert));
        stair_planks_vert5 = new StairsBlock(dark_oak_planks_vert.getDefaultState(),Block.Properties.from(dark_oak_planks_vert));
        stair_plaster = new StairsBlock(Block.Properties.from(plaster));
        stair_rammed_earth = new StairsBlock(Block.Properties.from(rammed_earth));
        stair_slate = new StairsBlock(Block.Properties.from(slate));
        stair_slate_green = new StairsBlock(Block.Properties.from(slate_green));
        stair_slate_purple = new StairsBlock(Block.Properties.from(slate_purple));
        stair_slate_slab = new StairsBlock(Block.Properties.from(slate_slab));
        stair_slate_slab_green = new StairsBlock(Block.Properties.from(green_slate_slab));
        stair_slate_slab_purple = new StairsBlock(Block.Properties.from(slate_slab_purple));
        stair_slate_shingle = new StairsBlock(Block.Properties.from(slate_shingle));
        stair_slate_shingle_verte = new StairsBlock(Block.Properties.from(block_slate_shingle_verte));
        stair_slate_shingle_purple = new StairsBlock(Block.Properties.from(block_slate_shingle_purple));
        stair_slate_tile = new StairsBlock(Block.Properties.from(block_slate_tile));
        stair_slate_tile_verte = new StairsBlock(Block.Properties.from(block_slate_tile_verte));
        stair_slate_tile_purple = new StairsBlock(Block.Properties.from(block_slate_tile_purple));
        stair_timber_oak = new StairsBlock(Block.Properties.from(block_timber_oak));
        stair_timber_spruce = new StairsBlock(Block.Properties.from(block_timber_spruce));
        stair_timber_birch = new StairsBlock(Block.Properties.from(block_timber_birch));
        stair_timber_jungle = new StairsBlock(Block.Properties.from(block_timber_jungle));
        stair_timber_acacia = new StairsBlock(Block.Properties.from(acacia_timber));
        stair_timber_dark_oak = new StairsBlock(Block.Properties.from(block_timber_dark_oak));
        stair_wattle = new StairsBlock(Block.Properties.from(wattle));
        stair_wicker = new StairsBlock(Block.Properties.from(wicker));
        stair_wood_shingle_oak = new StairsBlock(Block.Properties.from(oak_wood_shingle));
        stair_wood_shingle_spruce = new StairsBlock(Block.Properties.from(oak_wood_shingle));
        stair_wood_shingle_birch = new StairsBlock(Block.Properties.from(oak_wood_shingle));
        stair_wood_shingle_jungle = new StairsBlock(Block.Properties.from(oak_wood_shingle));
        stair_wood_shingle_acacia = new StairsBlock(Block.Properties.from(oak_wood_shingle));
        stair_wood_shingle_dark_oak = new StairsBlock(Block.Properties.from(oak_wood_shingle));

        wall_adobe = new WallBlock(Block.Properties.from(adobe));
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
        wall_slate_green = new WallBlock(Block.Properties.from(slate_green));
        wall_slate_purple = new WallBlock(Block.Properties.from(slate_purple));
        wall_slate_slab = new WallBlock(Block.Properties.from(slate_slab));
        wall_slate_slab_green = new WallBlock(Block.Properties.from(green_slate_slab));
        wall_slate_slab_purple = new WallBlock(Block.Properties.from(slate_slab_purple));
        wall_slate_shingle = new WallBlock(Block.Properties.from(slate_shingle));
        wall_slate_shingle_verte = new WallBlock(Block.Properties.from(block_slate_shingle_verte));
        wall_slate_shingle_purple = new WallBlock(Block.Properties.from(block_slate_shingle_purple));
        wall_slate_tile = new WallBlock(Block.Properties.from(block_slate_tile));
        wall_slate_tile_verte = new WallBlock(Block.Properties.from(block_slate_tile_verte));
        wall_slate_tile_purple = new WallBlock(Block.Properties.from(block_slate_tile_purple));
        wall_timber_oak = new WallBlock(Block.Properties.from(block_timber_oak));
        wall_timber_spruce = new WallBlock(Block.Properties.from(block_timber_spruce));
        wall_timber_birch = new WallBlock(Block.Properties.from(block_timber_birch));
        wall_timber_jungle = new WallBlock(Block.Properties.from(block_timber_jungle));
        wall_timber_acacia = new WallBlock(Block.Properties.from(acacia_timber));
        wall_timber_dark_oak = new WallBlock(Block.Properties.from(block_timber_dark_oak));
        wall_wattle = new WallBlock(Block.Properties.from(wattle));
        wall_wicker = new WallBlock(Block.Properties.from(wicker));
        wall_wood_shingle_oak = new WallBlock(Block.Properties.from(oak_wood_shingle));
        wall_wood_shingle_spruce = new WallBlock(Block.Properties.from(oak_wood_shingle));
        wall_wood_shingle_birch = new WallBlock(Block.Properties.from(oak_wood_shingle));
        wall_wood_shingle_jungle = new WallBlock(Block.Properties.from(oak_wood_shingle));
        wall_wood_shingle_acacia = new WallBlock(Block.Properties.from(oak_wood_shingle));
        wall_wood_shingle_dark_oak = new WallBlock(Block.Properties.from(oak_wood_shingle));

        //  QUARK COMPAT    //

        reed = new RotatedPillarBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.CLOTH).hardnessAndResistance( 0.8F, 1.0F));
        thatch = new RotatedPillarBlock(Block.Properties.create(Material.LEAVES).sound(SoundType.CLOTH).hardnessAndResistance(  0.8F, 1.0F));

        slab_reed = new SlabBlock(Block.Properties.from(reed));

        slab_thatch = new SlabBlock(Block.Properties.from(thatch));


        stair_reed = new StairsBlock(reed.getDefaultState(),Block.Properties.from(reed));
        stair_thatch = new StairsBlock(reed.getDefaultState(),Block.Properties.from(thatch));

        wall_reed = new WallBlock(Block.Properties.from(reed));
        wall_thatch = new WallBlock(Block.Properties.from(thatch));
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