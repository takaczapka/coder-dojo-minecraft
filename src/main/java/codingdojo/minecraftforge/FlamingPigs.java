package codingdojo.minecraftforge;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class FlamingPigs implements ICommand {

	private List<String> aliases = new ArrayList<String>();
	
	public FlamingPigs() {
		aliases.add("fp");
		aliases.add("flamingpigs");
	}
	
	@Override
	public int compareTo(ICommand o) {
		return 0;
	}

	@Override
	public String getCommandName() {
		return null;
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/flamingpigs <number of pigs>";
	}

	@Override
	public List<String> getCommandAliases() {
		return aliases;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		if (args.length != 1) {
			sendErrorMessage(sender, "Invalid number of arguments!");
			return;
		}
		
		int numberOfPigs = 0;
		try {
			numberOfPigs = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			sendErrorMessage(sender, "The argument \"" + args[0] + "\" is not a valid number");
			return;
		}
		
		EntityPlayer player = (EntityPlayer) sender;

		for (int i = 0; i < numberOfPigs; i++) {
			EntityPig pig = new EntityPig(player.worldObj);
			pig.setLocationAndAngles(player.posX, player.posY,
					player.posZ, 0, 0);
			pig.setFire(1000);

			player.worldObj.spawnEntityInWorld(pig);
		}
	}

	private void sendErrorMessage(ICommandSender sender, String message) {
		sender.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + message));
	}
	
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return sender instanceof EntityPlayer;
	}

	@Override
	public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}
}
