package alsender.earthworks.main.registry;


import alsender.earthworks.block.*;
import alsender.earthworks.item.BlockItemPlanksVert;
import alsender.earthworks.item.BlockItemWoodShingle;
import alsender.earthworks.item.ModItemSlab;
import alsender.earthworks.main.Config;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
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
    public static Block chalk_dust;
    public static Block cinder;
    public static Block cob;
    public static Block concrete;
    public static Block cordwood;
    public static Block dry_stone;
    public static Block GRAVEL_GABION;
    public static Block SAND_GABION;
    public static Block DIRT_GABION;
    public static Block gabion_falling0;
    public static Block gabion_falling1;
    public static Block gabion_falling2;
    public static Block mud;
    public static Block mud_bottom;
    public static Block oak_planks_vert;
    public static Block birch_planks_vert;
    public static Block jungle_planks_vert;
    public static Block spruce_planks_vert;
    public static Block acacia_planks_vert;
    public static Block dark_oak_planks_vert;

    public static Block block_plaster;
    public static Block block_rammed_earth;
    public static Block block_reed;
    public static Block block_slate;
    public static Block block_slate_green;
    public static Block block_slate_purple;
    public static Block block_slate_slab;
    public static Block block_slate_slab_green;
    public static Block block_slate_slab_purple;
    public static Block block_slate_shingle;
    public static Block block_slate_shingle_verte;
    public static Block block_slate_shingle_purple;
    public static Block block_slate_tile;
    public static Block block_slate_tile_verte;
    public static Block block_slate_tile_purple;
    public static Block block_thatch;
    public static Block block_timber_oak;
    public static Block block_timber_birch;
    public static Block block_timber_spruce;
    public static Block block_timber_jungle;
    public static Block block_timber_acacia;
    public static Block block_timber_dark_oak;
    public static Block block_wattle;
    public static Block block_wicker;
    public static Block oak_wood_shingle;
    public static Block birch_wood_shingle;
    public static Block jungle_wood_shingle;
    public static Block spruce_wood_shingle;
    public static Block acacia_wood_shingle;
    public static Block dark_oak_wood_shingle;

    public static Block fence_planks_vert0;
    public static Block fence_planks_vert1;
    public static Block fence_planks_vert2;
    public static Block fence_planks_vert3;
    public static Block fence_planks_vert4;
    public static Block fence_planks_vert5;

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
    public static Block slab_planks_vert0;
    public static Block slab_planks_vert1;
    public static Block slab_planks_vert2;
    public static Block slab_planks_vert3;
    public static Block slab_planks_vert4;
    public static Block slab_planks_vert5;
    public static Block slab_plaster;
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
    public static Block stair_gabion0;
    public static Block stair_gabion1;
    public static Block stair_gabion2;
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

    public static ModItemSlab
            itemslab_adobe;
    public static ModItemSlab itemslab_chalk;
    public static ModItemSlab itemslab_cinder;
    public static ModItemSlab itemslab_cob;
    public static ModItemSlab itemslab_concrete;
    public static ModItemSlab itemslab_cordwood;
    public static ModItemSlab itemslab_dry_stone;
    public static ModItemSlab itemslab_gabion0;
    public static ModItemSlab itemslab_gabion1;
    public static ModItemSlab itemslab_gabion2;
    public static ModItemSlab itemslab_mud;
    public static ModItemSlab itemslab_planks_vert0;
    public static ModItemSlab itemslab_planks_vert1;
    public static ModItemSlab itemslab_planks_vert2;
    public static ModItemSlab itemslab_planks_vert3;
    public static ModItemSlab itemslab_planks_vert4;
    public static ModItemSlab itemslab_planks_vert5;
    public static ModItemSlab itemslab_plaster;
    public static ModItemSlab itemslab_rammed_earth;
    public static ModItemSlab itemslab_reed;
    public static ModItemSlab itemslab_slate;
    public static ModItemSlab itemslab_slate_green;
    public static ModItemSlab itemslab_slate_purple;
    public static ModItemSlab itemslab_slate_slab;
    public static ModItemSlab itemslab_slate_slab_green;
    public static ModItemSlab itemslab_slate_slab_purple;
    public static ModItemSlab itemslab_slate_shingle;
    public static ModItemSlab itemslab_slate_shingle_verte;
    public static ModItemSlab itemslab_slate_shingle_purple;
    public static ModItemSlab itemslab_slate_tile;
    public static ModItemSlab itemslab_slate_tile_verte;
    public static ModItemSlab itemslab_slate_tile_purple;
    public static ModItemSlab itemslab_thatch;
    public static ModItemSlab itemslab_timber_oak;
    public static ModItemSlab itemslab_timber_birch;
    public static ModItemSlab itemslab_timber_spruce;
    public static ModItemSlab itemslab_timber_jungle;
    public static ModItemSlab itemslab_timber_acacia;
    public static ModItemSlab itemslab_timber_dark_oak;
    public static ModItemSlab itemslab_wattle;
    public static ModItemSlab itemslab_wicker;
    public static ModItemSlab itemslab_wood_shingle_oak;
    public static ModItemSlab itemslab_wood_shingle_spruce;
    public static ModItemSlab itemslab_wood_shingle_birch;
    public static ModItemSlab itemslab_wood_shingle_jungle;
    public static ModItemSlab itemslab_wood_shingle_acacia;
    public static ModItemSlab itemslab_wood_shingle_dark_oak;

    public static ModDoubleSlab doubleslab_adobe;
    public static ModDoubleSlab doubleslab_chalk;
    public static ModDoubleSlab doubleslab_cinder;
    public static ModDoubleSlab doubleslab_cob;
    public static ModDoubleSlab doubleslab_concrete;
    public static ModDoubleSlab doubleslab_cordwood;
    public static ModDoubleSlab doubleslab_dry_stone;
    public static ModDoubleSlab doubleslab_gabion0;
    public static ModDoubleSlab doubleslab_gabion1;
    public static ModDoubleSlab doubleslab_gabion2;
    public static ModDoubleSlab doubleslab_mud;
    public static ModDoubleSlab doubleslab_planks_vert0;
    public static ModDoubleSlab doubleslab_planks_vert1;
    public static ModDoubleSlab doubleslab_planks_vert2;
    public static ModDoubleSlab doubleslab_planks_vert3;
    public static ModDoubleSlab doubleslab_planks_vert4;
    public static ModDoubleSlab doubleslab_planks_vert5;
    public static ModDoubleSlab doubleslab_plaster;
    public static ModDoubleSlab doubleslab_rammed_earth;
    public static ModDoubleSlab doubleslab_reed;
    public static ModDoubleSlab doubleslab_slate;
    public static ModDoubleSlab doubleslab_slate_green;
    public static ModDoubleSlab doubleslab_slate_purple;
    public static ModDoubleSlab doubleslab_slate_slab;
    public static ModDoubleSlab doubleslab_slate_slab_green;
    public static ModDoubleSlab doubleslab_slate_slab_purple;
    public static ModDoubleSlab doubleslab_slate_shingle;
    public static ModDoubleSlab doubleslab_slate_shingle_verte;
    public static ModDoubleSlab doubleslab_slate_shingle_purple;
    public static ModDoubleSlab doubleslab_slate_tile;
    public static ModDoubleSlab doubleslab_slate_tile_verte;
    public static ModDoubleSlab doubleslab_slate_tile_purple;
    public static ModDoubleSlab doubleslab_thatch;
    public static ModDoubleSlab doubleslab_timber_oak;
    public static ModDoubleSlab doubleslab_timber_birch;
    public static ModDoubleSlab doubleslab_timber_spruce;
    public static ModDoubleSlab doubleslab_timber_jungle;
    public static ModDoubleSlab doubleslab_timber_acacia;
    public static ModDoubleSlab doubleslab_timber_dark_oak;
    public static ModDoubleSlab doubleslab_wattle;
    public static ModDoubleSlab doubleslab_wicker;
    public static ModDoubleSlab doubleslab_wood_shingle_oak;
    public static ModDoubleSlab doubleslab_wood_shingle_spruce;
    public static ModDoubleSlab doubleslab_wood_shingle_birch;
    public static ModDoubleSlab doubleslab_wood_shingle_jungle;
    public static ModDoubleSlab doubleslab_wood_shingle_acacia;
    public static ModDoubleSlab doubleslab_wood_shingle_dark_oak;

    @SubscribeEvent
    public static void initBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> r = event.getRegistry();
        adobe = new ModBlock(r, "adobe", Material.ROCK, SoundType.STONE, 2.0F, 3.3F);
        chalk = new ChalkBlock(r, "chalk");
        cinder = new ModBlock(r, "cinder", Material.ROCK, SoundType.STONE, 1.5F, 5.83F);
        cob = new ModBlock(r, "cob", Material.GROUND, SoundType.GROUND, 1.0F, 3.0F);
        concrete = new ModBlock(r, "block_concrete", Material.ROCK, SoundType.STONE, 2.0F, 10.0F);
        cordwood = new ModBlockFacing(r, "block_cordwood", Material.ROCK, SoundType.STONE, 1.5F, 2.83F);
        dry_stone = new ModBlock(r, "block_dry_stone", Material.ROCK, SoundType.STONE, 2.0F, 1333.3F);
        GRAVEL_GABION = new BlockGabion(r, "block_gabion_gravel", 0, Material.ROCK, SoundType.SAND, 2.0F, 12.0F);
        SAND_GABION = new BlockGabion(r, "block_gabion_sand", 1, Material.ROCK, SoundType.SAND, 2.0F, 12.0F);
        DIRT_GABION = new BlockGabion(r, "block_gabion_dirt", 2, Material.ROCK, SoundType.SAND, 2.0F, 12.0F);
        gabion_falling0 = new Block_Gabion_Falling(r, "gravel", GRAVEL_GABION);
        gabion_falling1 = new Block_Gabion_Falling(r, "sand", SAND_GABION);
        gabion_falling2 = new Block_Gabion_Falling(r, "dirt", DIRT_GABION);
        mud = new Block_Mud(r, "block_mud");
        mud_bottom = new Block_Mud_Bottom(r, "block_mud_bottom");
        block_plaster = new ModBlock(r, "block_plaster", Material.ROCK, SoundType.STONE, 2.0F, 7.5F);
        block_rammed_earth = new ModBlock(r, "block_rammed_earth", Material.GROUND, SoundType.STONE, 2.0F, 10.0F);
        block_slate = new ModBlock(r, "block_slate", Material.ROCK, SoundType.STONE, 1.5F, 10.0F);
        block_slate_green = new ModBlock(r, "block_slate_green", Material.ROCK, SoundType.STONE, 1.5F, 10.0F);
        block_slate_purple = new ModBlock(r, "block_slate_purple", Material.ROCK, SoundType.STONE, 1.5F, 10.0F);
        block_slate_slab = new ModBlock(r, "block_slate_slab", Material.ROCK, SoundType.STONE, 1.5F, 10.0F);
        block_slate_slab_green = new ModBlock(r, "block_slate_slab_green", Material.ROCK, SoundType.STONE, 1.5F, 10.0F);
        block_slate_slab_purple = new ModBlock(r, "block_slate_slab_purple", Material.ROCK, SoundType.STONE, 1.5F, 10.0F);
        block_slate_shingle = new ModBlockFacing(r, "block_slate_shingle", Material.ROCK, SoundType.STONE, 1.2F, 10.0F);
        block_slate_shingle_verte = new ModBlockFacing(r, "block_slate_shingle_verte", Material.ROCK, SoundType.STONE, 1.2F, 10.0F);
        block_slate_shingle_purple = new ModBlockFacing(r, "block_slate_shingle_purple", Material.ROCK, SoundType.STONE, 1.2F, 10.0F);
        block_slate_tile = new ModBlock(r, "block_slate_tile", Material.ROCK, SoundType.STONE, 1.2F, 10.0F);
        block_slate_tile_verte = new ModBlock(r, "block_slate_tile_verte", Material.ROCK, SoundType.STONE, 1.2F, 10.0F);
        block_slate_tile_purple = new ModBlock(r, "block_slate_tile_purple", Material.ROCK, SoundType.STONE, 1.2F, 10.0F);
        block_timber_oak = new ModRotatedPillar(r, "block_timber", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_timber_birch = new ModRotatedPillar(r, "block_timber_birch", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_timber_spruce = new ModRotatedPillar(r, "block_timber_spruce", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_timber_jungle = new ModRotatedPillar(r, "block_timber_jungle", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_timber_acacia = new ModRotatedPillar(r, "block_timber_acacia", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_timber_dark_oak = new ModRotatedPillar(r, "block_timber_dark_oak", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_wattle = new ModBlock(r, "block_wattle", Material.ROCK, SoundType.STONE, 1.5F, 8.33F);
        block_wicker = new ModBlock(r, "block_wicker", Material.WOOD, SoundType.CLOTH, 0.8F, 1.0F);
        oak_wood_shingle = new Block_Wood_Shingle(r, "oak_wood_shingle", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        birch_wood_shingle = new Block_Wood_Shingle(r, "birch_wood_shingle", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        jungle_wood_shingle = new Block_Wood_Shingle(r, "jungle_wood_shingle", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        spruce_wood_shingle = new Block_Wood_Shingle(r, "spruce_wood_shingle", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        acacia_wood_shingle = new Block_Wood_Shingle(r, "acacia_wood_shingle", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        dark_oak_wood_shingle = new Block_Wood_Shingle(r, "dark_oak_wood_shingle", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);


        oak_planks_vert = new Block_Planks_Vert(r, "oak_planks_vert", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        birch_planks_vert = new Block_Planks_Vert(r, "birch_planks_vert", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        jungle_planks_vert = new Block_Planks_Vert(r, "jungle_planks_vert", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        spruce_planks_vert = new Block_Planks_Vert(r, "spruce_planks_vert", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        acacia_planks_vert = new Block_Planks_Vert(r, "acacia_planks_vert", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        dark_oak_planks_vert = new Block_Planks_Vert(r, "dark_oak_planks_vert", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);

        // OreDictionary.registerOre("plankWood", oak_planks_vert);

//      block_chalk_dust = new Block_ChalkDust();

        fence_planks_vert0 = new ModFence(r, "fence_planks_vert_oak");
        fence_planks_vert1 = new ModFence(r, "fence_planks_vert_spruce");
        fence_planks_vert2 = new ModFence(r, "fence_planks_vert_birch");
        fence_planks_vert3 = new ModFence(r, "fence_planks_vert_jungle");
        fence_planks_vert4 = new ModFence(r, "fence_planks_vert_acacia");
        fence_planks_vert5 = new ModFence(r, "fence_planks_vert_dark_oak");


        slab_adobe = new ModSlab(r, "slab_adobe", adobe);
        doubleslab_adobe = new ModDoubleSlab(r, slab_adobe);

        slab_chalk = new ModSlab(r, "slab_chalk", chalk);
        doubleslab_chalk = new ModDoubleSlab(r, slab_chalk);

        slab_cinder = new ModSlab(r, "slab_cinder", cinder);
        doubleslab_cinder = new ModDoubleSlab(r, slab_cinder);

        slab_cob = new ModSlab(r, "slab_cob", cob);
        doubleslab_cob = new ModDoubleSlab(r, slab_cob);

        slab_concrete = new ModSlab(r, "slab_concrete", concrete);
        doubleslab_concrete = new ModDoubleSlab(r, slab_concrete);

        slab_cordwood = new ModSlab(r, "slab_cordwood", cordwood);
        doubleslab_cordwood = new ModDoubleSlab(r, slab_cordwood);

        slab_dry_stone = new ModSlab(r, "slab_dry_stone", dry_stone);
        doubleslab_dry_stone = new ModDoubleSlab(r, slab_dry_stone);

        slab_gabion0 = new ModSlab(r, "slab_gabion_gravel", GRAVEL_GABION);
        doubleslab_gabion0 = new ModDoubleSlab(r, slab_gabion0);

        slab_gabion1 = new ModSlab(r, "slab_gabion_sand", SAND_GABION);
        doubleslab_gabion1 = new ModDoubleSlab(r, slab_gabion1);

        slab_gabion2 = new ModSlab(r, "slab_gabion_dirt", DIRT_GABION);
        doubleslab_gabion2 = new ModDoubleSlab(r, slab_gabion2);

        slab_mud = new ModSlab(r, "slab_mud", mud);
        doubleslab_mud = new ModDoubleSlab(r, slab_mud);

        slab_planks_vert0 = new ModSlab(r, "slab_planks_vert_oak");
        doubleslab_planks_vert0 = new ModDoubleSlab(r, slab_planks_vert0);

        slab_planks_vert1 = new ModSlab(r, "slab_planks_vert_spruce");
        doubleslab_planks_vert1 = new ModDoubleSlab(r, slab_planks_vert1);

        slab_planks_vert2 = new ModSlab(r, "slab_planks_vert_birch");
        doubleslab_planks_vert2 = new ModDoubleSlab(r, slab_planks_vert2);

        slab_planks_vert3 = new ModSlab(r, "slab_planks_vert_jungle");
        doubleslab_planks_vert3 = new ModDoubleSlab(r, slab_planks_vert3);

        slab_planks_vert4 = new ModSlab(r, "slab_planks_vert_acacia");
        doubleslab_planks_vert4 = new ModDoubleSlab(r, slab_planks_vert4);

        slab_planks_vert5 = new ModSlab(r, "slab_planks_vert_dark_oak");
        doubleslab_planks_vert5 = new ModDoubleSlab(r, slab_planks_vert5);

        slab_plaster = new ModSlab(r, "slab_plaster", block_plaster);
        doubleslab_plaster = new ModDoubleSlab(r, slab_plaster);

        slab_rammed_earth = new ModSlab(r, "slab_rammed_earth", block_rammed_earth);
        doubleslab_rammed_earth = new ModDoubleSlab(r, slab_rammed_earth);

        slab_slate = new ModSlab(r, "slab_slate", block_slate);
        doubleslab_slate = new ModDoubleSlab(r, slab_slate);

        slab_slate_green = new ModSlab(r, "slab_slate_green", block_slate_green);
        doubleslab_slate_green = new ModDoubleSlab(r, slab_slate_green);

        slab_slate_purple = new ModSlab(r, "slab_slate_purple", block_slate_purple);
        doubleslab_slate_purple = new ModDoubleSlab(r, slab_slate_purple);

        slab_slate_slab = new ModSlab(r, "slab_slate_slab", block_slate_slab);
        doubleslab_slate_slab = new ModDoubleSlab(r, slab_slate_slab);

        slab_slate_slab_green = new ModSlab(r, "slab_slate_slab_green", block_slate_slab_green);
        doubleslab_slate_slab_green = new ModDoubleSlab(r, slab_slate_slab_green);

        slab_slate_slab_purple = new ModSlab(r, "slab_slate_slab_purple", block_slate_slab_purple);
        doubleslab_slate_slab_purple = new ModDoubleSlab(r, slab_slate_slab_purple);

        slab_slate_shingle = new ModSlab(r, "slab_slate_shingle", block_slate_shingle);
        doubleslab_slate_shingle = new ModDoubleSlab(r, slab_slate_shingle);

        slab_slate_shingle_verte = new ModSlab(r, "slab_slate_shingle_verte", block_slate_shingle_verte);
        doubleslab_slate_shingle_verte = new ModDoubleSlab(r, slab_slate_shingle_verte);

        slab_slate_shingle_purple = new ModSlab(r, "slab_slate_shingle_purple", block_slate_shingle_purple);
        doubleslab_slate_shingle_purple = new ModDoubleSlab(r, slab_slate_shingle_purple);

        slab_slate_tile = new ModSlab(r, "slab_slate_tile", block_slate_tile);
        doubleslab_slate_tile = new ModDoubleSlab(r, slab_slate_tile);

        slab_slate_tile_verte = new ModSlab(r, "slab_slate_tile_verte", block_slate_tile_verte);
        doubleslab_slate_tile_verte = new ModDoubleSlab(r, slab_slate_tile_verte);

        slab_slate_tile_purple = new ModSlab(r, "slab_slate_tile_purple", block_slate_tile_purple);
        doubleslab_slate_tile_purple = new ModDoubleSlab(r, slab_slate_tile_purple);

        slab_timber_oak = new ModSlab(r, "slab_timber", block_timber_oak);
        doubleslab_timber_oak = new ModDoubleSlab(r, slab_timber_oak);

        slab_timber_birch = new ModSlab(r, "slab_timber_birch", block_timber_birch);
        doubleslab_timber_birch = new ModDoubleSlab(r, slab_timber_birch);

        slab_timber_spruce = new ModSlab(r, "slab_timber_spruce", block_timber_spruce);
        doubleslab_timber_spruce = new ModDoubleSlab(r, slab_timber_spruce);

        slab_timber_jungle = new ModSlab(r, "slab_timber_jungle", block_timber_jungle);
        doubleslab_timber_jungle = new ModDoubleSlab(r, slab_timber_jungle);

        slab_timber_acacia = new ModSlab(r, "slab_timber_acacia", block_timber_acacia);
        doubleslab_timber_acacia = new ModDoubleSlab(r, slab_timber_acacia);

        slab_timber_dark_oak = new ModSlab(r, "slab_timber_dark_oak", block_timber_dark_oak);
        doubleslab_timber_dark_oak = new ModDoubleSlab(r, slab_timber_dark_oak);

        slab_wattle = new ModSlab(r, "slab_wattle", block_wattle);
        doubleslab_wattle = new ModDoubleSlab(r, slab_wattle);

        slab_wicker = new ModSlab(r, "slab_wicker", block_wicker);
        doubleslab_wicker = new ModDoubleSlab(r, slab_wicker);

        slab_wood_shingle_oak = new ModSlab(r, "slab_wood_shingle_oak", oak_wood_shingle);
        doubleslab_wood_shingle_oak = new ModDoubleSlab(r, slab_wood_shingle_oak);

        slab_wood_shingle_spruce = new ModSlab(r, "slab_wood_shingle_spruce", oak_wood_shingle);
        doubleslab_wood_shingle_spruce = new ModDoubleSlab(r, slab_wood_shingle_spruce);

        slab_wood_shingle_birch = new ModSlab(r, "slab_wood_shingle_birch", oak_wood_shingle);
        doubleslab_wood_shingle_birch = new ModDoubleSlab(r, slab_wood_shingle_birch);

        slab_wood_shingle_jungle = new ModSlab(r, "slab_wood_shingle_jungle", oak_wood_shingle);
        doubleslab_wood_shingle_jungle = new ModDoubleSlab(r, slab_wood_shingle_jungle);

        slab_wood_shingle_acacia = new ModSlab(r, "slab_wood_shingle_acacia", oak_wood_shingle);
        doubleslab_wood_shingle_acacia = new ModDoubleSlab(r, slab_wood_shingle_acacia);

        slab_wood_shingle_dark_oak = new ModSlab(r, "slab_wood_shingle_dark_oak", oak_wood_shingle);
        doubleslab_wood_shingle_dark_oak = new ModDoubleSlab(r, slab_wood_shingle_dark_oak);


        stair_adobe = new ModStair(r, "stair_adobe", adobe);
        stair_chalk = new ModStair(r, "stair_chalk", chalk);
        stair_cinder = new ModStair(r, "stair_cinder", cinder);
        stair_cob = new ModStair(r, "stair_cob", cob);
        stair_concrete = new ModStair(r, "stair_concrete", concrete);
        stair_cordwood = new ModStair(r, "stair_cordwood", cordwood);
        stair_dry_stone = new ModStair(r, "stair_dry_stone", dry_stone);
        stair_gabion0 = new ModStair(r, "stair_gabion_gravel", GRAVEL_GABION);
        stair_gabion1 = new ModStair(r, "stair_gabion_sand", SAND_GABION);
        stair_gabion2 = new ModStair(r, "stair_gabion_dirt", DIRT_GABION);
        stair_mud = new ModStair(r, "stair_mud", mud);
        stair_planks_vert0 = new ModStair(r, "stair_planks_vert_oak", adobe);
        stair_planks_vert1 = new ModStair(r, "stair_planks_vert_spruce", adobe);
        stair_planks_vert2 = new ModStair(r, "stair_planks_vert_birch", adobe);
        stair_planks_vert3 = new ModStair(r, "stair_planks_vert_jungle", adobe);
        stair_planks_vert4 = new ModStair(r, "stair_planks_vert_acacia", adobe);
        stair_planks_vert5 = new ModStair(r, "stair_planks_vert_dark_oak", adobe);
        stair_plaster = new ModStair(r, "stair_plaster", block_plaster);
        stair_rammed_earth = new ModStair(r, "stair_rammed_earth", block_rammed_earth);
        stair_slate = new ModStair(r, "stair_slate", block_slate);
        stair_slate_green = new ModStair(r, "stair_slate_green", block_slate_green);
        stair_slate_purple = new ModStair(r, "stair_slate_purple", block_slate_purple);
        stair_slate_slab = new ModStair(r, "stair_slate_slab", block_slate_slab);
        stair_slate_slab_green = new ModStair(r, "stair_slate_slab_green", block_slate_slab_green);
        stair_slate_slab_purple = new ModStair(r, "stair_slate_slab_purple", block_slate_slab_purple);
        stair_slate_shingle = new ModStair(r, "stair_slate_shingle", block_slate_shingle);
        stair_slate_shingle_verte = new ModStair(r, "stair_slate_shingle_verte", block_slate_shingle_verte);
        stair_slate_shingle_purple = new ModStair(r, "stair_slate_shingle_purple", block_slate_shingle_purple);
        stair_slate_tile = new ModStair(r, "stair_slate_tile", block_slate_tile);
        stair_slate_tile_verte = new ModStair(r, "stair_slate_tile_verte", block_slate_tile_verte);
        stair_slate_tile_purple = new ModStair(r, "stair_slate_tile_purple", block_slate_tile_purple);
        stair_timber_oak = new ModStair(r, "stair_timber", block_timber_oak);
        stair_timber_spruce = new ModStair(r, "stair_timber_spruce", block_timber_spruce);
        stair_timber_birch = new ModStair(r, "stair_timber_birch", block_timber_birch);
        stair_timber_jungle = new ModStair(r, "stair_timber_jungle", block_timber_jungle);
        stair_timber_acacia = new ModStair(r, "stair_timber_acacia", block_timber_acacia);
        stair_timber_dark_oak = new ModStair(r, "stair_timber_dark_oak", block_timber_dark_oak);
        stair_wattle = new ModStair(r, "stair_wattle", block_wattle);
        stair_wicker = new ModStair(r, "stair_wicker", block_wicker);
        stair_wood_shingle_oak = new ModStair(r, "stair_wood_shingle_oak", oak_wood_shingle);
        stair_wood_shingle_spruce = new ModStair(r, "stair_wood_shingle_spruce", oak_wood_shingle);
        stair_wood_shingle_birch = new ModStair(r, "stair_wood_shingle_birch", oak_wood_shingle);
        stair_wood_shingle_jungle = new ModStair(r, "stair_wood_shingle_jungle", oak_wood_shingle);
        stair_wood_shingle_acacia = new ModStair(r, "stair_wood_shingle_acacia", oak_wood_shingle);
        stair_wood_shingle_dark_oak = new ModStair(r, "stair_wood_shingle_dark_oak", oak_wood_shingle);

        wall_adobe = new ModWallBlock(r, "wall_adobe", adobe);
        wall_chalk = new ModWallBlock(r, "wall_chalk", chalk);
        wall_cinder = new ModWallBlock(r, "wall_cinder", cinder);
        wall_cob = new ModWallBlock(r, "wall_cob", cob);
        wall_concrete = new ModWallBlock(r, "wall_concrete", concrete);
        wall_cordwood = new ModWallBlock(r, "wall_cordwood", cordwood);
        wall_dry_stone = new ModWallBlock(r, "wall_dry_stone", dry_stone);
        wall_gabion0 = new ModWallBlock(r, "wall_gabion_gravel", GRAVEL_GABION);
        wall_gabion1 = new ModWallBlock(r, "wall_gabion_sand", SAND_GABION);
        wall_gabion2 = new ModWallBlock(r, "wall_gabion_dirt", DIRT_GABION);
        wall_mud = new ModWallBlock(r, "wall_mud", mud);
        wall_plaster = new ModWallBlock(r, "wall_plaster", block_plaster);
        wall_rammed_earth = new ModWallBlock(r, "wall_rammed_earth", block_rammed_earth);
        wall_slate = new ModWallBlock(r, "wall_slate", block_slate);
        wall_slate_green = new ModWallBlock(r, "wall_slate_green", block_slate_green);
        wall_slate_purple = new ModWallBlock(r, "wall_slate_purple", block_slate_purple);
        wall_slate_slab = new ModWallBlock(r, "wall_slate_slab", block_slate_slab);
        wall_slate_slab_green = new ModWallBlock(r, "wall_slate_slab_green", block_slate_slab_green);
        wall_slate_slab_purple = new ModWallBlock(r, "wall_slate_slab_purple", block_slate_slab_purple);
        wall_slate_shingle = new ModWallBlock(r, "wall_slate_shingle", block_slate_shingle);
        wall_slate_shingle_verte = new ModWallBlock(r, "wall_slate_shingle_verte", block_slate_shingle_verte);
        wall_slate_shingle_purple = new ModWallBlock(r, "wall_slate_shingle_purple", block_slate_shingle_purple);
        wall_slate_tile = new ModWallBlock(r, "wall_slate_tile", block_slate_tile);
        wall_slate_tile_verte = new ModWallBlock(r, "wall_slate_tile_verte", block_slate_tile_verte);
        wall_slate_tile_purple = new ModWallBlock(r, "wall_slate_tile_purple", block_slate_tile_purple);
        wall_timber_oak = new ModWallBlock(r, "wall_timber", block_timber_oak);
        wall_timber_spruce = new ModWallBlock(r, "wall_timber_spruce", block_timber_spruce);
        wall_timber_birch = new ModWallBlock(r, "wall_timber_birch", block_timber_birch);
        wall_timber_jungle = new ModWallBlock(r, "wall_timber_jungle", block_timber_jungle);
        wall_timber_acacia = new ModWallBlock(r, "wall_timber_acacia", block_timber_acacia);
        wall_timber_dark_oak = new ModWallBlock(r, "wall_timber_dark_oak", block_timber_dark_oak);
        wall_wattle = new ModWallBlock(r, "wall_wattle", block_wattle);
        wall_wicker = new ModWallBlock(r, "wall_wicker", block_wicker);
        wall_wood_shingle_oak = new ModWallBlock(r, "wall_wood_shingle_oak", oak_wood_shingle);
        wall_wood_shingle_spruce = new ModWallBlock(r, "wall_wood_shingle_spruce", oak_wood_shingle);
        wall_wood_shingle_birch = new ModWallBlock(r, "wall_wood_shingle_birch", oak_wood_shingle);
        wall_wood_shingle_jungle = new ModWallBlock(r, "wall_wood_shingle_jungle", oak_wood_shingle);
        wall_wood_shingle_acacia = new ModWallBlock(r, "wall_wood_shingle_acacia", oak_wood_shingle);
        wall_wood_shingle_dark_oak = new ModWallBlock(r, "wall_wood_shingle_dark_oak", oak_wood_shingle);

        //  QUARK COMPAT    //

        if (Config.quark) {
            block_reed = new ModRotatedPillar(r, "block_reed", Material.GRASS, SoundType.CLOTH, 0.8F, 1.0F);
            block_thatch = new ModRotatedPillar(r, "block_thatch", Material.GRASS, SoundType.CLOTH, 0.8F, 1.0F);

            slab_reed = new ModSlab(r, "slab_reed", block_reed);
            doubleslab_reed = new ModDoubleSlab(r, slab_reed);

            slab_thatch = new ModSlab(r, "slab_thatch", block_thatch);
            doubleslab_thatch = new ModDoubleSlab(r, slab_thatch);


            stair_reed = new ModStair(r, "stair_reed", block_reed);
            stair_thatch = new ModStair(r, "stair_thatch", block_thatch);

            wall_reed = new ModWallBlock(r, "wall_reed", block_reed);
            wall_thatch = new ModWallBlock(r, "wall_thatch", block_thatch);
        }
    }

    @SubscribeEvent
    public static void initItemBlocks(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        r.register(itemblock(adobe));
        r.register(itemblock(chalk));
        r.register(itemblock(cinder));
        r.register(itemblock(cob));
        r.register(itemblock(concrete));
        r.register(itemblock(cordwood));
        r.register(itemblock(dry_stone));
        r.register(itemblock(GRAVEL_GABION));
        r.register(itemblock(SAND_GABION));
        r.register(itemblock(DIRT_GABION));
        r.register(itemblock(mud));

        if (!Loader.isModLoaded("quark") || Config.persistantplanks) {
            r.register(new BlockItemPlanksVert(oak_planks_vert).setRegistryName(oak_planks_vert.getRegistryName()));
        }

        r.register(itemblock(block_plaster));
        r.register(itemblock(block_rammed_earth));
        r.register(itemblock(block_slate));
        r.register(itemblock(block_slate_green));
        r.register(itemblock(block_slate_purple));
        r.register(itemblock(block_slate_slab));
        r.register(itemblock(block_slate_slab_green));
        r.register(itemblock(block_slate_slab_purple));
        r.register(itemblock(block_slate_shingle));
        r.register(itemblock(block_slate_shingle_verte));
        r.register(itemblock(block_slate_shingle_purple));
        r.register(itemblock(block_slate_tile));
        r.register(itemblock(block_slate_tile_verte));
        r.register(itemblock(block_slate_tile_purple));
        r.register(itemblock(block_timber_oak));
        r.register(itemblock(block_timber_birch));
        r.register(itemblock(block_timber_spruce));
        r.register(itemblock(block_timber_jungle));
        r.register(itemblock(block_timber_acacia));
        r.register(itemblock(block_timber_dark_oak));
        r.register(itemblock(block_wattle));
        r.register(itemblock(block_wicker));
        r.register(new BlockItemWoodShingle(oak_wood_shingle).setRegistryName(oak_wood_shingle.getRegistryName()));

        r.register(itemblock(fence_planks_vert0));
        r.register(itemblock(fence_planks_vert1));
        r.register(itemblock(fence_planks_vert2));
        r.register(itemblock(fence_planks_vert3));
        r.register(itemblock(fence_planks_vert4));
        r.register(itemblock(fence_planks_vert5));

        itemslab_adobe = new ModItemSlab(r, slab_adobe, doubleslab_adobe);
        itemslab_chalk = new ModItemSlab(r, slab_chalk, doubleslab_chalk);
        itemslab_cinder = new ModItemSlab(r, slab_cinder, doubleslab_cinder);
        itemslab_cob = new ModItemSlab(r, slab_cob, doubleslab_cob);
        itemslab_concrete = new ModItemSlab(r, slab_concrete, doubleslab_concrete);
        itemslab_cordwood = new ModItemSlab(r, slab_cordwood, doubleslab_cordwood);
        itemslab_dry_stone = new ModItemSlab(r, slab_dry_stone, doubleslab_dry_stone);
        itemslab_gabion0 = new ModItemSlab(r, slab_gabion0, doubleslab_gabion0);
        itemslab_gabion1 = new ModItemSlab(r, slab_gabion1, doubleslab_gabion1);
        itemslab_gabion2 = new ModItemSlab(r, slab_gabion2, doubleslab_gabion2);
        itemslab_mud = new ModItemSlab(r, slab_mud, doubleslab_mud);
        itemslab_planks_vert0 = new ModItemSlab(r, slab_planks_vert0, doubleslab_planks_vert0);
        itemslab_planks_vert1 = new ModItemSlab(r, slab_planks_vert1, doubleslab_planks_vert1);
        itemslab_planks_vert2 = new ModItemSlab(r, slab_planks_vert2, doubleslab_planks_vert2);
        itemslab_planks_vert3 = new ModItemSlab(r, slab_planks_vert3, doubleslab_planks_vert3);
        itemslab_planks_vert4 = new ModItemSlab(r, slab_planks_vert4, doubleslab_planks_vert4);
        itemslab_planks_vert5 = new ModItemSlab(r, slab_planks_vert5, doubleslab_planks_vert5);
        itemslab_plaster = new ModItemSlab(r, slab_plaster, doubleslab_plaster);
        itemslab_rammed_earth = new ModItemSlab(r, slab_rammed_earth, doubleslab_rammed_earth);
        itemslab_slate = new ModItemSlab(r, slab_slate, doubleslab_slate);
        itemslab_slate_green = new ModItemSlab(r, slab_slate_green, doubleslab_slate_green);
        itemslab_slate_purple = new ModItemSlab(r, slab_slate_purple, doubleslab_slate_purple);
        itemslab_slate_slab = new ModItemSlab(r, slab_slate_slab, doubleslab_slate_slab);
        itemslab_slate_slab_green = new ModItemSlab(r, slab_slate_slab_green, doubleslab_slate_slab_green);
        itemslab_slate_slab_purple = new ModItemSlab(r, slab_slate_slab_purple, doubleslab_slate_slab_purple);
        itemslab_slate_shingle = new ModItemSlab(r, slab_slate_shingle, doubleslab_slate_shingle);
        itemslab_slate_shingle_verte = new ModItemSlab(r, slab_slate_shingle_verte, doubleslab_slate_shingle_verte);
        itemslab_slate_shingle_purple = new ModItemSlab(r, slab_slate_shingle_purple, doubleslab_slate_shingle_purple);
        itemslab_slate_tile = new ModItemSlab(r, slab_slate_tile, doubleslab_slate_tile);
        itemslab_slate_tile_verte = new ModItemSlab(r, slab_slate_tile_verte, doubleslab_slate_tile_verte);
        itemslab_slate_tile_purple = new ModItemSlab(r, slab_slate_tile_purple, doubleslab_slate_tile_purple);
        itemslab_timber_oak = new ModItemSlab(r, slab_timber_oak, doubleslab_timber_oak);
        itemslab_timber_birch = new ModItemSlab(r, slab_timber_birch, doubleslab_timber_birch);
        itemslab_timber_spruce = new ModItemSlab(r, slab_timber_spruce, doubleslab_timber_spruce);
        itemslab_timber_jungle = new ModItemSlab(r, slab_timber_jungle, doubleslab_timber_jungle);
        itemslab_timber_acacia = new ModItemSlab(r, slab_timber_acacia, doubleslab_timber_acacia);
        itemslab_timber_dark_oak = new ModItemSlab(r, slab_timber_dark_oak, doubleslab_timber_dark_oak);
        itemslab_wattle = new ModItemSlab(r, slab_wattle, doubleslab_wattle);
        itemslab_wicker = new ModItemSlab(r, slab_wicker, doubleslab_wicker);
        itemslab_wood_shingle_oak = new ModItemSlab(r, slab_wood_shingle_oak, doubleslab_wood_shingle_oak);
        itemslab_wood_shingle_spruce = new ModItemSlab(r, slab_wood_shingle_spruce, doubleslab_wood_shingle_spruce);
        itemslab_wood_shingle_birch = new ModItemSlab(r, slab_wood_shingle_birch, doubleslab_wood_shingle_birch);
        itemslab_wood_shingle_jungle = new ModItemSlab(r, slab_wood_shingle_jungle, doubleslab_wood_shingle_jungle);
        itemslab_wood_shingle_acacia = new ModItemSlab(r, slab_wood_shingle_acacia, doubleslab_wood_shingle_acacia);
        itemslab_wood_shingle_dark_oak = new ModItemSlab(r, slab_wood_shingle_dark_oak, doubleslab_wood_shingle_dark_oak);

        r.register(itemblock(stair_adobe));
        r.register(itemblock(stair_chalk));
        r.register(itemblock(stair_cinder));
        r.register(itemblock(stair_cob));
        r.register(itemblock(stair_concrete));
        r.register(itemblock(stair_cordwood));
        r.register(itemblock(stair_dry_stone));
        r.register(itemblock(stair_gabion0));
        r.register(itemblock(stair_gabion1));
        r.register(itemblock(stair_gabion2));
        r.register(itemblock(stair_mud));
        r.register(itemblock(stair_planks_vert0));
        r.register(itemblock(stair_planks_vert1));
        r.register(itemblock(stair_planks_vert2));
        r.register(itemblock(stair_planks_vert3));
        r.register(itemblock(stair_planks_vert4));
        r.register(itemblock(stair_planks_vert5));
        r.register(itemblock(stair_plaster));
        r.register(itemblock(stair_rammed_earth));
        r.register(itemblock(stair_slate));
        r.register(itemblock(stair_slate_green));
        r.register(itemblock(stair_slate_purple));
        r.register(itemblock(stair_slate_slab));
        r.register(itemblock(stair_slate_slab_green));
        r.register(itemblock(stair_slate_slab_purple));
        r.register(itemblock(stair_slate_shingle));
        r.register(itemblock(stair_slate_shingle_verte));
        r.register(itemblock(stair_slate_shingle_purple));
        r.register(itemblock(stair_slate_tile));
        r.register(itemblock(stair_slate_tile_verte));
        r.register(itemblock(stair_slate_tile_purple));
        r.register(itemblock(stair_timber_oak));
        r.register(itemblock(stair_timber_birch));
        r.register(itemblock(stair_timber_spruce));
        r.register(itemblock(stair_timber_jungle));
        r.register(itemblock(stair_timber_acacia));
        r.register(itemblock(stair_timber_dark_oak));
        r.register(itemblock(stair_wattle));
        r.register(itemblock(stair_wicker));
        r.register(itemblock(stair_wood_shingle_oak));
        r.register(itemblock(stair_wood_shingle_spruce));
        r.register(itemblock(stair_wood_shingle_birch));
        r.register(itemblock(stair_wood_shingle_jungle));
        r.register(itemblock(stair_wood_shingle_acacia));
        r.register(itemblock(stair_wood_shingle_dark_oak));

        r.register(itemblock(wall_adobe));
        r.register(itemblock(wall_chalk));
        r.register(itemblock(wall_cinder));
        r.register(itemblock(wall_cob));
        r.register(itemblock(wall_concrete));
        r.register(itemblock(wall_cordwood));
        r.register(itemblock(wall_dry_stone));
        r.register(itemblock(wall_gabion0));
        r.register(itemblock(wall_gabion1));
        r.register(itemblock(wall_gabion2));
        r.register(itemblock(wall_mud));
        r.register(itemblock(wall_plaster));
        r.register(itemblock(wall_rammed_earth));
        r.register(itemblock(wall_slate));
        r.register(itemblock(wall_slate_green));
        r.register(itemblock(wall_slate_purple));
        r.register(itemblock(wall_slate_slab));
        r.register(itemblock(wall_slate_slab_green));
        r.register(itemblock(wall_slate_slab_purple));
        r.register(itemblock(wall_slate_shingle));
        r.register(itemblock(wall_slate_shingle_verte));
        r.register(itemblock(wall_slate_shingle_purple));
        r.register(itemblock(wall_slate_tile));
        r.register(itemblock(wall_slate_tile_verte));
        r.register(itemblock(wall_slate_tile_purple));
        r.register(itemblock(wall_timber_oak));
        r.register(itemblock(wall_timber_birch));
        r.register(itemblock(wall_timber_spruce));
        r.register(itemblock(wall_timber_jungle));
        r.register(itemblock(wall_timber_acacia));
        r.register(itemblock(wall_timber_dark_oak));
        r.register(itemblock(wall_wattle));
        r.register(itemblock(wall_wicker));
        r.register(itemblock(wall_wood_shingle_oak));
        r.register(itemblock(wall_wood_shingle_spruce));
        r.register(itemblock(wall_wood_shingle_birch));
        r.register(itemblock(wall_wood_shingle_jungle));
        r.register(itemblock(wall_wood_shingle_acacia));
        r.register(itemblock(wall_wood_shingle_dark_oak));

        //  QUARK COMPAT    //

        if (Config.quark) {
            r.register(itemblock(block_reed));
            r.register(itemblock(block_thatch));
            itemslab_reed = new ModItemSlab(r, slab_reed, doubleslab_reed);
            itemslab_thatch = new ModItemSlab(r, slab_thatch, doubleslab_thatch);
            r.register(itemblock(stair_reed));
            r.register(itemblock(stair_thatch));
            r.register(itemblock(wall_reed));
            r.register(itemblock(wall_thatch));
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

    private static Item itemblock(Block block) {
        return new BlockItem(block).setRegistryName(block.getRegistryName());
    }
}