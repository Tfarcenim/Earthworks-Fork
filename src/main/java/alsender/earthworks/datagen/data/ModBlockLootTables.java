package alsender.earthworks.datagen.data;

import alsender.earthworks.main.registry.ItemRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.item.Item;

import java.util.Random;

public class ModBlockLootTables extends BlockLootTables {

    public Item getItemDropped(BlockState state, Random random, int fortune) {
        return ItemRegistry.item_chalk;
    }

    public int quantityDropped(Random random) {
        return (3 + random.nextInt(2));
    }

    public int quantityDroppedWithBonus(int fortune, Random random) {
        return quantityDropped(random) + random.nextInt(fortune + 1);
    }

}
