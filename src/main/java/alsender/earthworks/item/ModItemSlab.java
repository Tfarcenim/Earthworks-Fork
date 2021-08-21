package alsender.earthworks.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 5/26/17.
 */
public class ModItemSlab extends BlockItem {

    Block doubleSlab;

    public ModItemSlab(IForgeRegistry<Item> registry, Block block, Block doubleSlab) {
        super(block);
        String name = "item" + block.getRegistryName().toString().substring(11);
        this.setRegistryName(name);
        this.doubleSlab = doubleSlab;
        registry.register(this);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

    @Override
    public ActionResultType onItemUse(PlayerEntity player, World world, BlockPos pos, Hand hand, Direction side, float hitx, float hity, float hitz) {
        ItemStack stack = player.getHeldItem(hand);
        if (stack.getCount() == 0) {
            return ActionResultType.FAIL;
        } else if (!player.canPlayerEdit(pos.offset(side), side, stack)) {
            return ActionResultType.FAIL;
        } else {
            BlockState iblockstate = world.getBlockState(pos);
            if (iblockstate.getBlock() == getBlock()) {
                SlabBlock.EnumBlockHalf enumblockhalf = iblockstate.getValue(SlabBlock.HALF);
                if ((side == Direction.UP && enumblockhalf == SlabBlock.EnumBlockHalf.BOTTOM || side == Direction.DOWN && enumblockhalf == SlabBlock.EnumBlockHalf.TOP)) {
                    BlockState iblockstate1 = this.doubleSlab.getDefaultState();
                    if (world.checkNoEntityCollision(this.doubleSlab.getBoundingBox(iblockstate1, world, pos)) && world.setBlockState(pos, iblockstate1, 3)) {
                        world.playSound(pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 0.5F, this.doubleSlab.getSoundType().getPlaceSound(), SoundCategory.BLOCKS, (this.doubleSlab.getSoundType().getVolume() + 1.0F) / 2.0F, this.doubleSlab.getSoundType().getPitch() * 0.8F, true);
                        stack.shrink(1);
                    }
                    return ActionResultType.SUCCESS;
                }
            }
            return (this.check(stack, world, pos.offset(side)) || (super.onItemUse(player, world, pos, hand, side, hitx, hity, hitz) == ActionResultType.SUCCESS ? true : false)) ? ActionResultType.SUCCESS : ActionResultType.FAIL;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean canPlaceBlockOnSide(World world, BlockPos pos, Direction facing, PlayerEntity player, ItemStack stack) {
        BlockPos blockpos1 = pos;
        BlockState iblockstate = world.getBlockState(pos);
        if (iblockstate.getBlock() == getBlock()) {
            boolean flag = iblockstate.getValue(SlabBlock.HALF) == SlabBlock.EnumBlockHalf.TOP;
            if ((facing == Direction.UP && !flag || facing == Direction.DOWN && flag)) {
                return true;
            }
        }
        pos = pos.offset(facing);
        BlockState iblockstate1 = world.getBlockState(pos);
        return iblockstate1.getBlock() == getBlock() || super.canPlaceBlockOnSide(world, blockpos1, facing, player, stack);
    }

    private boolean check(ItemStack stack, World world, BlockPos pos) {
        BlockState iblockstate = world.getBlockState(pos);
        if (iblockstate.getBlock() == getBlock()) {
            BlockState iblockstate1 = this.doubleSlab.getDefaultState();
            if (world.checkNoEntityCollision(this.doubleSlab.getBoundingBox(iblockstate1, world, pos)) && world.setBlockState(pos, iblockstate1, 3)) {
                world.playSound(pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 0.5F, this.doubleSlab.getSoundType().getPlaceSound(), SoundCategory.BLOCKS, (this.doubleSlab.getSoundType().getVolume() + 1.0F) / 2.0F, this.doubleSlab.getSoundType().getPitch() * 0.8F, true);
                stack.shrink(1);
            }
            return true;
        }
        return false;
    }
}
