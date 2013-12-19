package tbd.core.blocks;

import java.util.List;

import tbd.core.creativetab.TBDCreativeTab;
import tbd.core.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class TbdMultiDirtBlock extends Block {
    private Icon iconArray[];

    public TbdMultiDirtBlock(int id) {
        super(id, Material.ground);
        setStepSound(Block.soundGravelFootstep);
        setCreativeTab(TBDCreativeTab.GEOLOGY.get());
        setHardness(0.5F);
        setUnlocalizedName(Reference.DIRT_1);
        setTextureName("tbdCore:dirts/tbdDirt");
    }
    
    public int damageDropped(int metadata) {
        return metadata;
    }

    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta){
        return this.iconArray[meta % this.iconArray.length];
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir){
        this.iconArray = new Icon[16];
        
        for (int a = 0; a < this.iconArray.length; a++){
            this.iconArray[a] = ir.registerIcon(this.getTextureName() + "_" + a);
        }
    }
   
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int unknown, CreativeTabs tab, List subItems){
        for (int a = 0; a < 16; a++){
            tab = TBDCreativeTab.GEOLOGY.get();
            subItems.add(new ItemStack(this, 1, a));
        }
    }
    
}
