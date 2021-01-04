package fr.bobsonic.overidle.block.slab;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockSlab;

public class MySlab {
	
	public static BlockSlab HalfSlabsingle;
	public static BlockSlab HalfSlabdouble;
	
	public static void init() {
		HalfSlabsingle = new HalfSlab(false);
		HalfSlabdouble = new HalfSlab(true);	
	}
	
	public static void register() {
		GameRegistry.registerBlock(HalfSlabsingle, ItemHalfSlab.class ,"HalfSlabsingle");
		GameRegistry.registerBlock(HalfSlabdouble, ItemHalfSlab.class,"HalfSlabdouble");
	}

}
