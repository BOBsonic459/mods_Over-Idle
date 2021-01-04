package fr.bobsonic.overidle.block.slab;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bobsonic.overidle.OverIdle;
import fr.bobsonic.overidle.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class HalfSlab extends BlockSlab {

	public IIcon topIcon;

	public HalfSlab(boolean boo) {
		super(boo, Material.rock);
		this.useNeighborBrightness = true;
		this.setStepSound(Block.soundTypeStone);
		this.setResistance(0.5F);
		this.setHardness(2.5F);
		this.setCreativeTab(OverIdle.OverIdle3);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		if (item != Item.getItemFromBlock(MySlab.HalfSlabdouble)) {
			list.add(new ItemStack(item, 1, 0));
		}
	}

	@SideOnly(Side.CLIENT)
	private static boolean isBlockSingleSlab(Block block) {
		return block == MySlab.HalfSlabsingle;	
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World world, int pie, int cake, int food) {
		return isBlockSingleSlab(this) ? Item.getItemFromBlock(this) : (this == MySlab.HalfSlabdouble ? Item.getItemFromBlock(MySlab.HalfSlabsingle) : Item.getItemFromBlock(MySlab.HalfSlabsingle));
	}
	
	public Item getItemDropped(int hotdog, Random random, int burer) {
		return Item.getItemFromBlock(MySlab.HalfSlabsingle);
	}
	
	protected ItemStack createdStactedBlock(int icecream) {
		return new ItemStack(MySlab.HalfSlabsingle, 2, 0);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		this.blockIcon = icon.registerIcon(Reference.MOD_ID + ":purpur_slab_side");
		this.topIcon = icon.registerIcon(Reference.MOD_ID + ":purpur_slab_top");
	}
	
	public IIcon getIcon(int cheese, int crakers) {
		int fruit = crakers & 7;
		
		if(this.field_150004_a && (crakers & 2) != 0) {
			cheese = 1;
		}
		
		return cheese == 1 ? this.topIcon : (cheese == 0 ? this.topIcon : this.blockIcon);
	}

	@Override
	public String func_150002_b(int p_150002_1_) {
		return super.getUnlocalizedName();
	}
}
 