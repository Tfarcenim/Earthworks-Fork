package alsender.earthworks.datagen.assets;

import alsender.earthworks.main.registry.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.resources.ResourcePackType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
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
    }

    protected void makeSimpleBlockItem(Item item) {
        getBuilder(item.getRegistryName().toString())
                .parent(getExistingFile(modLoc("block/" + item.getRegistryName().getPath())));
    }

    protected void makeOneLayerItem(Item item, ResourceLocation texture) {
        String path = item.getRegistryName().getPath();
        if (existingFileHelper.exists(new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath())
                , ResourcePackType.CLIENT_RESOURCES, ".png", "textures")) {
            getBuilder(path).parent(new ModelFile.UncheckedModelFile(mcLoc("item/generated")))
                    .texture("layer0", new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath()));
        } else {
            System.out.println("no texture for " + item + " found, skipping");
        }
    }

    protected void makeOneLayerItem(Item item) {
        makeOneLayerItem(item, item.getRegistryName());
    }

}
