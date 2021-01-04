package fr.bobsonic.overidle.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bobsonic.overidle.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockPillarPupur extends Block{
	
	private IIcon top;
	
	public BlockPillarPupur(Material material) {
		super(material);
	}
	
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister)
    {
        blockIcon = iconregister.registerIcon(Reference.MOD_ID + ":purpur_pillar");    
        top = iconregister.registerIcon(Reference.MOD_ID + ":purpur_pillar_top");
    }
    
    public IIcon getIcon(int side, int metadata)
    {
    	
    	if(side == 0) {
    		return top;
    	}
    	if(side == 1) {
    		return top;
    	}
    	if(side == 2) {
    		return blockIcon;
    	}
    	if(side == 3) {
    		return blockIcon;
    	}
    	if(side == 4) {
    		return blockIcon;
    	}
    	if(side == 5) {
    		return blockIcon;
    	}

        return null;
    }
	
}
