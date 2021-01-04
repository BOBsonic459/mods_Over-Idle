package fr.bobsonic.overidle.EventsEntity;

import net.minecraftforge.common.MinecraftForge;

public class SunModsEvents {

	public static void init() {
		MinecraftForge.EVENT_BUS.register(new DropsBlocks());
	}
	
}
