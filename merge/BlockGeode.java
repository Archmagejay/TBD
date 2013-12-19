package tbd.merge;
import java.util.Random;
import net.minecraft.src.forge.ITextureProvider;

public class BlockGeode extends Block implements ITextureProvider{

	public Random r = new Random();
	
	public BlockGeode(int i, Material mat) {
		super(i, mat);
	}

	public int idDropped(int i, Random rand, int j){
		int d = r.nextInt(10);
		switch(d){
		case 1:
			return Block.stone.blockID;
		case 2:
			return mod_CC.aquaG.shiftedIndex;
		case 3:
			return this.blockID;
		case 4:
			return Block.blockLapis.blockID;
		case 5:
			return Block.bedrock.blockID;
		case 6:
			return Block.brewingStand.blockID;
		case 7:
			return mod_CC.silicon.blockID;
		}
		return -1;
	}
	public String getTextureFile() {
		return "/cristal/terrain.png";
	}

}
