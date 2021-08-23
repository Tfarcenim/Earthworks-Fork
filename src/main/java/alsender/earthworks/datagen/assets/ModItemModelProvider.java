package alsender.earthworks.datagen.assets;

import alsender.earthworks.main.registry.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.resources.ResourcePackType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //blockitems
        getBuilder("adobe").parent(getExistingFile(modLoc("block/adobe0")));
        
        //misc items
        makeOneLayerItem(ItemRegistry.adobe_brick);
        makeOneLayerItem(ItemRegistry.chalk_dust);
        makeOneLayerItem(ItemRegistry.cob_ball);
        makeOneLayerItem(ItemRegistry.lime_plaster);
        makeOneLayerItem(ItemRegistry.mud_ball);
        makeOneLayerItem(ItemRegistry.quicklime);
        makeOneLayerItem(ItemRegistry.slaked_lime);
        makeOneLayerItem(ItemRegistry.timber_framing);

        makeOneLayerItem(ItemRegistry.square);
        makeOneLayerItem(ItemRegistry.acheulean);
        makeOneLayerItem(ItemRegistry.adz);
        makeOneLayerItem(ItemRegistry.compass);
        makeOneLayerItem(ItemRegistry.froe);
        makeOneLayerItem(ItemRegistry.planer);
        makeOneLayerItem(ItemRegistry.level);
        makeOneLayerItem(ItemRegistry.saw);

        makeOneLayerItem(ItemRegistry.wood_hammer);
        makeOneLayerItem(ItemRegistry.stone_hammer);
        makeOneLayerItem(ItemRegistry.iron_hammer);
        makeOneLayerItem(ItemRegistry.gold_hammer);
        makeOneLayerItem(ItemRegistry.diamond_hammer);

        makeSimpleBlockItem(ItemRegistry.adobe,modLoc("adobe0"));
        makeSimpleBlockItem(ItemRegistry.chalk);
        makeSimpleBlockItem(ItemRegistry.cinder);
        makeSimpleBlockItem(ItemRegistry.cob);
        makeSimpleBlockItem(ItemRegistry.concrete);
        makeSimpleBlockItem(ItemRegistry.cordwood,modLoc("cordwood0"));
        makeSimpleBlockItem(ItemRegistry.dry_fitted_stone,modLoc("dry_fitted_stone0"));
        makeSimpleBlockItem(ItemRegistry.GRAVEL_GABION);
        makeSimpleBlockItem(ItemRegistry.SAND_GABION);
        makeSimpleBlockItem(ItemRegistry.DIRT_GABION);
        makeSimpleBlockItem(ItemRegistry.mud);
        makeSimpleBlockItem(ItemRegistry.lath_and_plaster);
        makeSimpleBlockItem(ItemRegistry.rammed_earth);
        makeSimpleBlockItem(ItemRegistry.blue_slate);
        makeSimpleBlockItem(ItemRegistry.green_slate);
        makeSimpleBlockItem(ItemRegistry.purple_slate);
        makeSimpleBlockItem(ItemRegistry.polished_blue_slate);
        makeSimpleBlockItem(ItemRegistry.polished_green_slate);
        makeSimpleBlockItem(ItemRegistry.polished_purple_slate);
        makeSimpleBlockItem(ItemRegistry.blue_slate_shingles);
        makeSimpleBlockItem(ItemRegistry.green_slate_shingles);
        makeSimpleBlockItem(ItemRegistry.purple_slate_shingles);
        makeSimpleBlockItem(ItemRegistry.blue_slate_tiles);
        makeSimpleBlockItem(ItemRegistry.green_slate_tiles);
        makeSimpleBlockItem(ItemRegistry.purple_slate_tiles);
        makeSimpleBlockItem(ItemRegistry.oak_timber);
        makeSimpleBlockItem(ItemRegistry.birch_timber);
        makeSimpleBlockItem(ItemRegistry.spruce_timber);
        makeSimpleBlockItem(ItemRegistry.jungle_timber);
        makeSimpleBlockItem(ItemRegistry.acacia_timber);
        makeSimpleBlockItem(ItemRegistry.dark_oak_timber);
        makeSimpleBlockItem(ItemRegistry.wattle_and_daub,modLoc("daub_cob0"));
        makeSimpleBlockItem(ItemRegistry.wicker);
        makeSimpleBlockItem(ItemRegistry.oak_wood_shakes);
        makeSimpleBlockItem(ItemRegistry.spruce_wood_shakes);
        makeSimpleBlockItem(ItemRegistry.birch_wood_shakes);
        makeSimpleBlockItem(ItemRegistry.jungle_wood_shakes);
        makeSimpleBlockItem(ItemRegistry.acacia_wood_shakes);
        makeSimpleBlockItem(ItemRegistry.dark_oak_wood_shakes);

        makeSimpleBlockItem(ItemRegistry.adobe_slab);
        makeSimpleBlockItem(ItemRegistry.chalk_slab);
        makeSimpleBlockItem(ItemRegistry.cinder_slab);
        makeSimpleBlockItem(ItemRegistry.cob_slab);
        makeSimpleBlockItem(ItemRegistry.concrete_slab);
        makeSimpleBlockItem(ItemRegistry.cordwood_slab);
        makeSimpleBlockItem(ItemRegistry.dry_fitted_stone_slab);
        makeSimpleBlockItem(ItemRegistry.GRAVEL_GABION_SLAB);
        makeSimpleBlockItem(ItemRegistry.SAND_GABION_SLAB);
        makeSimpleBlockItem(ItemRegistry.DIRT_GABION_SLAB);
        makeSimpleBlockItem(ItemRegistry.mud_slab);
        makeSimpleBlockItem(ItemRegistry.vertical_oak_slab);
        makeSimpleBlockItem(ItemRegistry.vertical_spruce_slab);
        makeSimpleBlockItem(ItemRegistry.vertical_birch_slab);
        makeSimpleBlockItem(ItemRegistry.vertical_jungle_slab);
        makeSimpleBlockItem(ItemRegistry.vertical_acacia_slab);
        makeSimpleBlockItem(ItemRegistry.vertical_dark_oak_slab);
        makeSimpleBlockItem(ItemRegistry.lath_and_plaster_slab);
        makeSimpleBlockItem(ItemRegistry.rammed_earth_slab);
        makeSimpleBlockItem(ItemRegistry.reed_slab);
        makeSimpleBlockItem(ItemRegistry.blue_slate_slab);
        makeSimpleBlockItem(ItemRegistry.green_slate_slab);
        makeSimpleBlockItem(ItemRegistry.purple_slate_slab);
        makeSimpleBlockItem(ItemRegistry.polished_blue_slate_slab);
        makeSimpleBlockItem(ItemRegistry.polished_green_slate_slab);
        makeSimpleBlockItem(ItemRegistry.polished_purple_slate_slab);
        makeSimpleBlockItem(ItemRegistry.blue_slate_shingles_slab);
        makeSimpleBlockItem(ItemRegistry.green_slate_shingles_slab);
        makeSimpleBlockItem(ItemRegistry.purple_slate_shingles_slab);
        makeSimpleBlockItem(ItemRegistry.blue_slate_tiles_slab);
        makeSimpleBlockItem(ItemRegistry.green_slate_tiles_slab);
        makeSimpleBlockItem(ItemRegistry.purple_slate_tiles_slab);
        makeSimpleBlockItem(ItemRegistry.thatch_slab);
        makeSimpleBlockItem(ItemRegistry.oak_timber_slab);
        makeSimpleBlockItem(ItemRegistry.birch_timber_slab);
        makeSimpleBlockItem(ItemRegistry.spruce_timber_slab);
        makeSimpleBlockItem(ItemRegistry.jungle_timber_slab);
        makeSimpleBlockItem(ItemRegistry.acacia_timber_slab);
        makeSimpleBlockItem(ItemRegistry.dark_oak_timber_slab);
        makeSimpleBlockItem(ItemRegistry.wattle_and_daub_slab);
        makeSimpleBlockItem(ItemRegistry.wicker_slab);
        makeSimpleBlockItem(ItemRegistry.oak_wood_shakes_slab);
        makeSimpleBlockItem(ItemRegistry.spruce_wood_shakes_slab);
        makeSimpleBlockItem(ItemRegistry.birch_wood_shakes_slab);
        makeSimpleBlockItem(ItemRegistry.jungle_wood_shakes_slab);
        makeSimpleBlockItem(ItemRegistry.acacia_wood_shakes_slab);
        makeSimpleBlockItem(ItemRegistry.dark_oak_wood_shakes_slab);
    }

    protected void makeSimpleBlockItem(Item item) {
        makeSimpleBlockItem(item,item.getRegistryName());
    }

    protected void makeSimpleBlockItem(Item item,ResourceLocation model) {
        getBuilder(item.getRegistryName().toString())
                .parent(getExistingFile(new ResourceLocation(model.getNamespace() , "block/" + model.getPath())));
    }

    protected void makeOneLayerItem(Item item, ResourceLocation texture) {
        String path = item.getRegistryName().getPath();
        if (existingFileHelper.exists(new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath())
                , ResourcePackType.CLIENT_RESOURCES, ".png", "textures")) {
            getBuilder(path).parent(getExistingFile(mcLoc("item/generated")))
                    .texture("layer0", new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath()));
        } else {
            System.out.println("no texture for " + item + " found, skipping");
        }
    }

    protected void makeOneLayerItem(Item item) {
        makeOneLayerItem(item, item.getRegistryName());
    }

}
