package main.java.pi.homeocraft.common.item;

import main.java.pi.homeocraft.common.Homeocraft;
import main.java.pi.homeocraft.core.interfaces.IHasModel;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class FoodPoison extends ItemFood implements IHasModel {

	public FoodPoison(String name, int amount, boolean isWolfFood) {

		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Homeocraft.HOMEOTAB);
		setPotionEffect(new PotionEffect(Potion.getPotionById(18)), 100);
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated ethod stub
		Homeocraft.proxy.registerItemRenderer(this, 0, "inventory");	}


}