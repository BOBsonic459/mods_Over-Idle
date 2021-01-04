package fr.bobsonic.overidle.items;


import fr.bobsonic.overidle.Reference;
import fr.bobsonic.overidle.init.ItemMods;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorOver extends ItemArmor
{

    public ItemArmorOver(ArmorMaterial material, int metaData)
    {
        super(material, 0, metaData);
    }
    
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemMods.legging_over)
        {
            return Reference.MOD_ID + ":textures/armor/armor-over_layer_2.png";
        }
        
        else if(stack.getItem() == ItemMods.helmet_over || stack.getItem() == ItemMods.chestplate_over || stack.getItem() == ItemMods.boots_over)
        {
            return Reference.MOD_ID + ":textures/armor/armor-over_layer_1.png";
        }
        return null;
    }
    
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        if(this == ItemMods.boots_over)
        {
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 660, 0, true));
        }
        
        if(this == ItemMods.helmet_over)
        {
            player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 660, 0, true));
        }
    }
}