package tbd.merge;

import java.io.PrintStream;
import java.util.Random;

public class CCWorldGen1 extends WorldGenerator
{

    public CCWorldGen1()
    {
    }

    public boolean generate(World world, Random random, int i, int j, int k)
    {
    	world.setBlockWithNotify(i + 1, j + 2, k + 1, Block.chest.blockID);//
    	world.setBlockWithNotify(i - 1, j + 2, k + 1, Block.chest.blockID);//
    	world.setBlockWithNotify(i    , j + 2, k + 1, Block.chest.blockID);//
    	world.setBlockWithNotify(i + 1, j + 2, k - 1, Block.chest.blockID);//		" " " " " "
    	world.setBlockWithNotify(i - 1, j + 2, k - 1, Block.chest.blockID);//		" " ### " "
    	world.setBlockWithNotify(i    , j + 2, k - 1, Block.chest.blockID);//     	"#" "#" "#"
    	world.setBlockWithNotify(i + 1, j + 2, k    , Block.chest.blockID);//		
    	world.setBlockWithNotify(i - 1, j + 2, k    , Block.chest.blockID);//		
    	world.setBlockWithNotify(i    , j + 2, k    , Block.glowStone.blockID);//	
    	//																			-----------
    	world.setBlockWithNotify(i + 1, j + 1, k + 1, Block.chest.blockID);//
    	world.setBlockWithNotify(i - 1, j + 1, k + 1, Block.chest.blockID);//
    	world.setBlockWithNotify(i    , j + 1, k + 1, Block.chest.blockID);//
    	world.setBlockWithNotify(i + 1, j + 1, k - 1, Block.chest.blockID);//		" " " " " "
    	world.setBlockWithNotify(i - 1, j + 1, k - 1, Block.chest.blockID);//		" " ### " "
    	world.setBlockWithNotify(i    , j + 1, k - 1, Block.chest.blockID);//		"#" "#" "#"
    	world.setBlockWithNotify(i + 1, j + 1, k    , Block.chest.blockID);//		
    	world.setBlockWithNotify(i - 1, j + 1, k    , Block.chest.blockID);//	
    	world.setBlockWithNotify(i    , j + 1, k    , Block.glowStone.blockID);//	
    	//																			-----------
    	world.setBlockWithNotify(i + 1, j    , k + 1, Block.chest.blockID);//
    	world.setBlockWithNotify(i - 1, j    , k + 1, Block.chest.blockID);//
    	world.setBlockWithNotify(i    , j    , k + 1, Block.chest.blockID);//
    	world.setBlockWithNotify(i + 1, j    , k - 1, Block.chest.blockID);//		"#" "#" "#"
    	world.setBlockWithNotify(i - 1, j    , k - 1, Block.chest.blockID);//		"#" ### "#"
    	world.setBlockWithNotify(i    , j    , k - 1, Block.chest.blockID);//		"#" "#" "#"
    	world.setBlockWithNotify(i + 1, j    , k    , Block.chest.blockID);//		
    	world.setBlockWithNotify(i - 1, j    , k    , Block.chest.blockID);//	  
    	world.setBlockWithNotify(i + 1, j - 1, k + 1, Block.blockDiamond.blockID);
    	//layer 3
    	TileEntityChest tec1L3 = (TileEntityChest)world.getBlockTileEntity(i + 1, j + 2, k + 1);
    	TileEntityChest tec2L3 = (TileEntityChest)world.getBlockTileEntity(i - 1, j + 2, k + 1);
    	TileEntityChest tec3L3 = (TileEntityChest)world.getBlockTileEntity(i    , j + 2, k + 1);
    	TileEntityChest tec4L3 = (TileEntityChest)world.getBlockTileEntity(i + 1, j + 2, k - 1);
    	TileEntityChest tec5L3 = (TileEntityChest)world.getBlockTileEntity(i - 1, j + 2, k - 1);
    	TileEntityChest tec6L3 = (TileEntityChest)world.getBlockTileEntity(i    , j + 2, k - 1);
    	TileEntityChest tec7L3 = (TileEntityChest)world.getBlockTileEntity(i + 1, j + 2, k    );
    	TileEntityChest tec8L3 = (TileEntityChest)world.getBlockTileEntity(i - 1, j + 2, k    );
    	//layer 2
    	TileEntityChest tec1L2 = (TileEntityChest)world.getBlockTileEntity(i + 1, j + 1, k + 1);
    	TileEntityChest tec2L2 = (TileEntityChest)world.getBlockTileEntity(i - 1, j + 1, k + 1);
    	TileEntityChest tec3L2 = (TileEntityChest)world.getBlockTileEntity(i    , j + 1, k + 1);
    	TileEntityChest tec4L2 = (TileEntityChest)world.getBlockTileEntity(i + 1, j + 1, k - 1);
    	TileEntityChest tec5L2 = (TileEntityChest)world.getBlockTileEntity(i - 1, j + 1, k - 1);
    	TileEntityChest tec6L2 = (TileEntityChest)world.getBlockTileEntity(i    , j + 1, k - 1);
    	TileEntityChest tec7L2 = (TileEntityChest)world.getBlockTileEntity(i + 1, j + 1, k    );
    	TileEntityChest tec8L2 = (TileEntityChest)world.getBlockTileEntity(i - 1, j + 1, k    );
    	//layer 1
    	TileEntityChest tec1L1 = (TileEntityChest)world.getBlockTileEntity(i + 1, j    , k + 1);
    	TileEntityChest tec2L1 = (TileEntityChest)world.getBlockTileEntity(i - 1, j    , k + 1);
    	TileEntityChest tec3L1 = (TileEntityChest)world.getBlockTileEntity(i    , j    , k + 1);
    	TileEntityChest tec4L1 = (TileEntityChest)world.getBlockTileEntity(i + 1, j    , k - 1);
    	TileEntityChest tec5L1 = (TileEntityChest)world.getBlockTileEntity(i - 1, j    , k - 1);
    	TileEntityChest tec6L1 = (TileEntityChest)world.getBlockTileEntity(i    , j	   , k - 1);
    	TileEntityChest tec7L1 = (TileEntityChest)world.getBlockTileEntity(i + 1, j    , k    );
    	TileEntityChest tec8L1 = (TileEntityChest)world.getBlockTileEntity(i - 1, j    , k    );
        int k4 = 0;
        int i1 = 0;
        do
        {
            //layer 1
        	ItemStack is1 = pickVLootItem1(i1);
            ItemStack is2 = pickVLootItem2(i1);
            ItemStack is3 = pickVLootItem3(i1);
            ItemStack is4 = pickVLootItem4(i1);
            ItemStack is5 = pickVLootItem5(i1);
            ItemStack is6 = pickVLootItem6(i1);
            ItemStack is7 = pickVLootItem7(i1);
            ItemStack is8 = pickVLootItem8(i1);
            //layer 2
            //ItemStack is9 = pickCCLootItem1(i1);
            //layer 3
            if(is1 != null)
            {
                tec1L1.setInventorySlotContents(i1, is1);
                tec2L1.setInventorySlotContents(i1, is2);
                tec3L1.setInventorySlotContents(i1, is3);
                tec4L1.setInventorySlotContents(i1, is4);
                tec5L1.setInventorySlotContents(i1, is5);
                tec6L1.setInventorySlotContents(i1, is6);
                tec7L1.setInventorySlotContents(i1, is7);
                tec8L1.setInventorySlotContents(i1, is8);
                
               /* tec1L2.setInventorySlotContents(i1, is9);
                tec2L2.setInventorySlotContents(i1, is9);
                tec3L2.setInventorySlotContents(i1, is9);
                tec4L2.setInventorySlotContents(i1, is9);
                tec5L2.setInventorySlotContents(i1, is9);
                tec6L2.setInventorySlotContents(i1, is9);
                tec7L2.setInventorySlotContents(i1, is9);
                tec8L2.setInventorySlotContents(i1, is9);
                
                tec1L3.setInventorySlotContents(i1, is9);
                tec2L3.setInventorySlotContents(i1, is9);
                tec3L3.setInventorySlotContents(i1, is9);
                tec4L3.setInventorySlotContents(i1, is9);
                tec5L3.setInventorySlotContents(i1, is9);
                tec6L3.setInventorySlotContents(i1, is9);
                tec7L3.setInventorySlotContents(i1, is9);
                tec8L3.setInventorySlotContents(i1, is9); 
                */               
            }
            k4++;
            i1++;
        } while(i1 <= 26);
    return true;
}
   
