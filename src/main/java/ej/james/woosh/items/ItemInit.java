package ej.james.woosh.items;

import ej.james.woosh.Woosh;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit
{

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item INGOT_COPPER = new BaseItem("ingot_copper", CreativeTabs.BUILDING_BLOCKS);
}
