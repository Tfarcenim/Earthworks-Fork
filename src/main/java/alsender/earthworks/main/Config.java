package alsender.earthworks.main;

import net.minecraftforge.common.ForgeConfigSpec;

/**
 * Created by alsender on 1/29/17.
 */
public class Config {
    
    public static ForgeConfigSpec.IntValue Chalk_spawn_rate;
    public static ForgeConfigSpec.IntValue Cmin_spawn;
    public static ForgeConfigSpec.IntValue Cmax_spawn;
    public static ForgeConfigSpec.IntValue Cvein_size;
    public static ForgeConfigSpec.IntValue Slate_spawn_rate;
    public static ForgeConfigSpec.IntValue Smin_spawn;
    public static ForgeConfigSpec.IntValue Smax_spawn;
    public static ForgeConfigSpec.IntValue Svein_size;

    public Config(ForgeConfigSpec.Builder builder) {
        builder.push("General");
        Chalk_spawn_rate = builder.comment("Attempts the world generator will make to spawn a CHALK vein per chunk.  Set to 0 to turn off CHALK.").defineInRange("chalk_spawn_rate", 3,0,42);
        Cmin_spawn = builder.comment("Minimum Y level at which CHALK can spawn.").defineInRange("chalk_min_spawn",48,0,256);
        Cmax_spawn = builder.comment("Maximum Y level at which CHALK can spawn.").defineInRange("chalk_max_spawn",256,0,256);
        Cvein_size = builder.comment("Vein size that CHALK can spawn in.").defineInRange("chalk_vein_size",33,0,33);

        Slate_spawn_rate = builder.comment("Attempts the world generator will make to spawn a SLATE vein per chunk.  Set to 0 to turn off SLATE.").defineInRange("slate_spawn_rate", 10,0,42);
        Smin_spawn = builder.comment("Minimum Y level at which SLATE can spawn.").defineInRange("slate_min_spawn",0,0,256);
        Smax_spawn = builder.comment("Maximum Y level at which SLATE can spawn.").defineInRange("slate_max_spawn",256,0,256);
        Svein_size = builder.comment("Vein size that SLATE can spawn in.").defineInRange("slate_vein_size",33,0,33);
        builder.pop();
    }
}
