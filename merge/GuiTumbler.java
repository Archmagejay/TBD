package tbd.merge;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GuiTumbler extends GuiContainer {

	public GuiTumbler(InventoryPlayer invp, TileEntityTumbler tile) {
		super(new ContainerTumbler(invp, tile));
		TumblerInventory = tile;
	}
	
	protected void drawGuiContainerForegroundLayer() {
		fontRenderer.drawString("Gem Tumbler", 60, 6, 0x404040);
		fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
		fontRenderer.drawString("Residue", 138, 55, 0x404040);
		fontRenderer.drawString("Gem", 114, 22, 0x404040);
		fontRenderer.drawString("Fuel", 34, 56, 0x404040);
	}

	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		int k = mc.renderEngine.getTexture("/cristal/gui/tumblerGUI.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(k);
        int l = (width - xSize) / 2;
        int i1 = (height - ySize) / 2;
        drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
        if(TumblerInventory.isTumbling())
        {
            int j1 = TumblerInventory.getBurnTimeRemainingScaled(12);
            drawTexturedModalRect(l + 56, (i1 + 36 + 12) - j1, 176, 12 - j1, 14, j1 + 2);
        }
        int k1 = TumblerInventory.getCookProgressScaled(24);
        drawTexturedModalRect(l + 79, i1 + 34, 176, 14, k1 + 1, 16);
	}
	
	private TileEntityTumbler TumblerInventory;
	
}