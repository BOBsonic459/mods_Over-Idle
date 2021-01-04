package fr.bobsonic.overidle.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tab2 extends CreativeTabs {
 
	public tab2(String overidle2) {
		super(overidle2);
	}

	@Override
	public Item getTabIconItem() {
		return ItemMods.sonic_screwdriver;
	}

}