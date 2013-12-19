package tbd.merge;

public class ModelPenguin extends ModelBase
{
  //fields
    ModelRenderer P2;
    ModelRenderer P1;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
  
  public ModelPenguin()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      P2 = new ModelRenderer(this, 48, 5);
      P2.addBox(-2F, 0F, 0F, 4, 1, 2);
      P2.setRotationPoint(0F, 22F, 0.8F);
      P2.setTextureSize(64, 32);
      P2.mirror = true;
      setRotation(P2, -0.1745329F, 0F, 0F);
	  
      P1 = new ModelRenderer(this, 48, 5);
      P1.addBox(-1F, 0F, 0F, 2, 1, 3);
      P1.setRotationPoint(0F, 22F, 0.5F);
      P1.setTextureSize(64, 32);
      P1.mirror = true;
      setRotation(P1, -0.1745329F, 0F, 0F);
	  
      head = new ModelRenderer(this, 1, 0);
      head.addBox(-4F, -8F, -3F, 8, 7, 7);
      head.setRotationPoint(0F, 10F, -1F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
	  
      body = new ModelRenderer(this, 13, 14);
      body.addBox(-4F, 9F, -2F, 8, 14, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
	  
      rightarm = new ModelRenderer(this, 37, 14);
      rightarm.addBox(-1F, 0F, -2F, 1, 11, 4);
      rightarm.setRotationPoint(-4F, 10F, 0F);
      rightarm.setTextureSize(64, 32);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0.0523599F);
	  
      leftarm = new ModelRenderer(this, 37, 14);
      leftarm.addBox(0F, 0F, -2F, 1, 11, 4);
      leftarm.setRotationPoint(4F, 10F, 0F);
      leftarm.setTextureSize(64, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.0523599F);
	  
      rightleg = new ModelRenderer(this, 48, 0);
      rightleg.addBox(-2F, 0F, -5F, 4, 1, 4);
      rightleg.setRotationPoint(-3F, 23F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0.0872665F, 0F);
	  
      leftleg = new ModelRenderer(this, 48, 0);
      leftleg.addBox(-2F, 0F, -5F, 4, 1, 4);
      leftleg.setRotationPoint(3F, 23F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, -0.0872665F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    P2.render(f5);
    P1.render(f5);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
