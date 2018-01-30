package main.java.pi.homeocraft.core.handler;

import java.util.ArrayList;
import java.util.List;

import main.java.pi.homeocraft.core.init.ItemInit;
import main.java.pi.homeocraft.core.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	public static final List <Item> ITEMS = new ArrayList<Item>();
	
	public static final ItemInit libItems = new ItemInit(); 
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event ) {
		
		event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
	}
	
	
	//I don't have blocks but I may check this in the future... 
//	@SubscribeEvent
//	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
//		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block [0]));	
//	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		ITEMS.stream().filter(target-> target instanceof IHasModel)
		  .forEach(target ->((IHasModel) target).registerModels());
		
		
		  
		
//		for(Item item : ItemInit.ITEMS) {
//			
//			if(item instanceof IHasModel) 
//				((IHasModel)item).registerModels();
//			
//		}

	}
}
