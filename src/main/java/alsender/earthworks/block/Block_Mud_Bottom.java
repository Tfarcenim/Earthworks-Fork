package alsender.earthworks.block;

import alsender.earthworks.main.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by alsender on 12/14/16.
 */
public class Block_Mud_Bottom extends Block {

    public Block_Mud_Bottom(Properties properties) {
        super(properties);
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        super.neighborChanged(state, world, pos, blockIn, fromPos, isMoving);
        if (!world.getBlockState(pos.up()).getMaterial().isSolid()) {
            world.setBlockState(pos, BlockRegistry.mud.getDefaultState());
        }
    }

    public Item getItemDropped(BlockState state, Random random, int fortune) {
        return  Item.getItemFromBlock(BlockRegistry.mud);
    }
}
