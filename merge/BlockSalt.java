package tbd.merge;
import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockSalt extends Block implements ITextureProvider {

	public BlockSalt(int var1) {
		super(var1, Material.clay);
	}
	public int quantityDropped(Random var1)
	{
		return 4 + var1.nextInt(2);
	}
	
	public int idDropped(int var1, Random r, int j) {
	return mod_CC.saltG.shiftedIndex;
	}
	
	public String getTextureFile(){
		return "/cristal/terrain.png";
	}
}