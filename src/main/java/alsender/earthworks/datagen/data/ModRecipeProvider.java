package alsender.earthworks.datagen.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

      //      GameRegistry.addSmelting(ItemRegistry.item_chalk, new ItemStack(ItemRegistry.item_quicklime), 0.1F);
     //   GameRegistry.addSmelting(BlockRegistry.chalk, new ItemStack(ItemRegistry.item_quicklime, 4), 0.1F);

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {

    }
}
