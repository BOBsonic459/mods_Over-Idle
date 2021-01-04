package fr.bobsonic.overidle.init;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ChatComponentText;

public class RemoveMod {
	
	public static void init() {
		removeCraft(new ItemStack(Items.golden_apple, 1, 1));
		
	}

	private static void removeCraft(ItemStack stack) {
		List<IRecipe> recipelist = CraftingManager.getInstance().getRecipeList();
		
		for(int i = 0; i < recipelist.size(); i++) {
			ItemStack out = recipelist.get(i).getRecipeOutput();
			
			if (out != null && stack.getItem() == out.getItem() && stack.getItemDamage() == stack.getItemDamage()) {
				recipelist.remove(i);
			}

			
		}
	}
	
}
