package alsender.earthworks.datagen.assets;

import alsender.earthworks.block.ModBlockFacing;
import alsender.earthworks.main.Earthworks;
import alsender.earthworks.main.registry.BlockRegistry;
import net.minecraft.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourcePackType;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

import static net.minecraftforge.client.model.generators.ModelProvider.BLOCK_FOLDER;

public class ModBlockstateProvider extends BlockStateProvider {

    private final ExistingFileHelper existingFileHelper;

    public ModBlockstateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
        this.existingFileHelper = exFileHelper;
    }

    @Override
    protected void registerStatesAndModels() {

        makeVariantBlockState(BlockRegistry.adobe, 4);

        simpleBlock(BlockRegistry.chalk);
        simpleBlock(BlockRegistry.cinder);
        simpleBlock(BlockRegistry.cob);
        simpleBlock(BlockRegistry.concrete);
        cordwood();
        makeVariantBlockState(BlockRegistry.dry_fitted_stone, 4);
        gabions();

        simpleBlock(BlockRegistry.mud);

        verticalPlanks(BlockRegistry.vertical_oak_planks, Blocks.OAK_PLANKS);
        verticalPlanks(BlockRegistry.vertical_spruce_planks, Blocks.SPRUCE_PLANKS);
        verticalPlanks(BlockRegistry.vertical_birch_planks, Blocks.BIRCH_PLANKS);
        verticalPlanks(BlockRegistry.vertical_jungle_planks, Blocks.JUNGLE_PLANKS);
        verticalPlanks(BlockRegistry.vertical_acacia_planks, Blocks.ACACIA_PLANKS);
        verticalPlanks(BlockRegistry.vertical_dark_oak_planks, Blocks.DARK_OAK_PLANKS);

        simpleBlock(BlockRegistry.lath_and_plaster);
        simpleBlock(BlockRegistry.rammed_earth);

        axisBlock(BlockRegistry.reed, modBlockTexture("reed_side"), modBlockTexture("reed_top"));

        simpleBlock(BlockRegistry.blue_slate);
        simpleBlock(BlockRegistry.green_slate);
        simpleBlock(BlockRegistry.purple_slate);
        simpleBlock(BlockRegistry.polished_blue_slate);
        simpleBlock(BlockRegistry.polished_green_slate);
        simpleBlock(BlockRegistry.polished_purple_slate);
        simpleBlock(BlockRegistry.blue_slate_shingles);
        simpleBlock(BlockRegistry.green_slate_shingles);
        simpleBlock(BlockRegistry.purple_slate_shingles);
        simpleBlock(BlockRegistry.blue_slate_tiles);
        simpleBlock(BlockRegistry.green_slate_tiles);
        simpleBlock(BlockRegistry.purple_slate_tiles);

        axisBlock(BlockRegistry.thatch, modBlockTexture("thatch0_side"), modBlockTexture("thatch_top"));

        simpleBlock(BlockRegistry.oak_timber);
        simpleBlock(BlockRegistry.birch_timber);
        simpleBlock(BlockRegistry.spruce_timber);
        simpleBlock(BlockRegistry.jungle_timber);
        simpleBlock(BlockRegistry.acacia_timber);
        simpleBlock(BlockRegistry.dark_oak_timber);

        simpleBlock(BlockRegistry.wattle_and_daub,
                new ConfiguredModel(models().cubeAll("daub_cob0", modBlockTexture("daub_cob/daub_cob0"))),
                new ConfiguredModel(models().cubeAll("daub_cob1", modBlockTexture("daub_cob/daub_cob1"))));

        simpleBlock(BlockRegistry.wicker);
        simpleBlock(BlockRegistry.oak_wood_shakes);
        simpleBlock(BlockRegistry.birch_wood_shakes);
        simpleBlock(BlockRegistry.jungle_wood_shakes);
        simpleBlock(BlockRegistry.spruce_wood_shakes);
        simpleBlock(BlockRegistry.acacia_wood_shakes);
        simpleBlock(BlockRegistry.dark_oak_wood_shakes);

        verticalFence(BlockRegistry.vertical_oak_fence, Blocks.OAK_FENCE);
        verticalFence(BlockRegistry.vertical_spruce_fence, Blocks.SPRUCE_FENCE);
        verticalFence(BlockRegistry.vertical_birch_fence, Blocks.BIRCH_FENCE);
        verticalFence(BlockRegistry.vertical_jungle_fence, Blocks.JUNGLE_FENCE);
        verticalFence(BlockRegistry.vertical_acacia_fence, Blocks.ACACIA_FENCE);
        verticalFence(BlockRegistry.vertical_dark_oak_fence, Blocks.DARK_OAK_FENCE);

        slabs();
        stairs();
        walls();

    }

    protected void slabs() {
        //side textures should be adobe2
        ModelFile modelFile2 = models().slab("adobe_slab",modBlockTexture("adobe0"),modBlockTexture("adobe0"),modBlockTexture("adobe2"));

        slabBlock(BlockRegistry.adobe_slab,modelFile2,modelFile2,modelFile2);

        simpleSlab(BlockRegistry.chalk_slab);
        simpleSlab(BlockRegistry.cinder_slab);
        simpleSlab(BlockRegistry.cob_slab);
        simpleSlab(BlockRegistry.concrete_slab);

        ModelFile modelFile3 = models().slab("cordwood_slab",modBlockTexture("cordwood_side"),modBlockTexture("cordwood1"),modBlockTexture("cordwood1_back"));

        slabBlock(BlockRegistry.cordwood_slab,modelFile3,modelFile3,modelFile3);

        ModelFile modelFile4 = models().slab("dry_fitted_stone_slab",
                modBlockTexture("dry_fitted_stone0"),
                modBlockTexture("dry_fitted_stone0"),
                modBlockTexture("dry_fitted_stone0"));

        slabBlock(BlockRegistry.dry_fitted_stone_slab,modelFile4,modelFile4,modelFile4);

        slabGabions();

        simpleSlab(BlockRegistry.mud_slab);

        verticalSlab(BlockRegistry.vertical_oak_slab,Blocks.OAK_PLANKS);
        verticalSlab(BlockRegistry.vertical_spruce_slab,Blocks.SPRUCE_PLANKS);
        verticalSlab(BlockRegistry.vertical_birch_slab,Blocks.BIRCH_PLANKS);
        verticalSlab(BlockRegistry.vertical_jungle_slab,Blocks.JUNGLE_PLANKS);
        verticalSlab(BlockRegistry.vertical_acacia_slab,Blocks.ACACIA_PLANKS);
        verticalSlab(BlockRegistry.vertical_dark_oak_slab,Blocks.DARK_OAK_PLANKS);

        simpleSlab(BlockRegistry.lath_and_plaster_slab);
        simpleSlab(BlockRegistry.rammed_earth_slab);

        //half variants need 180 y rotation and the side texture on top
        ModelFile modelFile6 = models().slab("reed_slab",modBlockTexture("reed_top"),
                modBlockTexture("reed_side"),modBlockTexture("reed_top"));

        slabBlock(BlockRegistry.reed_slab,modelFile6,modelFile6,modelFile6);

        simpleSlab(BlockRegistry.blue_slate_slab);
        simpleSlab(BlockRegistry.green_slate_slab);
        simpleSlab(BlockRegistry.purple_slate_slab);
        simpleSlab(BlockRegistry.polished_blue_slate_slab);
        simpleSlab(BlockRegistry.polished_green_slate_slab);
        simpleSlab(BlockRegistry.polished_purple_slate_slab);
        simpleSlab(BlockRegistry.blue_slate_shingles_slab);
        simpleSlab(BlockRegistry.green_slate_shingles_slab);
        simpleSlab(BlockRegistry.purple_slate_shingles_slab);
        simpleSlab(BlockRegistry.blue_slate_tiles_slab);
        simpleSlab(BlockRegistry.green_slate_tiles_slab);
        simpleSlab(BlockRegistry.purple_slate_tiles_slab);

        ModelFile modelFile7 = models().slab("thatch_slab",modBlockTexture("thatch_top"),
                modBlockTexture("thatch1"),modBlockTexture("thatch_top"));

        slabBlock(BlockRegistry.thatch_slab,modelFile7,modelFile7,modelFile7);

        simpleSlab(BlockRegistry.oak_timber_slab);
        simpleSlab(BlockRegistry.birch_timber_slab);
        simpleSlab(BlockRegistry.spruce_timber_slab);
        simpleSlab(BlockRegistry.jungle_timber_slab);
        simpleSlab(BlockRegistry.acacia_timber_slab);
        simpleSlab(BlockRegistry.dark_oak_timber_slab);

        simpleSlab(BlockRegistry.wattle_and_daub_slab,modBlockTexture("daub_cob/daub_cob0"));

        simpleSlab(BlockRegistry.wicker_slab);
        simpleSlab(BlockRegistry.oak_wood_shakes_slab);
        simpleSlab(BlockRegistry.spruce_wood_shakes_slab);
        simpleSlab(BlockRegistry.birch_wood_shakes_slab);
        simpleSlab(BlockRegistry.jungle_wood_shakes_slab);
        simpleSlab(BlockRegistry.acacia_wood_shakes_slab);
        simpleSlab(BlockRegistry.dark_oak_wood_shakes_slab);
    }

    protected void stairs() {
        stairsBlock(BlockRegistry.adobe_stairs,modBlockTexture("adobe0"));
        simpleStairs(BlockRegistry.chalk_stairs);
        simpleStairs(BlockRegistry.cinder_stairs);
        simpleStairs(BlockRegistry.cob_stairs);
        simpleStairs(BlockRegistry.concrete_stairs);
        stairsBlock(BlockRegistry.cordwood_stairs,modBlockTexture("cordwood0"));
        stairsBlock(BlockRegistry.dry_fitted_stone_stairs,modBlockTexture("dry_fitted_stone0"));

        stairGabions();

        simpleStairs(BlockRegistry.mud_stairs);
        simpleStairs(BlockRegistry.vertical_oak_stairs);
        simpleStairs(BlockRegistry.vertical_spruce_stairs);
        simpleStairs(BlockRegistry.vertical_birch_stairs);
        simpleStairs(BlockRegistry.vertical_jungle_stairs);
        simpleStairs(BlockRegistry.vertical_acacia_stairs);
        simpleStairs(BlockRegistry.vertical_dark_oak_stairs);
        simpleStairs(BlockRegistry.lath_and_plaster_stairs);
        simpleStairs(BlockRegistry.rammed_earth_stairs);
        stairsBlock(BlockRegistry.reed_stairs,modBlockTexture("reed_side"));
        simpleStairs(BlockRegistry.blue_slate_stairs);
        simpleStairs(BlockRegistry.green_slate_stairs);
        simpleStairs(BlockRegistry.purple_slate_stairs);
        simpleStairs(BlockRegistry.polished_blue_slate_stairs);
        simpleStairs(BlockRegistry.polished_green_slate_stairs);
        simpleStairs(BlockRegistry.polished_purple_slate_stairs);
        simpleStairs(BlockRegistry.blue_slate_shingles_stairs);
        simpleStairs(BlockRegistry.green_slate_shingles_stairs);
        simpleStairs(BlockRegistry.purple_slate_shingles_stairs);
        simpleStairs(BlockRegistry.blue_slate_tiles_stairs);
        simpleStairs(BlockRegistry.green_slate_tiles_stairs);
        simpleStairs(BlockRegistry.purple_slate_tiles_stairs);
        stairsBlock(BlockRegistry.thatch_stairs,modBlockTexture("thatch0_side"));
        simpleStairs(BlockRegistry.oak_timber_stairs);
        simpleStairs(BlockRegistry.birch_timber_stairs);
        simpleStairs(BlockRegistry.spruce_timber_stairs);
        simpleStairs(BlockRegistry.jungle_timber_stairs);
        simpleStairs(BlockRegistry.acacia_timber_stairs);
        simpleStairs(BlockRegistry.dark_oak_timber_stairs);
        stairsBlock(BlockRegistry.wattle_and_daub_stairs, modBlockTexture("daub_cob/daub_cob0"));
        simpleStairs(BlockRegistry.wicker_stairs);
        simpleStairs(BlockRegistry.oak_wood_shakes_stairs);
        simpleStairs(BlockRegistry.spruce_wood_shakes_stairs);
        simpleStairs(BlockRegistry.birch_wood_shakes_stairs);
        simpleStairs(BlockRegistry.jungle_wood_shakes_stairs);
        simpleStairs(BlockRegistry.acacia_wood_shakes_stairs);
        simpleStairs(BlockRegistry.dark_oak_wood_shakes_stairs);
    }

    protected void walls() {
        wallBlock(BlockRegistry.adobe_wall, modBlockTexture("adobe0"));
        simpleWall(BlockRegistry.chalk_wall);
        simpleWall(BlockRegistry.cinder_wall);
        simpleWall(BlockRegistry.cob_wall);
        simpleWall(BlockRegistry.concrete_wall);

        wallBlock(BlockRegistry.cordwood_wall,modBlockTexture("cordwood1"));

        wallBlock(BlockRegistry.dry_fitted_stone_wall,modBlockTexture("dry_fitted_stone0"));

        wallGabions();

        simpleWall(BlockRegistry.mud_wall);
        simpleWall(BlockRegistry.lath_and_plaster_wall);
        simpleWall(BlockRegistry.rammed_earth_wall);

        wallBlock(BlockRegistry.reed_wall,"reed_wall",modBlockTexture("reed_side"));


        simpleWall(BlockRegistry.blue_slate_wall);
        simpleWall(BlockRegistry.green_slate_wall);
        simpleWall(BlockRegistry.purple_slate_wall);
        simpleWall(BlockRegistry.polished_blue_slate_wall);
        simpleWall(BlockRegistry.polished_green_slate_wall);
        simpleWall(BlockRegistry.polished_purple_slate_wall);
        simpleWall(BlockRegistry.blue_slate_shingles_wall);
        simpleWall(BlockRegistry.green_slate_shingles_wall);
        simpleWall(BlockRegistry.purple_slate_shingles_wall);
        simpleWall(BlockRegistry.blue_slate_tiles_wall);
        simpleWall(BlockRegistry.green_slate_tiles_wall);
        simpleWall(BlockRegistry.purple_slate_tiles_wall);

        wallBlock(BlockRegistry.thatch_wall,"thatch_wall",modBlockTexture("thatch0_side"));


        simpleWall(BlockRegistry.oak_timber_wall);
        simpleWall(BlockRegistry.birch_timber_wall);
        simpleWall(BlockRegistry.spruce_timber_wall);
        simpleWall(BlockRegistry.jungle_timber_wall);
        simpleWall(BlockRegistry.acacia_timber_wall);
        simpleWall(BlockRegistry.dark_oak_timber_wall);
        wallBlock(BlockRegistry.wattle_and_daub_wall,modBlockTexture("daub_cob/daub_cob0"));
        simpleWall(BlockRegistry.wicker_wall);
        simpleWall(BlockRegistry.oak_wood_shakes_wall);
        simpleWall(BlockRegistry.spruce_wood_shakes_wall);
        simpleWall(BlockRegistry.birch_wood_shakes_wall);
        simpleWall(BlockRegistry.jungle_wood_shakes_wall);
        simpleWall(BlockRegistry.acacia_wood_shakes_wall);
        simpleWall(BlockRegistry.dark_oak_wood_shakes_wall);
    }

    protected void slabGabions() {
        SlabBlock[] blocks = new SlabBlock[]{BlockRegistry.GRAVEL_GABION_SLAB, BlockRegistry.SAND_GABION_SLAB, BlockRegistry.DIRT_GABION_SLAB};

        for (SlabBlock block : blocks) {
            String path = block.getRegistryName().getPath();
            String name = path.substring(0,path.length() - "_gabion_slab".length());
            ModelFile bottom = models().slab(path,modBlockTexture("gabion_bottom"),
                    modBlockTexture("gabion_side"),modBlockTexture(name + "_gabion_top"));

            ModelFile top = models().slab(path+"_top",modBlockTexture("gabion_bottom"),
                    modBlockTexture("gabion_side"),modBlockTexture(name + "_gabion_top"));

            ModelFile doubleSlab = models().getExistingFile(modBlockTexture(name+"_gabion"));

            slabBlock(block,bottom,top,doubleSlab);
        }
    }

    protected void stairGabions() {
        StairsBlock[] blocks = new StairsBlock[]{BlockRegistry.GRAVEL_GABION_STAIRS, BlockRegistry.SAND_GABION_STAIRS, BlockRegistry.DIRT_GABION_STAIRS};

        for (StairsBlock block : blocks) {
            String path = block.getRegistryName().getPath();
            String name = path.substring(0,path.length() - "_gabion_stairs".length());

            ModelFile stairs = models().withExistingParent(path,modBlockTexture("stairs"));

            ModelFile inner = models().withExistingParent(path,modBlockTexture("inner_stairs"));

            ModelFile outer = models().withExistingParent(path,modBlockTexture("outer_stairs"));

            stairsBlock(block,stairs,inner,outer);
        }
    }

    protected void cubeColumn(Block block) {
        String path = block.getRegistryName().getPath();
        BlockModelBuilder blockModelBuilder = models().cubeColumn(path, modBlockTexture(path), modBlockTexture(path + "_top"));
        getVariantBuilder(block).partialState().addModels(ConfiguredModel.builder().modelFile(blockModelBuilder).build());
    }

    protected void gabions() {
        Block[] blocks = new Block[]{BlockRegistry.GRAVEL_GABION, BlockRegistry.SAND_GABION, BlockRegistry.DIRT_GABION};
        for (Block block : blocks) {
            String path = block.getRegistryName().getPath();
            BlockModelBuilder blockModelBuilder = models().cubeBottomTop(path, modBlockTexture("gabion_side"), modBlockTexture("gabion_bottom"), modBlockTexture(path + "_top"));
            getVariantBuilder(block).partialState().addModels(ConfiguredModel.builder().modelFile(blockModelBuilder).build());
        }
    }

    protected void wallGabions() {
        WallBlock[] blocks = new WallBlock[]{BlockRegistry.GRAVEL_GABION_WALL,BlockRegistry.SAND_GABION_WALL,BlockRegistry.DIRT_GABION_WALL};
        for (WallBlock block : blocks) {
            String path = block.getRegistryName().getPath();
            ModelFile post = models().withExistingParent(path+"_post",modBlockTexture("wall_post"));
            ModelFile side = models().withExistingParent(path+"_side",modBlockTexture("wall_side"));
            ModelFile sideTall = models().withExistingParent(path+"_side_tall",mcBlockTexture("template_wall_side_tall"));
            wallBlock(block,post,side,sideTall);
        }
    }

    protected void makeVariantBlockState(Block block, int variants) {

        List<ModelFile> files = new ArrayList<>();
        String path = block.getRegistryName().getPath();

        for (int i = 0; i < variants; i++) {
            ModelFile modelFile = models().cubeAll(path + i, modBlockTexture(path + i));
            files.add(modelFile);
        }

        getVariantBuilder(block).partialState().addModels(collectAndBuild(files));
    }

    //avoids creating a long builder chain
    protected ConfiguredModel[] collectAndBuild(List<ModelFile> modelFiles) {
        ConfiguredModel.Builder<?> builder = ConfiguredModel.builder();
        for (int i = 0; i < modelFiles.size() - 2; i++) {
            ModelFile modelFile = modelFiles.get(i);
            builder.modelFile(modelFile).nextModel();
        }
        return builder.modelFile(modelFiles.get(modelFiles.size() - 1)).build();
    }

    protected void cordwood() {
        ModelFile modelFile0 = models().cubeColumnHorizontal("cordwood0", modBlockTexture("cordwood0"), modBlockTexture("cordwood0_top"));
        ModelFile modelFile1 = models().cubeColumnHorizontal("cordwood1", modBlockTexture("cordwood1"), modBlockTexture("cordwood1_top"));
        ModelFile modelFile2 = models().cubeColumnHorizontal("cordwood2", modBlockTexture("cordwood2"), modBlockTexture("cordwood2_top"));

        Direction[] horizontals = new Direction[]{Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};

        VariantBlockStateBuilder builder = getVariantBuilder(BlockRegistry.cordwood);
        for (int i = 0; i < 4; i++) {
            Direction horizontal = horizontals[i];
            builder.partialState().with(HorizontalBlock.HORIZONTAL_FACING, horizontal).addModels(
                    ConfiguredModel.builder().modelFile(modelFile0).rotationY(i * 90).nextModel()
                            .modelFile(modelFile1).rotationY(i * 90).nextModel()
                            .modelFile(modelFile2).rotationY(i * 90).build()
            );
        }
    }

    public ResourceLocation modBlockTexture(String name) {
        return new ResourceLocation(Earthworks.mod_id, BLOCK_FOLDER + "/" + name);
    }

    public ResourceLocation mcBlockTexture(String name) {
        return new ResourceLocation(BLOCK_FOLDER + "/" + name);
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
        BlockModelBuilder blockModelBuilder = models().withExistingParent(block.getRegistryName().getPath(),
                new ResourceLocation(Earthworks.mod_id, "block/vertical_planks")).texture("all", blockTexture(from));
        getVariantBuilder(block).forAllStates(state -> ConfiguredModel.builder().modelFile(blockModelBuilder).build());
    }


    protected void verticalFence(Block block, Block from) {
        String tex = from.getRegistryName().getPath().substring(0, from.getRegistryName().getPath().length() - "_fence".length()) + "_planks";
        BlockModelBuilder builderPost = models().withExistingParent(block.getRegistryName().getPath() + "_post",
                new ResourceLocation(Earthworks.mod_id, "block/vertical_fence_post")).texture("texture", mcBlockTexture(tex));

        BlockModelBuilder builderSide = models().withExistingParent(block.getRegistryName().getPath() + "_side",
                new ResourceLocation(Earthworks.mod_id, "block/vertical_fence_side")).texture("texture", mcBlockTexture(tex));

        getMultipartBuilder(block)
                .part().modelFile(builderPost).addModel().end()
                .part().modelFile(builderSide).uvLock(true).addModel().condition(FenceBlock.NORTH, true).end()
                .part().modelFile(builderSide).uvLock(true).rotationY(90).addModel().condition(FenceBlock.EAST, true).end()
                .part().modelFile(builderSide).uvLock(true).rotationY(180).addModel().condition(FenceBlock.SOUTH, true).end()
                .part().modelFile(builderSide).uvLock(true).rotationY(270).addModel().condition(FenceBlock.WEST, true).end();
    }

    protected void verticalSlab(SlabBlock block,Block from) {
        String tex = from.getRegistryName().getPath();

        BlockModelBuilder bottom = models().withExistingParent(block.getRegistryName().getPath(),
                new ResourceLocation(Earthworks.mod_id, "block/vertical_slab")).texture("texture", mcBlockTexture(tex));

        BlockModelBuilder top = models().withExistingParent(block.getRegistryName().getPath() + "_top",
                new ResourceLocation(Earthworks.mod_id, "block/vertical_slab_top")).texture("texture", mcBlockTexture(tex));

        BlockModelBuilder doubleT = models().withExistingParent(block.getRegistryName().getPath().substring(0,block.getRegistryName().getPath().length() - "_slab".length()),
                new ResourceLocation(Earthworks.mod_id, "block/vertical_"+tex)).texture("texture", mcBlockTexture(tex));

        getVariantBuilder(block).forAllStates(state -> {
            SlabType type = state.get(SlabBlock.TYPE);
            switch (type) {
                case TOP:return ConfiguredModel.builder().modelFile(top).build();
                case BOTTOM:return ConfiguredModel.builder().modelFile(bottom).build();
                default:case DOUBLE:return ConfiguredModel.builder().modelFile(doubleT).build();
            }
        });

    }

    private String name(Block block) {
        return block.getRegistryName().getPath();
    }

    protected void simpleSlab(SlabBlock block) {

        ResourceLocation id = block.getRegistryName();

        String slabPath = id.getPath().substring(0, id.getPath().length() - "_slab".length());

        Block original = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(id.getNamespace(), slabPath));

        if (original == Blocks.AIR) {
            System.out.println("No original block found for " + id + " guessed " + slabPath);
            return;
        }
        simpleSlab(block,blockTexture(original));
    }

    protected void simpleSlab(SlabBlock block,ResourceLocation texture) {
        slabBlock(block, block.getRegistryName(), texture);
    }

    protected void simpleStairs(StairsBlock block) {
        ResourceLocation id = block.getRegistryName();

        String stairsPath = id.getPath().substring(0, id.getPath().length() - "_stairs".length());

        Block original = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(id.getNamespace(), stairsPath));

        if (original == Blocks.AIR) {
            System.out.println("No original block found for " + id + " tried " + stairsPath);
            return;
        }

        stairsBlock(block, new ResourceLocation(id.getNamespace(), "block/" + original.getRegistryName().getPath()));
    }

    protected void simpleWall(WallBlock block) {
        ResourceLocation id = block.getRegistryName();

        String stairsPath = id.getPath().substring(0, id.getPath().length() - "_wall".length());

        Block original = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(id.getNamespace(), stairsPath));

        if (original == Blocks.AIR) {
            System.out.println("No original block found for " + id + " tried " + stairsPath);
            return;
        }

        wallBlock(block, new ResourceLocation(id.getNamespace(), "block/" + original.getRegistryName().getPath()));
    }

}
