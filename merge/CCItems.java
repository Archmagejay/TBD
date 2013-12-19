package tbd.merge;
import net.minecraft.src.forge.*;

public class CCItems extends Item implements ITextureProvider{

	protected CCItems(int id, int meta) {
		super(id, meta);
	}
		
	public String getTextureFile(){
		return "/cristal/items.png";
	}
}
