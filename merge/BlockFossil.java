package tbd.merge;
import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockFossil extends Block implements ITextureProvider{

	public BlockFossil(int i, Material mat) {
		super(i, mat);
	}

	public String getTextureFile(){
		return "/cristal/terrain.png";
	}
	
	public int Drop(Random r, int i){
		i = r.nextInt(6);
		switch(i){
		case 1:
			drop = mod_CC.F1.shiftedIndex;
		case 2:
			drop = mod_CC.F2.shiftedIndex;
		case 3:
			drop = mod_CC.F3.shiftedIndex;
		case 4:
			drop = mod_CC.F4.shiftedIndex;
		case 5:
			drop = mod_CC.F5.shiftedIndex;
		case 6:
			drop = mod_CC.F6.shiftedIndex;
		case 7:
			drop = mod_CC.F7.shiftedIndex;
		case 8:
			drop = mod_CC.F8.shiftedIndex;
		case 9:
			drop = mod_CC.F9.shiftedIndex;
		case 10:
			drop = mod_CC.F10.shiftedIndex;
		case 11:
			drop = mod_CC.F11.shiftedIndex;
		case 12:
			drop = mod_CC.F12.shiftedIndex;
		case 13:
			drop = mod_CC.F13.shiftedIndex;
		case 14:
			drop = mod_CC.F14.shiftedIndex;
		case 15:
			drop = Item.swordGold.shiftedIndex;
		}
		return this.blockID;
	}
    public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer){
    	Random random = new Random();
    	(new CCWorldGen1()).generate(world, random, i, j, k);
    	return super.blockActivated(world, i, j, k, entityplayer);
    }
    
	public int idDropped(){
		return drop;
	}
	
	int drop;
}
