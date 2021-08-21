package alsender.earthworks.main.registry;

import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraftforge.oredict.OreDictionary;

import static alsender.earthworks.main.registry.BlockRegistry.*;
import static alsender.earthworks.main.registry.ItemRegistry.*;

/**
 * Created by alsender on 6/20/17.
 */
public class ModTags {

    public static void init() {
        OreDictionary.registerOre("logTimber", block_timber_oak);
        OreDictionary.registerOre("logTimber", block_timber_spruce);
        OreDictionary.registerOre("logTimber", block_timber_birch);
        OreDictionary.registerOre("logTimber", block_timber_jungle);
        OreDictionary.registerOre("logTimber", acacia_timber);
        OreDictionary.registerOre("logTimber", block_timber_dark_oak);

        OreDictionary.registerOre("materialBinding", Items.PAPER);
        OreDictionary.registerOre("materialBinding", Items.SUGAR_CANE);
        OreDictionary.registerOre("materialBinding", Items.STRING);
        OreDictionary.registerOre("materialBinding", Items.WHEAT);
        OreDictionary.registerOre("materialBinding", Blocks.CACTUS);
        OreDictionary.registerOre("materialBinding", Blocks.DEADBUSH);
        OreDictionary.registerOre("materialBinding", Blocks.DOUBLE_PLANT);
        OreDictionary.registerOre("materialBinding", Blocks.LEAVES);
        OreDictionary.registerOre("materialBinding", Blocks.LEAVES2);
        OreDictionary.registerOre("materialBinding", Blocks.SAPLING);
        OreDictionary.registerOre("materialBinding", Blocks.TALLGRASS);
        OreDictionary.registerOre("materialBinding", Blocks.VINE);
        OreDictionary.registerOre("materialBinding", Blocks.RED_FLOWER);
        OreDictionary.registerOre("materialBinding", Blocks.YELLOW_FLOWER);
        OreDictionary.registerOre("materialBinding", Blocks.WEB);
    }
}