    private ItemStack pickVLootItem1(int i) {
		switch(i){
		case 0:
			return new ItemStack(1, 64, 0);
		case 1:
			return new ItemStack(2, 64, 0);
		case 2:
			return new ItemStack(3, 64, 0);
		case 3:
			return new ItemStack(4, 64, 0);
		case 4:
			return new ItemStack(5, 64, 0);
		case 5:
			return new ItemStack(5, 64, 1);
		case 6:
			return new ItemStack(5, 64, 2);
		case 7:
			return new ItemStack(5, 64, 3);
		case 8:
			return new ItemStack(6, 64, 0);
		case 9:
			return new ItemStack(6, 64, 1);
		case 10:
			return new ItemStack(6, 64, 2);
		case 11:
			return new ItemStack(6, 64, 3);
		case 12:
			return new ItemStack(7, 64, 0);
		case 13:
			return new ItemStack(8, 64, 0);
		case 14:
			return new ItemStack(9, 64, 0);
		case 15:
			return new ItemStack(10, 64, 0);
		case 16:
			return new ItemStack(11, 64, 0);
		case 17:
			return new ItemStack(12, 64, 0);
		case 18:
			return new ItemStack(13, 64, 0);
		case 19:
			return new ItemStack(14, 64, 0);
		case 20:
			return new ItemStack(15, 64, 0);
		case 21:
			return new ItemStack(16, 64, 0);
		case 22:
			return new ItemStack(17, 64, 0);
		case 23:
			return new ItemStack(17, 64, 1);
		case 24:
			return new ItemStack(17, 64, 2);
		case 25:
			return new ItemStack(17, 64, 3);
		case 26:
			return new ItemStack(18, 64, 1);
		}
		return null;
	}
    
