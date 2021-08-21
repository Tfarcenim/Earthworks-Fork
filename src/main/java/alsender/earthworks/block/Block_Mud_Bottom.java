package alsender.earthworks.block;

import alsender.earthworks.main.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Random;

/**
 * Created by alsender on 12/14/16.
 */
public class Block_Mud_Bottom extends ModBlock {

    public Block_Mud_Bottom(IForgeRegistry<Block> registry, String name) {
        super(registry, name, Material.CLAY, SoundType.SLIME, 0.6F, 1.0F);
        setCreativeTab(null);
    }

    public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos) {
        super.neighborChanged(state, world, pos, block, fromPos);
        if (!world.getBlockState(pos.up()).getMaterial().isSolid()) {
            world.setBlockState(pos, BlockRegistry.mud.getDefaultState());
        }
    }

    public Item getItemDropped(BlockState state, Random random, int fortune) {
        return  Item.getItemFromBlock(BlockRegistry.mud);
    }
}
