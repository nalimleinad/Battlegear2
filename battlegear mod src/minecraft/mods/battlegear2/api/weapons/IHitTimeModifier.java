package mods.battlegear2.api.weapons;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

/**
 * See Attributes#attackSpeed
 */
@Deprecated
public interface IHitTimeModifier {
	/**
	 * 
	 * @param entityHit 
	 * @return The amount to modify the hit shield
	 */
	int getHitTime(ItemStack stack, EntityLivingBase entityHit);

}
