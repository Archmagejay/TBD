package tbd.merge;

import java.util.ArrayList;

public class BlockDark extends Block{
	boolean phase;
	
	public BlockDark(int i, int j, Material mat, boolean p){
		super(i, j, mat);
		phase = p;
		if(phase == false){
			this.blockIndexInTexture = -17;
			setBlockUnbreakable();
			setLightValue(-1F);
			setLightOpacity(255);
			setResistance(100000F);
			setHardness(100000F);
		} else if(phase == true){
			this.blockIndexInTexture = 7;
		}
	}
	
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        return null;
    }
    
    public int getRenderBlockPass(){
    if(this.phase == true){
    	return 0;
    } else if(phase == false){
    	return 3;
    } else
    	return 1;
    }
    
    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l){
    	return super.shouldSideBeRendered(iblockaccess, i, j, k, l - 1);
    }
    
    public boolean isOpaqueCube(){
    	return false;
    }
}
