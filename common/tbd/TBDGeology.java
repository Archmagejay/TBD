package tbd;

import net.minecraft.creativetab.CreativeTabs;
import tbd.core.proxy.CommonProxy;
import tbd.geology.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = Reference.MOD_ID + "|Geology", name = Reference.MOD_NAME + "|Geology", version = Reference.VERSION)
@NetworkMod(clientSideRequired = true)

public class TBDGeology {
    
    @Instance (Reference.MOD_ID + "|Geology")
    public static TBDGeology instance;
    
    @SidedProxy (clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
    public static CommonProxy proxy;
    
    public static final CreativeTabs itemCrystalsT0Tab = new CreativeTabs("TBD:Geo - Crystals T0");
    public static final CreativeTabs itemCrystalsT1Tab = new CreativeTabs("TBD:Geo - Crystals T1");
    public static final CreativeTabs itemCrystalsT2Tab = new CreativeTabs("TBD:Geo - Crystals T2");
    public static final CreativeTabs itemCrystalsT3Tab = new CreativeTabs("TBD:Geo - Crystals T3");
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(Reference.names.length);
        System.out.println(Reference.names[150]);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
