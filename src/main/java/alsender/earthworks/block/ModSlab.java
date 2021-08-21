package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 12/16/16.
 */
public class ModSlab extends SlabBlock {
    public final World world = null;
    public final BlockPos pos = null;

    public ModSlab(IForgeRegistry<Block> registry, String name, Block block) {
        super(block.getDefaultState().getMaterial());
        setHardness(block.getDefaultState().getBlockHardness(world, pos));

        setUnlocalizedName(Earthworks.mod_id + "." + name);
        setRegistryName(name);
        setCreativeTab(Earthworks.creativeTab);

        registry.register(this);

        useNeighborBrightness = true;
    }

    public ModSlab(IForgeRegistry<Block> registry, String name) {
        super(Material.WOOD);
        setHardness(2.0F);

        setUnlocalizedName(Earthworks.mod_id + "." + name);
        setRegistryName(name);
        setCreativeTab(Earthworks.creativeTab);

        registry.register(this);

        useNeighborBrightness = true;
    }

    @Override
    public IProperty getVariantProperty() {
        return HALF;
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return null;
    }

    public Comparable getTypeForItem(ItemStack stack) {
        return 0;
    }

    public boolean isDouble() {
        return false;
    }

    @Override
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, HALF);
    }

    @Override
    public BlockState getStateFromMeta(int meta) {
        BlockState iblockstate = this.getDefaultState();
        if (!this.isDouble()) {
            iblockstate = iblockstate.withProperty(HALF, (meta) == 1 ? EnumBlockHalf.BOTTOM : EnumBlockHalf.TOP);
        }
        return iblockstate;
    }

    @Override
    public int getMetaFromState(BlockState state) {
        return state.getValue(HALF) == EnumBlockHalf.BOTTOM ? 1 : 0;
    }
}
