package alsender.earthworks.main.registry;


import alsender.earthworks.block.timber.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 13/01/17.
 */
@Mod.EventBusSubscriber
public class TimberRegistry {

    public static Block
            daub_cob_arrow0;
    public static Block daub_cob_arrow1;
    public static Block daub_cob_arrow2;
    public static Block daub_cob_arrow3;
    public static Block daub_cob_barndoor0;
    public static Block daub_cob_barndoor1;
    public static Block daub_cob_barndoor2;
    public static Block daub_cob_barndoor3;
    public static Block daub_cob_barndoor4;
    public static Block daub_cob_barndoor5;
    public static Block daub_cob_barndoor6;
    public static Block daub_cob_barndoor7;
    public static Block daub_cob_bottom_l;
    public static Block daub_cob_bottom;
    public static Block daub_cob_bottom_r;
    public static Block daub_cob_left;
    public static Block daub_cob_right;
    public static Block daub_cob_parallel_hor;
    public static Block daub_cob_parallel_vert;
    public static Block daub_cob_slash_back;
    public static Block daub_cob_slash;
    public static Block daub_cob_square;
    public static Block daub_cob_square_x;
    public static Block daub_cob_x;
    public static Block daub_cob_top_l;
    public static Block daub_cob_top;
    public static Block daub_cob_top_r;
    public static Block daub_cob_triangle0;
    public static Block daub_cob_triangle1;
    public static Block daub_cob_triangle2;
    public static Block daub_cob_triangle3;
    public static Block daub_cob_xbottom;
    public static Block daub_cob_xleft;
    public static Block daub_cob_xright;
    public static Block daub_cob_xtop;
    public static Block daub_cob_xdoor0;
    public static Block daub_cob_xdoor1;
    public static Block daub_cob_xdoor2;
    public static Block daub_cob_xdoor3;

    public static Block
            plaster_arrow0;
    public static Block plaster_arrow1;
    public static Block plaster_arrow2;
    public static Block plaster_arrow3;
    public static Block plaster_barndoor0;
    public static Block plaster_barndoor1;
    public static Block plaster_barndoor2;
    public static Block plaster_barndoor3;
    public static Block plaster_barndoor4;
    public static Block plaster_barndoor5;
    public static Block plaster_barndoor6;
    public static Block plaster_barndoor7;
    public static Block plaster_bottom_l;
    public static Block plaster_bottom;
    public static Block plaster_bottom_r;
    public static Block plaster_left;
    public static Block plaster_right;
    public static Block plaster_parallel_hor;
    public static Block plaster_parallel_vert;
    public static Block plaster_slash_back;
    public static Block plaster_slash;
    public static Block plaster_square;
    public static Block plaster_square_x;
    public static Block plaster_x;
    public static Block plaster_top_l;
    public static Block plaster_top;
    public static Block plaster_top_r;
    public static Block plaster_triangle0;
    public static Block plaster_triangle1;
    public static Block plaster_triangle2;
    public static Block plaster_triangle3;
    public static Block plaster_xbottom;
    public static Block plaster_xleft;
    public static Block plaster_xright;
    public static Block plaster_xtop;
    public static Block plaster_xdoor0;
    public static Block plaster_xdoor1;
    public static Block plaster_xdoor2;
    public static Block plaster_xdoor3;

