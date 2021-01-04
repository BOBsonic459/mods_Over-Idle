package fr.bobsonic.overidle.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import fr.bobsonic.overidle.OverIdle;
import fr.bobsonic.overidle.Reference;
import fr.bobsonic.overidle.init.ItemTools.OverSwordTool;
import fr.bobsonic.overidle.init.ItemTools.SonicScrewdriverTool;
import fr.bobsonic.overidle.items.ItemArmorOver;
import fr.bobsonic.overidle.init.ItemTools.OverPickaxeTool;
import fr.bobsonic.overidle.init.ItemTools.OverShovelTool;
import fr.bobsonic.overidle.init.ItemTools.OverAxeTool;
import fr.bobsonic.overidle.init.ItemTools.OverHoeTool;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockTorch;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;

public class ItemMods {
	

	public static Item over_ingot, over_sholvel, over_hoe, over_axe, over_sword, over_pickaxe, helmet_over, chestplate_over, legging_over, boots_over;
	public static Item sonic_screwdriver;
	
	public static ToolMaterial OverSwordToolM = EnumHelper.addToolMaterial("OverSwordMaterial", 0, 10000, 10, 10, 8);
	public static ToolMaterial OverPickaxeToolM = EnumHelper.addToolMaterial("OverPickaxeTool", 5, 8000, 30, 3, 5);
	public static ToolMaterial OverShovelToolM = EnumHelper.addToolMaterial("OverShovel", 5, 8000, 30, 3, 5);
	public static ToolMaterial OverHoeToolM = EnumHelper.addToolMaterial("HoueMaterial", 0, 8000, 900, 3, 5);
	public static ToolMaterial OverAxeToolM = EnumHelper.addToolMaterial("OverAxeToolM", 1, 8000, 30, 3, 5);
	public static ArmorMaterial OverArmorM = EnumHelper.addArmorMaterial("OverArmorM", 40, new int[]{8, 8, 8, 8}, 50);
	public static ArmorMaterial OverArmorDetermination = EnumHelper.addArmorMaterial("OverArmorDetermination", 40, new int[]{8, 8, 8, 8}, 50);
	public static ToolMaterial SonicScrewdrieverM = EnumHelper.addToolMaterial("SonicScrewdrieverM", 3, 1000, 10, 100, 30);

	public static void init() {
		over_ingot = new Item().setUnlocalizedName("over_ingot").setCreativeTab(OverIdle.OverIdle).setTextureName(Reference.MOD_ID + ":over_ingot");
		over_pickaxe = new OverPickaxeTool(OverPickaxeToolM).setUnlocalizedName("over_pickaxe").setCreativeTab(OverIdle.OverIdle).setTextureName(Reference.MOD_ID + ":over_pickaxe");
		over_sword = new OverSwordTool(OverSwordToolM).setUnlocalizedName("over_sword").setCreativeTab(OverIdle.OverIdle).setTextureName(Reference.MOD_ID + ":over_sword");
		over_axe = new OverShovelTool(OverShovelToolM).setUnlocalizedName("over_axe").setCreativeTab(OverIdle.OverIdle).setTextureName(Reference.MOD_ID + ":over_axe");
		over_hoe = new OverHoeTool(OverHoeToolM).setUnlocalizedName("over_hoe").setCreativeTab(OverIdle.OverIdle).setTextureName(Reference.MOD_ID + ":over_hoe");
		over_sholvel = new OverAxeTool(OverAxeToolM).setUnlocalizedName("over_sholvel").setCreativeTab(OverIdle.OverIdle).setTextureName(Reference.MOD_ID + ":over_shovel");
		helmet_over = new ItemArmorOver(OverArmorM, 0).setCreativeTab(OverIdle.OverIdle).setTextureName(Reference.MOD_ID + ":helmet_over").setUnlocalizedName("helmet_over");
	    chestplate_over = new ItemArmorOver(OverArmorM, 1).setCreativeTab(OverIdle.OverIdle).setTextureName(Reference.MOD_ID + ":chestplate_over").setUnlocalizedName("chestplate_over");
	    legging_over = new ItemArmorOver(OverArmorM, 2).setCreativeTab(OverIdle.OverIdle).setTextureName(Reference.MOD_ID + ":legging_over").setUnlocalizedName("legging_over");
	    boots_over = new ItemArmorOver(OverArmorM, 3).setCreativeTab(OverIdle.OverIdle).setTextureName(Reference.MOD_ID + ":boots_over").setUnlocalizedName("boots_over");
	    
	    if (Reference.DEV_MODS == true) {
	    	sonic_screwdriver = new SonicScrewdriverTool(SonicScrewdrieverM).setCreativeTab(OverIdle.OverIdle2).setUnlocalizedName("sonic_screwdriver").setTextureName(Reference.MOD_ID + ":sonic_screwdriver");
		}
	}

	public static void register() {
		
	    if (Reference.DEV_MODS == true) {
	    	GameRegistry.registerItem(sonic_screwdriver, "sonic_screwdriver");
	    	GameRegistry.addRecipe(new ItemStack(sonic_screwdriver, 1), new Object[] {" * ", " # ", " / ", '*', new ItemStack(Blocks.stained_glass, 1, 11), '#', Blocks.iron_block, '/', Blocks.coal_block});
		}
		
		GameRegistry.registerItem(over_ingot, "over_ingot");
		GameRegistry.registerItem(over_pickaxe, "over_pickaxe");
		GameRegistry.registerItem(over_sword, "over_sword");
		GameRegistry.registerItem(over_axe, "over_axe");
		GameRegistry.registerItem(over_hoe, "over_hoe");
		GameRegistry.registerItem(over_sholvel, "over_sholvel");
		GameRegistry.registerItem(helmet_over, "helmet_over");
		GameRegistry.registerItem(chestplate_over, "chestplate_over");
		GameRegistry.registerItem(legging_over, "legging_over");
		GameRegistry.registerItem(boots_over, "boot_over");
		
		GameRegistry.addRecipe(new ItemStack(over_pickaxe, 1), new Object[] {"###", " / ", " / ", '#', ItemMods.over_ingot, '/',Items.stick });
		GameRegistry.addRecipe(new ItemStack(over_sword, 1), new Object[] {" # ", " # ", " / ", '#', ItemMods.over_ingot, '/',Items.stick });
		GameRegistry.addRecipe(new ItemStack(over_axe, 1), new Object[] {" ##", " /#", " / ", '#', ItemMods.over_ingot, '/',Items.stick });
		GameRegistry.addRecipe(new ItemStack(over_hoe, 1), new Object[] {" ##", " / ", " / ", '#', ItemMods.over_ingot, '/',Items.stick });
		GameRegistry.addRecipe(new ItemStack(over_sholvel, 1), new Object[] {" # ", " / ", " / ", '#', ItemMods.over_ingot, '/',Items.stick });
		GameRegistry.addRecipe(new ItemStack(helmet_over, 1), new Object[] {"###", "# #", "   ", '#', ItemMods.over_ingot});
		GameRegistry.addRecipe(new ItemStack(chestplate_over, 1), new Object[] {"# #", "###", "###", '#', ItemMods.over_ingot});
		GameRegistry.addRecipe(new ItemStack(legging_over, 1), new Object[] {"###", "# #", "# #", '#', ItemMods.over_ingot});
		GameRegistry.addRecipe(new ItemStack(boots_over, 1), new Object[] {"# #", "# #", "   ", '#', ItemMods.over_ingot});
	}

}
