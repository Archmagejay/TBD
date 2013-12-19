package tbd.merge;

public class CCEnchFireTouch extends Enchantment
{

    protected CCEnchFireTouch(int i, int j)
    {
        super(i, j, EnumEnchantmentType.digger);
        setName("flameTouch");
    }

    public int getMinEnchantability(int i)
    {
        return 1;
    }

    public int getMaxEnchantability(int i)
    {
        return super.getMinEnchantability(i) + 50;
    }

    public int getMaxLevel()
    {
        return 1;
    }

    public boolean canApplyTogether(Enchantment enchantment)
    {
        return super.canApplyTogether(enchantment) && enchantment.effectId != silkTouch.effectId;
    }
}
