package fr.bobsonic.overidle.gui;


import java.awt.Color;
import java.awt.Desktop;

import java.net.URL;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.bobsonic.overidle.OverIdle;
import fr.bobsonic.overidle.Reference;
import fr.bobsonic.overidle.dev.DevMain;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraftforge.client.event.GuiScreenEvent;

public class GuiMainMenu extends GuiScreen {

    public GuiScreen gui;
    public net.minecraft.client.gui.GuiMainMenu main;
    public  Minecraft mc = Minecraft.getMinecraft();

    @SubscribeEvent
    public void OnInitGui(GuiScreenEvent.InitGuiEvent.Post event) {
        OverIdle.logger.debug("GuiMainMenu", "Menu principale");
        gui = event.gui;
        if (gui instanceof net.minecraft.client.gui.GuiMainMenu) {
        	
            for (Object b : event.buttonList) {
            	
                if (((GuiButton) b).id == 14) {
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if (((GuiButton) b).id == 2) {
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if (((GuiButton) b).id == 6) {
                    ((GuiButton) b).width = ((GuiButton) b).width + 100;
                }
                if (((GuiButton) b).id == 1) {
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if (((GuiButton) b).id == 5) {
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if (((GuiButton) b).id == 4) {
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if (((GuiButton) b).id == 6) {
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if (((GuiButton) b).id == 0) {
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if (((GuiButton) b).id == 0) {
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
            }
            int a = gui.height / 4 + 20;
            event.buttonList.add(new GuiButton(31, gui.width / 2 + 40, a + 44, 100, 20, "Site web") {
                @Override
                public void mouseReleased(int mouseX, int mouseY) {
                    try {
                    	Desktop.getDesktop().browse(new URL("http://109.14.112.18/").toURI());
                    } catch (Exception exception) {
                    	System.out.println("BUG URL : " + exception.getMessage());
                    }
                }
            });
            
            int b = gui.height / 4 + 20;      
            event.buttonList.add(new GuiButton(32, gui.width / 2 - 140, b + 44, 100, 20, "Over-Idle") {
				@Override
                public void mouseReleased(int mouseX, int mouseY) {
					//FMLClientHandler.instance().connectToServerAtStartup("109.14.112.18", 25565);
					FMLClientHandler.instance().connectToServerAtStartup("localhost", 25568);
					
				}
            });

            int c = gui.height / 4 + 100;
            event.buttonList.add(new GuiButton(32, gui.width / 2 - 100, c, 75, 20, "Discord") {
                @Override
                public void mouseReleased(int mouseX, int mouseY) {
                    try {
                    	Desktop.getDesktop().browse(new URL("https://discordapp.com/invite/FngwAG3").toURI());
                    } catch (Exception exception) {
                    	System.out.println("BUG URL : " + exception.getMessage());
                    }
                }
            });
            
            int d = gui.height / 4 + 100;
            event.buttonList.add(new GuiButton(33, gui.width / 2 + 20, d, 75, 20, "Options") {
                @Override
                public void mouseReleased(int mouseX, int mouseY) {
                    Minecraft.getMinecraft().displayGuiScreen(new GuiOptions(gui, Minecraft.getMinecraft().gameSettings));
                }
            });
            
            if (Reference.getDEVMODS() == true) {
            	for (Object b1 : event.buttonList) {
                if (((GuiButton) b1).id == 1) {
                    ((GuiButton) b1).enabled = true;
                    ((GuiButton) b1).visible = true;            
                	}
            	}
            }
            
            int e = this.gui.height / 4 + 100;
            event.buttonList.add(new GuiButton(34, this.gui.width / 2 - 100, e - 25, 195, 20, "§cServeur de build") {
                  public void mouseReleased(int mouseX, int mouseY) {
                	  //FMLClientHandler.instance().connectToServerAtStartup("37.44.237.59", 25592);
                	  Minecraft.getMinecraft().displayGuiScreen(new GuiMultiplayer(GuiMainMenu.this.gui));
                  }
                });
            
        }
	}
}
