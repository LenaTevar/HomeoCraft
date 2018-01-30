package main.java.pi.homeocraft.common.item;


import main.java.pi.homeocraft.common.Homeocraft;
import main.java.pi.homeocraft.core.handler.RegistryHandler;
import main.java.pi.homeocraft.core.interfaces.IHasModel;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{
	
	public FoodBase(String name, int saturation, boolean wolf) {
		super(saturation, wolf);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Homeocraft.HOMEOTAB);
		
		RegistryHandler.ITEMS.add(this);
				
	}

	@Override
	public void registerModels() {
		Homeocraft.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