    public static void initBlocks(RegistryEvent.Register<Block> event) {
        daub_cob_arrow0 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Framed Arrow",0);
        daub_cob_arrow1 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Framed Arrow",1);
        daub_cob_arrow2 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Framed Arrow",2);
        daub_cob_arrow3 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Framed Arrow",3);
        daub_cob_barndoor0 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower Left Barndoor",4);
        daub_cob_barndoor1 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways Barndoor",5);
        daub_cob_barndoor2 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways Barndoor",6);
        daub_cob_barndoor3 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper Left Barndoor",7);
        daub_cob_barndoor4 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower Right Barndoor",8);
        daub_cob_barndoor5 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways Barndoor",9);
        daub_cob_barndoor6 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways Barndoor",10);
        daub_cob_barndoor7 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper Right Barndoor",11);
        daub_cob_bottom_l = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Framed",12);
        daub_cob_bottom = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Framed",13);
        daub_cob_bottom_r = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Framed",14);
        daub_cob_left = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Framed",15);
        daub_cob_parallel_hor = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Parallel Horizontals",16);
        daub_cob_parallel_vert = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Parallel Verticals",17);
        daub_cob_right = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Framed",18);
        daub_cob_slash_back = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"\\ Diagonal",19);
        daub_cob_slash = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"/ Diagonal",20);
        daub_cob_square = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Square Framed",21);
        daub_cob_square_x = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Square Framed X",22);
        daub_cob_top_l = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Framed",23);
        daub_cob_top = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Framed",24);
        daub_cob_top_r = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Framed",25);
        daub_cob_triangle0 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Triangle",26);
        daub_cob_triangle1 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Triangle",27);
        daub_cob_triangle2 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Triangle",28);
        daub_cob_triangle3 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Triangle",29);
        daub_cob_xbottom = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottomless Framed",30);
        daub_cob_xdoor0 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower X Framed Barndoor",31);
        daub_cob_xdoor1 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways X Framed Barndoor",32);
        daub_cob_xdoor2 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways X Framed Barndoor",33);
        daub_cob_xdoor3 = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper X Framed Barndoor",34);
        daub_cob_xleft = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left-less Framed",35);
        daub_cob_x = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Frame-less X",36);
        daub_cob_xright = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right-less Framed",37);
        daub_cob_xtop = new Daub_Cob(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Topless Framed",38);

        //Material.ROCK, SoundType.WOOD, 3.0F, 7.5F

        plaster_arrow0 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Framed Arrow",0);
        plaster_arrow1 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Framed Arrow",1);
        plaster_arrow2 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Framed Arrow",2);
        plaster_arrow3 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Framed Arrow",3);
        plaster_barndoor0 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower Left Barndoor",4);
        plaster_barndoor1 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways Barndoor",5);
        plaster_barndoor2 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways Barndoor",6);
        plaster_barndoor3 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper Left Barndoor",7);
        plaster_barndoor4 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower Right Barndoor",8);
        plaster_barndoor5 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways Barndoor",9);
        plaster_barndoor6 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways Barndoor",10);
        plaster_barndoor7 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper Right Barndoor",11);
        plaster_bottom_l = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Framed",12);
        plaster_bottom = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Framed",13);
        plaster_bottom_r = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Framed",14);
        plaster_left = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Framed",15);
        plaster_parallel_hor = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Parallel Horizontals",16);
        plaster_parallel_vert = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Parallel Verticals",17);
        plaster_right = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Framed",18);
        plaster_slash_back = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"\\ Diagonal",19);
        plaster_slash = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"/ Diagonal",20);
        plaster_square = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Square Framed",21);
        plaster_square_x = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Square Framed X",22);
        plaster_top_l = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Framed",23);
        plaster_top = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Framed",24);
        plaster_top_r = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Framed",25);
        plaster_triangle0 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Left Triangle",26);
        plaster_triangle1 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Left Triangle",27);
        plaster_triangle2 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottom Right Triangle",28);
        plaster_triangle3 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Top Right Triangle",29);
        plaster_xbottom = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Bottomless Framed",30);
        plaster_xdoor0 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Lower X Framed Barndoor",31);
        plaster_xdoor1 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right Sideways X Framed Barndoor",32);
        plaster_xdoor2 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left Sideways X Framed Barndoor",33);
        plaster_xdoor3 = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Upper X Framed Barndoor",34);
        plaster_xleft = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Left-less Framed",35);
        plaster_x = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Frame-less X",36);
        plaster_xright = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Right-less Framed",37);
        plaster_xtop = new Plaster(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.WOOD).hardnessAndResistance(1.5F, 10.0F),"Topless Framed",38);
    }

}