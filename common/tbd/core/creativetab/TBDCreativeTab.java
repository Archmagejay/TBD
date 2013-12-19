package tbd.core.creativetab;

import java.util.Locale;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public enum TBDCreativeTab {

    ASTRONOMY,
    FLORA,
    FAUNA,
    DIMENSIONAL,
    THAUMIC,
    GEOLOGY,
    TECH,
    EXPLORATION;
    
    private final CreativeTabs tab;
    
    private TBDCreativeTab() {
        tab = new Tab();
    }
    
    public CreativeTabs get() {
        return tab;
    }
    
    private String getLable() {
        return "tbd." + name().toLowerCase(Locale.ENGLISH);
    }
    
    private ItemStack getItem() {
        switch (this) {
            case GEOLOGY:
                return new ItemStack(Block.grass);
            default:
                return new ItemStack(Item.appleGold);
        }
    }
    
    private class Tab extends CreativeTabs {
        private Tab() {
            super(getLable());
        }
        
        @Override
        public ItemStack getIconItemStack() {
            return getItem();        
        }        
    }
    

}