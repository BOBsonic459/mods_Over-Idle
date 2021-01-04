package fr.bobsonic.overidle.gui.overlay;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.init.Items;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class WarningOverlay extends Gui{ 
	
	

    @SubscribeEvent
    public void renderOverlay(RenderGameOverlayEvent event) {
    	Minecraft mc = Minecraft.getMinecraft();
    	drawString(mc.fontRenderer, "Attention ce mod est en ALPHA, il manque des ressource craft item block, etc", 1, 1, 0xFFFF0000);
    	
    	
    }

}