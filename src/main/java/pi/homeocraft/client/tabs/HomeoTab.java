package main.java.pi.homeocraft.client.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HomeoTab extends CreativeTabs{
	
	public HomeoTab(int index, String label) {
		super(index,label);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return null;
		
	}
}
