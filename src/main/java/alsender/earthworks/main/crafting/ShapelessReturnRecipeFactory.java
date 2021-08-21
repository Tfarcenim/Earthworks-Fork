package alsender.earthworks.main.crafting;

import alsender.earthworks.main.Earthworks;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.item.Items;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by alsender on 3/22/17.
 */
public class ShapelessReturnRecipeFactory implements IRecipeFactory {

    @Override
    public IRecipe parse(JsonContext context, JsonObject json) {
        ShapelessOreRecipe recipe = ShapelessOreRecipe.factory(context, json);

        String group = JSONUtils.getString(json, "group", "");

        NonNullList<Ingredient> ings = NonNullList.create();
        for (JsonElement ele : JSONUtils.getJsonArray(json, "ingredients"))
            ings.add(CraftingHelper.getIngredient(ele, context));

        if (ings.isEmpty())
            throw new JsonParseException("No ingredients for shapeless recipe");

        ItemStack itemstack = CraftingHelper.getItemStack(JSONUtils.getJsonObject(json, "result"), context);
        return new ShapelessReturnRecipes(new ResourceLocation(Earthworks.mod_id, "shapeless_return_crafting"), itemstack, ings);
    }

    public class ShapelessReturnRecipes extends ShapelessOreRecipe {

        public ShapelessReturnRecipes(ResourceLocation group, ItemStack output, NonNullList<Ingredient> ingredients) {
            super(group, ingredients, output);
        }

        @Override
        public NonNullList<ItemStack> getRemainingItems(CraftingInventory inv) {
            NonNullList<ItemStack> nonnulllist = NonNullList.<ItemStack>withSize(inv.getSizeInventory(), ItemStack.EMPTY);
            for (int i = 0; i < nonnulllist.size(); ++i) {
                ItemStack itemstack = inv.getStackInSlot(i);
                if (itemstack != null && itemstack.getItem() == Items.FLINT) {
                    int count = itemstack.getCount();
                    nonnulllist.set(i, (itemstack.splitStack(count)));
                } else {
                    nonnulllist.set(i, ForgeHooks.getContainerItem(itemstack));
                }
            }
            return nonnulllist;
        }
    }
}