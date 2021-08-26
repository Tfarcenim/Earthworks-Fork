package alsender.earthworks.datagen.assets;

import alsender.earthworks.main.registry.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import org.codehaus.plexus.util.StringUtils;

public class ModLangProvider extends LanguageProvider {
    public ModLangProvider(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    @Override
    protected void addTranslations() {
        for (Item item : ItemRegistry.getAllItems()) {
            add(item.getTranslationKey(), getNameFromItem(item));
        }
    }

    public static String getNameFromItem(Item item) {
        return StringUtils.capitaliseAllWords(item.getTranslationKey().split("\\.")[2].replace("_", " "));
    }
}
