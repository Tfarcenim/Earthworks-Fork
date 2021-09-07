package alsender.earthworks.main.world;

import alsender.earthworks.main.Earthworks;
import alsender.earthworks.main.registry.BlockRegistry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.*;

public class ConfiguredFeatures {

    public static final ConfiguredFeature<?, ?> ORE_CHALK = register("ore_chalk", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.chalk.getDefaultState(), 33))
            .range(256).square().count(8));

    public static final ConfiguredFeature<?, ?> ORE_SLATE = register("ore_slate", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockRegistry.blue_slate.getDefaultState(), 33))
            .range(256).square().count(8));

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,new ResourceLocation(Earthworks.mod_id, key), configuredFeature);
    }
}
