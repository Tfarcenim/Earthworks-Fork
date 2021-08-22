package alsender.earthworks.datagen.data;

import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.ModBlockTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, modId, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModBlockTags.timber_log).add(
                BlockRegistry.spruce_timber,BlockRegistry.birch_timber,
                BlockRegistry.jungle_timber,BlockRegistry.acacia_timber
        ,BlockRegistry.dark_oak_timber);

        getOrCreateBuilder(BlockTags.WOODEN_FENCES)
                .add(BlockRegistry.vertical_oak_fence,BlockRegistry.vertical_spruce_fence,BlockRegistry.vertical_birch_fence,
                        BlockRegistry.vertical_jungle_fence,BlockRegistry.vertical_acacia_fence,BlockRegistry.vertical_dark_oak_fence);

    }
}
