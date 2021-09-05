package alsender.earthworks.datagen.data;

import alsender.earthworks.datagen.data.builders.CookingRecipeBuilderFullStack;
import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.ItemRegistry;
import alsender.earthworks.main.registry.ModBlockTags;
import alsender.earthworks.main.registry.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.data.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

      //      GameRegistry.addSmelting(ItemRegistry.item_chalk, new ItemStack(ItemRegistry.item_quicklime), 0.1F);
     //   GameRegistry.addSmelting(BlockRegistry.chalk, new ItemStack(ItemRegistry.item_quicklime, 4), 0.1F);

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ItemRegistry.chalk_dust),ItemRegistry.quicklime,.1f,200)
                .addCriterion("has_chalk_dust",hasItem(ItemRegistry.chalk_dust))
                .build(consumer);
        CookingRecipeBuilderFullStack.smeltingRecipe(Ingredient.fromItems(ItemRegistry.chalk),new ItemStack(ItemRegistry.quicklime,4),.4f,200)
                .addCriterion("has_chalk",hasItem(ItemRegistry.chalk))
                .build(consumer,"quicklime_from_chalk_dust");

        shapelessPlanksNew(consumer,ItemRegistry.vertical_oak_planks,ItemRegistry.oak_timber);
        shapelessPlanksNew(consumer,ItemRegistry.vertical_spruce_planks,ItemRegistry.spruce_timber);
        shapelessPlanksNew(consumer,ItemRegistry.vertical_birch_planks,ItemRegistry.birch_timber);
        shapelessPlanksNew(consumer,ItemRegistry.vertical_jungle_planks,ItemRegistry.jungle_timber);
        shapelessPlanksNew(consumer,ItemRegistry.vertical_acacia_planks,ItemRegistry.acacia_timber);
        shapelessPlanksNew(consumer,ItemRegistry.vertical_dark_oak_planks,ItemRegistry.dark_oak_timber);

        slabToBlock(consumer,ItemRegistry.vertical_oak_planks,BlockRegistry.vertical_oak_slab);
        slabToBlock(consumer,ItemRegistry.vertical_spruce_planks,BlockRegistry.vertical_spruce_slab);
        slabToBlock(consumer,ItemRegistry.vertical_birch_planks,BlockRegistry.vertical_birch_slab);
        slabToBlock(consumer,ItemRegistry.vertical_jungle_planks,BlockRegistry.vertical_jungle_slab);
        slabToBlock(consumer,ItemRegistry.vertical_acacia_planks,BlockRegistry.vertical_acacia_slab);
        slabToBlock(consumer,ItemRegistry.vertical_dark_oak_planks,BlockRegistry.vertical_dark_oak_slab);

        twoByTwo(consumer,ItemRegistry.adobe,ItemRegistry.adobe_brick);
        slabToBlock(consumer,ItemRegistry.adobe,BlockRegistry.adobe_slab);

        twoByTwo(consumer,ItemRegistry.chalk,ItemRegistry.chalk_dust);
        slabToBlock(consumer,ItemRegistry.chalk,BlockRegistry.chalk_slab);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.cinder_blocks).key('#', ItemRegistry.concrete)
                .patternLine("##").patternLine("##")
                .addCriterion("has_item", hasItem(ItemRegistry.concrete)).build(consumer);
        slabToBlock(consumer,ItemRegistry.cinder_blocks,BlockRegistry.cinder_block_slab);

        twoByTwo(consumer,ItemRegistry.cob,ItemRegistry.cob_ball);
        slabToBlock(consumer,ItemRegistry.cob, BlockRegistry.cob_slab);

        ShapelessRecipeBuilder.shapelessRecipe(BlockRegistry.cob,2)
                .addIngredient(Blocks.CLAY)
                .addIngredient(ModTags.material_binding)
                .addIngredient(BlockRegistry.mud)
                .addCriterion("has_clay",hasItem(Items.CLAY))
                .build(consumer,"bulk_cob");

        ShapelessRecipeBuilder.shapelessRecipe(BlockRegistry.concrete,2)
                .addIngredient(Blocks.GRAVEL)
                .addIngredient(ItemRegistry.lime_plaster)
                .addIngredient(ItemTags.SAND)
                .addCriterion("has_gravel",hasItem(Items.GRAVEL))
                .build(consumer);
        slabToBlock(consumer,ItemRegistry.concrete,BlockRegistry.concrete_slab);

        checkerboard(consumer,ItemRegistry.cordwood,Blocks.OAK_LOG,ItemRegistry.lime_plaster,5);
        slabToBlock(consumer,ItemRegistry.cordwood,BlockRegistry.cordwood_slab);

        //used pileDirt before
        twoByTwo(consumer, Items.DIRT,ItemRegistry.dirt_ball);

        ring(consumer,BlockRegistry.dry_fitted_stone,Items.STONE,8);
        slabToBlock(consumer,ItemRegistry.dry_fitted_stone,BlockRegistry.dry_fitted_stone_slab);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.DIRT_GABION,2)
                .key('a', Tags.Items.RODS_WOODEN)
                .key('b',Items.WHEAT)
                .key('c',Items.DIRT)
                .patternLine("aba").patternLine("bcb").patternLine("aba")
                .addCriterion("has_dirt",hasItem(Items.DIRT))
                .build(consumer);
        slabToBlock(consumer,ItemRegistry.DIRT_GABION,BlockRegistry.DIRT_GABION_SLAB);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.GRAVEL_GABION,2)
                .key('a', Tags.Items.RODS_WOODEN)
                .key('b',Items.WHEAT)
                .key('c',Items.DIRT)
                .patternLine("aba").patternLine("bcb").patternLine("aba")
                .addCriterion("has_gravel",hasItem(Items.GRAVEL))
                .build(consumer);
        slabToBlock(consumer,ItemRegistry.GRAVEL_GABION,BlockRegistry.GRAVEL_GABION_SLAB);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.SAND_GABION,2)
                .key('a', Tags.Items.RODS_WOODEN)
                .key('b',Items.WHEAT)
                .key('c',Items.DIRT)
                .patternLine("aba").patternLine("bcb").patternLine("aba")
                .addCriterion("has_sand",hasItem(Items.SAND))
                .build(consumer);
        slabToBlock(consumer,ItemRegistry.SAND_GABION,BlockRegistry.SAND_GABION_SLAB);

        //should this be converted to accept anything with water?
        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistry.mud)
                .addIngredient(Items.DIRT,8)
                .addIngredient(Items.WATER_BUCKET)
                .addCriterion("has_water",hasItem(Items.WATER_BUCKET))
                .build(consumer,"mud_from_water");
        slabToBlock(consumer,ItemRegistry.mud,BlockRegistry.mud_slab);
        twoByTwo(consumer,ItemRegistry.mud,ItemRegistry.mud_ball);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.lath_and_plaster)
                .key('l',ItemRegistry.lime_plaster)
                .key('p',ItemTags.PLANKS)
                .patternLine(" l ").patternLine("lpl").patternLine(" l ")
                .addCriterion("has_lime_plaster",hasItem(ItemRegistry.lime_plaster))
                .build(consumer);
        slabToBlock(consumer,ItemRegistry.lath_and_plaster,BlockRegistry.lath_and_plaster_slab);

        threeByTwo(consumer,ItemRegistry.rammed_earth,Items.DIRT,3);
        slabToBlock(consumer,ItemRegistry.rammed_earth,BlockRegistry.rammed_earth_slab);

        twoByTwo(consumer,ItemRegistry.reed,Items.SUGAR_CANE);
        slabToBlock(consumer,ItemRegistry.reed,BlockRegistry.reed_slab);
        //twoByTwo(consumer,Items.SAND,ItemRegistry.sand);

        slabToBlock(consumer,ItemRegistry.blue_slate,BlockRegistry.blue_slate_slab);
        slabToBlock(consumer,ItemRegistry.green_slate,BlockRegistry.green_slate_slab);
        slabToBlock(consumer,ItemRegistry.purple_slate,BlockRegistry.purple_slate_slab);

        twoByTwo(consumer,ItemRegistry.blue_slate_shingles,ItemRegistry.blue_slate,4);
        slabToBlock(consumer,ItemRegistry.blue_slate_shingles,BlockRegistry.blue_slate_shingles_slab);

        twoByTwo(consumer,ItemRegistry.green_slate_shingles,ItemRegistry.green_slate,4);
        slabToBlock(consumer,ItemRegistry.green_slate_shingles,BlockRegistry.green_slate_shingles_slab);

        twoByTwo(consumer,ItemRegistry.purple_slate_shingles,ItemRegistry.purple_slate,4);
        slabToBlock(consumer,ItemRegistry.purple_slate_shingles,BlockRegistry.purple_slate_shingles_slab);

        ring(consumer,ItemRegistry.polished_blue_slate,ItemRegistry.blue_slate,8);
        slabToBlock(consumer,ItemRegistry.polished_blue_slate,BlockRegistry.polished_blue_slate_slab);

        ring(consumer,ItemRegistry.polished_green_slate,ItemRegistry.green_slate,8);
        slabToBlock(consumer,ItemRegistry.polished_green_slate,BlockRegistry.polished_green_slate_slab);

        ring(consumer,ItemRegistry.polished_purple_slate,ItemRegistry.purple_slate,8);
        slabToBlock(consumer,ItemRegistry.polished_purple_slate,BlockRegistry.polished_purple_slate_slab);

        twoByTwo(consumer,ItemRegistry.blue_slate_tiles,ItemRegistry.polished_blue_slate,4);
        slabToBlock(consumer,ItemRegistry.blue_slate_tiles,BlockRegistry.blue_slate_tiles_slab);

        twoByTwo(consumer,ItemRegistry.green_slate_tiles,ItemRegistry.polished_green_slate,4);
        slabToBlock(consumer,ItemRegistry.green_slate_tiles,BlockRegistry.green_slate_tiles_slab);

        twoByTwo(consumer,ItemRegistry.purple_slate_tiles,ItemRegistry.polished_purple_slate,4);
        slabToBlock(consumer,ItemRegistry.purple_slate_tiles,BlockRegistry.purple_slate_tiles_slab);

        twoByTwo(consumer,BlockRegistry.thatch,Items.WHEAT);
        slabToBlock(consumer,BlockRegistry.thatch,BlockRegistry.thatch_slab);

        column(consumer,BlockRegistry.spruce_timber,Blocks.SPRUCE_LOG,3);
        slabToBlock(consumer,BlockRegistry.spruce_timber,BlockRegistry.spruce_timber_slab);

        column(consumer,BlockRegistry.birch_timber,Blocks.BIRCH_LOG,3);
        slabToBlock(consumer,BlockRegistry.birch_timber,BlockRegistry.birch_timber_slab);

        column(consumer,BlockRegistry.jungle_timber,Blocks.JUNGLE_LOG,3);
        slabToBlock(consumer,BlockRegistry.jungle_timber,BlockRegistry.jungle_timber_slab);

        column(consumer,BlockRegistry.acacia_timber,Blocks.ACACIA_LOG,3);
        slabToBlock(consumer,BlockRegistry.acacia_timber,BlockRegistry.acacia_timber_slab);

        column(consumer,BlockRegistry.dark_oak_timber,Blocks.DARK_OAK_LOG,3);
        slabToBlock(consumer,BlockRegistry.dark_oak_timber,BlockRegistry.dark_oak_timber_slab);
    }

    private static void shapelessPlanksNew(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider planks, IItemProvider input) {
        ShapelessRecipeBuilder.shapelessRecipe(planks, 4).addIngredient(input).setGroup("planks").addCriterion("has_log", hasItem(input)).build(recipeConsumer);
    }

    private static void slabToBlock(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider block, SlabBlock slab) {
        ShapedRecipeBuilder.shapedRecipe(block).key('s',slab).patternLine("s").patternLine("s")
                .setGroup("slab").addCriterion("has_slab", hasItem(slab)).build(recipeConsumer,block.asItem().getRegistryName().getPath()+"_from_slabs");
    }

    private static void twoByTwo(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input) {
        twoByTwo(recipeConsumer, output, input,1);
    }

    private static void twoByTwo(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count) {
        ShapedRecipeBuilder.shapedRecipe(output,count).key('#', input)
                .patternLine("##").patternLine("##")
                .addCriterion("has_item", hasItem(input)).build(recipeConsumer);
    }

    private static void checkerboard(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input1, IItemProvider input2, int count) {
        ShapedRecipeBuilder.shapedRecipe(output,count)
                .key('a', input1).key('b', input2)
                .patternLine("aba").patternLine("bab").patternLine("aba")
                .addCriterion("has_"+input1.asItem().getRegistryName().getPath(),hasItem(input1))
                .addCriterion("has_"+input2.asItem().getRegistryName().getPath(),hasItem(input2))
                .build(recipeConsumer);
    }

    private static void ring(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count) {
        ShapedRecipeBuilder.shapedRecipe(output,count)
                .key('a', input)
                .patternLine("aaa").patternLine("a a").patternLine("aaa")
                .addCriterion("has_"+input.asItem().getRegistryName().getPath(),hasItem(input))
                .build(recipeConsumer);
    }

    private static void threeByTwo(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count) {
        ShapedRecipeBuilder.shapedRecipe(output,count)
                .key('a', input)
                .patternLine("aaa").patternLine("aaa")
                .addCriterion("has_"+input.asItem().getRegistryName().getPath(),hasItem(input))
                .build(recipeConsumer);
    }

    private static void column(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input, int count) {
        ShapedRecipeBuilder.shapedRecipe(output,count)
                .key('a', input)
                .patternLine("a").patternLine("a").patternLine("a")
                .addCriterion("has_"+input.asItem().getRegistryName().getPath(),hasItem(input))
                .build(recipeConsumer);
    }
}
