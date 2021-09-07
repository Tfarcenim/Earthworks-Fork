package alsender.earthworks.main.world;

import alsender.earthworks.main.Config;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class Worldgen {

    public static void addFeatures(BiomeLoadingEvent e) {
        if (e.getCategory() != Biome.Category.NETHER && e.getCategory() != Biome.Category.NONE) {
            if (Config.enable_chalk.get()) {
                e.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ConfiguredFeatures.ORE_CHALK);
            }

            if (Config.enable_slate.get()) {
                e.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ConfiguredFeatures.ORE_SLATE);
            }
        }
    }
}
