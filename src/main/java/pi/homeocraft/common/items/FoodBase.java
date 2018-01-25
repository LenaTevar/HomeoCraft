package main.java.pi.homeocraft.common.items;

import main.java.pi.homeocraft.common.Homeocraft;
import main.java.pi.homeocraft.core.init.ItemInit;
import main.java.pi.homeocraft.core.interfaces.IHasModel;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{



	public FoodBase(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
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
