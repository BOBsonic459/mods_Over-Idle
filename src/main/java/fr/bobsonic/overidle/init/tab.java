package fr.bobsonic.overidle.init;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tab extends CreativeTabs {
 
	public tab(String overidle) {
		super(overidle);

	}

	@Override
	public Item getTabIconItem() {
		return ItemMods.over_ingot;
	}

}