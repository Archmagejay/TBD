package tbd.merge;

import net.minecraft.src.forge.ISidedInventory;

public class TileEntityTumbler extends TileEntity implements IInventory, ISidedInventory{

    private ItemStack tumblerItemStacks[];
    public int tumblerBurnTime;
    public int currentItemBurnTime;
    public int tumblerCookTime;

    public TileEntityTumbler()
    {
        tumblerItemStacks = new ItemStack[4];
        tumblerBurnTime = 0;
        currentItemBurnTime = 0;
        tumblerCookTime = 0;
    }

    public int getSizeInventory()
    {
        return tumblerItemStacks.length;
    }

    public int getStartInventorySide(int side) {
	    if(side==0) return 1;
	    if(side==1) return 0;
	    return 2;
    }

    public int getSizeInventorySide(int side) {
	    return 1;
    }

    public ItemStack getStackInSlot(int i)
    {
        return tumblerItemStacks[i];
    }

    public ItemStack decrStackSize(int i, int j)
    {
        if(tumblerItemStacks[i] != null)
        {
            if(tumblerItemStacks[i].stackSize <= j)
            {
                ItemStack itemstack = tumblerItemStacks[i];
                tumblerItemStacks[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = tumblerItemStacks[i].splitStack(j);
            if(tumblerItemStacks[i].stackSize == 0)
            {
                tumblerItemStacks[i] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public void setInventorySlotContents(int i, ItemStack itemstack)
    {
        tumblerItemStacks[i] = itemstack;
        if(itemstack != null && itemstack.stackSize > getInventoryStackLimit())
        {
            itemstack.stackSize = getInventoryStackLimit();
        }
    }

    public String getInvName()
    {
        return "Tumbler";
    }

    public void readFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
        NBTTagList nbttaglist = nbttagcompound.getTagList("Items");
        tumblerItemStacks = new ItemStack[getSizeInventory()];
        for(int i = 0; i < nbttaglist.tagCount(); i++)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
            byte byte0 = nbttagcompound1.getByte("Slot");
            if(byte0 >= 0 && byte0 < tumblerItemStacks.length)
            {
                tumblerItemStacks[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        tumblerBurnTime = nbttagcompound.getShort("BurnTime");
        tumblerCookTime = nbttagcompound.getShort("CookTime");
        currentItemBurnTime = getItemBurnTime(tumblerItemStacks[1]);
    }

    public void writeToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setShort("BurnTime", (short)tumblerBurnTime);
        nbttagcompound.setShort("CookTime", (short)tumblerCookTime);
        NBTTagList nbttaglist = new NBTTagList();
        for(int i = 0; i < tumblerItemStacks.length; i++)
        {
            if(tumblerItemStacks[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                tumblerItemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        nbttagcompound.setTag("Items", nbttaglist);
    }

    public int getInventoryStackLimit()
    {
        return 64;
    }

    public int getCookProgressScaled(int i)
    {
        return (tumblerCookTime * i) / 200;
    }

    public int getBurnTimeRemainingScaled(int i)
    {
        if(currentItemBurnTime == 0)
        {
            currentItemBurnTime = 200;
        }
        return (tumblerBurnTime * i) / currentItemBurnTime;
    }

    public boolean isTumbling()
    {
        return tumblerBurnTime > 0;
    }

    public void updateEntity()
    {
        boolean flag = tumblerBurnTime > 0;
        boolean flag1 = false;
        if(tumblerBurnTime > 0)
        {
            tumblerBurnTime--;
        }
        if(!worldObj.isRemote)
        {
            if(tumblerBurnTime == 0 && (canTumble() || canTumble2()))
            {
                currentItemBurnTime = tumblerBurnTime = getItemBurnTime(tumblerItemStacks[1]);
                if(tumblerBurnTime > 0)
                {
                    flag1 = true;
                    if(tumblerItemStacks[1] != null)
                    {
                        if(tumblerItemStacks[1].getItem().hasContainerItem())
                        {
                            tumblerItemStacks[1] = new ItemStack(tumblerItemStacks[1].getItem().getContainerItem());
                        } else
                        {
                            tumblerItemStacks[1].stackSize--;
                        }
                        if(tumblerItemStacks[1].stackSize == 0)
                        {
                            tumblerItemStacks[1] = null;
                        }
                    }
                }
            }
            if(isTumbling() && canTumble())
            {
                tumblerCookTime++;
                if(tumblerCookTime == 200)
                {
                    tumblerCookTime = 0;
                    tumbleItem();
                    flag1 = true;
                }
            }else if(isTumbling() && canTumble2()){
            	tumblerCookTime++;
            	if(tumblerCookTime == 200){
            		tumblerCookTime = 0;
            		tumbleItem2();
            		flag1 = true;
            	}
            	
            }
            else
            {
                tumblerCookTime = 0;
            }
            if(flag != (tumblerBurnTime > 0))
            {
                flag1 = true;
                BlockTumbler.updateTumblerBlockState(tumblerBurnTime > 0, worldObj, xCoord, yCoord, zCoord);
            }
        }
        if(flag1)
        {
            onInventoryChanged();
        }
    }

    private boolean canTumble()
    {
        if (this.tumblerItemStacks[0] == null)
        {
            return false;
        }
        else
        {
            ItemStack var1 = FurnaceRecipes.smelting().getSmeltingResult(this.tumblerItemStacks[0]);
            if (var1 == null) return false;
            if (this.tumblerItemStacks[2] == null) return true;
            if (!this.tumblerItemStacks[2].isItemEqual(var1)) return false;
            int result = tumblerItemStacks[2].stackSize + var1.stackSize;
            return (result <= getInventoryStackLimit() && result <= var1.getMaxStackSize());
        }
    }

    public void tumbleItem()
    {
        if(canTumble())
        {
        ItemStack itemstack = TumblerRecipes.Tumbling().getTumblingResult(tumblerItemStacks[0].getItem().shiftedIndex);
        if(tumblerItemStacks[2] == null)
        {
            tumblerItemStacks[2] = itemstack.copy();
        } else
        if(tumblerItemStacks[2].isItemEqual(itemstack))
        {
            tumblerItemStacks[2].stackSize += itemstack.stackSize;
        }
        if(tumblerItemStacks[0].getItem().hasContainerItem())
        {
            tumblerItemStacks[0] = new ItemStack(tumblerItemStacks[0].getItem().getContainerItem());
        } else
        {
            tumblerItemStacks[0].stackSize--;
        }
        if(tumblerItemStacks[0].stackSize <= 0)
        {
            tumblerItemStacks[0] = null;
        }
        }
    }
    
    private boolean canTumble2(){
    	if(tumblerItemStacks[0] == null){
    		return false;
    	}
    	ItemStack [] is = TumblerRecipes.Tumbling().getTumblingResult2Out(tumblerItemStacks[0].getItem().shiftedIndex);
    	if(is == null){
    		return false;
    	}
    	if(tumblerItemStacks[2] == null && tumblerItemStacks[3] == null){
    		return true;
    	}
    	if(!tumblerItemStacks[2].isItemEqual(is[0]) || !tumblerItemStacks[3].isItemEqual(is[1])){
    		return false;
    	}
    	if(tumblerItemStacks[2].stackSize < getInventoryStackLimit() && tumblerItemStacks[2].stackSize < tumblerItemStacks[2].getMaxStackSize() && tumblerItemStacks[3].stackSize < getInventoryStackLimit() && tumblerItemStacks[3].stackSize < tumblerItemStacks[3].getMaxStackSize()){
    		return true;
    	}
    	return tumblerItemStacks[2].stackSize < is[0].getMaxStackSize() && tumblerItemStacks[3].stackSize < is[1].getMaxStackSize();
    }
    
    public void tumbleItem2()
    {
        if(!canTumble2())
        {
            return;
        }
        ItemStack [] itemstack = TumblerRecipes.Tumbling().getTumblingResult2Out(tumblerItemStacks[0].getItem().shiftedIndex);
        if(tumblerItemStacks[2] == null)
        {
            tumblerItemStacks[2] = itemstack[0].copy();
        } else
        if(tumblerItemStacks[2].itemID == itemstack[0].itemID)
        {
            tumblerItemStacks[2].stackSize += itemstack[0].stackSize;
        }
        if(tumblerItemStacks[3] == null)
        {
            tumblerItemStacks[3] = itemstack[1].copy();
        } else
        if(tumblerItemStacks[3].itemID == itemstack[1].itemID)
        {
            tumblerItemStacks[3].stackSize += itemstack[1].stackSize;
        }
        if(tumblerItemStacks[0].getItem().hasContainerItem())
        {
            tumblerItemStacks[0] = new ItemStack(tumblerItemStacks[0].getItem().getContainerItem());
        } else
        {
            tumblerItemStacks[0].stackSize--;
        }
        if(tumblerItemStacks[0].stackSize <= 0)
        {
            tumblerItemStacks[0] = null;
        }
    }

    public static int getItemBurnTime(ItemStack itemstack)
    {
        if(itemstack == null)
        {
            return 0;
        }
        int i = itemstack.getItem().shiftedIndex;
        if(i == Block.dirt.blockID){
        	return 10000;
        }
        if(i == Block.cobblestone.blockID){
        	return 800;
        }
		return 0; 
    }

    public boolean isUseableByPlayer(EntityPlayer entityplayer)
    {
        if(worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) != this)
        {
            return false;
        }
        return entityplayer.getDistanceSq((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D) <= 64D;
    }

    public void openChest()
    {
    }

    public void closeChest()
    {
    }

	public ItemStack getStackInSlotOnClosing(int var1) {
		if (this.tumblerItemStacks[var1] != null)
        {
            ItemStack var2 = this.tumblerItemStacks[var1];
            this.tumblerItemStacks[var1] = null;
            return var2;
        }
        else
        {
            return null;
        }
	}
}
