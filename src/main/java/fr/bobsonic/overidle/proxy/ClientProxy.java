package fr.bobsonic.overidle.proxy;

import org.lwjgl.opengl.Display;

import fr.bobsonic.overidle.OverIdle;
import fr.bobsonic.overidle.gui.CGuiMainMenu;
import fr.bobsonic.overidle.gui.overlay.WarningOverlay;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
	
	@Override
	public void preInit() {
		super.preInit();
		MinecraftForge.EVENT_BUS.register(new CGuiMainMenu());
        MinecraftForge.EVENT_BUS.register(new WarningOverlay());
		Display.setTitle("Over-Idle V1 | " + Minecraft.getMinecraft().getSession().getUsername());
		OverIdle.logger.debug("ClientProxy - init","Entrés en phase de preinit");
	}
	
	public ClientProxy() 
	{
		registerEvent();
	}
	
	private void registerEvent()
	{
		
	}

}