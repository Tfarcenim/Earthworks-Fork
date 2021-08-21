package alsender.earthworks.datagen.data;

import alsender.earthworks.main.registry.ModBlockTags;
import alsender.earthworks.main.registry.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, modId, existingFileHelper);
    }

    @Override
    protected void registerTags() {

        copy(ModBlockTags.timber_log,ModTags.timber_log);

        getOrCreateBuilder(ModTags.material_binding).add(Items.PAPER,Items.SUGAR_CANE,Items.STRING,Items.WHEAT,Items.CACTUS,Items.DEAD_BUSH,Items.TALL_GRASS,Items.VINE,Items.COBWEB)
                .addTags(ItemTags.TALL_FLOWERS,ItemTags.LEAVES,ItemTags.SAPLINGS,ItemTags.FLOWERS);
    }
}
