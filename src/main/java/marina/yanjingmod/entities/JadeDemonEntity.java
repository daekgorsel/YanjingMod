package marina.yanjingmod.entities;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class JadeDemonEntity extends CreatureEntity {

	protected JadeDemonEntity(EntityType entityType, World p_i48577_2_) {
		super(entityType, p_i48577_2_);
		
	}
	
	@Override
	protected void registerGoals()
	{
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 0.1d));
		this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(3, new PanicGoal(this, 0.2d));
		this.goalSelector.addGoal(4, new LookAtGoal(this, PlayerEntity.class, 6.0F));
	//	this.goalSelector.addGoal(5, new OpenDoorGoal(ModelEntity, true));
	}
	
	@Override
	protected void registerAttributes() 
	{
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0d);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3d);
	}
}