    private ItemStack pickVLootItem2(int i) {
		switch(i){
		case 0:
			return new ItemStack(18, 64, 1);
		case 1:
			return new ItemStack(18, 64, 2);
		case 2:
			return new ItemStack(18, 64, 3);
		case 3:
			return new ItemStack(19, 64, 0);
		case 4:
			return new ItemStack(20, 64, 0);
		case 5:
			return new ItemStack(21, 64, 0);
		case 6:
			return new ItemStack(22, 64, 0);
		case 7:
			return new ItemStack(23, 64, 0);
		case 8:
			return new ItemStack(24, 64, 0);
		case 9:
			return new ItemStack(25, 64, 0);
		case 10:
			return new ItemStack(26, 64, 0);
		case 11:
			return new ItemStack(27, 64, 0);
		case 12:
			return new ItemStack(28, 64, 0);
		case 13:
			return new ItemStack(29, 64, 0);
		case 14:
			return new ItemStack(30, 64, 0);
		case 15:
			return new ItemStack(31, 64, 0);
		case 16:
			return new ItemStack(31, 64, 1);
		case 17:
			return new ItemStack(31, 64, 2);
		case 18:
			return new ItemStack(32, 64, 0);
		case 19:
			return new ItemStack(33, 64, 0);
		case 20:
			return new ItemStack(34, 64, 0);
		case 21:
			return new ItemStack(35, 64, 0);
		case 22:
			return new ItemStack(35, 64, 1);
		case 23:
			return new ItemStack(35, 64, 2);
		case 24:
			return new ItemStack(35, 64, 3);
		case 25:
			return new ItemStack(35, 64, 4);
		case 26:
			return new ItemStack(35, 64, 5);
		}
		return null;
	}
    
