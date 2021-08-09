package alsender.earthworks.main;

import alsender.earthworks.block.*;
import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.ItemRegistry;
import alsender.earthworks.main.registry.TimberRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.lang.reflect.Field;

/**
 * Created by alsender on 12/12/16.
 */
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy {

     public static void initBlockModels() {
         Field[] fields = BlockRegistry.class.getFields();

         for (Field field : fields) {
             try {
                 if (field.get(null) instanceof Block) {
                     makeModel((Block) field.get(null));
                 }
             } catch (IllegalAccessException e) {
                 e.printStackTrace();
             }
         }
     }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        initBlockModels();
        TimberRegistry.initModels();
        ItemRegistry.initModels();
    }

    private static void makeModel(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

}
