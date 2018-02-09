package ej.james.woosh.items;

import ej.james.woosh.Woosh;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{

    public static Item tutItem;

    public static void preInit()
    {
        tutItem = new Item().setUnlocalizedName("woosh_item").setCreativeTab(Woosh.wooshTab);
    }

    public static void registerItems()
    {
        
    }


}