    private ItemStack pickVLootItem3(int i) {
		switch(i){
		case 0:
			return new ItemStack(35, 64, 6);
		case 1:
			return new ItemStack(35, 64, 7);
		case 2:
			return new ItemStack(35, 64, 8);
		case 3:
			return new ItemStack(35, 64, 9);
		case 4:
			return new ItemStack(35, 64, 0);
		case 5:
			return new ItemStack(35, 64, 11);
		case 6:
			return new ItemStack(35, 64, 12);
		case 7:
			return new ItemStack(35, 64, 13);
		case 8:
			return new ItemStack(35, 64, 14);
		case 9:
			return new ItemStack(35, 64, 15);
		case 10:
			return new ItemStack(36, 64, 0);
		case 11:
			return new ItemStack(37, 64, 3);
		case 12:
			return new ItemStack(38, 64, 2);
		case 13:
			return new ItemStack(39, 64, 1);
		case 14:
			return new ItemStack(40, 64, 0);
		case 15:
			return new ItemStack(41, 64, 3);
		case 16:
			return new ItemStack(42, 64, 2);
		case 17:
			return new ItemStack(43, 64, 1);
		case 18:
			return new ItemStack(43, 64, 0);
		case 19:
			return new ItemStack(43, 64, 1);
		case 20:
			return new ItemStack(43, 64, 2);
		case 21:
			return new ItemStack(43, 64, 3);
		case 22:
			return new ItemStack(43, 64, 4);
		case 23:
			return new ItemStack(43, 64, 5);
		case 24:
			return new ItemStack(43, 64, 6);
		case 25:
			return new ItemStack(44, 64, 0);
		case 26:
			return new ItemStack(44, 64, 1);
		}
		return null;
	}
    
    private ItemStack pickVLootItem4(int i) {
		switch(i){
		case 0:
			return new ItemStack(44, 64, 3);
		case 1:
			return new ItemStack(44, 64, 4);
		case 2:
			return new ItemStack(44, 64, 5);
		case 3:
			return new ItemStack(44, 64, 6);
		case 4:
			return new ItemStack(45, 64, 0);
		case 5:
			return new ItemStack(46, 64, 0);
		case 6:
			return new ItemStack(47, 64, 0);
		case 7:
			return new ItemStack(48, 64, 0);
		case 8:
			return new ItemStack(49, 64, 0);
		case 9:
			return new ItemStack(50, 64, 0);
		case 10:
			return new ItemStack(51, 64, 0);
		case 11:
			return new ItemStack(52, 64, 0);
		case 12:
			return new ItemStack(53, 64, 0);
		case 13:
			return new ItemStack(54, 64, 0);
		case 14:
			return new ItemStack(55, 64, 0);
		case 15:
			return new ItemStack(56, 64, 0);
		case 16:
			return new ItemStack(57, 64, 0);
		case 17:
			return new ItemStack(58, 64, 0);
		case 18:
			return new ItemStack(59, 64, 0);
		case 19:
			return new ItemStack(60, 64, 0);
		case 20:
			return new ItemStack(61, 64, 0);
		case 21:
			return new ItemStack(62, 64, 0);
		case 22:
			return new ItemStack(63, 64, 0);
		case 23:
			return new ItemStack(64, 64, 0);
		case 24:
			return new ItemStack(65, 64, 0);
		case 25:
			return new ItemStack(66, 64, 0);
		case 26:
			return new ItemStack(67, 64, 0);
		}
		return null;
	}
    
