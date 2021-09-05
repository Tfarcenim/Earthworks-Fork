package alsender.earthworks.datagen.data;

import alsender.earthworks.datagen.data.builders.CookingRecipeBuilderFullStack;
import alsender.earthworks.main.registry.ItemRegistry;
import net.minecraft.data.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
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

        slabToBlock(consumer,ItemRegistry.vertical_oak_planks,ItemRegistry.vertical_oak_slab);
        slabToBlock(consumer,ItemRegistry.vertical_spruce_planks,ItemRegistry.vertical_spruce_slab);
        slabToBlock(consumer,ItemRegistry.vertical_birch_planks,ItemRegistry.vertical_birch_slab);
        slabToBlock(consumer,ItemRegistry.vertical_jungle_planks,ItemRegistry.vertical_jungle_slab);
        slabToBlock(consumer,ItemRegistry.vertical_acacia_planks,ItemRegistry.vertical_acacia_slab);
        slabToBlock(consumer,ItemRegistry.vertical_dark_oak_planks,ItemRegistry.vertical_dark_oak_slab);

        twoByTwo(consumer,ItemRegistry.adobe,ItemRegistry.adobe_brick);
        slabToBlock(consumer,ItemRegistry.adobe,ItemRegistry.adobe_slab);

        twoByTwo(consumer,ItemRegistry.chalk,ItemRegistry.chalk_dust);
        slabToBlock(consumer,ItemRegistry.chalk,ItemRegistry.chalk_slab);

        ShapedRecipeBuilder.shapedRecipe(ItemRegistry.cinder_blocks).key('#', ItemRegistry.concrete)
                .patternLine("##").patternLine("##")
                .addCriterion("has_item", hasItem(ItemRegistry.concrete)).build(consumer);
        slabToBlock(consumer,ItemRegistry.cinder_blocks,ItemRegistry.cinder_block_slab);
    }

    private static void shapelessPlanksNew(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider planks, IItemProvider input) {
        ShapelessRecipeBuilder.shapelessRecipe(planks, 4).addIngredient(input).setGroup("planks").addCriterion("has_log", hasItem(input)).build(recipeConsumer);
    }

    private static void slabToBlock(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider block, IItemProvider slab) {
        ShapedRecipeBuilder.shapedRecipe(block).key('s',slab).patternLine("s").patternLine("s")
                .setGroup("slab").addCriterion("has_slab", hasItem(slab)).build(recipeConsumer,block.asItem().getRegistryName().getPath()+"_from_slabs");
    }

    private static void twoByTwo(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider output, IItemProvider input) {
        ShapedRecipeBuilder.shapedRecipe(output).key('#', input)
                .patternLine("##").patternLine("##")
                .addCriterion("has_item", hasItem(input)).build(recipeConsumer);
    }
}
