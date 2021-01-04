package fr.bobsonic.overidle;

import fr.bobsonic.overidle.OverIdle;

public class Reference 
{
	public static final String MOD_ID = "overidle";
	public static final String MOD_NAME = "Over-Idle";
	public static final String ACCPETED_VERSION_MINECRAFT = "[1.7.10]";
	public static final String VERSION = "ALPHA";
	public static final String CLIENT_PROXY = "fr.bobsonic.overidle.proxy.ClientProxy";
	public static final String SERVER_PROXY = "fr.bobsonic.overidle.proxy.CommonProxy";

	public static boolean getDEVMODS()
	{
		return  DEV_MODS;
	}
	

	
	public static boolean DEV_MODS = true;
	
	
}
 