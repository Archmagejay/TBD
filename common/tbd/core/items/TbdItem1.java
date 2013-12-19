package tbd.core.items;

import tbd.TBDCore;
import tbd.core.creativetab.TBDCreativeTab;
import net.minecraft.item.Item;

public class TbdItem1 extends Item {

    public TbdItem1(int par1) {
        super(par1);
        setMaxStackSize(64);
        setCreativeTab(TBDCreativeTab.GEOLOGY.get());
        setUnlocalizedName("tbdItem1");
    }
}
