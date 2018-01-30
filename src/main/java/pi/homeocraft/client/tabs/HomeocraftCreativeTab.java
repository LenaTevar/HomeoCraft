package main.java.pi.homeocraft.client.tabs;

import main.java.pi.homeocraft.core.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HomeocraftCreativeTab extends CreativeTabs {
	public HomeocraftCreativeTab(String name) {
		
		super(name);
	}

	@Override
	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemInit.PREPARATION);
	}
	

}
