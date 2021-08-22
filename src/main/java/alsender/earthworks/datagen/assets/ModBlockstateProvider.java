package alsender.earthworks.datagen.assets;

import alsender.earthworks.block.ModBlockFacing;
import alsender.earthworks.main.Earthworks;
import alsender.earthworks.main.registry.BlockRegistry;
import net.minecraft.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourcePackType;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class ModBlockstateProvider extends BlockStateProvider {

    private final ExistingFileHelper existingFileHelper;

    public ModBlockstateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
        this.existingFileHelper = exFileHelper;
    }

    @Override
    protected void registerStatesAndModels() {

        makeVariantBlockState(BlockRegistry.adobe,4);

        simpleBlock(BlockRegistry.chalk);
        simpleBlock(BlockRegistry.cinder);
        simpleBlock(BlockRegistry.cob);
        simpleBlock(BlockRegistry.concrete);
        cordwood();
        makeVariantBlockState(BlockRegistry.dry_fitted_stone,4);
        gabions();

        simpleBlock(BlockRegistry.mud);

        wallBlock(BlockRegistry.adobe_wall,modBlockTexture("adobe0"));

        verticalPlanks(BlockRegistry.vertical_oak_planks, Blocks.OAK_PLANKS);
        verticalPlanks(BlockRegistry.vertical_spruce_planks, Blocks.SPRUCE_PLANKS);
        verticalPlanks(BlockRegistry.vertical_birch_planks, Blocks.BIRCH_PLANKS);
        verticalPlanks(BlockRegistry.vertical_jungle_planks, Blocks.JUNGLE_PLANKS);
        verticalPlanks(BlockRegistry.vertical_acacia_planks, Blocks.ACACIA_PLANKS);
        verticalPlanks(BlockRegistry.vertical_dark_oak_planks, Blocks.DARK_OAK_PLANKS);
    }

    protected void cubeColumn(Block block) {
        String path = block.getRegistryName().getPath();
        BlockModelBuilder blockModelBuilder = models().cubeColumn(path, modBlockTexture(path), modBlockTexture(path + "_top"));
        getVariantBuilder(block).partialState().addModels(ConfiguredModel.builder().modelFile(blockModelBuilder).build());
    }

    protected void gabions() {
        Block[] blocks = new Block[]{BlockRegistry.GRAVEL_GABION,BlockRegistry.SAND_GABION,BlockRegistry.DIRT_GABION};
        for (Block block : blocks) {
            String path = block.getRegistryName().getPath();
            BlockModelBuilder blockModelBuilder = models().cubeBottomTop(path, modBlockTexture("gabion_side"), modBlockTexture("gabion_bottom"),modBlockTexture(path + "_top"));
            getVariantBuilder(block).partialState().addModels(ConfiguredModel.builder().modelFile(blockModelBuilder).build());
        }
    }

    protected void makeVariantBlockState(Block block,int variants) {

        List<ModelFile> files = new ArrayList<>();
        String path = block.getRegistryName().getPath();

        for (int i = 0; i < variants;i++) {
            ModelFile modelFile = models().cubeAll(path + i, modBlockTexture(path + i));
            files.add(modelFile);
        }

        getVariantBuilder(block).partialState().addModels(collectAndBuild(files));
    }

    //avoids creating a long builder chain
    protected ConfiguredModel[] collectAndBuild(List<ModelFile> modelFiles) {
        ConfiguredModel.Builder<?> builder = ConfiguredModel.builder();
        for (int i = 0; i < modelFiles.size() - 2;i++) {
            ModelFile modelFile = modelFiles.get(i);
            builder.modelFile(modelFile).nextModel();
        }
        return builder.modelFile(modelFiles.get(modelFiles.size() - 1)).build();
    }

    protected void cordwood() {
        ModelFile modelFile0 = models().cubeColumnHorizontal("cordwood0", modBlockTexture("cordwood0"),modBlockTexture("cordwood0_top"));
        ModelFile modelFile1 = models().cubeColumnHorizontal("cordwood1", modBlockTexture("cordwood1"),modBlockTexture("cordwood1_top"));
        ModelFile modelFile2 = models().cubeColumnHorizontal("cordwood2", modBlockTexture("cordwood2"),modBlockTexture("cordwood2_top"));

        Direction[] horizontals = new Direction[]{Direction.NORTH,Direction.EAST,Direction.SOUTH,Direction.WEST};

        VariantBlockStateBuilder builder = getVariantBuilder(BlockRegistry.cordwood);
        for (int i =0; i < 4;i++) {
            Direction horizontal = horizontals[i];
            builder.partialState().with(HorizontalBlock.HORIZONTAL_FACING, horizontal).addModels(
                    ConfiguredModel.builder().modelFile(modelFile0).rotationY(i * 90).nextModel()
                            .modelFile(modelFile1).rotationY(i * 90).nextModel()
                            .modelFile(modelFile2).rotationY(i * 90).build()
            );
        }
    }

    public ResourceLocation modBlockTexture(String name) {
        return new ResourceLocation(Earthworks.mod_id, ModelProvider.BLOCK_FOLDER + "/" + name);
    }


    public boolean blockTextureExists(Block block) {
        if (textureExists(blockTexture(block))) {
            return true;
        }
        System.out.println("no texture for " + block + " found, skipping");
        return false;
    }

    public boolean textureExists(ResourceLocation name) {
        boolean b = existingFileHelper.exists(name, ResourcePackType.CLIENT_RESOURCES, ".png", "textures");
        if (!b) {
            System.out.println("no texture for " + name + " found, skipping");
        }
        return b;
    }

    public static boolean simple6sidedBlock(Block block) {
        return !(block instanceof ModBlockFacing) && !(block instanceof StairsBlock) && !(block instanceof SlabBlock) && !(block instanceof WallBlock) && !block.getRegistryName().getPath().contains("vertical");
    }

    protected void verticalPlanks(Block block, Block from) {
        simpleBlock(block, models().cubeAll(name(block), blockTexture(from)));
    }

    private String name(Block block) {
        return block.getRegistryName().getPath();
    }

    protected void simpleSlab(SlabBlock block) {
        ResourceLocation id = block.getRegistryName();

        String slabPath = id.getPath().substring(0, id.getPath().length() - "_slab".length());

        Block original = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(id.getNamespace(), slabPath));

        if (original == Blocks.AIR) {
            System.out.println("No original block found for " + id + " tried " + slabPath);
        }

        slabBlock(block, block.getRegistryName(), new ResourceLocation(id.getNamespace(), "block/" + original.getRegistryName().getPath()));
    }

    protected void simpleStairs(StairsBlock block) {
        ResourceLocation id = block.getRegistryName();

        String stairsPath = id.getPath().substring(0, id.getPath().length() - "_stairs".length());

        Block original = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(id.getNamespace(), stairsPath));

        if (original == Blocks.AIR) {
            System.out.println("No original block found for " + id + " tried " + stairsPath);
        }

        stairsBlock(block, new ResourceLocation(id.getNamespace(), "block/" + original.getRegistryName().getPath()));
    }

    protected void simpleWall(WallBlock block) {
        ResourceLocation id = block.getRegistryName();

        String stairsPath = id.getPath().substring(0, id.getPath().length() - "_wall".length());

        Block original = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(id.getNamespace(), stairsPath));

        if (original == Blocks.AIR) {
            System.out.println("No original block found for " + id + " tried " + stairsPath);
        }

        wallBlock(block, new ResourceLocation(id.getNamespace(), "block/" + original.getRegistryName().getPath()));
    }

}
