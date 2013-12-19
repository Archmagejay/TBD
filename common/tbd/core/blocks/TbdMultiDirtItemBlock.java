package tbd.core.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class TbdMultiDirtItemBlock extends ItemBlock{
    public static final String[] subNames = {
        "tbdDirt1", "tbdDirt2", "tbdDirt3", "tbdDirt4",
        "tbdDirt5", "tbdDirt6", "tbdDirt7", "tbdDirt8",
        "tbdDirt9", "tbdDirt10", "tbdDirt11", "tbdDirt12",
        "tbdDirt13", "tbdDirt14", "tbdDirt15", "tbdDirt16"
    };

    public TbdMultiDirtItemBlock(int id) {
        super(id);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damageValue){
        return damageValue;
    }
    
    @Override
    public String getUnlocalizedName(ItemStack is){
        return getUnlocalizedName() + "." + subNames[is.getItemDamage()];
    }
}
