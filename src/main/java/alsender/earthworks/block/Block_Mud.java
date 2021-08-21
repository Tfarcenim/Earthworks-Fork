package alsender.earthworks.block;

import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 12/12/16.
 */
public class Block_Mud extends ModBlock {

    protected static final AxisAlignedBB AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.897D, 1.0D);

    public Block_Mud(IForgeRegistry<Block> registry, String name) {
        super(registry, name, Material.CLAY, SoundType.SLIME, 0.6F, 1.0F);
        setCreativeTab(Earthworks.creativeTab);
    }

    public AxisAlignedBB getBoundingBox(BlockState state, IBlockAccess world, BlockPos pos) {
        return AABB;
    }

    @Override
    public boolean isOpaqueCube(BlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(BlockState state) {
        return false;
    }

    public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos) {
        super.neighborChanged(state, world, pos, block, fromPos);
        if (world.getBlockState(pos.up()).getMaterial().isSolid()) {
            world.setBlockState(pos, BlockRegistry.mud_bottom.getDefaultState());
        }
    }

    public void onBlockAdded(World world, BlockPos pos, BlockState state) {
        super.onBlockAdded(world, pos, state);
        if (world.getBlockState(pos.up()).getMaterial().isSolid()) {
            world.setBlockState(pos, BlockRegistry.mud_bottom.getDefaultState());
        }
    }
}
