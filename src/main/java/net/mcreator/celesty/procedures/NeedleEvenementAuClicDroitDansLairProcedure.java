package net.mcreator.celesty.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.celesty.network.CelestyModVariables;

public class NeedleEvenementAuClicDroitDansLairProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double Needle_Durability = 0;
		(itemstack).setDamageValue((int) (entity.getCapability(CelestyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CelestyModVariables.PlayerVariables())).Knit);
	}
}
