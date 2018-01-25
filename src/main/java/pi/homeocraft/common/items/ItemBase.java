package main.java.pi.homeocraft.common.items;

import main.java.pi.homeocraft.common.Homeocraft;
import main.java.pi.homeocraft.core.init.ItemInit;
import main.java.pi.homeocraft.core.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Homeocraft.HomeoTab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Homeocraft.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
