package fr.bobsonic.overidle.block;

import fr.bobsonic.overidle.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRedstoneLampOn extends Block{

	public BlockRedstoneLampOn(Material material, int level) {
		super(material);
        this.setLightLevel(1.0F);
        setHarvestLevel("pickaxe", level);
	}

}
