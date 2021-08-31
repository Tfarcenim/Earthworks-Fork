package alsender.earthworks.datagen.data;

import alsender.earthworks.datagen.data.builders.CookingRecipeBuilderFullStack;
import alsender.earthworks.main.registry.ItemRegistry;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

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
    }
}
