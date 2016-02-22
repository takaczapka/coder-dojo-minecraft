package codingdojo.minecraftforge;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class Parachute {

	@SubscribeEvent
	public void deployParachute(PlayerTickEvent event) {
		EntityPlayer player = event.player;
		
		if (player.isAirBorne && player.isSneaking()) {
			player.motionY = -0.05;
		}
	}
	
	@SubscribeEvent
	public void negateFallDamage(LivingFallEvent event) {
		if (event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;
			if (player.isSneaking()) event.setCanceled(true);
		}
	}
}
