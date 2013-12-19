package tbd.merge;

public class RenderPenguin extends RenderLiving
{

    public RenderPenguin(ModelBase modelbase, float f)
    {
        super(modelbase, f);
    }

    public void renderPenguin(EntityPenguin entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRenderLiving(entityliving, d, d1, d2, f, f1);
    }

    protected float tailRotation(EntityPenguin e, float f)
    {
        return e.setTailRotation();
    }

    protected void Empty(EntityPenguin entityPenguin, float f)
    {
    }

    protected void preRenderCallback(EntityLiving entityliving, float f)
    {
        Empty((EntityPenguin)entityliving, f);
    }

    protected float handleRotationFloat(EntityLiving entityliving, float f)
    {
        return tailRotation((EntityPenguin)entityliving, f);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
        renderPenguin((EntityPenguin)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        renderPenguin((EntityPenguin)entity, d, d1, d2, f, f1);
    }
}
