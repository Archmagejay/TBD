package tbd.geology.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import tbd.TBDGeology;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class ItemCrystals extends Item{

    private Icon iconArray[];    
    private int tier;
    
    public ItemCrystals(int id, int tier) {
        super(id);
        setHasSubtypes(true);
        setCreativeTab(TBDGeology.itemCrystalsT0Tab);
        setMaxDamage(0);
        setUnlocalizedName("tbdGeoCrystals");
        setTextureName("tbdGeology:items");
        this.tier = tier;
    }
    
    public Icon getIconFromDamage(int meta){
        switch (tier) {
            case 1 : 
               if (meta == 1) {
                   return iconArray[1];
               }
            break;

            default : 
                return null;
        }
        return null;
    }
    

    @SuppressWarnings("rawtypes")
    @SideOnly(Side.CLIENT)
    public void getSubItems(int u, CreativeTabs tab, List subItems){
        
    }
}
