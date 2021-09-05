package alsender.earthworks.datagen.data.builders;

import alsender.earthworks.main.Earthworks;
import com.google.gson.JsonObject;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.IRequirementsStrategy;
import net.minecraft.advancements.criterion.RecipeUnlockedTrigger;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.function.Consumer;

public class ShapelessReturnRecipeBuilder extends ShapelessRecipeBuilder {

    protected Ingredient returnItem;

    public ShapelessReturnRecipeBuilder(IItemProvider resultIn, int countIn) {
        super(resultIn, countIn);
    }

    /**
     * Creates a new builder for a shapeless recipe.
     */
    public static ShapelessReturnRecipeBuilder shapelessRecipe(IItemProvider resultIn) {
        return new ShapelessReturnRecipeBuilder(resultIn, 1);
    }

    /**
     * Creates a new builder for a shapeless recipe.
     */
    public static ShapelessReturnRecipeBuilder shapelessRecipe(IItemProvider resultIn, int countIn) {
        return new ShapelessReturnRecipeBuilder(resultIn, countIn);
    }


    public ShapelessReturnRecipeBuilder setReturnItem(IItemProvider returnItem) {
        this.returnItem = Ingredient.fromItems(returnItem);
        return this;
    }

    @Override
    public void build(Consumer<IFinishedRecipe> consumerIn, ResourceLocation id) {
        this.advancementBuilder.withParentId(new ResourceLocation("recipes/root")).withCriterion("has_the_recipe", RecipeUnlockedTrigger.create(id)).withRewards(AdvancementRewards.Builder.recipe(id)).withRequirementsStrategy(IRequirementsStrategy.OR);
        consumerIn.accept(new ReturnResult(id, this.result, this.count, this.group == null ? "" : this.group, this.ingredients, this.advancementBuilder, new ResourceLocation(id.getNamespace(), "recipes/" + this.result.getGroup().getPath() + "/" + id.getPath()),this.returnItem));
    }

    public static class ReturnResult extends Result {

        protected final Ingredient returnItem;
        public ReturnResult(ResourceLocation idIn, Item resultIn, int countIn, String groupIn, List<Ingredient> ingredientsIn, Advancement.Builder advancementBuilderIn, ResourceLocation advancementIdIn,Ingredient returnItem) {
            super(idIn, resultIn, countIn, groupIn, ingredientsIn, advancementBuilderIn, advancementIdIn);
            this.returnItem = returnItem;
        }


        @Override
        public IRecipeSerializer<?> getSerializer() {
            return Earthworks.shapeless_return;
        }

        @Override
        public void serialize(JsonObject json) {
            super.serialize(json);
            json.add("return",returnItem.serialize());
        }
    }
}
