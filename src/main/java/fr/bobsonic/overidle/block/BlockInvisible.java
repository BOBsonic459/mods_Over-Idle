package fr.bobsonic.overidle.block;

import java.util.UUID;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class BlockInvisible extends Block
{

    private UUID uuid;

	public BlockInvisible(Material p_i45394_1_, int level)
    {
        super(p_i45394_1_);
        setLightLevel(0.0F);
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean onBlockActivated(World world, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
    	if(world.isRemote) {

    		player.addChatComponentMessage(new ChatComponentText("§3[Mods Over-Idle] §6" + player.getDisplayName() + " §fCeci est block invisible"));

    	}
        return true;
    }
}