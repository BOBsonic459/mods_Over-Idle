package fr.bobsonic.overidle.gui.overlay;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.init.Items;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class SonicScrewdriverOverlay extends Gui{ 
	
	

    @SubscribeEvent
    public void renderOverlay(RenderGameOverlayEvent event) {
    	Minecraft mc = Minecraft.getMinecraft();
    	drawString(mc.fontRenderer, "Ceci est un teste", 3, 3, 0xFFFF0000);
    }

}