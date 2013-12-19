package tbd;

import tbd.core.blocks.TbdMultiDirtBlock;
import tbd.core.blocks.TbdMultiDirtItemBlock;
import tbd.core.blocks.TbdMultiGrassBlock;
import tbd.core.items.TbdItem1;
import tbd.core.lib.Reference;
import tbd.core.proxy.CommonProxy;
import tbd.core.creativetab.TBDCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID + "|Core", name = Reference.MOD_NAME + "|Core", version = Reference.VERSION)
@NetworkMod (clientSideRequired = true)

public class TBDCore {
    
    //public static CreativeTabs test1 = (new TBDCreativeTab(CreativeTabs.getNextID(), "tbdcore1", Block.bedrock, null));
    //public static CreativeTabs test2 = (new TBDCreativeTab(CreativeTabs.getNextID(), "tbdcore2", null, Item.skull));
    
    //Items
    public static final Item tbdItem1 = new TbdItem1(5000).setUnlocalizedName("tbdItem1").setTextureName("tbdCore:tbdTester");
    public static final Item tbdIngot1 = new TbdItem1(5001).setMaxStackSize(16).setUnlocalizedName("tbdIngot1").setTextureName("tbdCore:tbdIngot1");
        
    //Dirts
    public static final String[] multiDirt1Names = {
        "Damp Dirt", "Corrupted Dirt", "Hallowed dirt", "Trampled Dirt",
        "Rainforest Mulch", "Placeholder", "Placeholder1", "Placeholder2",
        "Placeholder3", "Placeholder4", "Placeholder5" ,"Placeholder6",
        "Placeholder7", "Placeholder8", "Placeholder9", "Placeholder10"
    };
    
    public static final Block tbdDirtBlock1 = new TbdMultiDirtBlock(500);
    
    //Grasses
    public static final Block tbdGrassBlock1 = new TbdMultiGrassBlock(516).setUnlocalizedName("tbdGrass1");
    //Ores
        
    @Instance (Reference.MOD_ID + "|Core")
    public static TBDCore instance;
    
    @SidedProxy (clientSide = Reference.CLIENT_SIDE_PROXY, serverSide = Reference.SERVER_SIDE_PROXY)
    public static CommonProxy proxy;
    /***
     * This is code that is executed prior to your mod being initialized into of Minecraft
     * Examples of code that could be run here;
     * 
     * Initializing your items/blocks (you must do this here)
     * Setting up your own custom logger for writing log data to
     * Loading your language translations for your mod (if your mod has translations for other languages)
     * Registering your mod's key bindings and sounds
     * 
     * @param event The Forge ModLoader pre-initialization event
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        
    }
    
    /**
     * This just saves me a tiny bit of typing... I'm so lazy...
     * 
     * @param id The objects declared name
     * @param name The name you want to display in-game
     */
    public void regName(Object id, String name){
        LanguageRegistry.addName(id, name);
    }
    
    public void regBlock(Block id, String name){
        GameRegistry.registerBlock(id, name);
    }
    
    /***
     * This is code that is executed when your mod is being initialized in Minecraft
     * Examples of code that could be run here;
     * 
     * Registering your GUI Handler
     * Registering your different event listeners
     * Registering your different tile entities
     * Adding in any recipes you have 
     * 
     * @param event The Forge ModLoader initialization event
     */
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerRenderers();
        regName(tbdItem1, "The first Item");
        regName(tbdIngot1, "Testing ingot");
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.tbdcore1", "en_US", "Testing 1");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tbdcore2", "en_US", "Testing 2");
        
        GameRegistry.registerBlock(tbdDirtBlock1, TbdMultiDirtItemBlock.class, "tbdDirt");
        for (int a = 0; a < 16; a++) {
            ItemStack wool = new ItemStack(Block.cloth, 1, a);
            ItemStack multiDirt = new ItemStack(tbdDirtBlock1, 1, a);            
            GameRegistry.addShapelessRecipe(multiDirt, wool, wool);
            
            LanguageRegistry.addName(new ItemStack(tbdDirtBlock1, 1, a), multiDirt1Names[multiDirt.getItemDamage()]);
        }
        
        MinecraftForge.setBlockHarvestLevel(tbdDirtBlock1, "shovel", 0);
        
    }
    
    /***
     * This is code that is executed after all mods are initialized in Minecraft
     * This is a good place to execute code that interacts with other mods (ie, loads an addon module
     * of your mod if you find a particular mod).
     * 
     * @param event The Forge ModLoader post-initialization event
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if (Loader.isModLoaded("")){
            
        }
    }
}
