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
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
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

        blockToSlab(consumer, BlockRegistry.vertical_oak_slab, ItemRegistry.vertical_oak_planks);
        blockToSlab(consumer, BlockRegistry.vertical_spruce_slab, ItemRegistry.vertical_spruce_planks);
        blockToSlab(consumer, BlockRegistry.vertical_birch_slab, ItemRegistry.vertical_birch_planks);
        blockToSlab(consumer, BlockRegistry.vertical_jungle_slab, ItemRegistry.vertical_jungle_planks);
        blockToSlab(consumer, BlockRegistry.vertical_acacia_slab, ItemRegistry.vertical_acacia_planks);
        blockToSlab(consumer, BlockRegistry.vertical_dark_oak_slab, ItemRegistry.vertical_dark_oak_planks);

        slabToBlock(consumer, ItemRegistry.vertical_oak_planks, BlockRegistry.vertical_oak_slab);
        slabToBlock(consumer, ItemRegistry.vertical_spruce_planks, BlockRegistry.vertical_spruce_slab);
        slabToBlock(consumer, ItemRegistry.vertical_birch_planks, BlockRegistry.vertical_birch_slab);
        slabToBlock(consumer, ItemRegistry.vertical_jungle_planks, BlockRegistry.vertical_jungle_slab);
        slabToBlock(consumer, ItemRegistry.vertical_acacia_planks, BlockRegistry.vertical_acacia_slab);
        slabToBlock(consumer, ItemRegistry.vertical_dark_oak_planks, BlockRegistry.vertical_dark_oak_slab);

        twoByTwo(consumer, ItemRegistry.adobe, ItemRegistry.adobe_brick);
        slabToBlock(consumer, ItemRegistry.adobe, BlockRegistry.adobe_slab);

        twoByTwo(consumer, ItemRegistry.chalk, ItemRegistry.chalk_dust);
        blockToSlab(consumer, BlockRegistry.chalk_slab, ItemRegistry.chalk);
        slabToBlock(consumer, ItemRegistry.chalk, BlockRegistry.chalk_slab);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.cinder_blocks).key('#', ItemRegistry.concrete)
                .patternLine("##").patternLine("##")
                .addCriterion("has_item", hasItem(ItemRegistry.concrete)).build(consumer);
        blockToSlab(consumer, BlockRegistry.cinder_block_slab, ItemRegistry.cinder_blocks);
        slabToBlock(consumer, ItemRegistry.cinder_blocks, BlockRegistry.cinder_block_slab);

        twoByTwo(consumer, ItemRegistry.cob, ItemRegistry.cob_ball);
        blockToSlab(consumer, BlockRegistry.cob_slab, ItemRegistry.cob);
        slabToBlock(consumer, ItemRegistry.cob, BlockRegistry.cob_slab);

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
        blockToSlab(consumer, BlockRegistry.concrete_slab, ItemRegistry.concrete);
        slabToBlock(consumer, ItemRegistry.concrete, BlockRegistry.concrete_slab);

        checkerboard(consumer, ItemRegistry.cordwood, Blocks.OAK_LOG, ItemRegistry.lime_plaster, 5);
        blockToSlab(consumer, BlockRegistry.cordwood_slab, ItemRegistry.cordwood);
        slabToBlock(consumer, ItemRegistry.cordwood, BlockRegistry.cordwood_slab);

        twoByTwo(consumer, Items.DIRT, ItemRegistry.dirt_ball);
        singleItemShapeless(consumer,ItemRegistry.dirt_ball,Items.DIRT,4);

        ring(consumer, BlockRegistry.dry_fitted_stone, Items.STONE, 8);
        blockToSlab(consumer, BlockRegistry.dry_fitted_stone_slab, ItemRegistry.dry_fitted_stone);
        slabToBlock(consumer, ItemRegistry.dry_fitted_stone, BlockRegistry.dry_fitted_stone_slab);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.DIRT_GABION, 2)
                .key('a', Tags.Items.RODS_WOODEN)
                .key('b', Items.WHEAT)
                .key('c', Items.DIRT)
                .patternLine("aba").patternLine("bcb").patternLine("aba")
                .addCriterion("has_dirt", hasItem(Items.DIRT))
                .build(consumer);
        blockToSlab(consumer, BlockRegistry.DIRT_GABION_SLAB, ItemRegistry.DIRT_GABION);
        slabToBlock(consumer, ItemRegistry.DIRT_GABION, BlockRegistry.DIRT_GABION_SLAB);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.GRAVEL_GABION, 2)
                .key('a', Tags.Items.RODS_WOODEN)
                .key('b', Items.WHEAT)
                .key('c', Items.DIRT)
                .patternLine("aba").patternLine("bcb").patternLine("aba")
                .addCriterion("has_gravel", hasItem(Items.GRAVEL))
                .build(consumer);
        blockToSlab(consumer, BlockRegistry.GRAVEL_GABION_SLAB, ItemRegistry.GRAVEL_GABION);
        slabToBlock(consumer, ItemRegistry.GRAVEL_GABION, BlockRegistry.GRAVEL_GABION_SLAB);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.SAND_GABION, 2)
                .key('a', Tags.Items.RODS_WOODEN)
                .key('b', Items.WHEAT)
                .key('c', Items.DIRT)
                .patternLine("aba").patternLine("bcb").patternLine("aba")
                .addCriterion("has_sand", hasItem(Items.SAND))
                .build(consumer);
        blockToSlab(consumer, BlockRegistry.SAND_GABION_SLAB, ItemRegistry.SAND_GABION);
        slabToBlock(consumer, ItemRegistry.SAND_GABION, BlockRegistry.SAND_GABION_SLAB);

        twoByTwo(consumer,Items.SAND,ItemRegistry.sand_pile);
        singleItemShapeless(consumer,ItemRegistry.sand_pile,Items.SAND,4);

        //should this be converted to accept anything with water?
        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.mud)
                .addIngredient(Items.DIRT, 8)
                .addIngredient(Items.WATER_BUCKET)
                .addCriterion("has_water", hasItem(Items.WATER_BUCKET))
                .build(consumer, "mud_from_water");
        blockToSlab(consumer, BlockRegistry.mud_slab, ItemRegistry.mud);
        slabToBlock(consumer, ItemRegistry.mud, BlockRegistry.mud_slab);
        twoByTwo(consumer, ItemRegistry.mud, ItemRegistry.mud_ball);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.lath_and_plaster)
                .key('l', ItemRegistry.lime_plaster)
                .key('p', ItemTags.PLANKS)
                .patternLine(" l ").patternLine("lpl").patternLine(" l ")
                .addCriterion("has_lime_plaster", hasItem(ItemRegistry.lime_plaster))
                .build(consumer);
        blockToSlab(consumer, BlockRegistry.lath_and_plaster_slab, ItemRegistry.lath_and_plaster);
        slabToBlock(consumer, ItemRegistry.lath_and_plaster, BlockRegistry.lath_and_plaster_slab);

        threeByTwo(consumer, ItemRegistry.rammed_earth, Items.DIRT, 3);
        blockToSlab(consumer, BlockRegistry.rammed_earth_slab, ItemRegistry.rammed_earth);
        slabToBlock(consumer, ItemRegistry.rammed_earth, BlockRegistry.rammed_earth_slab);

        twoByTwo(consumer, ItemRegistry.reed, Items.SUGAR_CANE);
        blockToSlab(consumer, BlockRegistry.reed_slab, ItemRegistry.reed);
        slabToBlock(consumer, ItemRegistry.reed, BlockRegistry.reed_slab);


        blockToSlab(consumer, BlockRegistry.blue_slate_slab, ItemRegistry.blue_slate);
        blockToSlab(consumer, BlockRegistry.green_slate_slab, ItemRegistry.green_slate);
        blockToSlab(consumer, BlockRegistry.purple_slate_slab, ItemRegistry.purple_slate);
        slabToBlock(consumer, ItemRegistry.blue_slate, BlockRegistry.blue_slate_slab);
        slabToBlock(consumer, ItemRegistry.green_slate, BlockRegistry.green_slate_slab);
        slabToBlock(consumer, ItemRegistry.purple_slate, BlockRegistry.purple_slate_slab);

        twoByTwo(consumer, ItemRegistry.blue_slate_shingles, ItemRegistry.blue_slate, 4);
        blockToSlab(consumer, BlockRegistry.blue_slate_shingles_slab, ItemRegistry.blue_slate_shingles);
        slabToBlock(consumer, ItemRegistry.blue_slate_shingles, BlockRegistry.blue_slate_shingles_slab);

        twoByTwo(consumer, ItemRegistry.green_slate_shingles, ItemRegistry.green_slate, 4);
        blockToSlab(consumer, BlockRegistry.green_slate_shingles_slab, ItemRegistry.green_slate_shingles);
        slabToBlock(consumer, ItemRegistry.green_slate_shingles, BlockRegistry.green_slate_shingles_slab);

        twoByTwo(consumer, ItemRegistry.purple_slate_shingles, ItemRegistry.purple_slate, 4);
        blockToSlab(consumer, BlockRegistry.purple_slate_shingles_slab, ItemRegistry.purple_slate_shingles);
        slabToBlock(consumer, ItemRegistry.purple_slate_shingles, BlockRegistry.purple_slate_shingles_slab);

        ring(consumer, ItemRegistry.polished_blue_slate, ItemRegistry.blue_slate, 8);
        blockToSlab(consumer, BlockRegistry.polished_blue_slate_slab, ItemRegistry.polished_blue_slate);
        slabToBlock(consumer, ItemRegistry.polished_blue_slate, BlockRegistry.polished_blue_slate_slab);

        ring(consumer, ItemRegistry.polished_green_slate, ItemRegistry.green_slate, 8);
        blockToSlab(consumer, BlockRegistry.polished_green_slate_slab, ItemRegistry.polished_green_slate);
        slabToBlock(consumer, ItemRegistry.polished_green_slate, BlockRegistry.polished_green_slate_slab);

        ring(consumer, ItemRegistry.polished_purple_slate, ItemRegistry.purple_slate, 8);
        blockToSlab(consumer, BlockRegistry.polished_purple_slate_slab, ItemRegistry.polished_purple_slate);
        slabToBlock(consumer, ItemRegistry.polished_purple_slate, BlockRegistry.polished_purple_slate_slab);

        twoByTwo(consumer, ItemRegistry.blue_slate_tiles, ItemRegistry.polished_blue_slate, 4);
        blockToSlab(consumer, BlockRegistry.blue_slate_tiles_slab, ItemRegistry.blue_slate_tiles);
        slabToBlock(consumer, ItemRegistry.blue_slate_tiles, BlockRegistry.blue_slate_tiles_slab);

        twoByTwo(consumer, ItemRegistry.green_slate_tiles, ItemRegistry.polished_green_slate, 4);
        blockToSlab(consumer, BlockRegistry.green_slate_tiles_slab, ItemRegistry.green_slate_tiles);
        slabToBlock(consumer, ItemRegistry.green_slate_tiles, BlockRegistry.green_slate_tiles_slab);

        twoByTwo(consumer, ItemRegistry.purple_slate_tiles, ItemRegistry.polished_purple_slate, 4);
        blockToSlab(consumer, BlockRegistry.purple_slate_tiles_slab, ItemRegistry.purple_slate_tiles);
        slabToBlock(consumer, ItemRegistry.purple_slate_tiles, BlockRegistry.purple_slate_tiles_slab);

        twoByTwo(consumer, BlockRegistry.thatch, Items.WHEAT);
        blockToSlab(consumer, BlockRegistry.thatch_slab, BlockRegistry.thatch);
        slabToBlock(consumer, BlockRegistry.thatch, BlockRegistry.thatch_slab);

        column(consumer, BlockRegistry.spruce_timber, Blocks.SPRUCE_LOG, 3);
        blockToSlab(consumer, BlockRegistry.spruce_timber_slab, BlockRegistry.spruce_timber);
        slabToBlock(consumer, BlockRegistry.spruce_timber, BlockRegistry.spruce_timber_slab);

        column(consumer, BlockRegistry.birch_timber, Blocks.BIRCH_LOG, 3);
        blockToSlab(consumer, BlockRegistry.birch_timber_slab, BlockRegistry.birch_timber);
        slabToBlock(consumer, BlockRegistry.birch_timber, BlockRegistry.birch_timber_slab);

        column(consumer, BlockRegistry.jungle_timber, Blocks.JUNGLE_LOG, 3);
        blockToSlab(consumer, BlockRegistry.jungle_timber_slab, BlockRegistry.jungle_timber);
        slabToBlock(consumer, BlockRegistry.jungle_timber, BlockRegistry.jungle_timber_slab);

        column(consumer, BlockRegistry.acacia_timber, Blocks.ACACIA_LOG, 3);
        blockToSlab(consumer, BlockRegistry.acacia_timber_slab, BlockRegistry.acacia_timber);
        slabToBlock(consumer, BlockRegistry.acacia_timber, BlockRegistry.acacia_timber_slab);

        column(consumer, BlockRegistry.dark_oak_timber, Blocks.DARK_OAK_LOG, 3);
        blockToSlab(consumer, BlockRegistry.dark_oak_timber_slab, BlockRegistry.dark_oak_timber);
        slabToBlock(consumer, BlockRegistry.dark_oak_timber, BlockRegistry.dark_oak_timber_slab);

        ringCenter(consumer, BlockRegistry.wattle_and_daub, ItemRegistry.cob_ball, BlockRegistry.wicker, 2);
        ringCenter(consumer, BlockRegistry.wattle_and_daub, BlockRegistry.cob, BlockRegistry.wicker, 8, "bulk_wattle_and_daub");
        blockToSlab(consumer, BlockRegistry.wattle_and_daub_slab, BlockRegistry.wattle_and_daub);
        slabToBlock(consumer, BlockRegistry.wattle_and_daub, BlockRegistry.wattle_and_daub_slab);

        checkerboardNoCenter(consumer, BlockRegistry.wicker, Items.STICK, Items.WHEAT, 2);
        blockToSlab(consumer, BlockRegistry.wicker_slab, BlockRegistry.wicker);
        slabToBlock(consumer, BlockRegistry.wicker, BlockRegistry.wicker_slab);

        woodShakesMain(consumer, BlockRegistry.oak_wood_shakes, Blocks.OAK_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.oak_wood_shakes, BlockRegistry.oak_timber, 6);
        blockToSlab(consumer,BlockRegistry.oak_wood_shakes_slab,BlockRegistry.oak_wood_shakes);
        slabToBlock(consumer,BlockRegistry.oak_wood_shakes,BlockRegistry.oak_wood_shakes_slab);

        woodShakesMain(consumer, BlockRegistry.spruce_wood_shakes, Blocks.SPRUCE_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.spruce_wood_shakes, BlockRegistry.spruce_timber, 6);
        blockToSlab(consumer,BlockRegistry.spruce_wood_shakes_slab,BlockRegistry.spruce_wood_shakes);
        slabToBlock(consumer,BlockRegistry.spruce_wood_shakes,BlockRegistry.spruce_wood_shakes_slab);

        woodShakesMain(consumer, BlockRegistry.birch_wood_shakes, Blocks.BIRCH_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.birch_wood_shakes, BlockRegistry.birch_timber, 6);
        blockToSlab(consumer,BlockRegistry.birch_wood_shakes_slab,BlockRegistry.birch_wood_shakes);
        slabToBlock(consumer,BlockRegistry.birch_wood_shakes,BlockRegistry.birch_wood_shakes_slab);

        woodShakesMain(consumer, BlockRegistry.jungle_wood_shakes, Blocks.JUNGLE_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.jungle_wood_shakes, BlockRegistry.jungle_timber, 6);
        blockToSlab(consumer,BlockRegistry.jungle_wood_shakes_slab,BlockRegistry.jungle_wood_shakes);
        slabToBlock(consumer,BlockRegistry.jungle_wood_shakes,BlockRegistry.jungle_wood_shakes_slab);

        woodShakesMain(consumer, BlockRegistry.acacia_wood_shakes, Blocks.ACACIA_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.acacia_wood_shakes, BlockRegistry.acacia_timber, 6);
        blockToSlab(consumer,BlockRegistry.acacia_wood_shakes_slab,BlockRegistry.acacia_wood_shakes);
        slabToBlock(consumer,BlockRegistry.acacia_wood_shakes,BlockRegistry.acacia_wood_shakes_slab);

        woodShakesMain(consumer, BlockRegistry.dark_oak_wood_shakes, Blocks.DARK_OAK_LOG, 6);
        woodShakesAlt(consumer, BlockRegistry.dark_oak_wood_shakes, BlockRegistry.dark_oak_timber, 6);
        blockToSlab(consumer,BlockRegistry.dark_oak_wood_shakes_slab,BlockRegistry.dark_oak_wood_shakes);
        slabToBlock(consumer,BlockRegistry.dark_oak_wood_shakes,BlockRegistry.dark_oak_wood_shakes_slab);

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
}
