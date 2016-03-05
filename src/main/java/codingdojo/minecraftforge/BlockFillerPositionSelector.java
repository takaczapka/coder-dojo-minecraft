package codingdojo.minecraftforge;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockFillerPositionSelector {

    static List<Integer> pos1 = new ArrayList<Integer>();
    static List<Integer> pos2 = new ArrayList<Integer>();

    @SubscribeEvent
    public void choosePositions(PlayerInteractEvent event) {
        if (event.entityPlayer.getHeldItem() != null
                && event.entityPlayer.getHeldItem().getItem() == Items.wooden_axe
                && event.entityPlayer.capabilities.isCreativeMode) {

            if (event.action == Action.RIGHT_CLICK_BLOCK) {

                setPosition(pos1, event.pos);

                chatMessage(event, EnumChatFormatting.GREEN, "Position 1 set to " + event.pos.getX()
                        + ", " + event.pos.getY() + ", " + event.pos.getZ() + ".");

                event.setCanceled(true);

            } else if (event.action == Action.LEFT_CLICK_BLOCK) {

                setPosition(pos2, event.pos);

                chatMessage(event, EnumChatFormatting.GREEN, "Position 2 set to " + event.pos.getX()
                        + ", " + event.pos.getY() + ", " + event.pos.getZ() + ".");
                event.setCanceled(true);
            }
        }
    }

    private void setPosition(List<Integer> position, BlockPos blockPosition) {
        position.clear();

        position.add(blockPosition.getX());
        position.add(blockPosition.getY());
        position.add(blockPosition.getZ());
    }

    private void chatMessage(PlayerInteractEvent event, EnumChatFormatting color, String message) {
        event.entityPlayer.addChatMessage(new ChatComponentText(
                color + message));
    }

}