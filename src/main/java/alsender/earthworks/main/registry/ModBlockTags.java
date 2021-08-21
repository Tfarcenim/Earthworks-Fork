package alsender.earthworks.main.registry;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

/**
 * Created by alsender on 6/20/17.
 */
public class ModBlockTags {

    public static final ITag.INamedTag<Block> timber_log = BlockTags.makeWrapperTag(new ResourceLocation(Earthworks.mod_id,"timber_log").toString());

}
