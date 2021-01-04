
package fr.bobsonic.overidle.EventsEntity;


import akka.japi.Effect;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.bobsonic.overidle.init.BlockMods;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

public class DropsBlocks {
//	@SubscribeEvent
//	public void BlockDestroyed(HarvestDropsEvent event) {
//		if (event.block == BlockMods.redstonelampon) {
//			event.drops.clear();
//			event.drops.add(new ItemStack(BlockMods.redstonelampoff));
//		}
//		
//		if (event.block == BlockChristmas.Present_1) {
//			event.drops.clear();
//			event.drops.add(new ItemStack(BlockMods.sea_lantern, 16));
//			event.drops.add(new ItemStack(BlockMods.prismarine_a, 16));
//			event.drops.add(new ItemStack(BlockMods.prismarine_b, 16));
//			event.drops.add(new ItemStack(BlockMods.prismarine_c, 16));
//			event.drops.add(new ItemStack(BlockMods.purpur_block, 16));
//			event.drops.add(new ItemStack(BlockMods.purpur_pillar, 16));
//			event.drops.add(new ItemStack(BlockMods.purpur_slab, 16));
//			event.drops.add(new ItemStack(BlockMods.purpur_stairs, 16));
//			event.drops.add(new ItemStack(ItemChristmas.mojang_thsirt, 1));
//		}
//		
//		if (event.block == BlockChristmas.Present_2) {
//			event.drops.clear();
//			event.drops.add(new ItemStack(BlockMods.concrete_black, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_blue, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_brown, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_cyan, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_dark_blue, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_dark_green, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_gray, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_cyan, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_green, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_magenta, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_orange, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_pink, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_purple, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_red, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_silver, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_white, 8));
//			event.drops.add(new ItemStack(BlockMods.concrete_yellow, 8));
//		}
//	}
}