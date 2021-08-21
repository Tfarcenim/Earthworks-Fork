package alsender.earthworks.main.registry;


import alsender.earthworks.item.ModItemTool;
import alsender.earthworks.main.Config;
import alsender.earthworks.main.Earthworks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 12/12/16.
 */
@Mod.EventBusSubscriber
public class ItemRegistry {

    public static Item
            item_adobe,
            item_cob,
            item_dirt,
            item_lime_plaster,
            item_mud,
            item_chalk,
            item_quicklime,
            item_sand,
            item_slaked_lime,
            item_timber;

    public static Item

            tool_square,
            tool_Acheulean,
            tool_adz,
            tool_compass,
            tool_froe,
            tool_planer,
            tool_level,
            tool_saw,

            tool_wood_hammer,
            tool_stone_hammer,
            tool_iron_hammer,
            tool_gold_hammer,
            tool_diamond_hammer;
    public static BlockItem
            itemslab_adobe;
    public static BlockItem itemslab_chalk;
    public static BlockItem itemslab_cinder;
    public static BlockItem itemslab_cob;
    public static BlockItem itemslab_concrete;
    public static BlockItem itemslab_cordwood;
    public static BlockItem itemslab_dry_stone;
    public static BlockItem itemslab_gabion0;
    public static BlockItem itemslab_gabion1;
    public static BlockItem itemslab_gabion2;
    public static BlockItem itemslab_mud;
    public static BlockItem itemslab_planks_vert0;
    public static BlockItem itemslab_planks_vert1;
    public static BlockItem itemslab_planks_vert2;
    public static BlockItem itemslab_planks_vert3;
    public static BlockItem itemslab_planks_vert4;
    public static BlockItem itemslab_planks_vert5;
    public static BlockItem itemslab_plaster;
    public static BlockItem itemslab_rammed_earth;
    public static BlockItem itemslab_reed;
    public static BlockItem itemslab_slate;
    public static BlockItem itemslab_slate_green;
    public static BlockItem itemslab_slate_purple;
    public static BlockItem itemslab_slate_slab;
    public static BlockItem itemslab_slate_slab_green;
    public static BlockItem itemslab_slate_slab_purple;
    public static BlockItem itemslab_slate_shingle;
    public static BlockItem itemslab_slate_shingle_verte;
    public static BlockItem itemslab_slate_shingle_purple;
    public static BlockItem itemslab_slate_tile;
    public static BlockItem itemslab_slate_tile_verte;
    public static BlockItem itemslab_slate_tile_purple;
    public static BlockItem itemslab_thatch;
    public static BlockItem itemslab_timber_oak;
    public static BlockItem itemslab_timber_birch;
    public static BlockItem itemslab_timber_spruce;
    public static BlockItem itemslab_timber_jungle;
    public static BlockItem itemslab_timber_acacia;
    public static BlockItem itemslab_timber_dark_oak;
    public static BlockItem itemslab_wattle;
    public static BlockItem itemslab_wicker;
    public static BlockItem itemslab_wood_shingle_oak;
    public static BlockItem itemslab_wood_shingle_spruce;
    public static BlockItem itemslab_wood_shingle_birch;
    public static BlockItem itemslab_wood_shingle_jungle;
    public static BlockItem itemslab_wood_shingle_acacia;
    public static BlockItem itemslab_wood_shingle_dark_oak;

    @SubscribeEvent
    public static void initItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        item_adobe = new ModItem(r, "adobe");
        item_chalk = new Item_Chalk(r);
        item_cob = new ModItem(r, "cob");
        item_lime_plaster = new ModItem(r, "lime_plaster");
        item_mud = new ModItem(r, "mud");
        item_quicklime = new ModItem(r, "quicklime");
        item_slaked_lime = new ModItem(r, "slaked_lime");
        item_timber = new ModItem(r, "timber");

        tool_square = new ModItemTool(new Item.Properties().group(Earthworks.creativeTab).maxDamage(60));
        tool_Acheulean = new ModItemTool(r, "hand_axe", 132);
        tool_adz = new ModItemTool(r, "adz",251);
        tool_compass = new ModItemTool(r, "compass",251);
        tool_froe = new ModItemTool(r, "froe", 251);
        tool_planer = new ModItemTool(r, "hand_planer", 251);
        tool_level = new ModItemTool(r, "level", 33);
        tool_saw = new ModItemTool(r, "saw", 1562);

        tool_wood_hammer = new ModItemTool(r, "wood_hammer", 60);
        tool_stone_hammer = new ModItemTool(r, "stone_hammer", 132);
        tool_iron_hammer = new ModItemTool(r, "iron_hammer", 251);
        tool_gold_hammer = new ModItemTool(r, "gold_hammer", 33);
        tool_diamond_hammer = new ModItemTool(r, "diamond_hammer", 1562);

        //  BETTER WITH MODS COMPAT //

        if (Config.betterwithmods) {
            item_dirt = new ModItem(r, "dirt");
            item_sand = new ModItem(r, "sand");
        }
    }
}
