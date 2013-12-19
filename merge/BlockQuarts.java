package tbd.merge;

import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockQuarts extends Block implements ITextureProvider
{
	public BlockQuarts(int var1, Material type)
	{
		super(var1, type);
	}
	
	public int idDropped(int var1, Random r, int j) {
		return mod_CC.quartsG.shiftedIndex;
	}
	
	public int quantityDropped(Random var1)
	{
		return 3 + var1.nextInt(2);
	}
	
	public String getTextureFile(){
		return "/cristal/terrain.png";
	}
}