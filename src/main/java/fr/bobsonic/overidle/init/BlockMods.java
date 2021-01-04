package fr.bobsonic.overidle.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.bobsonic.overidle.OverIdle;
import fr.bobsonic.overidle.Reference;
import fr.bobsonic.overidle.block.BlockBasic;
import fr.bobsonic.overidle.block.BlockDebug;
import fr.bobsonic.overidle.block.BlockInvisible;
import fr.bobsonic.overidle.block.BlockPillarPupur;
import fr.bobsonic.overidle.block.BlockRedstoneLampOn;
import fr.bobsonic.overidle.block.BlockStairsMods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockMods {
	public static Block over_block, eastereggone, over_ore, invisible_block, sea_lantern, prismarine_a, prismarine_b, prismarine_c, purpur_pillar, purpur_block, debug, redstonelampon, redstonelampoff, concrete_brown, concrete_red, concrete_orange, concrete_yellow, concrete_green, concrete_dark_green, concrete_cyan, concrete_blue, concrete_dark_blue, concrete_purple, concrete_pink, concrete_magenta, concrete_white, concrete_silver, concrete_gray, concrete_black, purpur_stairs, DoubleSlabTuto, SingleSlabTuto, purpur_slab, blueFire;	
	public static void init()
	{
		over_block = new BlockBasic(Material.rock, 2).setBlockName("over_block").setCreativeTab(OverIdle.OverIdle).setBlockTextureName(Reference.MOD_ID + ":over_block");
		sea_lantern = new BlockBasic(Material.rock, 2).setBlockName("sea_lantern").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":sea_lantern").setLightLevel(1.0F);
		prismarine_a = new BlockBasic(Material.rock, 2).setBlockName("prismarine_a").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":prismarine_a");
		prismarine_b = new BlockBasic(Material.rock, 2).setBlockName("prismarine_b").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":prismarine_b");
		prismarine_c = new BlockBasic(Material.rock, 2).setBlockName("prismarine_c").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":prismarine_c");
		purpur_pillar = new BlockPillarPupur(Material.rock).setBlockName("purpur_pillar").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":pupur_pillar");
		purpur_block = new BlockBasic(Material.rock, 2).setCreativeTab(OverIdle.OverIdle3).setBlockName("purpur_block").setBlockTextureName(Reference.MOD_ID + ":purpur_block");
		purpur_stairs = new BlockStairsMods(BlockMods.purpur_block, 0).setBlockName("purpur_stairs").setCreativeTab(OverIdle.OverIdle3);
		over_ore = new BlockBasic(Material.rock, 2).setCreativeTab(OverIdle.OverIdle).setBlockName("over_ore").setBlockTextureName(Reference.MOD_ID + ":over_ore").setResistance(30).setHardness(5).setLightLevel(15);
		invisible_block = new BlockInvisible(Material.rock, 2).setCreativeTab(OverIdle.OverIdle).setBlockTextureName(Reference.MOD_ID + ":barrier_block").setResistance(-1).setLightOpacity(0).setBlockName("invisible_block");
		eastereggone = new BlockBasic(Material.rock, 2).setBlockName("eastereggone").setCreativeTab(OverIdle.OverIdle2).setBlockTextureName(Reference.MOD_ID + ":eastereggone");
		debug = new BlockDebug(Material.rock, 2).setBlockName("debug").setCreativeTab(OverIdle.OverIdle).setBlockTextureName(Reference.MOD_ID + ":debug");
		concrete_brown = new BlockBasic(Material.rock, 2).setBlockName("concrete_brown").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_brown");
		concrete_red = new BlockBasic(Material.rock, 2).setBlockName("concrete_red").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_red");
		concrete_orange = new BlockBasic(Material.rock, 2).setBlockName("concrete_orange").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_orange");
		concrete_yellow = new BlockBasic(Material.rock, 2).setBlockName("concrete_yellow").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_yellow");
		concrete_green = new BlockBasic(Material.rock, 2).setBlockName("concrete_green").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_green");
		concrete_dark_green = new BlockBasic(Material.rock, 2).setBlockName("concrete_dark_green").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_dark_green");
		concrete_cyan = new BlockBasic(Material.rock, 2).setBlockName("concrete_cyan").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_cyan");
		concrete_blue = new BlockBasic(Material.rock, 2).setBlockName("concrete_blue").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_blue");
		concrete_dark_blue = new BlockBasic(Material.rock, 2).setBlockName("concrete_dark_blue").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_dark_blue");
		concrete_purple = new BlockBasic(Material.rock, 2).setBlockName("concrete_purple").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_purple");
		concrete_pink = new BlockBasic(Material.rock, 2).setBlockName("concrete_pink").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_pink");
		concrete_magenta = new BlockBasic(Material.rock, 2).setBlockName("concrete_magenta").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_magenta");
		concrete_white = new BlockBasic(Material.rock, 2).setBlockName("concrete_white").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_white");
		concrete_silver = new BlockBasic(Material.rock, 2).setBlockName("concrete_light_grey").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_light_gray");
		concrete_gray = new BlockBasic(Material.rock, 2).setBlockName("concrete_grey").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_gray");
		concrete_black = new BlockBasic(Material.rock, 2).setBlockName("concrete_black").setCreativeTab(OverIdle.OverIdle3).setBlockTextureName(Reference.MOD_ID + ":concrete_black");
				
	}
	
	public static void register() {
		GameRegistry.registerBlock(over_block, "over_block");
		GameRegistry.registerBlock(eastereggone, "eastereggone");
		GameRegistry.registerBlock(over_ore, "over_ore");
		GameRegistry.registerBlock(invisible_block, "invisible_block");
		GameRegistry.registerBlock(sea_lantern, "sea_lantern");
		GameRegistry.registerBlock(prismarine_a, "prismarine_a");
		GameRegistry.registerBlock(prismarine_b, "prismarine_b");
		GameRegistry.registerBlock(prismarine_c, "prismarine_c");
		GameRegistry.registerBlock(purpur_pillar, "purpur_pillar");
		GameRegistry.registerBlock(purpur_block, "purpur_block");
		GameRegistry.registerBlock(purpur_stairs, "purpur_stairs");
		GameRegistry.registerBlock(debug, "debug");
		GameRegistry.registerBlock(concrete_brown, "concrete_brown");
		GameRegistry.registerBlock(concrete_red, "concrete_red");
		GameRegistry.registerBlock(concrete_orange, "concrete_orange");
		GameRegistry.registerBlock(concrete_yellow, "concrete_yellow");
		GameRegistry.registerBlock(concrete_green, "concrete_green");
		GameRegistry.registerBlock(concrete_dark_green, "concrete_dark_green");
		GameRegistry.registerBlock(concrete_cyan, "concrete_cyan");
		GameRegistry.registerBlock(concrete_blue, "concrete_blue");
		GameRegistry.registerBlock(concrete_dark_blue, "concrete_dark_blue");
		GameRegistry.registerBlock(concrete_purple, "concrete_purple");
		GameRegistry.registerBlock(concrete_pink, "concrete_pink");
		GameRegistry.registerBlock(concrete_magenta, "concrete_magenta");
		GameRegistry.registerBlock(concrete_white, "concrete_white");
		GameRegistry.registerBlock(concrete_silver, "concrete_silver");
		GameRegistry.registerBlock(concrete_gray, "concrete_gray");
		GameRegistry.registerBlock(concrete_black, "concrete_black");
		

		GameRegistry.addRecipe(new ItemStack(over_block, 1), new Object[] {"###", "###", "###", '#', ItemMods.over_ingot});	
		GameRegistry.addRecipe(new ItemStack(eastereggone, 1), new Object[] {"/#/", "#/#", "#/#", '#', BlockMods.over_block, '/', ItemMods.over_ingot});
        GameRegistry.addSmelting(over_ore, new ItemStack(ItemMods.over_ingot, 1), 1.0F);
	}
}