    private ItemStack pickVLootItem5(int i) {
		switch(i){
		case 0:
			return new ItemStack(68, 64, 0);
		case 1:
			return new ItemStack(69, 64, 0);
		case 2:
			return new ItemStack(70, 64, 0);
		case 3:
			return new ItemStack(71, 64, 0);
		case 4:
			return new ItemStack(72, 64, 0);
		case 5:
			return new ItemStack(73, 64, 0);
		case 6:
			return new ItemStack(74, 64, 0);
		case 7:
			return new ItemStack(75, 64, 0);
		case 8:
			return new ItemStack(76, 64, 0);
		case 9:
			return new ItemStack(77, 64, 0);
		case 10:
			return new ItemStack(78, 64, 0);
		case 11:
			return new ItemStack(79, 64, 0);
		case 12:
			return new ItemStack(80, 64, 0);
		case 13:
			return new ItemStack(81, 64, 0);
		case 14:
			return new ItemStack(82, 64, 0);
		case 15:
			return new ItemStack(83, 64, 0);
		case 16:
			return new ItemStack(84, 64, 0);
		case 17:
			return new ItemStack(85, 64, 0);
		case 18:
			return new ItemStack(86, 64, 0);
		case 19:
			return new ItemStack(87, 64, 0);
		case 20:
			return new ItemStack(88, 64, 0);
		case 21:
			return new ItemStack(89, 64, 0);
		case 22:
			return new ItemStack(90, 64, 0);
		case 23:
			return new ItemStack(91, 64, 0);
		case 24:
			return new ItemStack(92, 64, 0);
		case 25:
			return new ItemStack(93, 64, 0);
		case 26:
			return new ItemStack(94, 64, 0);
		}
		return null;
	}
    
    private ItemStack pickVLootItem6(int i){
		switch(i){
		case 0:
			return new ItemStack(95, 64, 0);
		case 1:
			return new ItemStack(96, 64, 0);
		case 2:
			return new ItemStack(97, 64, 0);
		case 3:
			return new ItemStack(98, 64, 0);
		case 4:
			return new ItemStack(99, 64, 0);
		case 5:
			return new ItemStack(100, 64, 0);
		case 6:
			return new ItemStack(101, 64, 0);
		case 7:
			return new ItemStack(102, 64, 0);
		case 8:
			return new ItemStack(103, 64, 0);
		case 9:
			return new ItemStack(104, 64, 0);
		case 10:
			return new ItemStack(105, 64, 0);
		case 11:
			return new ItemStack(106, 64, 0);
		case 12:
			return new ItemStack(107, 64, 0);
		case 13:
			return new ItemStack(108, 64, 0);
		case 14:
			return new ItemStack(109, 64, 0);
		case 15:
			return new ItemStack(110, 64, 0);
		case 16:
			return new ItemStack(111, 64, 0);
		case 17:
			return new ItemStack(112, 64, 0);
		case 18:
			return new ItemStack(113, 64, 0);
		case 19:
			return new ItemStack(114, 64, 0);
		case 20:
			return new ItemStack(115, 64, 0);
		case 21:
			return new ItemStack(116, 64, 0);
		case 22:
			return new ItemStack(117, 64, 0);
		case 23:
			return new ItemStack(118, 64, 0);
		case 24:
			return new ItemStack(119, 64, 0);
		case 25:
			return new ItemStack(120, 64, 0);
		case 26:
			return new ItemStack(121, 64, 0);
		}
		return null;
	}
    
	private ItemStack pickVLootItem7(int i) {
	Random r = new Random();
    	switch(i){
    	case 0:
			return new ItemStack(122, 64, 0);
		case 1:
			return new ItemStack(123, 64, 0);
		case 2:
			return new ItemStack(124, 64, 0);
		case 3:
			return new ItemStack(125, 64, 0);
		case 4:
			return new ItemStack(126, 64, 0);
		case 5:
			return new ItemStack(1, 64, 0);
		case 6:
			return new ItemStack(1, 64, 0);
		case 7:
			return new ItemStack(1, 64, 0);
		case 8:
			return new ItemStack(1, 64, 0);
		case 9:
			return new ItemStack(1, 64, 0);
		case 10:
			return new ItemStack(1, 64, 0);
		case 11:
			return new ItemStack(1, 64, 0);
		case 12:
			return new ItemStack(1, 64, 0);
		case 13:
			return new ItemStack(1, 64, 0);
		case 14:
			return new ItemStack(1, 64, 0);
		case 15:
			return new ItemStack(1, 64, 0);
		case 16:
			return new ItemStack(1, 64, 0);
		case 17:
			return new ItemStack(1, 64, 0);
		case 18:
			return new ItemStack(1, 64, 0);
		case 19:
			return new ItemStack(1, 64, 0);
		case 20:
			return new ItemStack(1, 64, 0);
		case 21:
			return new ItemStack(1, 64, 0);
		case 22:
			return new ItemStack(1, 64, 0);
		case 23:
			return new ItemStack(1, 64, 0);
		case 24:
			return new ItemStack(1, 64, 0);
		case 25:
			return new ItemStack(1, 64, 0);
		case 26:
			return new ItemStack(1, 64, 0);
    	}
		return null;
	}

