
package sttp.nfm.item;

import sttp.nfm.itemgroup.NFMTabItemGroup;
import sttp.nfm.NfmModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@NfmModElements.ModElement.Tag
public class PureSandDustItem extends NfmModElements.ModElement {
	@ObjectHolder("nfm:pure_sand_dust")
	public static final Item block = null;
	public PureSandDustItem(NfmModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NFMTabItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("pure_sand_dust");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
