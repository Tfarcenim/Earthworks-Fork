package alsender.earthworks.block;

import alsender.earthworks.main.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

/**
 * Created by alsender on 12/12/16.
 */
public class Block_Mud extends Block {

    protected static final VoxelShape AABB = VoxelShapes.create(new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.897D, 1.0D));

    public Block_Mud(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return AABB;
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        super.neighborChanged(state, world, pos, blockIn, fromPos, isMoving);
        if (world.getBlockState(pos.up()).getMaterial().isSolid()) {
            world.setBlockState(pos, BlockRegistry.mud_bottom.getDefaultState());
        }
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onBlockAdded(state, world, pos, oldState, isMoving);
        if (world.getBlockState(pos.up()).getMaterial().isSolid()) {
            world.setBlockState(pos, BlockRegistry.mud_bottom.getDefaultState());
        }
    }
}
