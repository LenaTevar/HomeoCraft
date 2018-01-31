package main.java.pi.homeocraft.core.init;

import main.java.pi.homeocraft.common.item.BaubleHat;
import main.java.pi.homeocraft.common.item.FoodBase;
import main.java.pi.homeocraft.common.item.FoodPoison;
import main.java.pi.homeocraft.common.item.ItemBase;
import main.java.pi.homeocraft.core.handler.RegistryHandler;
import net.minecraft.item.Item;

public class ItemInit {
	public ItemInit() {
		this.init();
	}
	
	public static final Item PREPARATION = new FoodBase("preparation", 0, false);
	public static final Item DILUTION_1C = new FoodBase("dilution_1c", 0, false);
	public static final Item DILUTION_2C = new FoodBase("dilution_2c", 0, false);
	public static final Item DILUTION_3C = new FoodBase("dilution_3c", 0, false);
	public static final Item DILUTION_4C = new FoodBase("dilution_4c", 0, false);
	public static final Item DILUTION_5C = new FoodBase("dilution_5c", 0, false);
	public static final Item PILL = new FoodBase("pill", 0, false);
	public static final Item RAW_WATER = new FoodPoison("raw_water", 0, false);
	public static final Item FOIL_HAT = new BaubleHat("foil_hat");

	public void init() {
		RegistryHandler.ITEMS.add(PREPARATION);
		RegistryHandler.ITEMS.add(DILUTION_1C);
		RegistryHandler.ITEMS.add(DILUTION_2C);
		RegistryHandler.ITEMS.add(DILUTION_3C);
		RegistryHandler.ITEMS.add(DILUTION_4C);
		RegistryHandler.ITEMS.add(DILUTION_5C);
		RegistryHandler.ITEMS.add(PILL);
		RegistryHandler.ITEMS.add(RAW_WATER);
		RegistryHandler.ITEMS.add(FOIL_HAT);
	}
}
