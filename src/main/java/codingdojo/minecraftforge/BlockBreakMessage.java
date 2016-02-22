package codingdojo.minecraftforge;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage {

    @SubscribeEvent
    public void sendMessage(BreakEvent event) {

        event.getPlayer().addChatComponentMessage(
                new ChatComponentText(
                        EnumChatFormatting.GOLD + "You broke the " + event.state.getBlock().getLocalizedName() + " block!"
                ));
    }
}
