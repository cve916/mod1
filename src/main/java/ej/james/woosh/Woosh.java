package ej.james.woosh;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Woosh.MODID, name = Woosh.NAME, version = Woosh.VERSION)
public class Woosh {
    public static final String MODID = "woosh";
    public static final String NAME = "Whoosh Mod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "", serverSide = "")
    public static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.postInit(event);
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
        proxy.postInit(event);

    }
}
