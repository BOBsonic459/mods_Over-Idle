package fr.bobsonic.overidle.block;

import fr.bobsonic.overidle.OverIdle;
import fr.bobsonic.overidle.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockConstructor extends Block {

	public BlockConstructor(Material material) {
		super(material);
	}


public static class BlockOre extends Block {
	public BlockOre(Material p_i28096_1_) {
		super(p_i28096_1_);
				setCreativeTab(OverIdle.OverIdle).setBlockName("BlockOre").setBlockTextureName(Reference.MOD_ID + ":over_ore").setResistance(30).setHardness(5).setLightLevel(15);
		}
	}
}