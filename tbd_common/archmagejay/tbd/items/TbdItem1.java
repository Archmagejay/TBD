package archmagejay.tbd.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TbdItem1 extends Item {

    public TbdItem1(int par1) {
        super(par1);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("tbdItem1");
    }
}
