package tbd.merge;
import java.util.Random;
import net.minecraft.src.forge.*;

public class BlockCrystal extends Block implements ITextureProvider
{
	public BlockCrystal(int var1, Material type)
	{
		super(var1, type);
	}
	
    public int idDropped(int var1, Random var2, int j) {
    return this.blockID == mod_CC.emerald.blockID?mod_CC.emeraldG.shiftedIndex:
	(this.blockID == mod_CC.malchite.blockID? mod_CC.malG.shiftedIndex:
		(this.blockID == mod_CC.aquamarine.blockID?mod_CC.aquaG.shiftedIndex:
			(this.blockID == mod_CC.tiger.blockID?mod_CC.tigerG.shiftedIndex:
				(this.blockID == mod_CC.saphire.blockID?mod_CC.saphireG.shiftedIndex:
					(this.blockID == mod_CC.amethyst.blockID?mod_CC.amethystG.shiftedIndex:
						(this.blockID == mod_CC.bloodStone.blockID?mod_CC.bloodstoneG.shiftedIndex:
							(this.blockID == mod_CC.dioptase.blockID?mod_CC.dioptaseG.shiftedIndex:
								(this.blockID == mod_CC.jet.blockID?mod_CC.jetG.shiftedIndex:
									(this.blockID == mod_CC.thulite.blockID?mod_CC.thuliteG.shiftedIndex:
										(this.blockID == mod_CC.topas.blockID?mod_CC.topasG.shiftedIndex:
											(this.blockID == mod_CC.zincite.blockID?mod_CC.zinciteG.shiftedIndex:
												(this.blockID == mod_CC.tourmaline.blockID?mod_CC.tourmalineG.shiftedIndex:
													(this.blockID == mod_CC.sypsum.blockID?mod_CC.sypsumG.shiftedIndex:
														(this.blockID == mod_CC.calcite.blockID?mod_CC.calciteG.shiftedIndex:
															(this.blockID == mod_CC.flourite.blockID?mod_CC.flouriteG.shiftedIndex:
																(this.blockID == mod_CC.apatite.blockID?mod_CC.apatiteG.shiftedIndex:
																	(this.blockID == mod_CC.orthoclase.blockID?mod_CC.orthoclaseG.shiftedIndex:
																		(this.blockID == mod_CC.hematite.blockID?mod_CC.hematiteG.shiftedIndex:
																			(this.blockID == mod_CC.silicon.blockID?mod_CC.siliconG.shiftedIndex:
																				(this.blockID == mod_CC.tektite.blockID?mod_CC.tektiteG.shiftedIndex:
																					(this.blockID == mod_CC.sunstone.blockID?mod_CC.sunstoneG.shiftedIndex:
																						(this.blockID == mod_CC.garnet.blockID?mod_CC.garnetG.shiftedIndex:
																							(this.blockID == mod_CC.amber.blockID?mod_CC.amberG.shiftedIndex:
																								(this.blockID == mod_CC.mAgate.blockID?mod_CC.mossyagateG.shiftedIndex:
																									(this.blockID == mod_CC.kyanite.blockID?mod_CC.kyaniteG.shiftedIndex:
																										(this.blockID == mod_CC.jade.blockID?mod_CC.jadeG.shiftedIndex:
																											(this.blockID == mod_CC.adventurene.blockID?mod_CC.adventG.shiftedIndex:
																												(this.blockID == mod_CC.ruby.blockID?mod_CC.rubyG.shiftedIndex:
																												this.blockID))))))))))))))))))))))))))));
	}
    
    public String getTextureFile(){
    	return "/cristal/terrain.png";
    }
}