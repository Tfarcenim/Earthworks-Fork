package alsender.earthworks.main.crafting;

import alsender.earthworks.main.Earthworks;
import com.google.gson.JsonObject;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapelessRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeHooks;

public class ShapelessReturnRecipe extends ShapelessRecipe {

    protected final Ingredient returnItem;

    public ShapelessReturnRecipe(ShapelessRecipe baseRecipe,Ingredient returnItem) {
        super(baseRecipe.getId(), baseRecipe.getGroup(), baseRecipe.getRecipeOutput(),baseRecipe.getIngredients());
        this.returnItem = returnItem;
    }

    @Override
    public NonNullList<ItemStack> getRemainingItems(CraftingInventory inv) {
        NonNullList<ItemStack> nonnulllist = NonNullList.withSize(inv.getSizeInventory(), ItemStack.EMPTY);
        for (int i = 0; i < nonnulllist.size(); ++i) {
            ItemStack itemstack = inv.getStackInSlot(i);
            if (returnItem.test(itemstack)) {
                int count = itemstack.getCount();
                nonnulllist.set(i, itemstack.split(count));
            } else {
                nonnulllist.set(i, ForgeHooks.getContainerItem(itemstack));
            }
        }
        return nonnulllist;
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return Earthworks.shapeless_return;
    }


    public static class ReturnSerializer extends Serializer {

        @Override
        public ShapelessReturnRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
            ShapelessRecipe baseRecipe = super.read(recipeId, buffer);
            Ingredient returnItem = Ingredient.read(buffer);
            return new ShapelessReturnRecipe(baseRecipe,returnItem);
        }

        @Override
        public ShapelessRecipe read(ResourceLocation recipeId, JsonObject json) {
            ShapelessRecipe baseRecipe = super.read(recipeId, json);
            Ingredient returnItem = Ingredient.deserialize(json.get("return"));
            return new ShapelessReturnRecipe(baseRecipe,returnItem);
        }

        @Override
        public void write(PacketBuffer buffer, ShapelessRecipe recipe) {
            super.write(buffer, recipe);
            ((ShapelessReturnRecipe)recipe).returnItem.write(buffer);
        }
    }
}