	private ItemStack pickVLootItem8(int i)
    {
    	Random random = new Random();
        switch(i){
		case 0:
			return new ItemStack(1, 64, 0);
		case 1:
			return new ItemStack(1, 64, 0);
		case 2:
			return new ItemStack(1, 64, 0);
		case 3:
			return new ItemStack(1, 64, 0);
		case 4:
			return new ItemStack(1, 64, 0);
		case 5:
			return new ItemStack(1, 64, 0);
		case 6:
			return new ItemStack(1, 64, 0);
		case 7:
			return new ItemStack(1, 64, 0);
		case 8:
			return new ItemStack(1, 64, 0);
		case 9:
			return new ItemStack(1, 64, 0);
		case 10:
			return new ItemStack(1, 64, 0);
		case 11:
			return new ItemStack(1, 64, 0);
		case 12:
			return new ItemStack(1, 64, 0);
		case 13:
			return new ItemStack(1, 64, 0);
		case 14:
			return new ItemStack(1, 64, 0);
		case 15:
			return new ItemStack(1, 64, 0);
		case 16:
			return new ItemStack(1, 64, 0);
		case 17:
			return new ItemStack(1, 64, 0);
		case 18:
			return new ItemStack(1, 64, 0);
		case 19:
			return new ItemStack(1, 64, 0);
		case 20:
			return new ItemStack(1, 64, 0);
		case 21:
			return new ItemStack(1, 64, 0);
		case 22:
			return new ItemStack(1, 64, 0);
		case 23:
			return new ItemStack(1, 64, 0);
		case 24:
			return new ItemStack(1, 64, 0);
		case 25:
			return new ItemStack(1, 64, 0);
		case 26:
			return new ItemStack(1, 64, 0);
        }
        return null;       
    }
	
	private ItemStack pickCCLootItem1(int i) {
		switch(i){
		case 0:
			return new ItemStack(1, 64, 0);
		case 1:
			return new ItemStack(212, 64, 0);
		case 2:
			return new ItemStack(210, 64, 0);
		case 3:
			return new ItemStack(203, 64, 0);
		case 4:
			return new ItemStack(202, 64, 0);
		case 5:
			return new ItemStack(201, 64, 0);
		case 6:
			return new ItemStack(200, 64, 0);
		case 7:
			return new ItemStack(166, 64, 0);
		case 8:
			return new ItemStack(165, 64, 0);
		case 9:
			return new ItemStack(164, 64, 0);
		case 10:
			return new ItemStack(163, 64, 0);
		case 11:
			return new ItemStack(162, 64, 0);
		case 12:
			return new ItemStack(161, 64, 0);
		case 13:
			return new ItemStack(160, 64, 0);
		case 14:
			return new ItemStack(159, 64, 0);
		case 15:
			return new ItemStack(158, 64, 0);
		case 16:
			return new ItemStack(157, 64, 0);
		case 17:
			return new ItemStack(156, 64, 0);
		case 18:
			return new ItemStack(155, 64, 0);
		case 19:
			return new ItemStack(154, 64, 0);
		case 20:
			return new ItemStack(153, 64, 0);
		case 21:
			return new ItemStack(152, 64, 0);
		case 22:
			return new ItemStack(151, 64, 0);
		case 23:
			return new ItemStack(150, 64, 0);
		case 24:
			return new ItemStack(149, 64, 0);
		case 25:
			return new ItemStack(148, 64, 0);
		case 26:
			return new ItemStack(147, 64, 0);
		case 27:
			return new ItemStack(322, 64, 0);
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
}
