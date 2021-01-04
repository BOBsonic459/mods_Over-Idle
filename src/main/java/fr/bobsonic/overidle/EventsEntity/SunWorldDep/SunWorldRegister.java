package fr.bobsonic.overidle.EventsEntity.SunWorldDep;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class SunWorldRegister {
	public static void SunWorldMainRegistry() {
		SunWorldGenerator(new SunWorldGen(), -1);
		SunWorldGenerator(new SunWorldGen(), 0);
		SunWorldGenerator(new SunWorldGen(), 1);
	}
	
	public static void SunWorldGenerator(IWorldGenerator iGenerator, int probability) {
		GameRegistry.registerWorldGenerator(iGenerator, probability);
	}
}