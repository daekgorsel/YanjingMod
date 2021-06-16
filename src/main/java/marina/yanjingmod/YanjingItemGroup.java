package marina.yanjingmod;

import marina.yanjingmod.init.YanjingItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class YanjingItemGroup extends ItemGroup 
{
	
	public YanjingItemGroup() 
	{
		 super("YANJINGTAB");
	}
	
	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(YanjingItems.jade_ingot);
		//ItemStack(Item.BLOCK_TO_ITEM.get(BlockList.tutorial_block));
	
	}
}
