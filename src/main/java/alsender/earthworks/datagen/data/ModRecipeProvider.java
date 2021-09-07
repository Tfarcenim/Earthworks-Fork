package alsender.earthworks.datagen.data;

import alsender.earthworks.block.timber.Daub_Cob;
import alsender.earthworks.block.timber.Plaster;
import alsender.earthworks.datagen.data.builders.CookingRecipeBuilderFullStack;
import alsender.earthworks.datagen.data.builders.ShapelessReturnRecipeBuilder;
import alsender.earthworks.main.Earthworks;
import alsender.earthworks.main.crafting.ShapelessReturnRecipe;
import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.ItemRegistry;
import alsender.earthworks.main.registry.ModBlockTags;
import alsender.earthworks.main.registry.ModTags;
import net.minecraft.block.*;
import net.minecraft.data.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    //      GameRegistry.addSmelting(ItemRegistry.item_chalk, new ItemStack(ItemRegistry.item_quicklime), 0.1F);
    //   GameRegistry.addSmelting(BlockRegistry.chalk, new ItemStack(ItemRegistry.item_quicklime, 4), 0.1F);

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {

        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.adobe_brick,8)
                .addIngredient(Items.CLAY_BALL,6)
                .addIngredient(ModTags.material_binding)
                .addIngredient(ItemRegistry.sand_pile,2)
                .addCriterion("has_material_binding",hasItem(ModTags.material_binding))
                .build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemRegistry.chalk_dust), ItemRegistry.quicklime, .1f, 200)
                .addCriterion("has_chalk_dust", hasItem(ItemRegistry.chalk_dust))
                .build(consumer);
        CookingRecipeBuilderFullStack.smeltingRecipe(Ingredient.fromItems(ItemRegistry.chalk), new ItemStack(ItemRegistry.quicklime, 4), .4f, 200)
                .addCriterion("has_chalk", hasItem(ItemRegistry.chalk))
                .build(consumer, "quicklime_from_chalk_dust");

        shapelessPlanks(consumer, ItemRegistry.vertical_oak_planks, ItemRegistry.oak_timber);
        shapelessPlanks(consumer, ItemRegistry.vertical_spruce_planks, ItemRegistry.spruce_timber);
        shapelessPlanks(consumer, ItemRegistry.vertical_birch_planks, ItemRegistry.birch_timber);
        shapelessPlanks(consumer, ItemRegistry.vertical_jungle_planks, ItemRegistry.jungle_timber);
        shapelessPlanks(consumer, ItemRegistry.vertical_acacia_planks, ItemRegistry.acacia_timber);
        shapelessPlanks(consumer, ItemRegistry.vertical_dark_oak_planks, ItemRegistry.dark_oak_timber);

        slabsStairs(consumer,BlockRegistry.vertical_oak_planks,BlockRegistry.vertical_oak_slab,BlockRegistry.vertical_oak_stairs);
        slabsStairs(consumer,BlockRegistry.vertical_spruce_planks,BlockRegistry.vertical_spruce_slab,BlockRegistry.vertical_spruce_stairs);
        slabsStairs(consumer,BlockRegistry.vertical_birch_planks,BlockRegistry.vertical_birch_slab,BlockRegistry.vertical_birch_stairs);
        slabsStairs(consumer,BlockRegistry.vertical_jungle_planks,BlockRegistry.vertical_jungle_slab,BlockRegistry.vertical_jungle_stairs);
        slabsStairs(consumer,BlockRegistry.vertical_acacia_planks,BlockRegistry.vertical_acacia_slab,BlockRegistry.vertical_acacia_stairs);
        slabsStairs(consumer,BlockRegistry.vertical_dark_oak_planks,BlockRegistry.vertical_dark_oak_slab,BlockRegistry.vertical_dark_oak_stairs);

        twoByTwo(consumer, ItemRegistry.adobe, ItemRegistry.adobe_brick);
        slabsWallsStairs(consumer, ItemRegistry.adobe, BlockRegistry.adobe_slab, BlockRegistry.adobe_wall,BlockRegistry.adobe_stairs);

        twoByTwo(consumer, ItemRegistry.chalk, ItemRegistry.chalk_dust);
        slabsWallsStairs(consumer, ItemRegistry.chalk, BlockRegistry.chalk_slab, BlockRegistry.chalk_wall,BlockRegistry.chalk_stairs);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.cinder_blocks).key('#', ItemRegistry.concrete)
                .patternLine("##").patternLine("##")
                .addCriterion("has_item", hasItem(ItemRegistry.concrete)).build(consumer);
        slabsWallsStairs(consumer, ItemRegistry.cinder_blocks, BlockRegistry.cinder_block_slab, BlockRegistry.cinder_block_wall,BlockRegistry.cinder_block_stairs);

        twoByTwo(consumer, ItemRegistry.cob, ItemRegistry.cob_ball);
        slabsWallsStairs(consumer, ItemRegistry.cob, BlockRegistry.cob_slab, BlockRegistry.cob_wall,BlockRegistry.cob_stairs);

        ShapelessRecipeBuilder.shapelessRecipe(BlockRegistry.cob, 2)
                .addIngredient(Blocks.CLAY)
                .addIngredient(ModTags.material_binding)
                .addIngredient(BlockRegistry.mud)
                .addCriterion("has_clay", hasItem(Items.CLAY))
                .build(consumer, "bulk_cob");

        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.cob_ball,8)
                .addIngredient(Items.CLAY_BALL,4)
                .addIngredient(ModTags.material_binding)
                .addIngredient(ItemRegistry.mud_ball,4)
                .addCriterion("has_clay_ball",hasItem(Items.CLAY_BALL))
                .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(BlockRegistry.concrete, 2)
                .addIngredient(Blocks.GRAVEL)
                .addIngredient(ItemRegistry.lime_plaster)
                .addIngredient(ItemTags.SAND)
                .addCriterion("has_gravel", hasItem(Items.GRAVEL))
                .build(consumer);
        slabsWallsStairs(consumer, ItemRegistry.concrete, BlockRegistry.concrete_slab, BlockRegistry.concrete_wall,BlockRegistry.concrete_stairs);

        checkerboard(consumer, ItemRegistry.cordwood, Blocks.OAK_LOG, ItemRegistry.lime_plaster, 5);
        slabsWallsStairs(consumer, ItemRegistry.cordwood, BlockRegistry.cordwood_slab, BlockRegistry.cordwood_wall,BlockRegistry.cordwood_stairs);

        twoByTwo(consumer, Items.DIRT, ItemRegistry.dirt_ball);
        singleItemShapeless(consumer,ItemRegistry.dirt_ball,Items.DIRT,4);

        ring(consumer, BlockRegistry.dry_fitted_stone, Items.STONE, 8);
        slabsWallsStairs(consumer, ItemRegistry.dry_fitted_stone, BlockRegistry.dry_fitted_stone_slab, BlockRegistry.dry_fitted_stone_wall,BlockRegistry.dry_fitted_stone_stairs);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.DIRT_GABION, 2)
                .key('a', Tags.Items.RODS_WOODEN)
                .key('b', Items.WHEAT)
                .key('c', Items.DIRT)
                .patternLine("aba").patternLine("bcb").patternLine("aba")
                .addCriterion("has_dirt", hasItem(Items.DIRT))
                .build(consumer);
        slabsWallsStairs(consumer, ItemRegistry.DIRT_GABION, BlockRegistry.DIRT_GABION_SLAB, BlockRegistry.DIRT_GABION_WALL,BlockRegistry.DIRT_GABION_STAIRS);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.GRAVEL_GABION, 2)
                .key('a', Tags.Items.RODS_WOODEN)
                .key('b', Items.WHEAT)
                .key('c', Items.GRAVEL)
                .patternLine("aba").patternLine("bcb").patternLine("aba")
                .addCriterion("has_gravel", hasItem(Items.GRAVEL))
                .build(consumer);
        slabsWallsStairs(consumer, ItemRegistry.GRAVEL_GABION, BlockRegistry.GRAVEL_GABION_SLAB, BlockRegistry.GRAVEL_GABION_WALL,BlockRegistry.GRAVEL_GABION_STAIRS);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.SAND_GABION, 2)
                .key('a', Tags.Items.RODS_WOODEN)
                .key('b', Items.WHEAT)
                .key('c', Items.SAND)
                .patternLine("aba").patternLine("bcb").patternLine("aba")
                .addCriterion("has_sand", hasItem(Items.SAND))
                .build(consumer);
        slabsWallsStairs(consumer, ItemRegistry.SAND_GABION, BlockRegistry.SAND_GABION_SLAB, BlockRegistry.SAND_GABION_WALL,BlockRegistry.SAND_GABION_STAIRS);

        twoByTwo(consumer,Items.SAND,ItemRegistry.sand_pile);
        singleItemShapeless(consumer,ItemRegistry.sand_pile,Items.SAND,4);

        //should this be converted to accept anything with water?
        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.mud)
                .addIngredient(Items.DIRT, 8)
                .addIngredient(Items.WATER_BUCKET)
                .addCriterion("has_water", hasItem(Items.WATER_BUCKET))
                .build(consumer, "mud_from_water");
        slabsWallsStairs(consumer, ItemRegistry.mud, BlockRegistry.mud_slab, BlockRegistry.mud_wall,BlockRegistry.mud_stairs);

        twoByTwo(consumer, ItemRegistry.mud, ItemRegistry.mud_ball);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.lath_and_plaster)
                .key('l', ItemRegistry.lime_plaster)
                .key('p', ItemTags.PLANKS)
                .patternLine(" l ").patternLine("lpl").patternLine(" l ")
                .addCriterion("has_lime_plaster", hasItem(ItemRegistry.lime_plaster))
                .build(consumer);
        slabsWallsStairs(consumer, ItemRegistry.lath_and_plaster, BlockRegistry.lath_and_plaster_slab, BlockRegistry.lath_and_plaster_wall,BlockRegistry.lath_and_plaster_stairs);

        threeByTwo(consumer, ItemRegistry.rammed_earth, Items.DIRT, 3);
        slabsWallsStairs(consumer, ItemRegistry.rammed_earth, BlockRegistry.rammed_earth_slab, BlockRegistry.rammed_earth_wall,BlockRegistry.rammed_earth_stairs);

        twoByTwo(consumer, ItemRegistry.reed, Items.SUGAR_CANE);
        slabsWallsStairs(consumer, ItemRegistry.reed, BlockRegistry.reed_slab, BlockRegistry.reed_wall,BlockRegistry.reed_stairs);

        slabsWallsStairs(consumer, ItemRegistry.blue_slate, BlockRegistry.blue_slate_slab, BlockRegistry.blue_slate_wall,BlockRegistry.blue_slate_stairs);
        slabsWallsStairs(consumer, ItemRegistry.green_slate, BlockRegistry.green_slate_slab, BlockRegistry.green_slate_wall,BlockRegistry.green_slate_stairs);
        slabsWallsStairs(consumer, ItemRegistry.purple_slate, BlockRegistry.purple_slate_slab, BlockRegistry.purple_slate_wall,BlockRegistry.purple_slate_stairs);

        slabsWallsStairs(consumer, ItemRegistry.blue_slate_shingles, BlockRegistry.blue_slate_shingles_slab, BlockRegistry.blue_slate_shingles_wall,BlockRegistry.blue_slate_shingles_stairs);
        slabsWallsStairs(consumer, ItemRegistry.green_slate_shingles, BlockRegistry.green_slate_shingles_slab, BlockRegistry.green_slate_shingles_wall,BlockRegistry.green_slate_shingles_stairs);
        slabsWallsStairs(consumer, ItemRegistry.purple_slate_shingles, BlockRegistry.purple_slate_shingles_slab, BlockRegistry.purple_slate_shingles_wall,BlockRegistry.purple_slate_shingles_stairs);

        slabsWallsStairs(consumer, ItemRegistry.polished_blue_slate, BlockRegistry.polished_blue_slate_slab, BlockRegistry.polished_blue_slate_wall,BlockRegistry.polished_blue_slate_stairs);
        slabsWallsStairs(consumer, ItemRegistry.polished_green_slate, BlockRegistry.polished_green_slate_slab, BlockRegistry.polished_green_slate_wall,BlockRegistry.polished_green_slate_stairs);
        slabsWallsStairs(consumer, ItemRegistry.polished_purple_slate, BlockRegistry.polished_purple_slate_slab, BlockRegistry.polished_purple_slate_wall,BlockRegistry.polished_purple_slate_stairs);


        twoByTwo(consumer, ItemRegistry.blue_slate_shingles, ItemRegistry.blue_slate, 4);
        twoByTwo(consumer, ItemRegistry.green_slate_shingles, ItemRegistry.green_slate, 4);
        twoByTwo(consumer, ItemRegistry.purple_slate_shingles, ItemRegistry.purple_slate, 4);

        ring(consumer, ItemRegistry.polished_blue_slate, ItemRegistry.blue_slate, 8);
        ring(consumer, ItemRegistry.polished_green_slate, ItemRegistry.green_slate, 8);
        ring(consumer, ItemRegistry.polished_purple_slate, ItemRegistry.purple_slate, 8);

        twoByTwo(consumer, ItemRegistry.blue_slate_tiles, ItemRegistry.polished_blue_slate, 4);
        twoByTwo(consumer, ItemRegistry.green_slate_tiles, ItemRegistry.polished_green_slate, 4);
        twoByTwo(consumer, ItemRegistry.purple_slate_tiles, ItemRegistry.polished_purple_slate, 4);

        slabsWallsStairs(consumer, ItemRegistry.blue_slate_tiles, BlockRegistry.blue_slate_tiles_slab, BlockRegistry.blue_slate_tiles_wall,BlockRegistry.blue_slate_tiles_stairs);
        slabsWallsStairs(consumer, ItemRegistry.green_slate_tiles, BlockRegistry.green_slate_tiles_slab, BlockRegistry.green_slate_tiles_wall,BlockRegistry.green_slate_tiles_stairs);
        slabsWallsStairs(consumer, ItemRegistry.purple_slate_tiles, BlockRegistry.purple_slate_tiles_slab, BlockRegistry.purple_slate_tiles_wall,BlockRegistry.purple_slate_tiles_stairs);

        twoByTwo(consumer, BlockRegistry.thatch, Items.WHEAT);
        slabsWallsStairs(consumer, ItemRegistry.thatch, BlockRegistry.thatch_slab, BlockRegistry.thatch_wall,BlockRegistry.thatch_stairs);

        column(consumer, BlockRegistry.oak_timber, Blocks.OAK_LOG, 3);
        slabsWallsStairs(consumer, ItemRegistry.oak_timber, BlockRegistry.oak_timber_slab, BlockRegistry.oak_timber_wall,BlockRegistry.oak_timber_stairs);

        column(consumer, BlockRegistry.spruce_timber, Blocks.SPRUCE_LOG, 3);
        slabsWallsStairs(consumer, ItemRegistry.spruce_timber, BlockRegistry.spruce_timber_slab, BlockRegistry.spruce_timber_wall,BlockRegistry.spruce_timber_stairs);

        column(consumer, BlockRegistry.birch_timber, Blocks.BIRCH_LOG, 3);
        slabsWallsStairs(consumer, ItemRegistry.birch_timber, BlockRegistry.birch_timber_slab, BlockRegistry.birch_timber_wall,BlockRegistry.birch_timber_stairs);

        column(consumer, BlockRegistry.jungle_timber, Blocks.JUNGLE_LOG, 3);
        slabsWallsStairs(consumer, ItemRegistry.jungle_timber, BlockRegistry.jungle_timber_slab, BlockRegistry.jungle_timber_wall,BlockRegistry.jungle_timber_stairs);

        column(consumer, BlockRegistry.acacia_timber, Blocks.ACACIA_LOG, 3);
        slabsWallsStairs(consumer, ItemRegistry.acacia_timber, BlockRegistry.acacia_timber_slab, BlockRegistry.acacia_timber_wall,BlockRegistry.acacia_timber_stairs);

        column(consumer, BlockRegistry.dark_oak_timber, Blocks.DARK_OAK_LOG, 3);
        slabsWallsStairs(consumer, ItemRegistry.dark_oak_timber, BlockRegistry.dark_oak_timber_slab, BlockRegistry.dark_oak_timber_wall,BlockRegistry.dark_oak_timber_stairs);

        ringCenter(consumer, BlockRegistry.wattle_and_daub, ItemRegistry.cob_ball, BlockRegistry.wicker, 2);
        ringCenter(consumer, BlockRegistry.wattle_and_daub, BlockRegistry.cob, BlockRegistry.wicker, 8, "bulk_wattle_and_daub");
        slabsWallsStairs(consumer, ItemRegistry.wattle_and_daub, BlockRegistry.wattle_and_daub_slab, BlockRegistry.wattle_and_daub_wall,BlockRegistry.wattle_and_daub_stairs);

        checkerboardNoCenter(consumer, BlockRegistry.wicker, Items.STICK, Items.WHEAT, 2);
        slabsWallsStairs(consumer, ItemRegistry.wicker, BlockRegistry.wicker_slab, BlockRegistry.wicker_wall,BlockRegistry.wicker_stairs);

        woodShakesMain(consumer, BlockRegistry.oak_wood_shakes, Blocks.OAK_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.oak_wood_shakes, BlockRegistry.oak_timber, 6);
        slabsWallsStairs(consumer, ItemRegistry.oak_wood_shakes, BlockRegistry.oak_wood_shakes_slab, BlockRegistry.oak_wood_shakes_wall,BlockRegistry.oak_wood_shakes_stairs);

        woodShakesMain(consumer, BlockRegistry.spruce_wood_shakes, Blocks.SPRUCE_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.spruce_wood_shakes, BlockRegistry.spruce_timber, 6);
        slabsWallsStairs(consumer, ItemRegistry.spruce_wood_shakes, BlockRegistry.spruce_wood_shakes_slab, BlockRegistry.spruce_wood_shakes_wall,BlockRegistry.spruce_wood_shakes_stairs);

        woodShakesMain(consumer, BlockRegistry.birch_wood_shakes, Blocks.BIRCH_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.birch_wood_shakes, BlockRegistry.birch_timber, 6);
        slabsWallsStairs(consumer, ItemRegistry.birch_wood_shakes, BlockRegistry.birch_wood_shakes_slab, BlockRegistry.birch_wood_shakes_wall,BlockRegistry.birch_wood_shakes_stairs);

        woodShakesMain(consumer, BlockRegistry.jungle_wood_shakes, Blocks.JUNGLE_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.jungle_wood_shakes, BlockRegistry.jungle_timber, 6);
        slabsWallsStairs(consumer, ItemRegistry.jungle_wood_shakes, BlockRegistry.jungle_wood_shakes_slab, BlockRegistry.jungle_wood_shakes_wall,BlockRegistry.jungle_wood_shakes_stairs);

        woodShakesMain(consumer, BlockRegistry.acacia_wood_shakes, Blocks.ACACIA_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.acacia_wood_shakes, BlockRegistry.acacia_timber, 6);
        slabsWallsStairs(consumer, ItemRegistry.acacia_wood_shakes, BlockRegistry.acacia_wood_shakes_slab, BlockRegistry.acacia_wood_shakes_wall,BlockRegistry.acacia_wood_shakes_stairs);

        woodShakesMain(consumer, BlockRegistry.dark_oak_wood_shakes, Blocks.DARK_OAK_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.dark_oak_wood_shakes, BlockRegistry.dark_oak_timber, 6);
        slabsWallsStairs(consumer, ItemRegistry.dark_oak_wood_shakes, BlockRegistry.dark_oak_wood_shakes_slab, BlockRegistry.dark_oak_wood_shakes_wall,BlockRegistry.dark_oak_wood_shakes_stairs);

        //instead of copying all of the 1.12 recipes since they no longer work, use the stonecutter instead
        ringCenter(consumer, BlockRegistry.daub_cob_square, ItemRegistry.timber_framing, BlockRegistry.wattle_and_daub, 4);

        List<Block> duab_cob_variants = BlockRegistry.getAllBlocks().stream().filter(Daub_Cob.class::isInstance).collect(Collectors.toList());

        //1 2 3 4 5 6 7 8
        //2 3 4 5 6 7 8
        //3 4 5 6 7 8

        //1 - 2
        //1 - 3
        //...
        //1 - 8
        //2 - 3
        for (int i = 0; i < duab_cob_variants.size(); i++) {
            for (int j = i + 1; j < duab_cob_variants.size(); j++) {
                Block block1 = duab_cob_variants.get(i);
                Block block2 = duab_cob_variants.get(j);

                SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(block1), block2)
                        .addCriterion("has_item", hasItem(BlockRegistry.daub_cob_square))
                        .build(consumer, new ResourceLocation(Earthworks.mod_id, block2.getRegistryName().getPath() + "_from_" + block1.getRegistryName().getPath()));

                SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(block2), block1)
                        .addCriterion("has_item", hasItem(BlockRegistry.daub_cob_square))
                        .build(consumer, new ResourceLocation(Earthworks.mod_id, block1.getRegistryName().getPath() + "_from_" + block2.getRegistryName().getPath()));
            }
        }

        ringCenter(consumer, BlockRegistry.plaster_square, ItemRegistry.timber_framing, BlockRegistry.lath_and_plaster, 4);

        List<Block> plaster_variants = BlockRegistry.getAllBlocks().stream().filter(Plaster.class::isInstance).collect(Collectors.toList());

        for (int i = 0; i < plaster_variants.size(); i++) {
            for (int j = i + 1; j < plaster_variants.size(); j++) {
                Block block1 = plaster_variants.get(i);
                Block block2 = plaster_variants.get(j);

                SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(block1), block2)
                        .addCriterion("has_item", hasItem(BlockRegistry.plaster_square))
                        .build(consumer, new ResourceLocation(Earthworks.mod_id, block2.getRegistryName().getPath() + "_from_" + block1.getRegistryName().getPath()));

                SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(block2), block1)
                        .addCriterion("has_item", hasItem(BlockRegistry.plaster_square))
                        .build(consumer, new ResourceLocation(Earthworks.mod_id, block1.getRegistryName().getPath() + "_from_" + block2.getRegistryName().getPath()));
            }
        }

        shapedWoodenFence(consumer, BlockRegistry.vertical_oak_fence, BlockRegistry.vertical_oak_planks);
        shapedWoodenFence(consumer, BlockRegistry.vertical_spruce_fence, BlockRegistry.vertical_acacia_planks);
        shapedWoodenFence(consumer, BlockRegistry.vertical_birch_fence, BlockRegistry.vertical_birch_planks);
        shapedWoodenFence(consumer, BlockRegistry.vertical_jungle_fence, BlockRegistry.vertical_jungle_planks);
        shapedWoodenFence(consumer, BlockRegistry.vertical_acacia_fence, BlockRegistry.vertical_acacia_planks);
        shapedWoodenFence(consumer, BlockRegistry.vertical_dark_oak_fence, BlockRegistry.vertical_dark_oak_planks);

        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.slaked_lime,8)
                .addIngredient(ItemRegistry.quicklime,8)
                .addIngredient(Items.WATER_BUCKET)
                .addCriterion("has_quicklime",hasItem(ItemRegistry.quicklime))
                .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.lime_plaster,2)
                .addIngredient(ItemRegistry.slaked_lime)
                .addIngredient(ItemRegistry.sand_pile)
                .addCriterion("has_slaked_lime",hasItem(ItemRegistry.slaked_lime))
                .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.lime_plaster,8)
                .addIngredient(ItemRegistry.quicklime,4)
                .addIngredient(Items.WATER_BUCKET)
                .addIngredient(ItemRegistry.sand_pile,4)
                .addCriterion("has_slaked_lime",hasItem(ItemRegistry.slaked_lime))
                .build(consumer,"lime_plaster_bulk");

        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.mud_ball,8)
                .addIngredient(ItemRegistry.dirt_ball,8)
                .addIngredient(Items.WATER_BUCKET)
                .addCriterion("has_dirt_ball",hasItem(ItemRegistry.dirt_ball))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.timber_framing,6)
                .key('a',ModTags.timber_log)
                .patternLine("a").patternLine("a")
                .addCriterion("has_timber",hasItem(ModTags.timber_log))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.adz)
                .key('a',Tags.Items.RODS_WOODEN).key('i',Tags.Items.INGOTS_IRON)
                .patternLine("ia").patternLine(" a").patternLine(" a")
                .addCriterion("has_iron",hasItem(Tags.Items.INGOTS_IRON))
                .build(consumer);

        hammer(consumer,ItemRegistry.stone_hammer,Blocks.COBBLESTONE);
        hammer(consumer,ItemRegistry.iron_hammer,Items.IRON_INGOT);
        hammer(consumer,ItemRegistry.gold_hammer,Items.GOLD_INGOT);
        hammer(consumer,ItemRegistry.diamond_hammer,Items.DIAMOND);

        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.acheulean)
                .addIngredient(Items.FLINT).addIngredient(ItemTags.STONE_TOOL_MATERIALS)
        .addCriterion("has_flint",hasItem(Items.FLINT)).build(consumer);

        row(consumer,ItemRegistry.level,Items.GOLD_INGOT,1);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.saw)
                .key('a',Items.IRON_INGOT)
                .key('b',Items.STICK)
                .key('c',Items.DIAMOND)
                .patternLine("aab").patternLine("ccb")
                .addCriterion("has_diamond",hasItem(Items.DIAMOND))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.square)
                .key('a',ItemTags.PLANKS)
                .patternLine("a  ").patternLine("a  ").patternLine("aaa")
                .addCriterion("has_planks",hasItem(ItemTags.PLANKS))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.froe)
                .key('a',Items.IRON_INGOT)
                .key('b',Items.STICK)
                .patternLine("aa").patternLine(" b")
                .addCriterion("has_iron",hasItem(Items.IRON_INGOT))
                .build(consumer);
    }

    private static void shapelessPlanks(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider planks, IItemProvider input) {
        ShapelessRecipeBuilder.shapelessRecipe(planks, 4).addIngredient(input).setGroup("planks").addCriterion("has_log", hasItem(input)).build(recipeConsumer);
    }

    private static void slabToBlock(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider block, SlabBlock slab) {
        ShapedRecipeBuilder.shapedRecipe(block).key('s', slab).patternLine("s").patternLine("s")
                .setGroup("slab").addCriterion("has_slab", hasItem(slab)).build(recipeConsumer, block.asItem().getRegistryName().getPath() + "_from_slabs");
    }

    private static void blockToSlab(Consumer<IFinishedRecipe> recipeConsumer, SlabBlock slab, IItemProvider block) {
        ShapedRecipeBuilder.shapedRecipe(slab, 6).key('#', block)
                .patternLine("###").addCriterion("has_"+block.asItem().getRegistryName().getPath(), hasItem(block)).build(recipeConsumer);
    }

    private static void twoByTwo(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input) {
        twoByTwo(recipeConsumer, output, input, 1);
    }

    private static void twoByTwo(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count) {
        ShapedRecipeBuilder.shapedRecipe(output, count).key('#', input)
                .patternLine("##").patternLine("##")
                .addCriterion("has_item", hasItem(input)).build(recipeConsumer);
    }

    private static void checkerboard(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input1, IItemProvider input2, int count) {
        ShapedRecipeBuilder.shapedRecipe(output, count)
                .key('a', input1).key('b', input2)
                .patternLine("aba").patternLine("bab").patternLine("aba")
                .addCriterion("has_" + input1.asItem().getRegistryName().getPath(), hasItem(input1))
                .addCriterion("has_" + input2.asItem().getRegistryName().getPath(), hasItem(input2))
                .build(recipeConsumer);
    }

    private static void checkerboardNoCenter(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input1, IItemProvider input2, int count) {
        ShapedRecipeBuilder.shapedRecipe(output, count)
                .key('a', input1).key('b', input2)
                .patternLine("aba").patternLine("b b").patternLine("aba")
                .addCriterion("has_" + input1.asItem().getRegistryName().getPath(), hasItem(input1))
                .addCriterion("has_" + input2.asItem().getRegistryName().getPath(), hasItem(input2))
                .build(recipeConsumer);
    }

    private static void ring(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count) {
        ShapedRecipeBuilder.shapedRecipe(output, count)
                .key('a', input)
                .patternLine("aaa").patternLine("a a").patternLine("aaa")
                .addCriterion("has_" + input.asItem().getRegistryName().getPath(), hasItem(input))
                .build(recipeConsumer);
    }

    private static void threeByTwo(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count) {
        ShapedRecipeBuilder.shapedRecipe(output, count)
                .key('a', input)
                .patternLine("aaa").patternLine("aaa")
                .addCriterion("has_" + input.asItem().getRegistryName().getPath(), hasItem(input))
                .build(recipeConsumer);
    }

    private static void column(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count) {
        ShapedRecipeBuilder.shapedRecipe(output, count)
                .key('a', input)
                .patternLine("a").patternLine("a").patternLine("a")
                .addCriterion("has_" + input.asItem().getRegistryName().getPath(), hasItem(input))
                .build(recipeConsumer);
    }

    private static void row(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count) {
        ShapedRecipeBuilder.shapedRecipe(output, count)
                .key('a', input)
                .patternLine("aaa")
                .addCriterion("has_" + input.asItem().getRegistryName().getPath(), hasItem(input))
                .build(recipeConsumer);
    }

    private static void ringCenter(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider ring, IItemProvider center, int count) {
        ringCenter(recipeConsumer, output, ring, center, count, output.asItem().getRegistryName().getPath());
    }

    private static void ringCenter(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider ring, IItemProvider center, int count, String name) {
        ShapedRecipeBuilder.shapedRecipe(output, count)
                .key('a', ring).key('b', center)
                .patternLine("aaa").patternLine("aba").patternLine("aaa")
                .addCriterion("has_" + ring.asItem().getRegistryName().getPath(), hasItem(ring))
                .build(recipeConsumer, name);
    }

    private static void woodShakesMain(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count) {
        woodShakes(recipeConsumer, output, input, count, output.asItem().getRegistryName().getPath());
    }

    private static void woodShakesAlt(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count) {
        woodShakes(recipeConsumer, output, input, count, output.asItem().getRegistryName().getPath() + "_alt");
    }

    private static void woodShakes(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count, String name) {
        ShapelessReturnRecipeBuilder.shapelessRecipe(output, count)
                .setReturnItem(Items.FLINT)
                .addIngredient(Items.FLINT)
                .addIngredient(input)
                .addCriterion("has_" + input.asItem().getRegistryName().getPath(), hasItem(input))
                .build(recipeConsumer, name);
    }

    private static void singleItemShapeless(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input,int count) {
        ShapelessRecipeBuilder.shapelessRecipe(output,count)
                .addIngredient(input)
                .addCriterion("has_item", hasItem(input))
                .build(recipeConsumer);
    }


    private static void stairs(Consumer<IFinishedRecipe> recipeConsumer, StairsBlock output, IItemProvider input) {
        ShapedRecipeBuilder.shapedRecipe(output, 4).key('#', input)
                .patternLine("#  ").patternLine("## ").patternLine("###")
                .addCriterion("has_"+input.asItem().getRegistryName().getPath(), hasItem(input)).build(recipeConsumer);
    }

    private static void wall(Consumer<IFinishedRecipe> recipeConsumer, WallBlock output, IItemProvider input) {
        ShapedRecipeBuilder.shapedRecipe(output, 6).key('#', input)
                .patternLine("###").patternLine("###")
                .addCriterion("has_"+input.asItem().getRegistryName().getPath(), hasItem(input)).build(recipeConsumer);
    }

    private static void slabsStairs(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider input, SlabBlock slab,StairsBlock stairs) {
        blockToSlab(recipeConsumer,slab,input);
        slabToBlock(recipeConsumer,input,slab);
        stairs(recipeConsumer,stairs,input);
    }

    private static void slabsWallsStairs(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider input, SlabBlock slab, WallBlock wall,StairsBlock stairs) {
        slabsStairs(recipeConsumer, input, slab, stairs);
        wall(recipeConsumer,wall,input);
    }

    private static void hammer(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output,IItemProvider input) {
        ShapedRecipeBuilder.shapedRecipe(output)
                .key('g', input).key('s',Tags.Items.RODS_WOODEN)
                .patternLine("ggg").patternLine("gsg").patternLine(" s ")
                .addCriterion("has_"+input.asItem().getRegistryName().getPath(), hasItem(input)).build(recipeConsumer);
    }
}