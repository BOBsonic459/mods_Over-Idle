package fr.bobsonic.overidle.info;

import java.util.UUID;

import fr.bobsonic.overidle.OverIdle;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerInfo {
	
	public String name;
	public String username;
	public int id;
	public static UUID uuid;
	public boolean invisible;
	public boolean ground;
	
	public PlayerInfo(EntityPlayer player) {
		this.name = String.valueOf(player.getGameProfile().getName());
		this.username = Minecraft.getMinecraft().getSession().getUsername();
		this.id = player.getEntityId();
		this.uuid = player.getGameProfile().getId();
		this.invisible = player.isInvisible();
		this.ground = player.onGround;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public UUID getUuid() {
		return uuid;
	}
	
	public boolean isInvisible() {
		return invisible;
	}
	
	public boolean isGround() {
		return ground;
	}
	
	public void DEV_MODS() {

	}

}
