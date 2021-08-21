package alsender.earthworks.datagen;

import alsender.earthworks.datagen.data.ModLootTableProvider;
import alsender.earthworks.datagen.data.ModRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

public class ModDatagen {

    public static void start(GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();
        ExistingFileHelper helper = e.getExistingFileHelper();
        if (e.includeServer()) {
            generator.addProvider(new ModLootTableProvider(generator));
            generator.addProvider(new ModRecipeProvider(generator));
        }
    }
}
