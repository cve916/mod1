package ej.james.woosh.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabWoosh extends CreativeTabs
{
    public CreativeTabWoosh(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.STICK);
    }
}
