package alsender.earthworks.datagen;

import alsender.earthworks.datagen.assets.ModBlockstateProvider;
import alsender.earthworks.datagen.data.ModBlockTagsProvider;
import alsender.earthworks.datagen.data.ModItemTagsProvider;
import alsender.earthworks.datagen.data.ModLootTableProvider;
import alsender.earthworks.datagen.data.ModRecipeProvider;
import alsender.earthworks.main.Earthworks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

public class ModDatagen {

    public static void start(GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();
        ExistingFileHelper helper = e.getExistingFileHelper();
        if (e.includeServer()) {
            BlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(generator, Earthworks.mod_id,helper);
            generator.addProvider(new ModLootTableProvider(generator));
            generator.addProvider(new ModRecipeProvider(generator));
            generator.addProvider(new ModItemTagsProvider(generator,blockTagsProvider,Earthworks.mod_id,helper));
        }

        if (e.includeClient()) {
            generator.addProvider(new ModBlockstateProvider(generator,Earthworks.mod_id,helper));
        }
    }
}
