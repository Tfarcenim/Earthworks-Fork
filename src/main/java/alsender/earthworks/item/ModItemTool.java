package alsender.earthworks.item;

import alsender.earthworks.block.timber.Daub_Cob;
import alsender.earthworks.block.timber.Plaster;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by alsender on 4/7/17.
 */
public class ModItemTool extends Item {

    public ModItemTool(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        ItemStack itemstack = context.getItem();
        BlockPos pos = context.getPos();
        Block block = context.getWorld().getBlockState(pos).getBlock();
        PlayerEntity player = context.getPlayer();
        player.setActiveHand(context.getHand());
        World world = context.getWorld();
        if (player.isSneaking()) {
            if (block instanceof Daub_Cob) {
                world.setBlockState(pos, ((Daub_Cob) block).getRotation(block));
                itemstack.damageItem(1, player,playerEntity -> playerEntity.sendBreakAnimation(context.getHand()));
                return ActionResultType.SUCCESS;
            } else if (block instanceof Plaster) {
                world.setBlockState(pos, ((Plaster) block).getRotation(block));
                itemstack.damageItem(1, player,playerEntity -> playerEntity.sendBreakAnimation(context.getHand()));
                return ActionResultType.SUCCESS;
            }
        } else return ActionResultType.FAIL;
        return ActionResultType.FAIL;
    }

}
