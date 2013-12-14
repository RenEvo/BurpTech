package burptech.client.gui;

import burptech.BurpTechCore;
import org.lwjgl.opengl.GL11;

import burptech.gui.ContainerPortableWorkbench;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;

public class GuiPortableWorkbench extends GuiContainer
{
	private static final ResourceLocation resourceLocation = new ResourceLocation("textures/gui/container/crafting_table.png");

	public GuiPortableWorkbench(InventoryPlayer par1InventoryPlayer, World world)
    {
        super(new ContainerPortableWorkbench(par1InventoryPlayer, world));
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRenderer.drawString(StatCollector.translateToLocal(BurpTechCore.configuration.items.portableWorkbench.getUnlocalizedName() + ".name") , 8, 6, 4210752 );
    	this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(resourceLocation);
        
        int j = (this.width - this.xSize) / 2;
        int k = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(j, k, 0, 0, this.xSize, this.ySize);
    }
}
