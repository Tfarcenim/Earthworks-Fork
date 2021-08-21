package alsender.earthworks.main.registry;

import alsender.earthworks.main.Earthworks;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

/**
 * Created by alsender on 6/20/17.
 */
public class ModTags {

    public static final ITag.INamedTag<Item> material_binding = ItemTags.makeWrapperTag(new ResourceLocation(Earthworks.mod_id,"material_binding").toString());
    public static final ITag.INamedTag<Item> timber_log = ItemTags.makeWrapperTag(new ResourceLocation(Earthworks.mod_id,"timber_log").toString());
}
