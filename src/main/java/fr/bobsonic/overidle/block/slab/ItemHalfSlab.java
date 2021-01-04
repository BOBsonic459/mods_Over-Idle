package fr.bobsonic.overidle.block.slab;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class ItemHalfSlab extends ItemSlab{

	public ItemHalfSlab(Block block) {
		super(block, MySlab.HalfSlabsingle, MySlab.HalfSlabdouble, block == MySlab.HalfSlabdouble);
	}

	
}
