package main.java.pi.homeocraft.common.item;

import main.java.pi.homeocraft.common.Homeocraft;
import main.java.pi.homeocraft.core.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Homeocraft.HOMEOTAB);					
	}
	
	@Override
	public void registerModels() {
		Homeocraft.proxy.registerItemRenderer(this, 0, "inventory");
	}
	

}
