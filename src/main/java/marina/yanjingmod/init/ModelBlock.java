package marina.yanjingmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.state.StateContainer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModelBlock  extends Block {
	public ModelBlock() {
		super(Properties.from(Blocks.GLASS));
	}
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public BlockRenderLayer getRenderLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
}
