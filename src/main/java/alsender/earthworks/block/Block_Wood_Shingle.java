package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 3/2/17.
 */
public class Block_Wood_Shingle extends Block {

    public final String blockName;

    public Block_Wood_Shingle(IForgeRegistry<Block> registry, String name, Material mat, SoundType sound, float hardness, float resistance) {
        super(mat);
        this.setSoundType(sound);
        this.setHardness(hardness);
        this.setResistance(resistance);

        this.setUnlocalizedName(Earthworks.mod_id + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Earthworks.creativeTab);
        registry.register(this);

        this.blockName = name;
    }
}
