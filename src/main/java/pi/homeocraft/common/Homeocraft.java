package main.java.pi.homeocraft.common;



import main.java.pi.homeocraft.client.tabs.HomeoTab;
import main.java.pi.homeocraft.core.lib.Reference;
import main.java.pi.homeocraft.core.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Homeocraft {
	
	

		public static Block plastoTextileBlock;
		public static final CreativeTabs HomeoTab = new HomeoTab(CreativeTabs.getNextID(), "homeocraft");

		@Instance
		public static Homeocraft instance1;


		@SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_COMMON)
		public static CommonProxy proxy;

		@EventHandler
		public static void preInit(FMLPreInitializationEvent event) {}

		@EventHandler
		public static void init(FMLInitializationEvent event) {
			//Register new blocks and items and stuff
			}

		@EventHandler
		public static void postInit(FMLPostInitializationEvent event) {}



	
}
