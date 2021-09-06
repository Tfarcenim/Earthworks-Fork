package alsender.earthworks.datagen.assets;

import alsender.earthworks.main.registry.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.resources.ResourcePackType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
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
        makeOneLayerItem(ItemRegistry.dirt_ball);
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
        makeSimpleBlockItem(ItemRegistry.cinder_blocks);
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
        makeSimpleBlockItem(ItemRegistry.cinder_block_slab);
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

        makeSimpleBlockItem(ItemRegistry.vertical_oak_planks);
        makeSimpleBlockItem(ItemRegistry.vertical_spruce_planks);
        makeSimpleBlockItem(ItemRegistry.vertical_birch_planks);
        makeSimpleBlockItem(ItemRegistry.vertical_jungle_planks);
        makeSimpleBlockItem(ItemRegistry.vertical_acacia_planks);
        makeSimpleBlockItem(ItemRegistry.vertical_dark_oak_planks);


        makeVerticalFenceInventoryItem(ItemRegistry.vertical_oak_fence);
        makeVerticalFenceInventoryItem(ItemRegistry.vertical_spruce_fence);
        makeVerticalFenceInventoryItem(ItemRegistry.vertical_birch_fence);
        makeVerticalFenceInventoryItem(ItemRegistry.vertical_jungle_fence);
        makeVerticalFenceInventoryItem(ItemRegistry.vertical_acacia_fence);
        makeVerticalFenceInventoryItem(ItemRegistry.vertical_dark_oak_fence);


        makeSimpleBlockItem(ItemRegistry.adobe_stairs);
        makeSimpleBlockItem(ItemRegistry.chalk_stairs);
        makeSimpleBlockItem(ItemRegistry.cinder_block_stairs);
        makeSimpleBlockItem(ItemRegistry.cob_stairs);
        makeSimpleBlockItem(ItemRegistry.concrete_stairs);
        makeSimpleBlockItem(ItemRegistry.cordwood_stairs);
        makeSimpleBlockItem(ItemRegistry.dry_fitted_stone_stairs);
        makeSimpleBlockItem(ItemRegistry.GRAVEL_GABION_STAIRS);
        makeSimpleBlockItem(ItemRegistry.SAND_GABION_STAIRS);
        makeSimpleBlockItem(ItemRegistry.DIRT_GABION_STAIRS);
        makeSimpleBlockItem(ItemRegistry.mud_stairs);
        makeSimpleBlockItem(ItemRegistry.vertical_oak_stairs);
        makeSimpleBlockItem(ItemRegistry.vertical_spruce_stairs);
        makeSimpleBlockItem(ItemRegistry.vertical_birch_stairs);
        makeSimpleBlockItem(ItemRegistry.vertical_jungle_stairs);
        makeSimpleBlockItem(ItemRegistry.vertical_acacia_stairs);
        makeSimpleBlockItem(ItemRegistry.vertical_dark_oak_stairs);
        makeSimpleBlockItem(ItemRegistry.lath_and_plaster_stairs);
        makeSimpleBlockItem(ItemRegistry.rammed_earth_stairs);
        makeSimpleBlockItem(ItemRegistry.blue_slate_stairs);
        makeSimpleBlockItem(ItemRegistry.green_slate_stairs);
        makeSimpleBlockItem(ItemRegistry.purple_slate_stairs);
        makeSimpleBlockItem(ItemRegistry.polished_blue_slate_stairs);
        makeSimpleBlockItem(ItemRegistry.polished_green_slate_stairs);
        makeSimpleBlockItem(ItemRegistry.polished_purple_slate_stairs);
        makeSimpleBlockItem(ItemRegistry.blue_slate_shingles_stairs);
        makeSimpleBlockItem(ItemRegistry.green_slate_shingles_stairs);
        makeSimpleBlockItem(ItemRegistry.purple_slate_shingles_stairs);
        makeSimpleBlockItem(ItemRegistry.blue_slate_tiles_stairs);
        makeSimpleBlockItem(ItemRegistry.green_slate_tiles_stairs);
        makeSimpleBlockItem(ItemRegistry.purple_slate_tiles_stairs);
        makeSimpleBlockItem(ItemRegistry.oak_timber_stairs);
        makeSimpleBlockItem(ItemRegistry.birch_timber_stairs);
        makeSimpleBlockItem(ItemRegistry.spruce_timber_stairs);
        makeSimpleBlockItem(ItemRegistry.jungle_timber_stairs);
        makeSimpleBlockItem(ItemRegistry.acacia_timber_stairs);
        makeSimpleBlockItem(ItemRegistry.dark_oak_timber_stairs);
        makeSimpleBlockItem(ItemRegistry.wattle_and_daub_stairs);
        makeSimpleBlockItem(ItemRegistry.wicker_stairs);
        makeSimpleBlockItem(ItemRegistry.oak_wood_shakes_stairs);
        makeSimpleBlockItem(ItemRegistry.spruce_wood_shakes_stairs);
        makeSimpleBlockItem(ItemRegistry.birch_wood_shakes_stairs);
        makeSimpleBlockItem(ItemRegistry.jungle_wood_shakes_stairs);
        makeSimpleBlockItem(ItemRegistry.acacia_wood_shakes_stairs);
        makeSimpleBlockItem(ItemRegistry.dark_oak_wood_shakes_stairs);

        makeWallInventoryItem(ItemRegistry.adobe_wall);
        makeWallInventoryItem(ItemRegistry.chalk_wall);
        makeWallInventoryItem(ItemRegistry.cinder_block_wall);
        makeWallInventoryItem(ItemRegistry.cob_wall);
        makeWallInventoryItem(ItemRegistry.concrete_wall);
        makeWallInventoryItem(ItemRegistry.cordwood_wall);
        makeWallInventoryItem(ItemRegistry.dry_fitted_stone_wall);
        makeWallInventoryItem(ItemRegistry.GRAVEL_GABION_WALL);
        makeWallInventoryItem(ItemRegistry.SAND_GABION_WALL);
        makeWallInventoryItem(ItemRegistry.DIRT_GABION_WALL);
        makeWallInventoryItem(ItemRegistry.mud_wall);
        makeWallInventoryItem(ItemRegistry.lath_and_plaster_wall);
        makeWallInventoryItem(ItemRegistry.rammed_earth_wall);
        makeWallInventoryItem(ItemRegistry.blue_slate_wall);
        makeWallInventoryItem(ItemRegistry.green_slate_wall);
        makeWallInventoryItem(ItemRegistry.purple_slate_wall);
        makeWallInventoryItem(ItemRegistry.polished_blue_slate_wall);
        makeWallInventoryItem(ItemRegistry.polished_green_slate_wall);
        makeWallInventoryItem(ItemRegistry.polished_purple_slate_wall);
        makeWallInventoryItem(ItemRegistry.blue_slate_shingles_wall);
        makeWallInventoryItem(ItemRegistry.green_slate_shingles_wall);
        makeWallInventoryItem(ItemRegistry.purple_slate_shingles_wall);
        makeWallInventoryItem(ItemRegistry.blue_slate_tiles_wall);
        makeWallInventoryItem(ItemRegistry.green_slate_tiles_wall);
        makeWallInventoryItem(ItemRegistry.purple_slate_tiles_wall);
        makeWallInventoryItem(ItemRegistry.oak_timber_wall);
        makeWallInventoryItem(ItemRegistry.birch_timber_wall);
        makeWallInventoryItem(ItemRegistry.spruce_timber_wall);
        makeWallInventoryItem(ItemRegistry.jungle_timber_wall);
        makeWallInventoryItem(ItemRegistry.acacia_timber_wall);
        makeWallInventoryItem(ItemRegistry.dark_oak_timber_wall);
        makeWallInventoryItem(ItemRegistry.wattle_and_daub_wall);
        makeWallInventoryItem(ItemRegistry.wicker_wall);
        makeWallInventoryItem(ItemRegistry.oak_wood_shakes_wall);
        makeWallInventoryItem(ItemRegistry.spruce_wood_shakes_wall);
        makeWallInventoryItem(ItemRegistry.birch_wood_shakes_wall);
        makeWallInventoryItem(ItemRegistry.jungle_wood_shakes_wall);
        makeWallInventoryItem(ItemRegistry.acacia_wood_shakes_wall);
        makeWallInventoryItem(ItemRegistry.dark_oak_wood_shakes_wall);

        makeSimpleBlockItem(ItemRegistry.reed);
        makeSimpleBlockItem(ItemRegistry.thatch);

        makeSimpleBlockItem(ItemRegistry.reed_stairs);
        makeSimpleBlockItem(ItemRegistry.thatch_stairs);
        makeWallInventoryItem(ItemRegistry.reed_wall);
        makeWallInventoryItem(ItemRegistry.thatch_wall);

        makeSimpleBlockItem(ItemRegistry.daub_cob_arrow0);
        makeSimpleBlockItem(ItemRegistry.daub_cob_arrow1);
        makeSimpleBlockItem(ItemRegistry.daub_cob_arrow2);
        makeSimpleBlockItem(ItemRegistry.daub_cob_arrow3);
        makeSimpleBlockItem(ItemRegistry.daub_cob_barndoor0);
        makeSimpleBlockItem(ItemRegistry.daub_cob_barndoor1);
        makeSimpleBlockItem(ItemRegistry.daub_cob_barndoor2);
        makeSimpleBlockItem(ItemRegistry.daub_cob_barndoor3);
        makeSimpleBlockItem(ItemRegistry.daub_cob_barndoor4);
        makeSimpleBlockItem(ItemRegistry.daub_cob_barndoor5);
        makeSimpleBlockItem(ItemRegistry.daub_cob_barndoor6);
        makeSimpleBlockItem(ItemRegistry.daub_cob_barndoor7);
        makeSimpleBlockItem(ItemRegistry.daub_cob_bottom_l);
        makeSimpleBlockItem(ItemRegistry.daub_cob_bottom);
        makeSimpleBlockItem(ItemRegistry.daub_cob_bottom_r);
        makeSimpleBlockItem(ItemRegistry.daub_cob_left);
        makeSimpleBlockItem(ItemRegistry.daub_cob_parallel_hor);
        makeSimpleBlockItem(ItemRegistry.daub_cob_parallel_vert);
        makeSimpleBlockItem(ItemRegistry.daub_cob_right);
        makeSimpleBlockItem(ItemRegistry.daub_cob_slash_back);
        makeSimpleBlockItem(ItemRegistry.daub_cob_slash);
        makeSimpleBlockItem(ItemRegistry.daub_cob_square);
        makeSimpleBlockItem(ItemRegistry.daub_cob_square_x);
        makeSimpleBlockItem(ItemRegistry.daub_cob_top_l);
        makeSimpleBlockItem(ItemRegistry.daub_cob_top);
        makeSimpleBlockItem(ItemRegistry.daub_cob_top_r);
        makeSimpleBlockItem(ItemRegistry.daub_cob_triangle0);
        makeSimpleBlockItem(ItemRegistry.daub_cob_triangle1);
        makeSimpleBlockItem(ItemRegistry.daub_cob_triangle2);
        makeSimpleBlockItem(ItemRegistry.daub_cob_triangle3);
        makeSimpleBlockItem(ItemRegistry.daub_cob_xbottom);
        makeSimpleBlockItem(ItemRegistry.daub_cob_xdoor0);
        makeSimpleBlockItem(ItemRegistry.daub_cob_xdoor1);
        makeSimpleBlockItem(ItemRegistry.daub_cob_xdoor2);
        makeSimpleBlockItem(ItemRegistry.daub_cob_xdoor3);
        makeSimpleBlockItem(ItemRegistry.daub_cob_xleft);
        makeSimpleBlockItem(ItemRegistry.daub_cob_x);
        makeSimpleBlockItem(ItemRegistry.daub_cob_xright);
        makeSimpleBlockItem(ItemRegistry.daub_cob_xtop);

        makeSimpleBlockItem(ItemRegistry.plaster_arrow0);
        makeSimpleBlockItem(ItemRegistry.plaster_arrow1);
        makeSimpleBlockItem(ItemRegistry.plaster_arrow2);
        makeSimpleBlockItem(ItemRegistry.plaster_arrow3);
        makeSimpleBlockItem(ItemRegistry.plaster_barndoor0);
        makeSimpleBlockItem(ItemRegistry.plaster_barndoor1);
        makeSimpleBlockItem(ItemRegistry.plaster_barndoor2);
        makeSimpleBlockItem(ItemRegistry.plaster_barndoor3);
        makeSimpleBlockItem(ItemRegistry.plaster_barndoor4);
        makeSimpleBlockItem(ItemRegistry.plaster_barndoor5);
        makeSimpleBlockItem(ItemRegistry.plaster_barndoor6);
        makeSimpleBlockItem(ItemRegistry.plaster_barndoor7);
        makeSimpleBlockItem(ItemRegistry.plaster_bottom_l);
        makeSimpleBlockItem(ItemRegistry.plaster_bottom);
        makeSimpleBlockItem(ItemRegistry.plaster_bottom_r);
        makeSimpleBlockItem(ItemRegistry.plaster_left);
        makeSimpleBlockItem(ItemRegistry.plaster_parallel_hor);
        makeSimpleBlockItem(ItemRegistry.plaster_parallel_vert);
        makeSimpleBlockItem(ItemRegistry.plaster_right);
        makeSimpleBlockItem(ItemRegistry.plaster_slash_back);
        makeSimpleBlockItem(ItemRegistry.plaster_slash);
        makeSimpleBlockItem(ItemRegistry.plaster_square);
        makeSimpleBlockItem(ItemRegistry.plaster_square_x);
        makeSimpleBlockItem(ItemRegistry.plaster_top_l);
        makeSimpleBlockItem(ItemRegistry.plaster_top);
        makeSimpleBlockItem(ItemRegistry.plaster_top_r);
        makeSimpleBlockItem(ItemRegistry.plaster_triangle0);
        makeSimpleBlockItem(ItemRegistry.plaster_triangle1);
        makeSimpleBlockItem(ItemRegistry.plaster_triangle2);
        makeSimpleBlockItem(ItemRegistry.plaster_triangle3);
        makeSimpleBlockItem(ItemRegistry.plaster_xbottom);
        makeSimpleBlockItem(ItemRegistry.plaster_xdoor0);
        makeSimpleBlockItem(ItemRegistry.plaster_xdoor1);
        makeSimpleBlockItem(ItemRegistry.plaster_xdoor2);
        makeSimpleBlockItem(ItemRegistry.plaster_xdoor3);
        makeSimpleBlockItem(ItemRegistry.plaster_xleft);
        makeSimpleBlockItem(ItemRegistry.plaster_x);
        makeSimpleBlockItem(ItemRegistry.plaster_xright);
        makeSimpleBlockItem(ItemRegistry.plaster_xtop);
        
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

    protected void makeVerticalFenceInventoryItem(BlockItem item) {
        String path = item.getRegistryName().getPath();

        String tex = path.substring("vertical_".length(),path.length() - "_fence".length()) + "_planks";

        ItemModelBuilder parent = getBuilder(path + "_inventory")
                .parent(getExistingFile(modLoc("block/vertical_fence_inventory")))
                .texture("texture",mcLoc("block/"+tex));
        getBuilder(path).parent(parent);
    }

    protected void makeWallInventoryItem(BlockItem item) {
        String path = item.getRegistryName().getPath();

        ItemModelBuilder parent = getBuilder(path + "_inventory").parent(getExistingFile(modLoc("block/"+path+"_inventory")));
        getBuilder(path).parent(parent);
    }

    protected void makeOneLayerItem(Item item) {
        makeOneLayerItem(item, item.getRegistryName());
    }

}
