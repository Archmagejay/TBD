package tbd.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TbdMultiGrassBlock extends Block{

    public TbdMultiGrassBlock(int id) {
        super(id, Material.grass);
        setStepSound(Block.soundGrassFootstep);
        setCreativeTab(CreativeTabs.tabCombat);
        setHardness(0.6F);
        setTextureName("tbdCore:tbdGrassTop1");
    }

}
