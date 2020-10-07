
package cn.evolvefield.civwar.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import cn.evolvefield.civwar.item.CivBookItem;
import cn.evolvefield.civwar.CivwarModElements;

@CivwarModElements.ModElement.Tag
public class CivWarCoreItemGroup extends CivwarModElements.ModElement {
	public CivWarCoreItemGroup(CivwarModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabciv_war_core") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CivBookItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
