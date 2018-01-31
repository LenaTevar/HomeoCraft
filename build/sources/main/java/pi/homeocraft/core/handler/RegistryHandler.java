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
	public static List <Item> ITEMS= new ArrayList<Item>();
	public static ItemInit libItems = new ItemInit();
	
		
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event ) {
		
		//event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
		
		ITEMS.stream().forEach(a -> event.getRegistry().register(a));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		ITEMS.stream().filter(target-> target instanceof IHasModel)
		  .forEach(target ->((IHasModel) target).registerModels());
		
		
		
		
		
		
		
		
		
		
		
//		for (Item item : ItemInit.ITEMS) {
//		if (item instanceof IHasModel) {
//			((IHasModel)item).registerModels();	
//		}
//	}
	
//	for (Block block : BlockInit.BLOCKS) {
//		if(block instanceof IHasModel) {
//			((IHasModel)block).registerModels();
//		}
//	}
//}
//

	}
}
