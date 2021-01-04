package fr.bobsonic.overidle.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.util.ResourceLocation;

public class SpalshProgress {

	private static final int MAX = 7;
	private static int PROGRESS = 0;
	private static String CURRENT = "";
	private static ResourceLocation spalsh;
	private static UnicodeFontRenderer ufr;
	
	public static void update() {
		if(Minecraft.getMinecraft() == null || Minecraft.getMinecraft().getLanguageManager() == null) {
			return;
		}
		drawSpalsh(Minecraft.getMinecraft().getTextureManager());
	}
	
	public static void setProgress(int givenProgress, String givenText) {
		PROGRESS = givenProgress;
		CURRENT = givenText;
		update();
	}
	
	public static void drawSpalsh(TextureManager tm) {
		ScaledResolution scaledResolution = new ScaledResolution(Minecraft.getMinecraft(), PROGRESS, PROGRESS);
		int scaleFactor = scaledResolution.getScaleFactor();
		
		Framebuffer framebuffer = new Framebuffer(scaledResolution.getScaledWidth() * scaleFactor, scaledResolution.getScaledHeight() * scaleFactor, true);
		framebuffer.bindFramebuffer(false);
		
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0.0D, (double)scaledResolution.getScaledWidth(), (double)scaledResolution.getScaledHeight(), 0.0D, 1000.0D, 3000.0D);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glLoadIdentity();
		GL11.glTranslatef(0.0F, 0.0F, -2000.0F);

		if (spalsh == null) {
			spalsh = new ResourceLocation(":textures/gui/spalsh.png");
		}
		
		tm.bindTexture(spalsh);
		
		GL11.glColor4f(0, 0, 0, 0);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

	}
	
	private static void drawProgress() {
		
	}
	
	private static void resetTextureState() {
		
	}

}
