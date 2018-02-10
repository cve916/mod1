package ej.james.woosh.items;


import ej.james.woosh.Woosh;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class BaseItem extends Item
{

    protected String name;

    public BaseItem(String name, CreativeTabs tab)
    {
        //this(name,tab,64);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    /*
    public  BaseItem(String name, CreativeTabs tab, int max)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setMaxDamage(max);

        ItemInit.ITEMS.add(this);
    }
    */

    public void registerItemModel() {
        Woosh.proxy.registerItemRenderer(this, 0, name);
    }
}
