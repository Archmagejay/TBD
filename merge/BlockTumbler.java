package tbd.merge;

import java.util.Random;
import net.minecraft.src.forge.ITextureProvider;

public class BlockTumbler extends BlockContainer implements ITextureProvider
{

    private Random tumblerRand;
    private final boolean isActive;
    private static boolean keepTumblerInventory = false;

    protected BlockTumbler(int i, boolean flag)
    {
        super(i, Material.rock);
        tumblerRand = new Random();
        isActive = flag;
        blockIndexInTexture = 12;
    }

    public int idDropped(int i, Random random, int j)
    {
        return mod_CC.tumbler.blockID;
    }

    public void onBlockAdded(World world, int i, int j, int k)
    {
        super.onBlockAdded(world, i, j, k);
        setDefaultDirection(world, i, j, k);
    }

    private void setDefaultDirection(World world, int i, int j, int k)
    {
        if(!world.isRemote)
        {
            int var5 = world.getBlockId(i, j, k - 1);
            int var6 = world.getBlockId(i, j, k + 1);
            int var7 = world.getBlockId(i - 1, j, k);
            int var8 = world.getBlockId(i + 1, j, k);
            byte var9 = 3;

            if (Block.opaqueCubeLookup[var5] && !Block.opaqueCubeLookup[var6])
            {
                var9 = 3;
            }

            if (Block.opaqueCubeLookup[var6] && !Block.opaqueCubeLookup[var5])
            {
                var9 = 2;
            }

            if (Block.opaqueCubeLookup[var7] && !Block.opaqueCubeLookup[var8])
            {
                var9 = 5;
            }

            if (Block.opaqueCubeLookup[var8] && !Block.opaqueCubeLookup[var7])
            {
                var9 = 4;
            }

            world.setBlockMetadataWithNotify(i, j, k, var9);
        }
    }

    public int getBlockTexture(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        if(l == 1)
        {
            return blockIndexInTexture - 3;
        }
        if(l == 0)
        {
            return blockIndexInTexture - 3;
        }
        int i1 = iblockaccess.getBlockMetadata(i, j, k);
        if(l != i1)
        {
            return blockIndexInTexture;
        }
        if(isActive)
        {
            return blockIndexInTexture - 1;
        } else
        {
            return blockIndexInTexture - 2;
        }
    }

    public void randomDisplayTick(World world, int i, int j, int k, Random random)
    {
        if(!isActive)
        {
            return;
        }
        int l = world.getBlockMetadata(i, j, k);
        float f = (float)i + 0.5F;
        float f1 = (float)j + 0.0F + (random.nextFloat() * 6F) / 16F;
        float f2 = (float)k + 0.5F;
        float f3 = 0.52F;
        float f4 = random.nextFloat() * 0.6F - 0.3F;
        if(l == 4)
        {
            world.spawnParticle("smoke", f - f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", f - f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 5)
        {
            world.spawnParticle("smoke", f + f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", f + f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 2)
        {
            world.spawnParticle("smoke", f + f4, f1, f2 - f3, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", f + f4, f1, f2 - f3, 0.0D, 0.0D, 0.0D);
        } else
        if(l == 3)
        {
            world.spawnParticle("smoke", f + f4, f1, f2 + f3, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", f + f4, f1, f2 + f3, 0.0D, 0.0D, 0.0D);
        }
    }

    public int getBlockTextureFromSide(int i)
    {
        if(i == 1)
        {
            return blockIndexInTexture - 3;
        }
        if(i == 0)
        {
            return blockIndexInTexture - 3;
        }
        if(i == 3)
        {
            return blockIndexInTexture - 2;
        } else
        {
            return blockIndexInTexture;
        }
    }

    public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        if(world.isRemote){
            return true;
        } else
        {
            TileEntityTumbler tileentityfreezer = (TileEntityTumbler)world.getBlockTileEntity(i, j, k);
            ModLoader.openGUI(entityplayer, new GuiTumbler(entityplayer.inventory, tileentityfreezer));
            return true;
        }
    }


    public static void updateTumblerBlockState(boolean flag, World world, int i, int j, int k)
    {
        int l = world.getBlockMetadata(i, j, k);
        TileEntity tileentity = world.getBlockTileEntity(i, j, k);
        keepTumblerInventory = true;
        if(flag)
        {
            world.setBlockWithNotify(i, j, k, mod_CC.tumblerActive.blockID);
        } else
        {
            world.setBlockWithNotify(i, j, k, mod_CC.tumbler.blockID);
        }
        keepTumblerInventory = false;
        world.setBlockMetadataWithNotify(i, j, k, l);
        if(tileentity != null)
        {
            tileentity.validate();
            world.setBlockTileEntity(i, j, k, tileentity);
        }
    }

    public TileEntity getBlockEntity()
    {
        return new TileEntityTumbler();
    }

    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
    {
        int l = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        if(l == 0)
        {
            world.setBlockMetadataWithNotify(i, j, k, 2);
        }
        if(l == 1)
        {
            world.setBlockMetadataWithNotify(i, j, k, 5);
        }
        if(l == 2)
        {
            world.setBlockMetadataWithNotify(i, j, k, 3);
        }
        if(l == 3)
        {
            world.setBlockMetadataWithNotify(i, j, k, 4);
        }
    }

    public void onBlockRemoval(World world, int i, int j, int k)
    {
        if(!keepTumblerInventory)
        {
            TileEntityTumbler tileentitytumbler = (TileEntityTumbler)world.getBlockTileEntity(i, j, k);
            if(tileentitytumbler != null)
            {
label0:
                for(int l = 0; l < tileentitytumbler.getSizeInventory(); l++)
                {
                    ItemStack itemstack = tileentitytumbler.getStackInSlot(l);
                    if(itemstack == null)
                    {
                        continue;
                    }
                    float f = tumblerRand.nextFloat() * 0.8F + 0.1F;
                    float f1 = tumblerRand.nextFloat() * 0.8F + 0.1F;
                    float f2 = tumblerRand.nextFloat() * 0.8F + 0.1F;
                    do
                    {
                        if(itemstack.stackSize <= 0)
                        {
                            continue label0;
                        }
                        int i1 = tumblerRand.nextInt(21) + 10;
                        if(i1 > itemstack.stackSize)
                        {
                            i1 = itemstack.stackSize;
                        }
                        itemstack.stackSize -= i1;
                        EntityItem entityitem = new EntityItem(world, (float)i + f, (float)j + f1, (float)k + f2, new ItemStack(itemstack.itemID, i1, itemstack.getItemDamage()));
                        float f3 = 0.05F;
                        entityitem.motionX = (float)tumblerRand.nextGaussian() * f3;
                        entityitem.motionY = (float)tumblerRand.nextGaussian() * f3 + 0.2F;
                        entityitem.motionZ = (float)tumblerRand.nextGaussian() * f3;
                        world.spawnEntityInWorld(entityitem);
                    } while(true);
                }

            }
        }
        super.onBlockRemoval(world, i, j, k);
    }

	public String getTextureFile() {

		return "/cristal/terrain.png";
	}

}
