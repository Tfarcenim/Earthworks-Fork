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


    }

    private static void shapelessPlanksNew(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider planks, IItemProvider input) {
        ShapelessRecipeBuilder.shapelessRecipe(planks, 4).addIngredient(input).setGroup("planks").addCriterion("has_log", hasItem(input)).build(recipeConsumer);
    }

    private static void slabToBlock(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider block, SlabBlock slab) {
        ShapedRecipeBuilder.shapedRecipe(block).key('s',slab).patternLine("s").patternLine("s")
                .setGroup("slab").addCriterion("has_slab", hasItem(slab)).build(recipeConsumer,block.asItem().getRegistryName().getPath()+"_from_slabs");
    }

    private static void twoByTwo(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input) {
        ShapedRecipeBuilder.shapedRecipe(output).key('#', input)
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
}
