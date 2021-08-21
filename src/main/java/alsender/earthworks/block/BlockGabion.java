package alsender.earthworks.block;

import alsender.earthworks.main.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Random;

/**
 * Created by alsender on 2/22/17.
 */
public class BlockGabion extends ModBlock {

    private final int IDNum;

    public BlockGabion(IForgeRegistry<Block> registry, String name, int ID, Material material, SoundType soundType, float hardness, float resistance) {
        super(registry, name, material, soundType, hardness, resistance);
        this.IDNum = ID;
    }

    public boolean onBlockActivated(World world, BlockPos pos, BlockState state, PlayerEntity player, Hand hand, Direction facing, float hitX, float hitY, float hitZ) {
        Block block = world.getBlockState(pos).getBlock();
        if (player.isSneaking() && world.getBlockState(pos.down()).getMaterial().isReplaceable()) {
            if (world.getBlockState(pos).getBlock() == BlockRegistry.stair_gabion0 || world.getBlockState(pos).getBlock() == BlockRegistry.stair_gabion1 || world.getBlockState(pos).getBlock() == BlockRegistry.stair_gabion2) {
                return false;
            }
            world.setBlockState(pos, switchGabion(block).getDefaultState());
            return true;
        }
        return false;
    }

    public void neighborChanged(BlockState state, World world, BlockPos pos1, Block block, BlockPos pos2) {
        if (world.isBlockPowered(pos1) || world.isBlockPowered(pos1.up())) {
            world.scheduleUpdate(pos1, this, 2);
        }
    }

    public void updateTick(World world, BlockPos pos, BlockState state, Random random) {
        Block block = world.getBlockState(pos).getBlock();
        world.setBlockState(pos, switchGabion(block).getDefaultState());
    }

    public void onBlockAdded(World world, BlockPos pos, BlockState state) {
        Block block = world.getBlockState(pos).getBlock();
        if (world.getBlockState(pos.down()).getBlock() == BlockRegistry.GRAVEL_GABION || world.getBlockState(pos.down()).getBlock() == BlockRegistry.SAND_GABION || world.getBlockState(pos.down()).getBlock() == BlockRegistry.DIRT_GABION) {
            world.setBlockState(pos, switchGabion(block).getDefaultState());
        }
        if (world.getBlockState(pos.down()).getBlock() == BlockRegistry.gabion_falling0 || world.getBlockState(pos.down()).getBlock() == BlockRegistry.gabion_falling1 || world.getBlockState(pos.down()).getBlock() == BlockRegistry.gabion_falling2) {
            world.setBlockState(pos, switchGabion(block).getDefaultState());
        }
    }

    public int getIDNum() {
        return this.IDNum;
    }

    private Block switchGabion(Block block) {
        Block blockReturn = null;
        switch (getIDNum()) {
            case 0 : blockReturn = BlockRegistry.gabion_falling0;
                    break;
            case 1 : blockReturn = BlockRegistry.gabion_falling1;
                    break;
            case 2 : blockReturn = BlockRegistry.gabion_falling2;
                    break;
        }
        return blockReturn;
    }
}
