package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 12/25/16.
 */
public class ModWallBlock extends BlockWall {

    public ModWallBlock(IForgeRegistry<Block> registry, String name, Block block) {
        super(block);
        setHardness(blockHardness);
        setResistance(blockResistance);

        setUnlocalizedName(Earthworks.mod_id + "." + name);
        setRegistryName(name);
        setCreativeTab(Earthworks.creativeTab);
        setDefaultState(this.blockState.getBaseState().withProperty(UP, false).withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, false));

        registry.register(this);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(CreativeTabs tabs, NonNullList<ItemStack> list) {
        list.add(new ItemStack(this, 1, 0));
    }
}
