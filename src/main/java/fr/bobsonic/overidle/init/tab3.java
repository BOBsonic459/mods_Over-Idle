package fr.bobsonic.overidle.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tab3 extends CreativeTabs {
 
	public tab3(String overidle3) {
		super(overidle3);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(BlockMods.sea_lantern);
	}

}