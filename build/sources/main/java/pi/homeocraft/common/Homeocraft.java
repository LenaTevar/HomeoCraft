package main.java.pi.homeocraft.common;

import main.java.pi.homeocraft.client.tabs.HomeocraftCreativeTab;
import main.java.pi.homeocraft.core.lib.libReferences;
import main.java.pi.homeocraft.core.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = libReferences.MODID, name = libReferences.NAME, version = libReferences.VERSION)
public class Homeocraft {
	public static final CreativeTabs HOMEOTAB = new HomeocraftCreativeTab("Homeocraft");
	
	@Instance
	public static Homeocraft instance1;
	
	@SidedProxy(clientSide = libReferences.PROXY_CLIENT, serverSide = libReferences.PROXY_COMMON )
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
	

}
