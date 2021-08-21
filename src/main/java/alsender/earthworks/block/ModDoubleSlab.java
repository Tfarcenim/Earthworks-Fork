package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;

/**
 * Created by alsender on 5/26/17.
 */
public class ModDoubleSlab extends SlabBlock {

    private Block slab;

    public ModDoubleSlab(IForgeRegistry<Block> registry, Block block) {
        super(block.getMaterial(block.getDefaultState()));

        String name = "double" + block.getRegistryName().toString().substring(11);

        this.setRegistryName(name);
        this.setUnlocalizedName(Earthworks.mod_id + "." + name);
        this.slab = block;

        registry.register(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName().toString(), "inventory"));
    }

    public void setSlab(Block slab) {
        this.slab = slab;
    }

    @Override
    public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, BlockState state, int foturne) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(Item.getItemFromBlock(this.slab), 1));
        drops.add(new ItemStack(Item.getItemFromBlock(this.slab), 1));
        return drops;
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return null;
    }

    @Override
    public boolean isDouble() {
        return true;
    }

    @SideOnly(Side.CLIENT)
    protected static boolean isHalfSlab(BlockState state) {
        return true;
    }

    @Override
    public ItemStack getPickBlock(BlockState state, RayTraceResult target, World world, BlockPos pos, PlayerEntity player) {
        return new ItemStack(Item.getItemFromBlock(this.slab));
    }

    @Override
    public BlockState getStateFromMeta(int meta) {
        BlockState iblockstate = this.getDefaultState();
        if (!this.isDouble()) {
            iblockstate = iblockstate.withProperty(HALF, (meta) == 0 ? EnumBlockHalf.BOTTOM : EnumBlockHalf.TOP);
        }
        return iblockstate;
    }

    @Override
    public int getMetaFromState(BlockState state) {
        return state.getValue(HALF) == EnumBlockHalf.BOTTOM ? 0 : 1;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, HALF);
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return HALF;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return 0;
    }
}
