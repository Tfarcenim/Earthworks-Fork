package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 3/5/17.
 */
public class Block_Planks_Vert extends Block {

    public Block_Planks_Vert(IForgeRegistry<Block> registry, String name, Material material, SoundType sound, Float hardness, Float resistance) {
        super(material);
        this.setSoundType(sound);
        this.setHardness(hardness);
        this.setResistance(resistance);

        this.setUnlocalizedName(Earthworks.mod_id + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Earthworks.creativeTab);
        registry.register(this);
    }
}
