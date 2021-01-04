package fr.bobsonic.overidle;

import org.lwjgl.opengl.Display;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import fr.bobsonic.overidle.EventsEntity.SunWorldDep.SunWorldRegister;
import fr.bobsonic.overidle.block.BlockBasic;
import fr.bobsonic.overidle.block.slab.MySlab;
import fr.bobsonic.overidle.commads.Command;
import fr.bobsonic.overidle.dev.ConsoleColors;
import fr.bobsonic.overidle.dev.DevMain;
import fr.bobsonic.overidle.gui.overlay.WarningOverlay;
import fr.bobsonic.overidle.info.PlayerInfo;
import fr.bobsonic.overidle.info.Staff;
import fr.bobsonic.overidle.init.BlockMods;
import fr.bobsonic.overidle.init.ItemMods;
import fr.bobsonic.overidle.init.RemoveMod;
import fr.bobsonic.overidle.proxy.CommonProxy;
import fr.bobsonic.overidle.EventsEntity.SunModsEvents;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION,  acceptedMinecraftVersions = Reference.ACCPETED_VERSION_MINECRAFT, dependencies = "required-after:Forge@[10.13.4.1614,);")
public class OverIdle 
{
	
	
	public static OverIdle instance;
    public static DevMain logger = new DevMain();

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	 public static CommonProxy proxy;  
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		ItemMods.init();
		ItemMods.register();
		BlockMods.init();
		BlockMods.register();
		MySlab.init();
		MySlab.register();
		RemoveMod.init();
		SunModsEvents.init();
		SunWorldRegister.SunWorldMainRegistry();
		
	}
	
    @EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {
    	event.registerServerCommand(new Command());
    }
	

	@EventHandler
	public void Init(FMLInitializationEvent event) 
	{
		proxy.preInit();
		logger.debug("Over-Idle", ConsoleColors.YELLOW + " Mod en Initialisation");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}

}
