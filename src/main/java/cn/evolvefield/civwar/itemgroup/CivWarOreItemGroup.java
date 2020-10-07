
package cn.evolvefield.civwar.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import cn.evolvefield.civwar.block.CopperOreBlock;
import cn.evolvefield.civwar.CivwarModElements;

@CivwarModElements.ModElement.Tag
public class CivWarOreItemGroup extends CivwarModElements.ModElement {
	public CivWarOreItemGroup(CivwarModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabciv_war_ore") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CopperOreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
