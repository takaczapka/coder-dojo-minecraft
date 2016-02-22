package codingdojo.minecraftforge;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SuperJump {
	
	@SubscribeEvent
	public void makeJumpHigher(LivingJumpEvent event) {
		if (event.entity instanceof EntityPlayer) {
			event.entityLiving.addChatMessage(
					new ChatComponentText(
							EnumChatFormatting.DARK_RED + "JUMP"
							));
			event.entity.motionY *= 5;
		}
	}
}
